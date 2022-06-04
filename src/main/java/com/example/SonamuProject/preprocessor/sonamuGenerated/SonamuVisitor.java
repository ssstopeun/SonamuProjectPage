// Generated from C:/Users/PC/Desktop/졸프/SonamuProjectPage/src/main/g4\Sonamu.g4 by ANTLR 4.10.1

    package com.example.SonamuProject.preprocessor.sonamuGenerated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SonamuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SonamuVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SonamuParser#sourceUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceUnit(SonamuParser.SourceUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#pragmaDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaDirective(SonamuParser.PragmaDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#pragmaValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaValue(SonamuParser.PragmaValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(SonamuParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#versionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionOperator(SonamuParser.VersionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#versionConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionConstraint(SonamuParser.VersionConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(SonamuParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#importDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDirective(SonamuParser.ImportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#natSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatSpec(SonamuParser.NatSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#contractDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractDefinition(SonamuParser.ContractDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceSpecifier(SonamuParser.InheritanceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#contractPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractPart(SonamuParser.ContractPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVariableDeclaration(SonamuParser.StateVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingForDeclaration(SonamuParser.UsingForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(SonamuParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#constructorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDefinition(SonamuParser.ConstructorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#modifierDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierDefinition(SonamuParser.ModifierDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#modifierInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierInvocation(SonamuParser.ModifierInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SonamuParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#returnParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnParameters(SonamuParser.ReturnParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#modifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierList(SonamuParser.ModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#eventDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDefinition(SonamuParser.EventDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(SonamuParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(SonamuParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SonamuParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SonamuParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#eventParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameterList(SonamuParser.EventParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#eventParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameter(SonamuParser.EventParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameterList(SonamuParser.FunctionTypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameter(SonamuParser.FunctionTypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SonamuParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(SonamuParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinedTypeName(SonamuParser.UserDefinedTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping(SonamuParser.MappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#functionTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeName(SonamuParser.FunctionTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#storageLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageLocation(SonamuParser.StorageLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#stateMutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMutability(SonamuParser.StateMutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SonamuParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SonamuParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#requireStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequireStatement(SonamuParser.RequireStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#revertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevertStatement(SonamuParser.RevertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SonamuParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SonamuParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SonamuParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(SonamuParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SonamuParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineAssemblyStatement(SonamuParser.InlineAssemblyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(SonamuParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(SonamuParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(SonamuParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SonamuParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(SonamuParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#emitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatement(SonamuParser.EmitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(SonamuParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(SonamuParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SonamuParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryTypeName(SonamuParser.ElementaryTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SonamuParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SonamuParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(SonamuParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#nameValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValueList(SonamuParser.NameValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#nameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValue(SonamuParser.NameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(SonamuParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SonamuParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyBlock(SonamuParser.AssemblyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyItem(SonamuParser.AssemblyItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyExpression(SonamuParser.AssemblyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCall(SonamuParser.AssemblyCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLocalDefinition(SonamuParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyAssignment(SonamuParser.AssemblyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierOrList(SonamuParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierList(SonamuParser.AssemblyIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyStackAssignment(SonamuParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#labelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDefinition(SonamuParser.LabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblySwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblySwitch(SonamuParser.AssemblySwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCase(SonamuParser.AssemblyCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionDefinition(SonamuParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionReturns(SonamuParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFor(SonamuParser.AssemblyForContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIf(SonamuParser.AssemblyIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLiteral(SonamuParser.AssemblyLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#subAssembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAssembly(SonamuParser.SubAssemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(SonamuParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#typeNameExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameExpression(SonamuParser.TypeNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(SonamuParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SonamuParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SonamuParser.IdentifierContext ctx);
}