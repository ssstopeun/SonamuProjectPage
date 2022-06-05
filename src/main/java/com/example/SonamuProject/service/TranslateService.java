package com.example.SonamuProject.service;

import com.example.SonamuProject.dto.SourceCode;
import com.example.SonamuProject.preprocessor.ErrorHandler;
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

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;


@Service
public class TranslateService {

    private final String CODE_ERR_MSG = "입력한 코드가 올바르지 않습니다.\n코드를 다시 확인해주세요!";

    public String translate(SourceCode sourceCode) throws FileNotFoundException, UnsupportedEncodingException {
        if (sourceCode.getTypeOfCode().equals("solidity")) {
            return solidityToSonamuTranslate(sourceCode);
        }
        // default
        return sonamuToSolidityTranslate(sourceCode);
    }

    // solidity -> sonamu
    private String solidityToSonamuTranslate(SourceCode sourceCode) throws FileNotFoundException, UnsupportedEncodingException {
        // 코드 입력 오류 처리를 위한 PrintStream 변경
        ErrorHandler.ErrorDelegatingPrintStream errReplacement = new ErrorHandler.ErrorDelegatingPrintStream(System.err);
        System.setErr(errReplacement);

        CharStream codeCharStream = CharStreams.fromString(sourceCode.getCode());
        SolidityLexer lexer = new SolidityLexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolidityParser parser = new SolidityParser(tokens);
        try {
            ParseTree tree = parser.sourceUnit();
            ParseTreeWalker walker = new ParseTreeWalker();

            SonamuPreprocessor sonamuPreprocessor = new SonamuPreprocessor();
            walker.walk(sonamuPreprocessor, tree);
            return sonamuPreprocessor.getOutput();
        } catch (RuntimeException e) {
            return CODE_ERR_MSG;
        }
    }

    // sonamu -> solidity
    private String sonamuToSolidityTranslate(SourceCode sourceCode) throws FileNotFoundException, UnsupportedEncodingException {
        // 코드 입력 오류 처리를 위한 PrintStream 변경
        ErrorHandler.ErrorDelegatingPrintStream errReplacement = new ErrorHandler.ErrorDelegatingPrintStream(System.err);
        System.setErr(errReplacement);

        CharStream codeCharStream = CharStreams.fromString(sourceCode.getCode());
        SonamuLexer lexer = new SonamuLexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SonamuParser parser = new SonamuParser(tokens);
        try {
            ParseTree tree = parser.sourceUnit();
            ParseTreeWalker walker = new ParseTreeWalker();

            SolidityPreprocessor solidityPreprocessor = new SolidityPreprocessor();
            walker.walk(solidityPreprocessor, tree);
            return solidityPreprocessor.getOutput();
        } catch (RuntimeException e) {
            return CODE_ERR_MSG;
        }
    }

}
