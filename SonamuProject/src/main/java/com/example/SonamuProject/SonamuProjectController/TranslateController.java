package com.example.SonamuProject.SonamuProjectController;

import com.example.SonamuProject.dto.SourceCode;
import com.example.SonamuProject.dto.TargetCode;
import com.example.SonamuProject.preprocessor.generated.SolidityLexer;
import com.example.SonamuProject.preprocessor.generated.SolidityParser;
import com.example.SonamuProject.preprocessor.listener.SonamuPreprocessor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class TranslateController {

    @Autowired SonamuPreprocessor sonamuPreprocessor;
    @Autowired TargetCode targetCode;

    @PostMapping("/translate")
    public String translate(Model model, SourceCode sourceCode) throws IOException {

        CharStream codeCharStream = CharStreams.fromString(sourceCode.getCode());
        SolidityLexer lexer = new SolidityLexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolidityParser parser = new SolidityParser(tokens);
        ParseTree tree = parser.sourceUnit(); // solidity 시작점은 sourceUnit

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(sonamuPreprocessor, tree);

        model.addAttribute("source", sourceCode.getCode());
        model.addAttribute("target", targetCode.getCode());

        return "index";

    }
}
