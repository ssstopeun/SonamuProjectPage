// Copyright 2016-2019 Federico Bond <federicobond@gmail.com>
// Licensed under the MIT license. See LICENSE file in the project root for details.

grammar Sonamu;

@header {
    package com.example.SonamuProject.preprocessor.sonamuGenerated;
}

sourceUnit
  : (pragmaDirective | importDirective | contractDefinition)* EOF ;

pragmaDirective
  : '버전' pragmaValue ';' ;

pragmaValue
  : version | expression ;

version
  : versionConstraint versionConstraint? ;

versionOperator
  : '^' | '~' | '>=' | '>' | '<' | '<=' | '=' ;

versionConstraint
  : versionOperator? VersionLiteral ;

importDeclaration
  : identifier ('as' identifier)? ;

importDirective
  : 'import' StringLiteral ('as' identifier)? ';'
  | 'import' ('*' | identifier) ('as' identifier)? 'from' StringLiteral ';'
  | 'import' '{' importDeclaration ( ',' importDeclaration )* '}' 'from' StringLiteral ';' ;

NatSpecSingleLine
  : ('///' .*? [\r\n]) + ;

NatSpecMultiLine
  : '/**' .*? '*/' ;

natSpec
  : NatSpecSingleLine
  | NatSpecMultiLine ;

contractDefinition
  : natSpec? identifier
    ( '계약' | '인터페이스' | '라이브러리' )
    ( 'is' inheritanceSpecifier (',' inheritanceSpecifier )* )?
    '{' contractPart* '}' ;

inheritanceSpecifier
  : userDefinedTypeName ( '(' expressionList? ')' )? ;

contractPart
  : stateVariableDeclaration
  | usingForDeclaration
  | structDefinition
  | constructorDefinition
  | modifierDefinition
  | functionDefinition
  | eventDefinition
  | enumDefinition ;

stateVariableDeclaration
  : typeName identifier
     ( PublicKeyword | InternalKeyword | PrivateKeyword | ConstantKeyword )*
     ('=' expression)? ';' ;

usingForDeclaration
  : 'using' identifier 'for' ('*' | typeName) ';' ;

structDefinition
  : 'struct' identifier
    '{' ( variableDeclaration ';' (variableDeclaration ';')* )? '}' ;

constructorDefinition
  : '초안' parameterList modifierList block ;

modifierDefinition
  : '추가동작' identifier parameterList? block ;

modifierInvocation
  : identifier ( '(' expressionList? ')' )? ;

functionDefinition
  : natSpec? '계약내용' identifier? parameterList modifierList returnParameters? ( ';' | block ) ;

returnParameters
  : '==>' parameterList ;

modifierList
  : ( modifierInvocation | stateMutability | ExternalKeyword
    | PublicKeyword | InternalKeyword | PrivateKeyword )* ;

eventDefinition
  : natSpec? identifier '기록' eventParameterList AnonymousKeyword? ';' ;

enumValue
  : identifier ;

enumDefinition
  : 'enum' identifier '{' enumValue? (',' enumValue)* '}' ;

parameterList
  : '(' ( parameter (',' parameter)* )? ')' ;

parameter
  : typeName storageLocation? identifier? ;

eventParameterList
  : '(' ( eventParameter (',' eventParameter)* )? ')' ;

eventParameter
  : typeName IndexedKeyword? identifier? ;

functionTypeParameterList
  : '(' ( functionTypeParameter (',' functionTypeParameter)* )? ')' ;

functionTypeParameter
  : typeName storageLocation? ;

variableDeclaration
  : typeName storageLocation? identifier ;

typeName
  : elementaryTypeName
  | userDefinedTypeName
  | mapping
  | typeName '[' expression? ']'
  | functionTypeName
  | '지불가능한' '주소' ;

userDefinedTypeName
  : identifier ( '.' identifier )* ;

mapping
  : '짝꿍' '(' elementaryTypeName '=>' typeName ')' ;

functionTypeName
  : '계약내용' functionTypeParameterList
    ( InternalKeyword | ExternalKeyword | stateMutability )*
    ( '==>' functionTypeParameterList )? ;

storageLocation
  : 'memory' | 'storage' | 'calldata';

stateMutability
  : PureKeyword | ConstantKeyword | ViewKeyword | PayableKeyword ;

block
  : '{' statement* '}' ;

statement
  : ifStatement
  | whileStatement
  | forStatement
  | block
  | inlineAssemblyStatement
  | doWhileStatement
  | continueStatement
  | breakStatement
  | returnStatement
  | throwStatement
  | emitStatement
  | simpleStatement ;

expressionStatement
  : expression ';' ;

ifStatement
  : '경우' '(' expression ')' statement ( '그외' statement )? ;

whileStatement
  : '(' expression ')' '동안은' statement ;

simpleStatement
  : ( variableDeclarationStatement | expressionStatement ) ;

forStatement
  : 'for' '(' ( simpleStatement | ';' ) ( expressionStatement | ';' ) expression? ')' statement ;

