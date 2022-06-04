// Generated from C:/Users/PC/Desktop/졸프/SonamuProjectPage/src/main/g4\Sonamu.g4 by ANTLR 4.10.1

    package com.example.SonamuProject.preprocessor.sonamuGenerated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SonamuParser}.
 */
public interface SonamuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SonamuParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(SonamuParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(SonamuParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void enterPragmaDirective(SonamuParser.PragmaDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void exitPragmaDirective(SonamuParser.PragmaDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void enterPragmaValue(SonamuParser.PragmaValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void exitPragmaValue(SonamuParser.PragmaValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(SonamuParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(SonamuParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void enterVersionOperator(SonamuParser.VersionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void exitVersionOperator(SonamuParser.VersionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void enterVersionConstraint(SonamuParser.VersionConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void exitVersionConstraint(SonamuParser.VersionConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(SonamuParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(SonamuParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportDirective(SonamuParser.ImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportDirective(SonamuParser.ImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#natSpec}.
	 * @param ctx the parse tree
	 */
	void enterNatSpec(SonamuParser.NatSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#natSpec}.
	 * @param ctx the parse tree
	 */
	void exitNatSpec(SonamuParser.NatSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(SonamuParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(SonamuParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceSpecifier(SonamuParser.InheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceSpecifier(SonamuParser.InheritanceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void enterContractPart(SonamuParser.ContractPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void exitContractPart(SonamuParser.ContractPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVariableDeclaration(SonamuParser.StateVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVariableDeclaration(SonamuParser.StateVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingForDeclaration(SonamuParser.UsingForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingForDeclaration(SonamuParser.UsingForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(SonamuParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(SonamuParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDefinition(SonamuParser.ConstructorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDefinition(SonamuParser.ConstructorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModifierDefinition(SonamuParser.ModifierDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModifierDefinition(SonamuParser.ModifierDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void enterModifierInvocation(SonamuParser.ModifierInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void exitModifierInvocation(SonamuParser.ModifierInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SonamuParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SonamuParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void enterReturnParameters(SonamuParser.ReturnParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void exitReturnParameters(SonamuParser.ReturnParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(SonamuParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(SonamuParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEventDefinition(SonamuParser.EventDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEventDefinition(SonamuParser.EventDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(SonamuParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(SonamuParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(SonamuParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(SonamuParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SonamuParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SonamuParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SonamuParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SonamuParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void enterEventParameterList(SonamuParser.EventParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void exitEventParameterList(SonamuParser.EventParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void enterEventParameter(SonamuParser.EventParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void exitEventParameter(SonamuParser.EventParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameterList(SonamuParser.FunctionTypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameterList(SonamuParser.FunctionTypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameter(SonamuParser.FunctionTypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameter(SonamuParser.FunctionTypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SonamuParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SonamuParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SonamuParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SonamuParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedTypeName(SonamuParser.UserDefinedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedTypeName(SonamuParser.UserDefinedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(SonamuParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(SonamuParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(SonamuParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(SonamuParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void enterStorageLocation(SonamuParser.StorageLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void exitStorageLocation(SonamuParser.StorageLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void enterStateMutability(SonamuParser.StateMutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void exitStateMutability(SonamuParser.StateMutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SonamuParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SonamuParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SonamuParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SonamuParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#requireStatement}.
	 * @param ctx the parse tree
	 */
	void enterRequireStatement(SonamuParser.RequireStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#requireStatement}.
	 * @param ctx the parse tree
	 */
	void exitRequireStatement(SonamuParser.RequireStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#revertStatement}.
	 * @param ctx the parse tree
	 */
	void enterRevertStatement(SonamuParser.RevertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#revertStatement}.
	 * @param ctx the parse tree
	 */
	void exitRevertStatement(SonamuParser.RevertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SonamuParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SonamuParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SonamuParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SonamuParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SonamuParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SonamuParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(SonamuParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(SonamuParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SonamuParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SonamuParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void enterInlineAssemblyStatement(SonamuParser.InlineAssemblyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void exitInlineAssemblyStatement(SonamuParser.InlineAssemblyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(SonamuParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(SonamuParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SonamuParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SonamuParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SonamuParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SonamuParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SonamuParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SonamuParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(SonamuParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(SonamuParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(SonamuParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(SonamuParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(SonamuParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(SonamuParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(SonamuParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(SonamuParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SonamuParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SonamuParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void enterElementaryTypeName(SonamuParser.ElementaryTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void exitElementaryTypeName(SonamuParser.ElementaryTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SonamuParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SonamuParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SonamuParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SonamuParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(SonamuParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(SonamuParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void enterNameValueList(SonamuParser.NameValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void exitNameValueList(SonamuParser.NameValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(SonamuParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(SonamuParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(SonamuParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(SonamuParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SonamuParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SonamuParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyBlock(SonamuParser.AssemblyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyBlock(SonamuParser.AssemblyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyItem(SonamuParser.AssemblyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyItem(SonamuParser.AssemblyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyExpression(SonamuParser.AssemblyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyExpression(SonamuParser.AssemblyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCall(SonamuParser.AssemblyCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCall(SonamuParser.AssemblyCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLocalDefinition(SonamuParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLocalDefinition(SonamuParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyAssignment(SonamuParser.AssemblyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyAssignment(SonamuParser.AssemblyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierOrList(SonamuParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierOrList(SonamuParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierList(SonamuParser.AssemblyIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierList(SonamuParser.AssemblyIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyStackAssignment(SonamuParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyStackAssignment(SonamuParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(SonamuParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(SonamuParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void enterAssemblySwitch(SonamuParser.AssemblySwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void exitAssemblySwitch(SonamuParser.AssemblySwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCase(SonamuParser.AssemblyCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCase(SonamuParser.AssemblyCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionDefinition(SonamuParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionDefinition(SonamuParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionReturns(SonamuParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionReturns(SonamuParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFor(SonamuParser.AssemblyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFor(SonamuParser.AssemblyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIf(SonamuParser.AssemblyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIf(SonamuParser.AssemblyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLiteral(SonamuParser.AssemblyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLiteral(SonamuParser.AssemblyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void enterSubAssembly(SonamuParser.SubAssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void exitSubAssembly(SonamuParser.SubAssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(SonamuParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(SonamuParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#typeNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameExpression(SonamuParser.TypeNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#typeNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameExpression(SonamuParser.TypeNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(SonamuParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(SonamuParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SonamuParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SonamuParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SonamuParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SonamuParser.IdentifierContext ctx);
}