package com.example.SonamuProject.preprocessor.listener;

import com.example.SonamuProject.preprocessor.sonamuGenerated.SonamuBaseListener;
import com.example.SonamuProject.preprocessor.sonamuGenerated.SonamuParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class SolidityPreprocessor extends SonamuBaseListener implements ParseTreeListener {
    private String output;

    ParseTreeProperty<String> strTree = new ParseTreeProperty<>(); // String으로 tree를 만들어주는 객체
    int indent = 0;

    // indent 값만큼 \t 추가
    public String printIndent() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            result.append("\t");
        }
        return result.toString();
    }

    public String getOutput() { return output; }
}
