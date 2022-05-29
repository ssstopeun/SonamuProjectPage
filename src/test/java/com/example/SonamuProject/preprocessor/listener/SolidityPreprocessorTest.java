package com.example.SonamuProject.preprocessor.listener;

import com.example.SonamuProject.preprocessor.sonamuGenerated.SonamuLexer;
import com.example.SonamuProject.preprocessor.sonamuGenerated.SonamuParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolidityPreprocessorTest {

    String removeAllWhitespaces(String str) {
        return str.replaceAll("(\r\n|\r|\n|\n\r|\\p{Z}|\\t)", "");
    }

    String setProgram(String given) {
        CharStream codeCharStream = CharStreams.fromString(given);
        SonamuLexer lexer = new SonamuLexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SonamuParser parser = new SonamuParser(tokens);
        ParseTree tree = parser.sourceUnit(); // solidity 시작점은 sourceUnit

        ParseTreeWalker walker = new ParseTreeWalker();

        SolidityPreprocessor solidityPreprocessor = new SolidityPreprocessor();
        walker.walk(solidityPreprocessor, tree);
        return solidityPreprocessor.getOutput();
    }

    @Test
    @DisplayName("contract 키워드 번역 테스트")
    void contract() {
        // 입력 데이터
        String given = "test 계약 { }";

        // 예상 출력 값
        String expect = removeAllWhitespaces("contract test { }");

        // 실제 출력 값
        String actual = removeAllWhitespaces(setProgram(given));

        // 예상 값과 실제 값 비교
        assertThat(expect).isEqualTo(actual);
    }


}