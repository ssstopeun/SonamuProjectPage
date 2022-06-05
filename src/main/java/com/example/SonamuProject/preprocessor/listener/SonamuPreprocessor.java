package com.example.SonamuProject.preprocessor.listener;

import com.example.SonamuProject.preprocessor.generated.SolidityBaseListener;
import com.example.SonamuProject.preprocessor.generated.SolidityParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class SonamuPreprocessor extends SolidityBaseListener implements ParseTreeListener {

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

    // 결과 값 반환
    public String getOutput() {
        return output;
    }

    // 최상위 노드 SourceUnit
    // SourceUnit을 exit하면서 하위의 3가지 논터미널 노드가 갖는 문자열을 모두 합쳐준다.
    @Override
    public void exitSourceUnit(SolidityParser.SourceUnitContext ctx) {
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

        // 완성된 프로그램 반환
        // targetCode에 string setting
        output = sourceUnit;
    }

    @Override
    public void exitPragmaDirective(SolidityParser.PragmaDirectiveContext ctx) {
        String s1 = "버전"; // "pragma -> 버전"
        // String s2 = strTree.get(ctx.pragmaName());
        String s3 = strTree.get(ctx.pragmaValue());
        String s4 = ctx.getChild(3).getText(); // ";"
        strTree.put(ctx, s1 + " " + s3 + s4 + "\n");
    }

    @Override
    public void exitPragmaName(SolidityParser.PragmaNameContext ctx) {
        strTree.put(ctx, strTree.get(ctx.identifier()));
    }

    @Override
    public void exitIdentifier(SolidityParser.IdentifierContext ctx) {
        strTree.put(ctx, ctx.getChild(0).getText());
    }

    @Override
    public void exitPragmaValue(SolidityParser.PragmaValueContext ctx) {
        if (ctx.version() != null) {
            strTree.put(ctx, strTree.get(ctx.version()));
        }
        if (ctx.expression() != null) {
            strTree.put(ctx, strTree.get(ctx.expression()));
        }
    }

    @Override
    public void exitVersion(SolidityParser.VersionContext ctx) {
        String result = "";
        for (int i = 0; i < ctx.getChildCount(); i++) {
            result += strTree.get(ctx.getChild(i));
            if (i != ctx.getChildCount() - 1)
                result += " ";
        }
        strTree.put(ctx, result);
    }

    @Override
    public void exitVersionConstraint(SolidityParser.VersionConstraintContext ctx) {
        String result = "";
        if (ctx.versionOperator() != null) {
            result += strTree.get(ctx.versionOperator());
        }
        result += ctx.VersionLiteral().getText(); // VersionLiteral
        strTree.put(ctx, result);
    }

    @Override
    public void exitVersionOperator(SolidityParser.VersionOperatorContext ctx) {
        strTree.put(ctx, ctx.getChild(0).getText());
    }

    @Override
    public void exitExpression(SolidityParser.ExpressionContext ctx) {
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
                        strTree.put(ctx, "생성" + expr1);
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
        /*
        String expr1 = strTree.get(ctx.expression(0)); // 가장 처음 나타나는 Expression을 미리 받아놓음
        // 노드가 2개인 경우
        if (nodeCount == 2) {
            // 'new' typeName
            if (ctx.typeName() != null) {
                String s1 = ctx.getChild(0).getText(); // 'new'
                String s2 = strTree.get(ctx.typeName());
                strTree.put(ctx, s1 + " " + s2);
            }
            // unary operator
            // expression이 앞에 나오는 경우
            if (ctx.getChild(0) == ctx.expression()) {
                String s1 = ctx.getChild(1).getText();
                strTree.put(ctx, expr1 + s1);
            }
            // expression이 뒤에 나오는 경우
            if (ctx.getChild(1) == ctx.expression()) {
                String s1 = ctx.getChild(0).getText();
                // s1이 after, delete인 경우 공백 추가
                if (s1.equals("after") || s1.equals("delete")) {
                    strTree.put(ctx, s1 + " " + expr1);
                } else {
                    // 나머지 경우 공백 없이 사용
                    strTree.put(ctx,s1 + expr1);
                }
            }
        }
        // 노드가 3개인 경우
        if (nodeCount == 3) {
            // '(' expression ')'
            if (ctx.getChild(0).getText().equals("(")) {
                String s1 = ctx.getChild(0).getText(); // '('
                String s2 = ctx.getChild(0).getText(); // ')'
                strTree.put(ctx, s1 + expr1 + s2);
            }
            // binary operator
            else {
                String expr2 = strTree.get(ctx.expression(1));
                String s1 = ctx.getChild(1).getText(); // 연산자
                strTree.put(ctx, expr1 + " " + s1 + " " + expr2);
            }
        }
        // 노드가 4개인 경우
        if (nodeCount == 4) {
            if (ctx.functionCallArguments() != null) {
                String expr2 = strTree.get(ctx.expression(1));
                String s1 = ctx.getChild(1).getText();
                String s2 = ctx.getChild(3).getText();
                strTree.put(ctx, expr1 + s1 + expr2 + s2);
            }
            else {
                String funcallArgs = strTree.get(ctx.functionCallArguments());
                String s1 = ctx.getChild(1).getText();
                String s2 = ctx.getChild(3).getText();
                strTree.put(ctx, expr1 + s1 + funcallArgs + s2);
            }
        }
        // 노드가 5개인 경우
        // expression '?' expression ':' expression
        if (nodeCount == 5) {
            String expr2 = strTree.get(ctx.expression(1));
            String expr3 = strTree.get(ctx.expression(2));
            String s1 = ctx.getChild(1).getText();
            String s2 = ctx.getChild(3).getText();
            strTree.put(ctx, expr1 + " " + s1 + " " + expr2 + " " + s2 + " " + expr3);
        }

         */
    }

    @Override
    public void exitPrimaryExpression(SolidityParser.PrimaryExpressionContext ctx) {
        String s1 = "";
        if (ctx.getChild(0) == ctx.numberLiteral() || ctx.getChild(0) == ctx.identifier() ||
                ctx.getChild(0) == ctx.tupleExpression() || ctx.getChild(0) == ctx.typeNameExpression()) {
            // 논 터미널
            s1 = strTree.get(ctx.getChild(0));
        } else {
            // 터미널
            String terminal = ctx.getChild(0).getText();
            switch(terminal) {
                case "true":
                    s1 = "참";
                    break;
                case "false":
                    s1 = "거짓";
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

    @Override
    public void exitTypeNameExpression(SolidityParser.TypeNameExpressionContext ctx) {
        if(ctx.elementaryTypeName() != null)
            strTree.put(ctx, strTree.get(ctx.elementaryTypeName()));
        else
            strTree.put(ctx, strTree.get(ctx.userDefinedTypeName()));
    }

    // numberLiteral
    //  : (DecimalNumber | HexNumber) NumberUnit? ;

    @Override
    public void exitNumberLiteral(SolidityParser.NumberLiteralContext ctx) {
        String s1 = ctx.getChild(0).getText();
        String s2 = "";
        if (ctx.getChildCount() >= 2) {
            s2 += ctx.getChild(1).getText();
        }
        strTree.put(ctx, s1 + s2);
    }

    @Override
    public void exitTypeName(SolidityParser.TypeNameContext ctx) {
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
            String s1 = "주소";
            String s2 = "지불가능한";
            strTree.put(ctx, s2 + " " + s1);
        }
    }

    @Override
    public void exitElementaryTypeName(SolidityParser.ElementaryTypeNameContext ctx) {
        String s = ctx.getChild(0).getText();
        String cuttingS = s.substring(0,3);
        strTree.put(ctx,cuttingS);
        switch(cuttingS){
            case "boo" :
                strTree.put(ctx,"논리연산자");
                break;
            case "add":
                strTree.put(ctx, "주소형");
                break;
            case "str":
                strTree.put(ctx, "문자열");
                break;
            case "var":
                strTree.put(ctx, "변수");
                break;
            case "byt":
                if(s.length() == 4){
                    strTree.put(ctx, "바이트");
                } else if(s.length() == 5) {
                    strTree.put(ctx, "바이트배열");
                } else {
                    strTree.put(ctx, "바이트배열" + s.substring(5));
                }
                break;
            case "int":
                if (s.length() == 3) {
                    strTree.put(ctx,"정수");
                }else {
                    strTree.put(ctx, "정수" + s.substring(3));
                }
                break;
            case "uin":
                if (s.length() == 4){
                    strTree.put(ctx, "양의정수");
                }else{
                    strTree.put(ctx,"양의정수" + s.substring(4));
                }
                break;
            case "fix":
                if(s.length() ==5){
                    strTree.put(ctx,"고정소수점");
                }else{
                    strTree.put(ctx, "고정소수점"+s.substring(5));
                }
                break;
            case "ufi":
                if(s.length() ==6) {
                    strTree.put(ctx, "양의고정소수점");
                } else{
                    strTree.put(ctx,"양의고정소수점" + s.substring(6));
                }
                break;

            default:
                break;
        }


    }

    @Override
    public void exitUserDefinedTypeName(SolidityParser.UserDefinedTypeNameContext ctx) {
        int numOfIdentifier = ctx.identifier().size();
        String result = strTree.get(ctx.identifier(0));
        for (int i = 1; i < numOfIdentifier; i++) {
            result += ctx.getChild(2 * i - 1).getText(); // '.'
            result += strTree.get(ctx.identifier(1));
        }
        strTree.put(ctx, result);
    }

    @Override
    public void exitMapping(SolidityParser.MappingContext ctx) {
        String s1 = "짝꿍"; // 'mapping' -> "짝꿍"
        String s2 = ctx.getChild(1).getText(); // '('
        String s3 = ctx.getChild(3).getText(); // '=>'
        String s4 = ctx.getChild(5).getText(); // ')'
        String elementaryTypeName = strTree.get(ctx.elementaryTypeName());
        String typeName = strTree.get(ctx.typeName());
        strTree.put(ctx, s1 + s2 + elementaryTypeName + " " + s3 + " " + typeName + s4);
    }

    @Override
    public void exitFunctionTypeName(SolidityParser.FunctionTypeNameContext ctx) {
        /*
          : 'function' functionTypeParameterList
        ( InternalKeyword | ExternalKeyword | stateMutability )*
        ( 'returns' functionTypeParameterList )? ;
         */
        int count = ctx.getChildCount();

        String s1 = "계약내용";
        String functionTypeParameterList1 = strTree.get(ctx.functionTypeParameterList(0));

        String mid = "";

        String ret = "";
        String functionTypeParameterList2 = "";
        if(ctx.functionTypeParameterList(1) != null) {
            ret = "==>";
            functionTypeParameterList2 = strTree.get(ctx.functionTypeParameterList(1));
            count -= 2;
        }

        for(int i = 2; i < count; i++) {
            if(ctx.getChild(i).getText().equals("internal"))
                mid += ":내부용";
            else if(ctx.getChild(i).getText().equals("external"))
                mid += ":외부용";
            else
                mid += strTree.get(ctx.stateMutability(i));
        }

        strTree.put(ctx, s1 + functionTypeParameterList1 + mid + ret + functionTypeParameterList2);
    }

    @Override
    public void exitStateMutability(SolidityParser.StateMutabilityContext ctx) {
        String keyword = "";
        if(ctx.getChild(0).getText().equals("pure"))
            keyword = ":순수함수";
        else if(ctx.getChild(0).getText().equals("constant"))
            keyword = ":불변처리";
        else if(ctx.getChild(0).getText().equals("view"))
            keyword = ":읽기전용";
        else if(ctx.getChild(0).getText().equals("payable"))
            keyword = ":지불가능";
        strTree.put(ctx, keyword);
    }

    @Override
    public void exitFunctionTypeParameterList(SolidityParser.FunctionTypeParameterListContext ctx) {
        // '(' ( functionTypeParameter (',' functionTypeParameter)* )? ')' ;
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

    @Override
    public void exitFunctionTypeParameter(SolidityParser.FunctionTypeParameterContext ctx) {
        String result = strTree.get(ctx.typeName());
        if (ctx.storageLocation() != null) {
            result += strTree.get(ctx.storageLocation());
        }
        strTree.put(ctx, result);
    }

    @Override
    public void exitStorageLocation(SolidityParser.StorageLocationContext ctx) {
        strTree.put(ctx, ctx.getChild(0).getText());
    }

    // contractDefinition
    // natSpec? ( 'contract' | 'interface' | 'library' ) identifier
    //    ( 'is' inheritanceSpecifier (',' inheritanceSpecifier )* )?
    //    '{' contractPart* '}' ;
    @Override
    public void exitContractDefinition(SolidityParser.ContractDefinitionContext ctx) {
        String natSpec = "";
        String kindOf = "";
        String identifier = "";
        String inheritanceSpecifierPart = "";
        String leftParentheses = "";
        String contractPart = "";
        String rightParentheses = "";

        int indexOfKindOf = 0;


        if (ctx.natSpec() != null) {
            natSpec = strTree.get(ctx.natSpec());
            indexOfKindOf = 1;
        }

        // TODO) 인터페이스와 라이브러리 다른 한글 키워드로 변경
        if ((ctx.getChild(indexOfKindOf).getText()).equals("contract")) {
            kindOf = "계약";
        } else if ((ctx.getChild(indexOfKindOf).getText()).equals("interface")) {
            kindOf = "인터페이스";
        } else {
            kindOf = "라이브러리";
        }


        // TODO) identifier -> 계약 이름 한글로 변경해야함
        identifier = strTree.get(ctx.identifier());

        int countInheritanceSpecifier;
        if ((countInheritanceSpecifier = ctx.inheritanceSpecifier().size()) != 0) {
            inheritanceSpecifierPart += ":상속 "; // 'is '
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

        strTree.put(ctx, natSpec + "\n" + identifier + " " + kindOf + inheritanceSpecifierPart +
                " " + leftParentheses + contractPart + "\n" + rightParentheses);
    }


    // tod
    // 2. block indentation 어떻게 처리할지 논의하기
    // 2-1. ContractDefinition -> ContractPart 들어갈 때 indent
    // 2-2. ContractPart 아래의 각 노드에서 'block' 노드로 들어갈 때 indent

    @Override
    public void exitNatSpec(SolidityParser.NatSpecContext ctx) {
        //todo
    }

    @Override
    public void exitInheritanceSpecifier(SolidityParser.InheritanceSpecifierContext ctx) {
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
    public void exitModifierDefinition(SolidityParser.ModifierDefinitionContext ctx) {
        String s1 = "추가동작"; // 'modifier' -> "추가동작" 으로 번역완료
        String s2 = strTree.get(ctx.identifier());
        String s3 = "";
        if (ctx.parameterList() != null) {
            s3 = strTree.get(ctx.parameterList());
        }
        String s4 = strTree.get(ctx.block());
        strTree.put(ctx, s1 + " " + s2 + s3 + s4);
    }

    @Override
    public void enterContractPart(SolidityParser.ContractPartContext ctx) {
        indent++; // indent 증가
    }

    @Override
    public void exitContractPart(SolidityParser.ContractPartContext ctx) {
        indent--; // indent 감소
        strTree.put(ctx, "\n\n\t" + strTree.get(ctx.getChild(0)));
    }

    //parameterList
    @Override
    public void exitParameterList(SolidityParser.ParameterListContext ctx) {
        // '(' ( parameter (',' parameter)* )? ')' ;
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

    @Override
    public void exitParameter(SolidityParser.ParameterContext ctx) {
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

    //returns -> "==>" 로 번역완료
    @Override
    public void exitReturnParameters(SolidityParser.ReturnParametersContext ctx) {
        // 'returns' parameterList ;
        String s1 = "==>"; // 'returns' -> "==>"
        String s2 = strTree.get(ctx.parameterList());
        strTree.put(ctx, s1 + " " + s2 );
    }

    @Override
    public void enterBlock(SolidityParser.BlockContext ctx) {
        indent++;
    }

    // block
    @Override
    public void exitBlock(SolidityParser.BlockContext ctx) {
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
    public void exitEventParameterList(SolidityParser.EventParameterListContext ctx) {
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
    public void exitEventParameter(SolidityParser.EventParameterContext ctx) {
        // typeName IndexedKeyword? identifier?
        int count = ctx.getChildCount() - 1; // indexedkeyword와 identifier의 갯수
        String typeName = strTree.get(ctx.typeName());
        String indexedKeyword = "";
        String identifier = "";

        if(ctx.IndexedKeyword() != null){
            indexedKeyword = "검색";
        }
        if(ctx.identifier() != null){
            identifier = strTree.get(ctx.identifier());
        }

        /*
        // indexedkeyword가 있으면 count -1
        if ((ctx.getChild(1).getText()).equals(" indexed")) {
            indexedKeyword = ctx.getChild(1).getText();
            count = count - 1;
        }

        // count가 0이상이면 identifer가 있는것
        if (count > 0) {
            identifier = strTree.get(ctx.getChild(ctx.getChildCount() - 1));
        }
         */
        strTree.put(ctx, typeName + " " + indexedKeyword +" "+ identifier);

    }

    @Override
    public void exitStatement(SolidityParser.StatementContext ctx) {
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
    public void exitModifierList(SolidityParser.ModifierListContext ctx) {
        int count = ctx.getChildCount();
        String result = "";
        for (int i = 0; i < count; i++) {
            // child가 Non-Terminal 인 경우
            if (ctx.getChild(i) instanceof SolidityParser.ModifierInvocationContext
                    || ctx.getChild(i) instanceof SolidityParser.StateMutabilityContext) {
                if ((ctx.getChild(i).getText()).equals("payable")) {
                    result += ":지불가능";
                } else {
                    result += strTree.get(ctx.getChild(i));
                }
            }
            // ExternalKeyword | PublicKeyword | InternalKeyword | PrivateKeyword -> : 외부용 | : 공용 | : 개인용 | : 상속자용 으로 변경
            else {
                if ((ctx.getChild(i).getText()).equals("public")) {
                    result += ":공용";
                } else if ((ctx.getChild(i).getText()).equals("external")) {
                    result += ":외부용";
                } else if ((ctx.getChild(i).getText()).equals("internal")) {
                    result += ":상속용";
                } else if ((ctx.getChild(i).getText()).equals("private")) {
                    result += ":개인용";
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
    public void exitModifierInvocation(SolidityParser.ModifierInvocationContext ctx) {
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
    public void exitExpressionList(SolidityParser.ExpressionListContext ctx) {
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
    public void exitStateVariableDeclaration(SolidityParser.StateVariableDeclarationContext ctx) {
        int childNum = ctx.getChildCount();
        String typeName = strTree.get(ctx.typeName());
        String keyword = "";
        String id = "";
        String expr = "";
        for(int i = 1; i < childNum; i++) {
            if ((ctx.getChild(i).getText()).equals("public")) {
                keyword += ":공용";
            } else if ((ctx.getChild(i).getText()).equals("constant")) {
                keyword += ":불변처리";
            } else if ((ctx.getChild(i).getText()).equals("internal")) {
                keyword += ":상속용";
            } else if ((ctx.getChild(i).getText()).equals("private")) {
                keyword += ":개인용";
            } else {
                keyword += "";
            }
        }

        id = strTree.get(ctx.identifier());
        if (ctx.expression() != null) {
            expr = " = " + strTree.get(ctx.expression());
            strTree.put(ctx, typeName + " " + id + keyword + expr + ";");
        } else {
            strTree.put(ctx, typeName + " " + id + keyword + ";");
        }
    }

    @Override
    // natSpec? 'function' identifier? parameterList modifierList returnParameters? ( ';' | block ) ;
    public void exitFunctionDefinition(SolidityParser.FunctionDefinitionContext ctx) {
        String natSpec = "";
        StringBuilder func_sb = new StringBuilder();
        if (ctx.natSpec() != null) {
            natSpec = strTree.get(ctx.natSpec());
            func_sb.append("계약내용");
        } else
            func_sb.append("계약내용");
        if (ctx.identifier() != null)
            func_sb.append(" ").append(strTree.get(ctx.identifier()));
        func_sb.append(strTree.get(ctx.parameterList()));
        func_sb.append(" ").append(strTree.get(ctx.modifierList()));

        if (ctx.returnParameters() != null)
            func_sb.append(" ").append(strTree.get(ctx.returnParameters()));
        if (ctx.block() != null) {
            func_sb.append(" " +strTree.get(ctx.block()));
        } else {
            func_sb.append(";");
        }
        strTree.put(ctx, natSpec + func_sb);
    }

    @Override
    //natSpec? 'event' identifier eventParameterList AnonymousKeyword? ';' ;
    public void exitEventDefinition(SolidityParser.EventDefinitionContext ctx) {
        String natSpec = "";
        String event = "기록";
        String identifier = strTree.get(ctx.identifier());
        StringBuilder event_sb = new StringBuilder();
        if (ctx.natSpec() != null) {
            natSpec = strTree.get(ctx.natSpec()) + " ";
        }
        event_sb.append(strTree.get(ctx.eventParameterList()));
        if (ctx.AnonymousKeyword() != null)
            event_sb.append(" " + ctx.AnonymousKeyword());
        event_sb.append(";");
        strTree.put(ctx, natSpec + identifier + " " + event + event_sb);
    }

    @Override
    public void exitIfStatement(SolidityParser.IfStatementContext ctx) {

        String if_snm = "경우";
        String expr = strTree.get(ctx.expression());
        String if_stmt = strTree.get(ctx.statement(0));

        String else_snm = "";
        String else_stmt = "";
        if (ctx.statement().size() >= 2) {
            else_snm = "그 외";
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
    public void exitSimpleStatement(SolidityParser.SimpleStatementContext ctx) {
        strTree.put(ctx, strTree.get(ctx.getChild(0)));
    }

    @Override
    public void exitVariableDeclarationStatement(SolidityParser.VariableDeclarationStatementContext ctx) {
        String s = "";
        String expr = "";

        if(ctx.identifierList() != null){
            s = "변수 " + strTree.get(ctx.identifierList());
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
    public void exitExpressionStatement(SolidityParser.ExpressionStatementContext ctx) {
        String expr = strTree.get(ctx.expression());
        String s1 = ";";
        strTree.put(ctx, expr + s1);
    }

    @Override
    public void exitIdentifierList(SolidityParser.IdentifierListContext ctx) {
        int count = ctx.getChildCount();
        String start = ctx.getChild(0).getText(); // '('
        String end = ctx.getChild(count - 1).getText(); // ')'
        String mid = "";
        int identIndex = 0;
        for (int i = 1; i < count - 1; i++) {
            if (ctx.getChild(i) instanceof SolidityParser.IdentifierContext) {
                mid += strTree.get(ctx.identifier(identIndex++));
            } else {
                mid += ctx.getChild(i).getText(); // ','
            }
        }
        strTree.put(ctx, start + mid + end);
    }

    @Override
    public void exitVariableDeclarationList(SolidityParser.VariableDeclarationListContext ctx) {
        int count = ctx.getChildCount();
        String result = "";
        int identIndex = 0;
        for (int i = 0; i < count; i++) {
            if (ctx.getChild(i) instanceof SolidityParser.VariableDeclarationContext) {
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
    public void exitVariableDeclaration(SolidityParser.VariableDeclarationContext ctx) {
        String typeName = strTree.get(ctx.typeName());
        String storage = "";
        if (ctx.storageLocation() != null) {
            storage = " " + strTree.get(ctx.storageLocation());
        }
        String id = strTree.get(ctx.identifier());
        strTree.put(ctx, typeName + storage + " " + id);
    }


    @Override
    public void exitReturnStatement(SolidityParser.ReturnStatementContext ctx) {
        // 'return' expression? ';'
        String return_smn = "반환";
        String expr = "";
        if (ctx.expression() != null) {
            expr = strTree.get(ctx.expression());
        }
        strTree.put(ctx, return_smn + " " + expr + ";");
    }

    @Override
    public void exitEmitStatement(SolidityParser.EmitStatementContext ctx) {
        String emit_smn = "기록하다";
        String funcCall = strTree.get(ctx.functionCall());
        strTree.put(ctx, funcCall + emit_smn + ";");
    }

    @Override
    public void exitFunctionCall(SolidityParser.FunctionCallContext ctx) {
        String expr = strTree.get(ctx.expression());
        String funcCallArgu = strTree.get(ctx.functionCallArguments());
        strTree.put(ctx, expr + "( " + funcCallArgu + " )");
    }

    @Override
    public void exitFunctionCallArguments(SolidityParser.FunctionCallArgumentsContext ctx) {
        String whatList = "";
        if (ctx.getChild(1) != null && ctx.getChild(1).equals("}")) {
            whatList = "{ " + strTree.get(ctx.nameValueList()) + " }";
        } else {
            whatList = strTree.get(ctx.expressionList());
        }
        strTree.put(ctx, whatList);
    }

    @Override
    public void exitNameValueList(SolidityParser.NameValueListContext ctx) {
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
    public void exitConstructorDefinition(SolidityParser.ConstructorDefinitionContext ctx) {
        // constructor -> "초안" 번역완료
        String constructor = "초안";
        String parameterList = strTree.get(ctx.parameterList());
        String modifierList = strTree.get(ctx.modifierList());
        String block = strTree.get(ctx.block());

        strTree.put(ctx, constructor + " " + parameterList + " " + modifierList + " " + block);
    }

    @Override
    public void exitNameValue(SolidityParser.NameValueContext ctx) {
        String identifier = strTree.get(ctx.identifier());
        String expr = strTree.get(ctx.expression());
        strTree.put(ctx, identifier + " : " + expr);
    }
    @Override
    public void exitWhileStatement(SolidityParser.WhileStatementContext ctx) {
        String while_snm = "동안은 ";
        String expr = strTree.get(ctx.expression());
        String state = strTree.get(ctx.statement());
        strTree.put(ctx, printIndent() + "(" + expr + ") " + while_snm + state);
    }

    @Override
    public void exitRequireStatement(SolidityParser.RequireStatementContext ctx) {
        String require_snm = "실행조건";
        String exprList = strTree.get(ctx.expressionList());

        strTree.put(ctx, require_snm + " (" + exprList + ");");
    }

    @Override
    public void exitRevertStatement(SolidityParser.RevertStatementContext ctx) {
        String revert_snm = "에러발생";
        String expr = "";
        if(ctx.expression() != null)
            expr = strTree.get(ctx.expression());
        strTree.put(ctx, revert_snm + "(" + expr + ");");
    }
    @Override
    public void exitForStatement(SolidityParser.ForStatementContext ctx) {
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
    }

    @Override
    public void exitContinueStatement(SolidityParser.ContinueStatementContext ctx) {
        strTree.put(ctx, "다시;");
    }

    @Override
    public void exitBreakStatement(SolidityParser.BreakStatementContext ctx) {
        strTree.put(ctx, "그만;");
    }

}
