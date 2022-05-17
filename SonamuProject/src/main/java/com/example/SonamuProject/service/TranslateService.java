package com.example.SonamuProject.service;

import com.example.SonamuProject.dto.SourceCode;
import com.example.SonamuProject.preprocessor.generated.SolidityLexer;
import com.example.SonamuProject.preprocessor.generated.SolidityParser;
import com.example.SonamuProject.preprocessor.listener.SonamuPreprocessor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslateService {

    private final SonamuPreprocessor sonamuPreprocessor;

    @Autowired
    public TranslateService(SonamuPreprocessor sonamuPreprocessor) {
        this.sonamuPreprocessor = sonamuPreprocessor;
    }

    public void translate(SourceCode sourceCode) {
        CharStream codeCharStream = CharStreams.fromString(sourceCode.getCode());
        SolidityLexer lexer = new SolidityLexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolidityParser parser = new SolidityParser(tokens);
        ParseTree tree = parser.sourceUnit(); // solidity 시작점은 sourceUnit

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(sonamuPreprocessor, tree);
    }

}