inlineAssemblyStatement
  : 'assembly' StringLiteral? assemblyBlock ;

doWhileStatement
  : 'do' statement 'while' '(' expression ')' ';' ;

continueStatement
  : 'continue' ';' ;

breakStatement
  : 'break' ';' ;

returnStatement
  : '반환' expression? ';' ;

throwStatement
  : 'throw' ';' ;

emitStatement
  : functionCall '기록하다' ';' ;

variableDeclarationStatement
  : ( '변수' identifierList | variableDeclaration | '(' variableDeclarationList ')' ) ( '=' expression )? ';';

variableDeclarationList
  : variableDeclaration? (',' variableDeclaration? )* ;

identifierList
  : '(' ( identifier? ',' )* identifier? ')' ;

elementaryTypeName
  : '주소형' | '논리연산자' | '문자열' | '변수' | Int | Uint | '바이트' | Byte | Fixed | Ufixed ;

Int
  : '정수' | '정수8' | '정수16' | '정수24' | '정수32' | '정수40' | '정수48' | '정수56' | '정수64' | '정수72' | '정수80' | '정수88' | '정수96' | '정수104' | '정수112' | '정수120' | '정수128' | '정수136' | '정수144' | '정수152' | '정수160' | '정수168' | '정수176' | '정수184' | '정수192' | '정수200' | '정수208' | '정수216' | '정수224' | '정수232' | '정수240' | '정수248' | '정수256' ;

Uint
  : '양의정수' | '양의정수8' | '양의정수16' | '양의정수24' | '양의정수32' | '양의정수40' | '양의정수48' | '양의정수56' | '양의정수64' | '양의정수72' | '양의정수80' | '양의정수88' | '양의정수96' | '양의정수104' | '양의정수112' | '양의정수120' | '양의정수128' | '양의정수136' | '양의정수144' | '양의정수152' | '양의정수160' | '양의정수168' | '양의정수176' | '양의정수184' | '양의정수192' | '양의정수200' | '양의정수208' | '양의정수216' | '양의정수224' | '양의정수232' | '양의정수240' | '양의정수248' | '양의정수256' ;

Byte
  : '바이트배열' | '바이트배열1' | 'b바이트배열2' | '바이트배열3' | '바이트배열4' | '바이트배열5' | '바이트배열6' | '바이트배열7' | '바이트배열8' | '바이트배열9' | '바이트배열10' | '바이트배열11' | '바이트배열12' | '바이트배열13' | '바이트배열14' | '바이트배열15' | '바이트배열16' | '바이트배열17' | '바이트배열18' | '바이트배열19' | '바이트배열20' | '바이트배열21' | '바이트배열22' | '바이트배열23' | '바이트배열24' | '바이트배열25' | '바이트배열26' | '바이트배열27' | '바이트배열28' | '바이트배열29' | '바이트배열30' | '바이트배열31' | '바이트배열32' ;

Fixed
  : '고정소수점' | ( '고정소수점' [0-9]+ 'x' [0-9]+ ) ;

Ufixed
  : '양의고정소수점' | ( '양의고정소수점' [0-9]+ 'x' [0-9]+ ) ;

expression
  : expression '++'
  | expression '--'
  | '생성' typeName
  | expression '[' expression ']'
  | expression '(' functionCallArguments ')'
  | expression '.' identifier
  | '(' expression ')'
  | '++' expression
  | '--' expression
  | '+' expression
  | '-' expression
  | 'after' expression
  | 'delete' expression
  | '!' expression
  | '~' expression
  | expression '**' expression
  | expression '*' expression
  | expression '/' expression
  | expression '%' expression
  | expression '+' expression
  | expression '-' expression
  | expression '<<' expression
  | expression '>>' expression
  | expression '&' expression
  | expression '^' expression
  | expression '|' expression
  | expression '<' expression
  | expression '>' expression
  | expression '<=' expression
  | expression '>=' expression
  | expression '==' expression
  | expression '!=' expression
  | expression '&&' expression
  | expression '||' expression
  | expression '=' expression
  | expression '|=' expression
  | expression '^=' expression
  | expression '&=' expression
  | expression '<<=' expression
  | expression '>>=' expression
  | expression '+=' expression
  | expression '-=' expression
  | expression '*=' expression
  | expression '/=' expression
  | expression '%=' expression
  | expression '?' expression ':' expression
  | primaryExpression ;

primaryExpression
  : BooleanLiteral
  | numberLiteral
  | HexLiteral
  | StringLiteral
  | identifier ('[' ']')?
  | TypeKeyword
  | tupleExpression
  | typeNameExpression ('[' ']')? ;

expressionList
  : expression (',' expression)* ;

nameValueList
  : nameValue (',' nameValue)* ','? ;

nameValue
  : identifier ':' expression ;

functionCallArguments
  : '{' nameValueList? '}'
  | expressionList? ;

functionCall
  : expression '(' functionCallArguments ')' ;

assemblyBlock
  : '{' assemblyItem* '}' ;

