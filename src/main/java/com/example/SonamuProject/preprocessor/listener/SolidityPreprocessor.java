package com.example.SonamuProject.preprocessor.listener;

import com.example.SonamuProject.preprocessor.generated.SolidityParser;
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
    @Override
    public void exitIdentifier(SonamuParser.IdentifierContext ctx) {
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
            String terminal = ctx.getChild(0).getText();
            switch(terminal) {
                case "참":
                    s1 = "true";
                    break;
                case "거짓":
                    s1 = "true";
                    break;
                default:
                    s1 = ctx.getChild(0).getText();
                    break;
            }
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
    @Override public void exitNumberLiteral(SonamuParser.NumberLiteralContext ctx) {
        String s1 = ctx.getChild(0).getText();
        String s2 = "";
        if (ctx.getChildCount() >= 2) {
            s2 += ctx.getChild(1).getText();
        }
        strTree.put(ctx, s1 + s2);
    }
    @Override public void exitContractDefinition(SonamuParser.ContractDefinitionContext ctx) {
        String natSpec = "";
        String kindOf = "";
        String identifier = "";
        String inheritanceSpecifierPart = "";
        String leftParentheses = "";
        String contractPart = "";
        String rightParentheses = "";

        int indexOfKindOf = 1;


        if (ctx.natSpec() != null) {
            natSpec = strTree.get(ctx.natSpec());
            indexOfKindOf = 2;
        }

        // TODO) 인터페이스와 라이브러리 다른 한글 키워드로 변경
        if ((ctx.getChild(indexOfKindOf).getText()).equals("계약")) {
            kindOf = "contract";
        } else if ((ctx.getChild(indexOfKindOf).getText()).equals("인터페이스")) {
            kindOf = "interface";
        } else {
            kindOf = "library";
        }


        // TODO) identifier -> 계약 이름 한글로 변경해야함
        identifier = strTree.get(ctx.identifier());

        int countInheritanceSpecifier;
        if ((countInheritanceSpecifier = ctx.inheritanceSpecifier().size()) != 0) {
            inheritanceSpecifierPart += " is "; // 'is '
            inheritanceSpecifierPart += strTree.get(ctx.inheritanceSpecifier(0));
            for (int i = 1; i < countInheritanceSpecifier; i++) {
                inheritanceSpecifierPart += ctx.getChild(indexOfKindOf + 2 + 2 * i); // ','
                inheritanceSpecifierPart += " " + strTree.get(ctx.inheritanceSpecifier(i));
            }
        }

        int countContractPart = ctx.contractPart().size();
        leftParentheses = ctx.getChild(ctx.getChildCount() - countContractPart - 2).getText(); // '{'
        rightParentheses = ctx.getChild(ctx.getChildCount() - 1).getText(); // '}'
        for (int i = 0; i < countContractPart; i++) {
            contractPart += strTree.get(ctx.contractPart(i));
        }

        strTree.put(ctx, natSpec + "\n" + kindOf + " " + identifier + inheritanceSpecifierPart +
                " " + leftParentheses + contractPart + "\n" + rightParentheses);
    }

    @Override public void exitTypeName(SonamuParser.TypeNameContext ctx) {
        if (ctx.elementaryTypeName() != null) {
            strTree.put(ctx, strTree.get(ctx.elementaryTypeName()));
        } else if (ctx.userDefinedTypeName() != null) {
            strTree.put(ctx, strTree.get(ctx.userDefinedTypeName()));
        } else if (ctx.mapping() != null) {
            strTree.put(ctx, strTree.get(ctx.mapping()));
        } else if (ctx.typeName() != null) {
            String typeName = strTree.get(ctx.typeName());
            String s1 = ctx.getChild(1).getText();
            String s2;
            if (ctx.expression() != null) {
                // expression이 존재하는 경우
                String expr = strTree.get(ctx.expression());
                s2 = ctx.getChild(3).getText();
                strTree.put(ctx, typeName + s1 + expr + s2);
            } else {
                // expression이 존재하지 않는 경우
                s2 = ctx.getChild(2).getText();
                strTree.put(ctx, typeName + s1 + s2);
            }
        } else if (ctx.functionTypeName() != null) {
            strTree.put(ctx, strTree.get(ctx.functionTypeName()));
        } else {
            // address payable -> "지불가능한 주소" 로 번역
            String s1 = "address";
            String s2 = "payable";
            strTree.put(ctx, s2 + " " + s1);
        }
    }
    @Override public void exitElementaryTypeName(SonamuParser.ElementaryTypeNameContext ctx) {
        String s = ctx.getChild(0).getText();
        String cuttingS = s.substring(0,1);
        strTree.put(ctx,cuttingS);
        switch(cuttingS){
            case "주" :
                strTree.put(ctx,"address");
                break;
            case "논":
                strTree.put(ctx, "boolean");
                break;
            case "문":
                strTree.put(ctx, "string");
                break;
            case "변":
                strTree.put(ctx, "var");
                break;
            case "바":
                if(s.length() == 3){
                    strTree.put(ctx, "byte");
                } else if(s.length() == 5) {
                    strTree.put(ctx, "bytes");
                } else {
                    strTree.put(ctx, "bytes" + s.substring(5));
                }
                break;
            case "정":
                if (s.length() == 2) {
                    strTree.put(ctx,"int");
                }else {
                    strTree.put(ctx, "int" + s.substring(2));
                }
                break;
            case "양":
                //양의정수와 양의고정소수점 구분하기
                String cutS = s.substring(0,4);
                if (cutS.equals("양의정수")){
                    if(s.length() == 4){
                        strTree.put(ctx,"uint");
                    }else{
                        strTree.put(ctx,"uint" + s.substring(4));
                    }
                }else {
                    if(s.length() == 7){
                        strTree.put(ctx,"ufixed");
                    }else{
                        strTree.put(ctx, "ufixed" + s.substring(7));
                    }
                }
                break;
            case "고":
                if(s.length() ==5){
                    strTree.put(ctx,"fixed");
                }else{
                    strTree.put(ctx, "fixed"+s.substring(5));
                }
                break;
            default:
                break;
        }
    }
    @Override public void exitUserDefinedTypeName(SonamuParser.UserDefinedTypeNameContext ctx) {
        int numOfIdentifier = ctx.identifier().size();
        String result = strTree.get(ctx.identifier(0));
        for (int i = 1; i < numOfIdentifier; i++) {
            result += ctx.getChild(2 * i - 1).getText(); // '.'
            result += strTree.get(ctx.identifier(1));
        }
        strTree.put(ctx, result);
    }
    @Override public void exitMapping(SonamuParser.MappingContext ctx) {
        String s1 = "mapping"; // '짝궁' -> "mapping"
        String s2 = ctx.getChild(1).getText(); // '('
        String s3 = ctx.getChild(3).getText(); // '=>'
        String s4 = ctx.getChild(5).getText(); // ')'
        String elementaryTypeName = strTree.get(ctx.elementaryTypeName());
        String typeName = strTree.get(ctx.typeName());
        strTree.put(ctx, s1 + s2 + elementaryTypeName + " " + s3 + " " + typeName + s4);
    }

    @Override public void exitFunctionTypeName(SonamuParser.FunctionTypeNameContext ctx) {
        int count = ctx.getChildCount();
        String s1 = "function";
        String functionTypeParameterList1 = strTree.get(ctx.functionTypeParameterList(0));

        String mid = "";

        String ret = "";
        String functionTypeParameterList2 = "";
        if(ctx.functionTypeParameterList(1) != null) {
            ret = "returns";
            functionTypeParameterList2 = strTree.get(ctx.functionTypeParameterList(1));
            count -= 2;
        }

        for(int i = 2; i < count; i++) {
            if(ctx.getChild(i).getText().equals(":내부용"))
                mid += "internal";
            else if(ctx.getChild(i).getText().equals(":외부용"))
                mid += "external";
            else
                mid += strTree.get(ctx.stateMutability(i));
        }

        strTree.put(ctx, s1 + functionTypeParameterList1 + mid + ret + functionTypeParameterList2);
    }
    @Override public void enterStateMutability(SonamuParser.StateMutabilityContext ctx) {
        String keyword = "";
        if(ctx.getChild(0).getText().equals(":순수함수"))
            keyword = "pure";
        else if(ctx.getChild(0).getText().equals(":불변처리"))
            keyword = "constant";
        else if(ctx.getChild(0).getText().equals(":읽기전용"))
            keyword = "view";
        else if(ctx.getChild(0).getText().equals(":지불가능"))
            keyword = "payable";
        strTree.put(ctx, keyword);
    }
    @Override public void exitFunctionTypeParameterList(SonamuParser.FunctionTypeParameterListContext ctx) {
        int count = ctx.functionTypeParameter().size();
        String s1 = ctx.getChild(0).getText(); // '('
        String s2 = ctx.getChild(ctx.getChildCount() - 1).getText(); // ')'
        String mid = "";
        if (count >= 1) {
            mid = strTree.get(ctx.functionTypeParameter(0));
        }
        for (int i = 1; i < count; i++) {
            mid += ctx.getChild(2 * i).getText(); // ','
            mid += strTree.get(ctx.functionTypeParameter(i));
        }
        strTree.put(ctx, s1 + mid + s2);
    }
    @Override public void exitFunctionTypeParameter(SonamuParser.FunctionTypeParameterContext ctx) {
        String result = strTree.get(ctx.typeName());
        if (ctx.storageLocation() != null) {
            result += strTree.get(ctx.storageLocation());
        }
        strTree.put(ctx, result);
    }
    @Override public void exitStorageLocation(SonamuParser.StorageLocationContext ctx) {
        strTree.put(ctx, ctx.getChild(0).getText());
    }


    @Override public void exitNatSpec(SonamuParser.NatSpecContext ctx) {
        //todo
    }
    @Override public void exitInheritanceSpecifier(SonamuParser.InheritanceSpecifierContext ctx) {
        String userDefinedTypeName = strTree.get(ctx.userDefinedTypeName());
        String exprList = "";
        String s1 = "";
        String s2 = "";
        if (ctx.expressionList() != null) {
            s1 = ctx.getChild(1).getText(); // '('
            s2 = ctx.getChild(3).getText(); // ')'
            exprList = strTree.get(ctx.expressionList());
        }
        strTree.put(ctx, userDefinedTypeName + s1 + exprList + s2);
    }

    @Override
    public void exitModifierDefinition(SonamuParser.ModifierDefinitionContext ctx) {
        String s1 = "modifier";
        String s2 = strTree.get(ctx.identifier());
        String s3 = "";
        if (ctx.parameterList() != null) {
            s3 = strTree.get(ctx.parameterList());
        }
        String s4 = strTree.get(ctx.block());
        strTree.put(ctx, s1 + " " + s2 + s3 + s4);
    }

    @Override public void enterContractPart(SonamuParser.ContractPartContext ctx) {
        indent++;
    }
    @Override public void exitContractPart(SonamuParser.ContractPartContext ctx) {
        indent--;
        strTree.put(ctx, "\n\n\t" + strTree.get(ctx.getChild(0)));
    }
    @Override public void exitParameterList(SonamuParser.ParameterListContext ctx) {
        int count = ctx.parameter().size();
        String s1 = ctx.getChild(0).getText(); // '('
        String s2 = ctx.getChild(ctx.getChildCount() - 1).getText(); // ')'
        String mid = "";
        if (count >= 1) {
            mid = strTree.get(ctx.parameter(0));
        }
        for (int i = 1; i < count; i++) {
            mid += ctx.getChild(2 * i).getText(); // ',
            mid += " ";
            mid += strTree.get(ctx.parameter(i));
        }
        strTree.put(ctx, s1 + mid + s2);
    }
    @Override public void exitParameter(SonamuParser.ParameterContext ctx) {
        String typeName = strTree.get(ctx.typeName());
        String storage = "";
        String identifier = "";
        if (ctx.storageLocation() != null) {
            storage += " " + strTree.get(ctx.storageLocation());
        }
        if (ctx.identifier() != null) {
            storage += " " + strTree.get(ctx.identifier());
        }
        strTree.put(ctx, typeName + storage + identifier);
    }
    @Override
    public void exitReturnParameters(SonamuParser.ReturnParametersContext ctx) {
        // 'returns' parameterList ;
        String s1 = "returns";
        String s2 = strTree.get(ctx.parameterList());
        strTree.put(ctx, s1 + " " + s2);
    }

    @Override
    public void enterBlock(SonamuParser.BlockContext ctx) {
        indent++;
    }

    // block
    @Override
    public void exitBlock(SonamuParser.BlockContext ctx) {
        indent--;
        int count = ctx.statement().size();
        String start = ctx.getChild(0).getText(); // '{'
        String end = ctx.getChild(ctx.getChildCount() - 1).getText(); // '}'
        String mid = "";
        if (count >= 1) {
            mid = "\n" + strTree.get(ctx.statement(0)) + "\n";
        }
        for (int i = 1; i < count; i++) {
            mid += strTree.get(ctx.statement(i));
            mid += "\n";
        }
        strTree.put(ctx, start + mid + printIndent() + end + "\n");
    }

    // eventParmeterList
    @Override
    public void exitEventParameterList(SonamuParser.EventParameterListContext ctx) {
        // '(' ( eventParameter (',' eventParameter)* )? ')' ;
        int count = ctx.eventParameter().size();
        String s1 = ctx.getChild(0).getText(); // '('
        String s2 = ctx.getChild(ctx.getChildCount() - 1).getText(); // ')'
        String mid = "";
        if (count >= 1) {
            mid = strTree.get(ctx.eventParameter(0));
        }
        for (int i = 1; i < count; i++) {
            mid += ctx.getChild(2 * i).getText() + " "; // ','
            mid += strTree.get(ctx.eventParameter(i));
        }
        strTree.put(ctx, s1 + mid + s2);
    }

    // eventparmeter
    @Override
    public void exitEventParameter(SonamuParser.EventParameterContext ctx) {
        // typeName IndexedKeyword? identifier?
        int count = ctx.getChildCount() - 1; // indexedkeyword와 identifier의 갯수
        String typeName = strTree.get(ctx.typeName());
        String indexedKeyword = "";
        String identifier = "";

        // indexedkeyword가 있으면 count -1
        if ((ctx.getChild(1).getText()).equals("검색")) {
            indexedKeyword = " indexed ";
            count = count - 1;
        }

        // count가 0이상이면 identifer가 있는것
        if (count > 0) {
            identifier = strTree.get(ctx.getChild(ctx.getChildCount() - 1));
        }

        strTree.put(ctx, typeName + indexedKeyword +" "+ identifier);

    }

    @Override
    public void exitStatement(SonamuParser.StatementContext ctx) {
        if(ctx.block()!=null){
            strTree.put(ctx, strTree.get(ctx.getChild(0)));
        }else{
            strTree.put(ctx, printIndent()+strTree.get(ctx.getChild(0)));
        }
    }

    @Override
    /*( modifierInvocation | stateMutability | ExternalKeyword
       | PublicKeyword | InternalKeyword | PrivateKeyword )* ;*/
    // TODO) terminal만 번역한 상태
    public void exitModifierList(SonamuParser.ModifierListContext ctx) {
        int count = ctx.getChildCount();
        String result = "";
        for (int i = 0; i < count; i++) {
            // child가 Non-Terminal 인 경우
            if (ctx.getChild(i) instanceof SonamuParser.ModifierInvocationContext
                    || ctx.getChild(i) instanceof SonamuParser.StateMutabilityContext) {
                if ((ctx.getChild(i).getText()).equals(":지불가능")) {
                    result += "payable";
                } else {
                    result += strTree.get(ctx.getChild(i));
                }
            }
            // ExternalKeyword | PublicKeyword | InternalKeyword | PrivateKeyword -> : 외부용 | : 공용 | : 개인용 | : 상속자용 으로 변경
            else {
                if ((ctx.getChild(i).getText()).equals(":공용")) {
                    result += "public";
                } else if ((ctx.getChild(i).getText()).equals(":외부용")) {
                    result += "external";
                } else if ((ctx.getChild(i).getText()).equals(":상속용")) {
                    result += "internal";
                } else if ((ctx.getChild(i).getText()).equals(":개인용")) {
                    result += "private";
                }
            }
            // 키워드 다음 공백 추가
            if (i < count - 1) {
                result += " ";
            }
        }
        strTree.put(ctx, result);
    }

    @Override
    public void exitModifierInvocation(SonamuParser.ModifierInvocationContext ctx) {
        String identifier = strTree.get(ctx.identifier());
        String s1 = "";
        String s2 = "";
        String exprList = "";
        if (ctx.expressionList() != null) {
            s1 = ctx.getChild(1).getText(); // '('
            s2 = ctx.getChild(3).getText(); // ')'
            exprList = strTree.get(ctx.expressionList());
        }
        strTree.put(ctx, identifier + s1 + exprList + s2);
    }

    @Override
    public void exitExpressionList(SonamuParser.ExpressionListContext ctx) {
        int expr_size = ctx.expression().size();
        StringBuffer expr_sb = new StringBuffer();
        expr_sb.append(strTree.get(ctx.expression(0)));
        if (expr_size > 1) {
            for (int i = 1; i < expr_size; i++)
                expr_sb.append(", " + strTree.get(ctx.expression(i)));
        }
        strTree.put(ctx, expr_sb.toString());
    }

    @Override
    /* typeName
    ( PublicKeyword | InternalKeyword | PrivateKeyword | ConstantKeyword )*
    identifier ('=' expression)? ';' ; */
    public void exitStateVariableDeclaration(SonamuParser.StateVariableDeclarationContext ctx) {
        int count = ctx.getChildCount();
        String typeName = strTree.get(ctx.typeName());
        String keyword = "";
        String id = "";
        String expr = "";
        for(int i = 2; i < count; i++) {
            if ((ctx.getChild(i).getText()).equals(":공용")) {
                keyword += "public";
            } else if ((ctx.getChild(i).getText()).equals(":불변처리")) {
                keyword += "constant";
            } else if ((ctx.getChild(i).getText()).equals(":상속용")) {
                keyword += "internal";
            } else if ((ctx.getChild(i).getText()).equals(":개인용")) {
                keyword += "private";
            } else {
                keyword += "";
            }
        }

        id = strTree.get(ctx.identifier());
        if (ctx.expression() != null) {
            expr = " = " + strTree.get(ctx.expression());
            strTree.put(ctx, typeName + " " + keyword+" "+ id + expr + ";");
        } else {
            strTree.put(ctx, typeName + " " + keyword+ " "+ id + ";");
        }
    }

    @Override
    // natSpec? 'function' identifier? parameterList modifierList returnParameters? ( ';' | block ) ;
    public void exitFunctionDefinition(SonamuParser.FunctionDefinitionContext ctx) {
        String natSpec = "";
        StringBuilder func_sb = new StringBuilder();
        if (ctx.natSpec() != null) {
            natSpec = strTree.get(ctx.natSpec());
            func_sb.append("function");
        } else
            func_sb.append("function");
        if (ctx.identifier() != null)
            func_sb.append(" ").append(strTree.get(ctx.identifier()));
        func_sb.append(strTree.get(ctx.parameterList()));
        func_sb.append(" ").append(strTree.get(ctx.modifierList()));
        if (ctx.returnParameters() != null)
            func_sb.append(" ").append(strTree.get(ctx.returnParameters()));
        if (ctx.block() != null)
            func_sb.append(" " +strTree.get(ctx.block()));
        else
            func_sb.append(";");
        strTree.put(ctx, natSpec + func_sb);
    }

    @Override
    //natSpec? 'event' identifier eventParameterList AnonymousKeyword? ';' ;
    public void exitEventDefinition(SonamuParser.EventDefinitionContext ctx) {
        String natSpec = "";
        String event = "event";
        String identifier = strTree.get(ctx.identifier());
        StringBuilder event_sb = new StringBuilder();
        if (ctx.natSpec() != null) {
            natSpec = strTree.get(ctx.natSpec()) + " ";
        }
        event_sb.append(strTree.get(ctx.eventParameterList()));
        if (ctx.AnonymousKeyword() != null)
            event_sb.append(" " + ctx.AnonymousKeyword());
        event_sb.append(";");
        strTree.put(ctx, natSpec + event+" "+identifier + event_sb);
    }

    @Override
    public void exitIfStatement(SonamuParser.IfStatementContext ctx) {
        String if_snm = "if";
        String expr = strTree.get(ctx.expression());
        String if_stmt = strTree.get(ctx.statement(0));

        String else_snm = "";
        String else_stmt = "";
        if (ctx.statement().size() >= 2) {
            else_snm = "else";
            else_stmt = strTree.get(ctx.statement(1));
        }
        strTree.put(ctx, if_snm + " (" + expr + ")" + " " + if_stmt + printIndent() + else_snm + " " + else_stmt);

        /*
        String s1 = ctx.getChild(0).getText(); // 'if'
        String s2 = ctx.getChild(1).getText(); // '('
        String expr = strTree.get(ctx.expression());
        String s3 = ctx.getChild(3).getText(); // ')'
        String ifStatement = strTree.get(ctx.statement(0));

        // else 구문 존재 시
        String s4 = "";
        String elseStatement = "";
        if (ctx.statement().size() >= 2) {
            s4 = ctx.getChild(5).getText(); // 'else'
            elseStatement = strTree.get(ctx.statement(1));
        }
        strTree.put(ctx, printIndent() + s1 + s2 + expr + s3 + " " + ifStatement + printIndent() + s4 + " " + elseStatement);
        */
    }


    @Override
    public void exitSimpleStatement(SonamuParser.SimpleStatementContext ctx) {
        strTree.put(ctx, strTree.get(ctx.getChild(0)));
    }

    @Override
    public void exitVariableDeclarationStatement(SonamuParser.VariableDeclarationStatementContext ctx) {
        String s = "";
        String expr = "";

        if(ctx.identifierList() != null){
            s = "var " + strTree.get(ctx.identifierList());
        }else if(ctx.variableDeclaration() != null)
            s = strTree.get(ctx.variableDeclaration());
        else
            s = "(" + strTree.get(ctx.variableDeclarationList()) + ")";

        if(ctx.expression() != null)
            expr = " = " + strTree.get(ctx.expression());
        strTree.put(ctx, s + expr + ";");
        /*
        String start = "";
        String end = "";

        // 앞부분 노드 개수 파악
        int count = ctx.getChildCount() - 1;
        if (ctx.expression() != null) {
            end += ctx.getChild(count - 3).getText(); // '='
            end += strTree.get(ctx.expression());
            count -= 2;
        }

        if (count == 1) {
            start += strTree.get(ctx.variableDeclaration());
        } else if (count == 2) {
            start += ctx.getChild(0).getText();
            start += strTree.get(ctx.identifierList());
        } else {
            start += ctx.getChild(0).getText();
            start += strTree.get(ctx.variableDeclarationList());
            start += ctx.getChild(2).getText();
        }
        end += ctx.getChild(ctx.getChildCount() - 1).getText(); // ';'
        strTree.put(ctx, printIndent() + start + end);
        */
    }


    @Override
    public void exitExpressionStatement(SonamuParser.ExpressionStatementContext ctx) {
        String expr = strTree.get(ctx.expression());
        String s1 = ";";
        strTree.put(ctx, expr + s1);
    }

    @Override
    public void exitIdentifierList(SonamuParser.IdentifierListContext ctx) {
        int count = ctx.getChildCount();
        String start = ctx.getChild(0).getText(); // '('
        String end = ctx.getChild(count - 1).getText(); // ')'
        String mid = "";
        int identIndex = 0;
        for (int i = 1; i < count - 1; i++) {
            if (ctx.getChild(i) instanceof SonamuParser.IdentifierContext) {
                mid += strTree.get(ctx.identifier(identIndex++));
            } else {
                mid += ctx.getChild(i).getText(); // ','
            }
        }
        strTree.put(ctx, start + mid + end);
    }

    @Override
    public void exitVariableDeclarationList(SonamuParser.VariableDeclarationListContext ctx) {
        int count = ctx.getChildCount();
        String result = "";
        int identIndex = 0;
        for (int i = 0; i < count; i++) {
            if (ctx.getChild(i) instanceof SonamuParser.VariableDeclarationContext) {
                result += strTree.get(ctx.variableDeclaration(identIndex++));
            } else {
                result += ctx.getChild(i).getText(); // ','
            }
        }
        strTree.put(ctx, result);
    }

    // variableDeclaration
    //  : typeName storageLocation? identifier ;

    @Override
    public void exitVariableDeclaration(SonamuParser.VariableDeclarationContext ctx) {
        String typeName = strTree.get(ctx.typeName());
        String storage = "";
        if (ctx.storageLocation() != null) {
            storage = " " + strTree.get(ctx.storageLocation());
        }
        String id = strTree.get(ctx.identifier());
        strTree.put(ctx, typeName + storage + " " + id);
    }


    @Override
    public void exitReturnStatement(SonamuParser.ReturnStatementContext ctx) {
        // '반환' expression? ';'
        String return_smn = "return";
        String expr = "";
        if (ctx.expression() != null) {
            expr = strTree.get(ctx.expression());
        }
        strTree.put(ctx, return_smn + " " + expr+";");
    }

    @Override
    public void exitEmitStatement(SonamuParser.EmitStatementContext ctx) {
        String emit_smn = "emit";
        String funcCall = strTree.get(ctx.functionCall());
        strTree.put(ctx, emit_smn + " " + funcCall + ";");
    }

    @Override
    public void exitFunctionCall(SonamuParser.FunctionCallContext ctx) {
        String expr = strTree.get(ctx.expression());
        String funcCallArgu = strTree.get(ctx.functionCallArguments());
        strTree.put(ctx, expr + "( " + funcCallArgu + " )");
    }

    @Override
    public void exitFunctionCallArguments(SonamuParser.FunctionCallArgumentsContext ctx) {
        String whatList = "";
        if (ctx.getChild(1) != null && ctx.getChild(1).equals("}")) {
            whatList = "{ " + strTree.get(ctx.nameValueList()) + " }";
        } else {
            whatList = strTree.get(ctx.expressionList());
        }
        strTree.put(ctx, whatList);
    }

    @Override
    public void exitNameValueList(SonamuParser.NameValueListContext ctx) {
        int size = ctx.getChildCount();
        String nameValue = ctx.getChild(0).getText();
        String nameValue_plus = "";
        for (int i = 1; i < size; i++) {
            nameValue_plus += ", " + ctx.getChild(i);
        }
        strTree.put(ctx, nameValue + nameValue_plus);
    }

    // 'constructor' parameterList modifierList block ;
    @Override
    public void exitConstructorDefinition(SonamuParser.ConstructorDefinitionContext ctx) {
        // constructor -> "초안" 번역완료
        String constructor = "constructor";
        String parameterList = strTree.get(ctx.parameterList());
        String modifierList = strTree.get(ctx.modifierList());
        String block = strTree.get(ctx.block());

        strTree.put(ctx, constructor + " " + parameterList + " " + modifierList + " " + block);
    }
    @Override
    public void exitNameValue(SonamuParser.NameValueContext ctx) {
        String identifier = strTree.get(ctx.identifier());
        String expr = strTree.get(ctx.expression());
        strTree.put(ctx, identifier + " : " + expr);
    }
    @Override
    public void exitWhileStatement(SonamuParser.WhileStatementContext ctx) {
        String while_snm = "while ";
        String expr = strTree.get(ctx.expression());
        String state = strTree.get(ctx.statement());
        strTree.put(ctx, printIndent() + while_snm +"(" + expr + ") "+ state);
    }

    @Override
    public void exitRequireStatement(SonamuParser.RequireStatementContext ctx) {
        String require_snm = "require";
        String exprList = strTree.get(ctx.expressionList());

        strTree.put(ctx, require_snm + " (" + exprList + ");");
    }

    @Override
    public void exitRevertStatement(SonamuParser.RevertStatementContext ctx) {
        String revert_sol = "revert";
        String expr = "";
        if(ctx.expression() != null)
            expr = strTree.get(ctx.expression());
        strTree.put(ctx, revert_sol + "(" + expr + ");");
    }

    @Override
    public void exitTypeNameExpression(SonamuParser.TypeNameExpressionContext ctx) {
        if(ctx.elementaryTypeName() != null)
            strTree.put(ctx, strTree.get(ctx.elementaryTypeName()));
        else
            strTree.put(ctx, strTree.get(ctx.userDefinedTypeName()));
    }
/*
    @Override
    public void exitForStatement(SonamuParser.ForStatementContext ctx) {
        String id = "";
        String range = "";
        String expr = "";
        String stmt = strTree.get(ctx.statement());

        if(ctx.simpleStatement() != null)
            id = strTree.get(ctx.simpleStatement()).replace(";", "");
        if(ctx.expressionStatement() != null)
            range = strTree.get(ctx.expressionStatement()).replace(";","");
        if(ctx.expression() != null)
            expr = strTree.get(ctx.expression());

        strTree.put(ctx, id + "이/가 " + range + "안에서 " + expr + "실행" + printIndent() + stmt);
    }*/

    @Override
    public void exitContinueStatement(SonamuParser.ContinueStatementContext ctx) {
        strTree.put(ctx, "continue;");
    }

    @Override
    public void exitBreakStatement(SonamuParser.BreakStatementContext ctx) {
        strTree.put(ctx, "break;");
    }


}