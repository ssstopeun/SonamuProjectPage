package com.example.SonamuProject.preprocessor.listener;

import com.example.SonamuProject.preprocessor.generated.SolidityLexer;
import com.example.SonamuProject.preprocessor.generated.SolidityParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SonamuPreprocessorTest {

    String removeAllWhitespaces(String str) {
        return str.replaceAll("(\r\n|\r|\n|\n\r|\\p{Z}|\\t)", "");
    }

    String setProgram(String given) {
        CharStream codeCharStream = CharStreams.fromString(given);
        SolidityLexer lexer = new SolidityLexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolidityParser parser = new SolidityParser(tokens);
        ParseTree tree = parser.sourceUnit(); // solidity 시작점은 sourceUnit

        ParseTreeWalker walker = new ParseTreeWalker();

        SonamuPreprocessor sonamuPreprocessor = new SonamuPreprocessor();
        walker.walk(sonamuPreprocessor, tree);
        return sonamuPreprocessor.getOutput();
    }

    @Test
    @DisplayName("contract 키워드 번역 테스트")
    void contract() {
        // 입력 데이터
        String given = "contract test { }";

        // 예상 출력 값
        String expect = removeAllWhitespaces("test 계약 { }");

        // 실제 출력 값
        String actual = removeAllWhitespaces(setProgram(given));

        // 예상 값과 실제 값 비교
        assertThat(expect).isEqualTo(actual);
    }

    @Test
    @DisplayName("function 키워드 번역 테스트")
    void function() {
        // 입력 데이터
        String given = "contract test {\n" +
                "function f();\n" +
                "}";

        // 예상 출력 값
        String expect = removeAllWhitespaces("test 계약 {\n" +
                "\n" +
                "\t계약내용 f() ;\n" +
                "}");

        // 실제 출력 값
        String actual = removeAllWhitespaces(setProgram(given));

        // 예상 값과 실제 값 비교
        assertThat(expect).isEqualTo(actual);
    }


}