assemblyItem
  : identifier
  | assemblyBlock
  | assemblyExpression
  | assemblyLocalDefinition
  | assemblyAssignment
  | assemblyStackAssignment
  | labelDefinition
  | assemblySwitch
  | assemblyFunctionDefinition
  | assemblyFor
  | assemblyIf
  | BreakKeyword
  | ContinueKeyword
  | subAssembly
  | numberLiteral
  | StringLiteral
  | HexLiteral ;

assemblyExpression
  : assemblyCall | assemblyLiteral ;

assemblyCall
  : ( 'return' | 'address' | 'byte' | identifier ) ( '(' assemblyExpression? ( ',' assemblyExpression )* ')' )? ;

assemblyLocalDefinition
  : 'let' assemblyIdentifierOrList ( ':=' assemblyExpression )? ;

assemblyAssignment
  : assemblyIdentifierOrList ':=' assemblyExpression ;

assemblyIdentifierOrList
  : identifier | '(' assemblyIdentifierList ')' ;

assemblyIdentifierList
  : identifier ( ',' identifier )* ;

assemblyStackAssignment
  : '=:' identifier ;

labelDefinition
  : identifier ':' ;

assemblySwitch
  : 'switch' assemblyExpression assemblyCase* ;

assemblyCase
  : 'case' assemblyLiteral assemblyBlock
  | 'default' assemblyBlock ;

assemblyFunctionDefinition
  : 'function' identifier '(' assemblyIdentifierList? ')'
    assemblyFunctionReturns? assemblyBlock ;

assemblyFunctionReturns
  : ( '->' assemblyIdentifierList ) ;

assemblyFor
  : 'for' ( assemblyBlock | assemblyExpression )
    assemblyExpression ( assemblyBlock | assemblyExpression ) assemblyBlock ;

assemblyIf
  : 'if' assemblyExpression assemblyBlock ;

assemblyLiteral
  : StringLiteral | DecimalNumber | HexNumber | HexLiteral ;

subAssembly
  : 'assembly' identifier assemblyBlock ;

tupleExpression
  : '(' ( expression? ( ',' expression? )* ) ')'
  | '[' ( expression ( ',' expression )* )? ']' ;

typeNameExpression
  : elementaryTypeName
  | userDefinedTypeName ;

numberLiteral
  : (DecimalNumber | HexNumber) NumberUnit? ;

identifier
  : ('from' | 'calldata' | Identifier) ;

VersionLiteral
  : [0-9]+ '.' [0-9]+ '.' [0-9]+ ;

BooleanLiteral
  : '참' | '거짓' ;

DecimalNumber
  : ( DecimalDigits | (DecimalDigits? '.' DecimalDigits) ) ( [eE] DecimalDigits )? ;

fragment
DecimalDigits
  : [0-9] ( '_'? [0-9] )* ;

HexNumber
  : '0' [xX] HexDigits ;

fragment
HexDigits
  : HexCharacter ( '_'? HexCharacter )* ;

NumberUnit
  : 'wei' | 'szabo' | 'finney' | 'ether'
  | 'seconds' | 'minutes' | 'hours' | 'days' | 'weeks' | 'years' ;

HexLiteral : 'hex' ('"' HexPair* '"' | '\'' HexPair* '\'') ;

fragment
HexPair
  : HexCharacter HexCharacter ;

fragment
HexCharacter
  : [0-9A-Fa-f] ;

ReservedKeyword
  : 'abstract'
  | 'after'
  | 'case'
  | 'catch'
  | 'default'
  | 'final'
  | 'in'
  | 'inline'
  | 'let'
  | 'match'
  | 'null'
  | 'of'
  | 'relocatable'
  | 'static'
  | 'switch'
  | 'try'
  | 'typeof' ;

AnonymousKeyword : 'anonymous' ;
BreakKeyword : 'break' ;
ConstantKeyword : 'constant' ;
ContinueKeyword : 'continue' ;
ExternalKeyword : ':외부용' ;
IndexedKeyword : 'indexed' ;
InternalKeyword : ':상속용' ;
PayableKeyword : ':지불가능' ;
PrivateKeyword : ':개인용' ;
PublicKeyword : ':공용' ;
PureKeyword : 'pure' ;
TypeKeyword : 'type' ;
ViewKeyword : 'view' ;

Identifier
  : IdentifierStart IdentifierPart* ;

fragment
IdentifierStart
  : [a-zA-Z$_] ;

fragment
IdentifierPart
  : [a-zA-Z0-9$_] ;

StringLiteral
  : '"' DoubleQuotedStringCharacter* '"'
  | '\'' SingleQuotedStringCharacter* '\'' ;

fragment
DoubleQuotedStringCharacter
  : ~["\r\n\\] | ('\\' .) ;

fragment
SingleQuotedStringCharacter
  : ~['\r\n\\] | ('\\' .) ;

WS
  : [ \t\r\n\u000C]+ -> skip ;

COMMENT
  : '/*' .*? '*/' -> channel(HIDDEN) ;

LINE_COMMENT
  : '//' ~[\r\n]* -> channel(HIDDEN) ;
