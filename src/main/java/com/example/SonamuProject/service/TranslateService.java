package com.example.SonamuProject.service;

import com.example.SonamuProject.dto.SourceCode;
import com.example.SonamuProject.preprocessor.generated.SolidityLexer;
import com.example.SonamuProject.preprocessor.generated.SolidityParser;
import com.example.SonamuProject.preprocessor.listener.SolidityPreprocessor;
import com.example.SonamuProject.preprocessor.listener.SonamuPreprocessor;
import com.example.SonamuProject.preprocessor.sonamuGenerated.SonamuLexer;
import com.example.SonamuProject.preprocessor.sonamuGenerated.SonamuParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Service;

@Service
public class TranslateService {

    public String translate(SourceCode sourceCode) {
        if (sourceCode.getTypeOfCode().equals("solidity")) {
            return solidityToSonamuTranslate(sourceCode);
        }
        // default
        return sonamuToSolidityTranslate(sourceCode);
    }

    // solidity -> sonamu
    private String solidityToSonamuTranslate(SourceCode sourceCode) {
        CharStream codeCharStream = CharStreams.fromString(sourceCode.getCode());
        SolidityLexer lexer = new SolidityLexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolidityParser parser = new SolidityParser(tokens);
        ParseTree tree = parser.sourceUnit(); // solidity 시작점은 sourceUnit

        ParseTreeWalker walker = new ParseTreeWalker();

        SonamuPreprocessor sonamuPreprocessor = new SonamuPreprocessor();
        walker.walk(sonamuPreprocessor, tree);
        return sonamuPreprocessor.getOutput();
    }

    // sonamu -> solidity
    private String sonamuToSolidityTranslate(SourceCode sourceCode) {
        CharStream codeCharStream = CharStreams.fromString(sourceCode.getCode());
        SonamuLexer lexer = new SonamuLexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SonamuParser parser = new SonamuParser(tokens);
        ParseTree tree = parser.sourceUnit(); // solidity 시작점은 sourceUnit

        ParseTreeWalker walker = new ParseTreeWalker();

        SolidityPreprocessor solidityPreprocessor = new SolidityPreprocessor();
        walker.walk(solidityPreprocessor, tree);
        return solidityPreprocessor.getOutput();
    }

}
