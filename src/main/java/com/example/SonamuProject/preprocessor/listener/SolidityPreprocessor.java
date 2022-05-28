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

    public String getOutput() {
        return output;
    }

    @Override
    public void exitSourceUnit(SonamuParser.SourceUnitContext ctx) {
        String sourceUnit = "";
        // PragmaDirective
        for (int i = 0; i < ctx.pragmaDirective().size(); i++) {
            sourceUnit += strTree.get(ctx.pragmaDirective(i));
        }
        // ImportDirective
        for (int i = 0; i < ctx.importDirective().size(); i++) {
            sourceUnit += strTree.get(ctx.importDirective(i));
        }
        // ContractDefinition
        for (int i = 0; i < ctx.contractDefinition().size(); i++) {
            sourceUnit += strTree.get(ctx.contractDefinition(i));
        }

        output = sourceUnit;
    }

    @Override
    public void exitPragmaDirective(SonamuParser.PragmaDirectiveContext ctx) {
        String s1 = "pragma"; // "버전 -> prgma"
        String s3 = strTree.get(ctx.pragmaValue());
        String s4 = ctx.getChild(2).getText(); // ";"
        strTree.put(ctx, s1 + " solidity " + s3 + s4 + "\n");
    }
    @Override public void exitIdentifierList(SonamuParser.IdentifierListContext ctx) {
        strTree.put(ctx, ctx.getChild(0).getText());
    }

    @Override
    public void exitPragmaValue(SonamuParser.PragmaValueContext ctx) {
        if (ctx.version() != null) {
            strTree.put(ctx, strTree.get(ctx.version()));
        }
        if (ctx.expression() != null) {
            strTree.put(ctx, strTree.get(ctx.expression()));
        }
    }

    @Override public void exitVersion(SonamuParser.VersionContext ctx) {
        String result = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            result += strTree.get(ctx.getChild(i));
            if (i != ctx.getChildCount() - 1)
                result += " ";
        }
        strTree.put(ctx, result);
    }
    @Override public void exitVersionConstraint(SonamuParser.VersionConstraintContext ctx) {
        String result = "";
        if (ctx.versionOperator() != null) {
            result += strTree.get(ctx.versionOperator());
        }
        result += ctx.VersionLiteral().getText(); // VersionLiteral
        strTree.put(ctx, result);
    }
    @Override
    public void exitVersionOperator(SonamuParser.VersionOperatorContext ctx) {
        strTree.put(ctx, ctx.getChild(0).getText());
    }

    @Override
    public void exitExpression(SonamuParser.ExpressionContext ctx) {
        // Expression이 PrimaryExpression인 경우
        if (ctx.primaryExpression() != null) {
            strTree.put(ctx, strTree.get(ctx.primaryExpression()));
        } else {
            // PrimaryExpression외에는 nodeCount에 따라 분리
            int nodeCount = ctx.getChildCount();
            String expr1 = "", expr2 = "", op = "";

            switch (nodeCount) {
                case 2:
                    // 'new' typeName
                    if (ctx.typeName() != null) {
                        expr1 = strTree.get(ctx.typeName());
                        strTree.put(ctx, "new" + expr1);
                    }
                    // expression '++' | expression '--'
                    else if (ctx.getChild(0).equals(ctx.expression(0))) {
                        expr1 = strTree.get(ctx.expression(0));
                        op = ctx.getChild(1).getText();
                        strTree.put(ctx, expr1 + op);
                    } else {
                        expr1 = strTree.get(ctx.expression(0));
                        op = ctx.getChild(0).getText();
                        strTree.put(ctx, op + expr1);
                    }
                    break;
                case 3:
                    // expression '.' identifier
                    if (ctx.getChild(0).getText().equals("(")) {
                        expr1 = strTree.get(ctx.expression(0));
                        strTree.put(ctx, "(" + expr1 + ")");
                    } else if (ctx.identifier() != null) {
                        expr1 = strTree.get(ctx.expression(0));
                        expr2 = strTree.get(ctx.identifier());
                        op = ".";
                        strTree.put(ctx, expr1 + op + expr2);
                    } else {
                        expr1 = strTree.get(ctx.expression(0));
                        expr2 = strTree.get(ctx.expression(1));
                        op = ctx.getChild(1).getText();
                        strTree.put(ctx, expr1 + " " + op + " " + expr2);
                    }
                    break;
                case 4:
                    if (ctx.functionCallArguments() != null) {
                        expr1 = strTree.get(ctx.expression(0));
                        expr2 = strTree.get(ctx.functionCallArguments());
                        strTree.put(ctx, expr1 + " (" + expr2 + ")");
                    } else {
                        expr1 = strTree.get(ctx.expression(0));
                        expr2 = strTree.get(ctx.expression(1));
                        strTree.put(ctx, expr1 + " [" + expr2 + "]");
                    }
                    break;
                default:
                    expr1 = strTree.get(ctx.expression(0));
                    expr2 = strTree.get(ctx.expression(1));
                    String expr3 = strTree.get(ctx.expression(2));
                    strTree.put(ctx, expr1 + " ? " + expr2 + " : " + expr3);
            }
        }
    }

    @Override
    public void exitPrimaryExpression(SonamuParser.PrimaryExpressionContext ctx) {
        String s1 = "";
        if (ctx.getChild(0) == ctx.numberLiteral() || ctx.getChild(0) == ctx.identifier() ||
                ctx.getChild(0) == ctx.tupleExpression() || ctx.getChild(0) == ctx.typeNameExpression()) {
            // 논 터미널
            s1 = strTree.get(ctx.getChild(0));
        } else {
            // 터미널
            s1 = ctx.getChild(0).getText();
        }

        if (ctx.getChildCount() == 1) {
            // 노드가 한 개 짜리인 경우
            strTree.put(ctx, s1);
        } else {
            // 노드가 3개 인 경우
            String s2 = ctx.getChild(1).getText();
            String s3 = ctx.getChild(2).getText();
            strTree.put(ctx, s1 + s2 + s3);
        }
    }
}