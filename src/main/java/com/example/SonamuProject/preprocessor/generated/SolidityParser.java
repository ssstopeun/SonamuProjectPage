// Generated from C:/Users/PC/Desktop/졸프/SonamuProjectPage/src/main/g4\Solidity.g4 by ANTLR 4.10.1

    package com.example.SonamuProject.preprocessor.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, NatSpecSingleLine=93, 
		NatSpecMultiLine=94, Int=95, Uint=96, Byte=97, Fixed=98, Ufixed=99, VersionLiteral=100, 
		BooleanLiteral=101, DecimalNumber=102, HexNumber=103, NumberUnit=104, 
		HexLiteral=105, ReservedKeyword=106, AnonymousKeyword=107, BreakKeyword=108, 
		ConstantKeyword=109, ContinueKeyword=110, ExternalKeyword=111, IndexedKeyword=112, 
		InternalKeyword=113, PayableKeyword=114, PrivateKeyword=115, PublicKeyword=116, 
		PureKeyword=117, TypeKeyword=118, ViewKeyword=119, Identifier=120, StringLiteral=121, 
		WS=122, COMMENT=123, LINE_COMMENT=124;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_pragmaValue = 3, 
		RULE_version = 4, RULE_versionOperator = 5, RULE_versionConstraint = 6, 
		RULE_importDeclaration = 7, RULE_importDirective = 8, RULE_natSpec = 9, 
		RULE_contractDefinition = 10, RULE_inheritanceSpecifier = 11, RULE_contractPart = 12, 
		RULE_stateVariableDeclaration = 13, RULE_usingForDeclaration = 14, RULE_structDefinition = 15, 
		RULE_constructorDefinition = 16, RULE_modifierDefinition = 17, RULE_modifierInvocation = 18, 
		RULE_functionDefinition = 19, RULE_returnParameters = 20, RULE_modifierList = 21, 
		RULE_eventDefinition = 22, RULE_enumValue = 23, RULE_enumDefinition = 24, 
		RULE_parameterList = 25, RULE_parameter = 26, RULE_eventParameterList = 27, 
		RULE_eventParameter = 28, RULE_functionTypeParameterList = 29, RULE_functionTypeParameter = 30, 
		RULE_variableDeclaration = 31, RULE_typeName = 32, RULE_userDefinedTypeName = 33, 
		RULE_mapping = 34, RULE_functionTypeName = 35, RULE_storageLocation = 36, 
		RULE_stateMutability = 37, RULE_block = 38, RULE_statement = 39, RULE_expressionStatement = 40, 
		RULE_ifStatement = 41, RULE_whileStatement = 42, RULE_simpleStatement = 43, 
		RULE_forStatement = 44, RULE_inlineAssemblyStatement = 45, RULE_doWhileStatement = 46, 
		RULE_continueStatement = 47, RULE_breakStatement = 48, RULE_returnStatement = 49, 
		RULE_throwStatement = 50, RULE_requireStatement = 51, RULE_revertStatement = 52, 
		RULE_emitStatement = 53, RULE_variableDeclarationStatement = 54, RULE_variableDeclarationList = 55, 
		RULE_identifierList = 56, RULE_elementaryTypeName = 57, RULE_expression = 58, 
		RULE_primaryExpression = 59, RULE_expressionList = 60, RULE_nameValueList = 61, 
		RULE_nameValue = 62, RULE_functionCallArguments = 63, RULE_functionCall = 64, 
		RULE_assemblyBlock = 65, RULE_assemblyItem = 66, RULE_assemblyExpression = 67, 
		RULE_assemblyCall = 68, RULE_assemblyLocalDefinition = 69, RULE_assemblyAssignment = 70, 
		RULE_assemblyIdentifierOrList = 71, RULE_assemblyIdentifierList = 72, 
		RULE_assemblyStackAssignment = 73, RULE_labelDefinition = 74, RULE_assemblySwitch = 75, 
		RULE_assemblyCase = 76, RULE_assemblyFunctionDefinition = 77, RULE_assemblyFunctionReturns = 78, 
		RULE_assemblyFor = 79, RULE_assemblyIf = 80, RULE_assemblyLiteral = 81, 
		RULE_subAssembly = 82, RULE_tupleExpression = 83, RULE_typeNameExpression = 84, 
		RULE_numberLiteral = 85, RULE_identifier = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaName", "pragmaValue", "version", 
			"versionOperator", "versionConstraint", "importDeclaration", "importDirective", 
			"natSpec", "contractDefinition", "inheritanceSpecifier", "contractPart", 
			"stateVariableDeclaration", "usingForDeclaration", "structDefinition", 
			"constructorDefinition", "modifierDefinition", "modifierInvocation", 
			"functionDefinition", "returnParameters", "modifierList", "eventDefinition", 
			"enumValue", "enumDefinition", "parameterList", "parameter", "eventParameterList", 
			"eventParameter", "functionTypeParameterList", "functionTypeParameter", 
			"variableDeclaration", "typeName", "userDefinedTypeName", "mapping", 
			"functionTypeName", "storageLocation", "stateMutability", "block", "statement", 
			"expressionStatement", "ifStatement", "whileStatement", "simpleStatement", 
			"forStatement", "inlineAssemblyStatement", "doWhileStatement", "continueStatement", 
			"breakStatement", "returnStatement", "throwStatement", "requireStatement", 
			"revertStatement", "emitStatement", "variableDeclarationStatement", "variableDeclarationList", 
			"identifierList", "elementaryTypeName", "expression", "primaryExpression", 
			"expressionList", "nameValueList", "nameValue", "functionCallArguments", 
			"functionCall", "assemblyBlock", "assemblyItem", "assemblyExpression", 
			"assemblyCall", "assemblyLocalDefinition", "assemblyAssignment", "assemblyIdentifierOrList", 
			"assemblyIdentifierList", "assemblyStackAssignment", "labelDefinition", 
			"assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", "assemblyFunctionReturns", 
			"assemblyFor", "assemblyIf", "assemblyLiteral", "subAssembly", "tupleExpression", 
			"typeNameExpression", "numberLiteral", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", 
			"'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", "'contract'", 
			"'interface'", "'library'", "'is'", "'('", "')'", "'using'", "'for'", 
			"'struct'", "'constructor'", "'modifier'", "'function'", "'returns'", 
			"'event'", "'enum'", "'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", 
			"'memory'", "'storage'", "'calldata'", "'if'", "'else'", "'while'", "'assembly'", 
			"'do'", "'return'", "'throw'", "'require'", "'revert'", "'emit'", "'var'", 
			"'bool'", "'string'", "'byte'", "'++'", "'--'", "'new'", "'+'", "'-'", 
			"'after'", "'delete'", "'!'", "'**'", "'/'", "'%'", "'<<'", "'>>'", "'&'", 
			"'|'", "'=='", "'!='", "'&&'", "'||'", "'|='", "'^='", "'&='", "'<<='", 
			"'>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'?'", "':'", "'let'", 
			"':='", "'=:'", "'switch'", "'case'", "'default'", "'->'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'anonymous'", "'break'", "'constant'", "'continue'", "'external'", "'indexed'", 
			"'internal'", "'payable'", "'private'", "'public'", "'pure'", "'type'", 
			"'view'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NatSpecSingleLine", 
			"NatSpecMultiLine", "Int", "Uint", "Byte", "Fixed", "Ufixed", "VersionLiteral", 
			"BooleanLiteral", "DecimalNumber", "HexNumber", "NumberUnit", "HexLiteral", 
			"ReservedKeyword", "AnonymousKeyword", "BreakKeyword", "ConstantKeyword", 
			"ContinueKeyword", "ExternalKeyword", "IndexedKeyword", "InternalKeyword", 
			"PayableKeyword", "PrivateKeyword", "PublicKeyword", "PureKeyword", "TypeKeyword", 
			"ViewKeyword", "Identifier", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSourceUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0) || _la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(174);
					pragmaDirective();
					}
					break;
				case T__10:
					{
					setState(175);
					importDirective();
					}
					break;
				case T__16:
				case T__17:
				case T__18:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
					{
					setState(176);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__0);
			setState(185);
			pragmaName();
			setState(186);
			pragmaValue();
			setState(187);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmaValue);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			versionConstraint();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==VersionLiteral) {
				{
				setState(196);
				versionConstraint();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersionConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(201);
				versionOperator();
				}
			}

			setState(204);
			match(VersionLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			identifier();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(207);
				match(T__9);
				setState(208);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDirectiveContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDirective);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__10);
				setState(212);
				match(StringLiteral);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(213);
					match(T__9);
					setState(214);
					identifier();
					}
				}

				setState(217);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(T__10);
				setState(221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(219);
					match(T__11);
					}
					break;
				case T__12:
				case T__39:
				case Identifier:
					{
					setState(220);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(223);
					match(T__9);
					setState(224);
					identifier();
					}
				}

				setState(227);
				match(T__12);
				setState(228);
				match(StringLiteral);
				setState(229);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(T__10);
				setState(231);
				match(T__13);
				setState(232);
				importDeclaration();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(233);
					match(T__14);
					setState(234);
					importDeclaration();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(T__15);
				setState(241);
				match(T__12);
				setState(242);
				match(StringLiteral);
				setState(243);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NatSpecContext extends ParserRuleContext {
		public TerminalNode NatSpecSingleLine() { return getToken(SolidityParser.NatSpecSingleLine, 0); }
		public TerminalNode NatSpecMultiLine() { return getToken(SolidityParser.NatSpecMultiLine, 0); }
		public NatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNatSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNatSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NatSpecContext natSpec() throws RecognitionException {
		NatSpecContext _localctx = new NatSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_natSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==NatSpecSingleLine || _la==NatSpecMultiLine) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(249);
				natSpec();
				}
			}

			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(253);
			identifier();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(254);
				match(T__19);
				setState(255);
				inheritanceSpecifier();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(256);
					match(T__14);
					setState(257);
					inheritanceSpecifier();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(265);
			match(T__13);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (NatSpecSingleLine - 93)) | (1L << (NatSpecMultiLine - 93)) | (1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				{
				setState(266);
				contractPart();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInheritanceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			userDefinedTypeName();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(275);
				match(T__20);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
					{
					setState(276);
					expressionList();
					}
				}

				setState(279);
				match(T__21);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contractPart);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				enumDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStateVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			typeName(0);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (InternalKeyword - 109)) | (1L << (PrivateKeyword - 109)) | (1L << (PublicKeyword - 109)))) != 0)) {
				{
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (InternalKeyword - 109)) | (1L << (PrivateKeyword - 109)) | (1L << (PublicKeyword - 109)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			identifier();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(300);
				match(T__8);
				setState(301);
				expression(0);
				}
			}

			setState(304);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUsingForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__22);
			setState(307);
			identifier();
			setState(308);
			match(T__23);
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(309);
				match(T__11);
				}
				break;
			case T__12:
			case T__27:
			case T__33:
			case T__35:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(310);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__24);
			setState(316);
			identifier();
			setState(317);
			match(T__13);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(318);
				variableDeclaration();
				setState(319);
				match(T__1);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
					{
					{
					setState(320);
					variableDeclaration();
					setState(321);
					match(T__1);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(330);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitConstructorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitConstructorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__25);
			setState(333);
			parameterList();
			setState(334);
			modifierList();
			setState(335);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__26);
			setState(338);
			identifier();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(339);
				parameterList();
				}
			}

			setState(342);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			identifier();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(345);
				match(T__20);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
					{
					setState(346);
					expressionList();
					}
				}

				setState(349);
				match(T__21);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(352);
				natSpec();
				}
			}

			setState(355);
			match(T__27);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(356);
				identifier();
				}
			}

			setState(359);
			parameterList();
			setState(360);
			modifierList();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(361);
				returnParameters();
				}
			}

			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(364);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(365);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__28);
			setState(369);
			parameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__39 || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (ExternalKeyword - 109)) | (1L << (InternalKeyword - 109)) | (1L << (PayableKeyword - 109)) | (1L << (PrivateKeyword - 109)) | (1L << (PublicKeyword - 109)) | (1L << (PureKeyword - 109)) | (1L << (ViewKeyword - 109)) | (1L << (Identifier - 109)))) != 0)) {
				{
				setState(377);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__39:
				case Identifier:
					{
					setState(371);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(372);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(373);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(374);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(375);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(376);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(382);
				natSpec();
				}
			}

			setState(385);
			match(T__29);
			setState(386);
			identifier();
			setState(387);
			eventParameterList();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(388);
				match(AnonymousKeyword);
				}
			}

			setState(391);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEnumDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__30);
			setState(396);
			identifier();
			setState(397);
			match(T__13);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(398);
				enumValue();
				}
			}

			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(401);
				match(T__14);
				setState(402);
				enumValue();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__20);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(411);
				parameter();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(412);
					match(T__14);
					setState(413);
					parameter();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(421);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			typeName(0);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(424);
				storageLocation();
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(427);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__20);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(431);
				eventParameter();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(432);
					match(T__14);
					setState(433);
					eventParameter();
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(441);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			typeName(0);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(444);
				match(IndexedKeyword);
				}
			}

			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(447);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__20);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(451);
				functionTypeParameter();
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(452);
					match(T__14);
					setState(453);
					functionTypeParameter();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(461);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			typeName(0);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) {
				{
				setState(464);
				storageLocation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			typeName(0);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(468);
				storageLocation();
				}
				break;
			}
			setState(471);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(474);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(475);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(476);
				mapping();
				}
				break;
			case 4:
				{
				setState(477);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(478);
				match(T__33);
				setState(479);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(482);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(483);
					match(T__31);
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
						{
						setState(484);
						expression(0);
						}
					}

					setState(487);
					match(T__32);
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUserDefinedTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUserDefinedTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			identifier();
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					match(T__34);
					setState(495);
					identifier();
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__35);
			setState(502);
			match(T__20);
			setState(503);
			elementaryTypeName();
			setState(504);
			match(T__36);
			setState(505);
			typeName(0);
			setState(506);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(T__27);
			setState(509);
			functionTypeParameterList();
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(513);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(510);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(511);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(512);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(518);
				match(T__28);
				setState(519);
				functionTypeParameterList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStorageLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStorageLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStateMutability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (PayableKeyword - 109)) | (1L << (PureKeyword - 109)) | (1L << (ViewKeyword - 109)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__13);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__27) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (BreakKeyword - 95)) | (1L << (ContinueKeyword - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
				{
				{
				setState(527);
				statement();
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(533);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public RequireStatementContext requireStatement() {
			return getRuleContext(RequireStatementContext.class,0);
		}
		public RevertStatementContext revertStatement() {
			return getRuleContext(RevertStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_statement);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				ifStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				whileStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				forStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(538);
				block();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(539);
				inlineAssemblyStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 6);
				{
				setState(540);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(541);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(542);
				breakStatement();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 9);
				{
				setState(543);
				returnStatement();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 10);
				{
				setState(544);
				throwStatement();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 11);
				{
				setState(545);
				emitStatement();
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__27:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 12);
				{
				setState(546);
				simpleStatement();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 13);
				{
				setState(547);
				requireStatement();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 14);
				{
				setState(548);
				revertStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			expression(0);
			setState(552);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__40);
			setState(555);
			match(T__20);
			setState(556);
			expression(0);
			setState(557);
			match(T__21);
			setState(558);
			statement();
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(559);
				match(T__41);
				setState(560);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__42);
			setState(564);
			match(T__20);
			setState(565);
			expression(0);
			setState(566);
			match(T__21);
			setState(567);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(569);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(570);
				expressionStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__23);
			setState(574);
			match(T__20);
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__27:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(575);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(576);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__31:
			case T__33:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(579);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(580);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
				{
				setState(583);
				expression(0);
				}
			}

			setState(586);
			match(T__21);
			setState(587);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInlineAssemblyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInlineAssemblyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(T__43);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(590);
				match(StringLiteral);
				}
			}

			setState(593);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(T__44);
			setState(596);
			statement();
			setState(597);
			match(T__42);
			setState(598);
			match(T__20);
			setState(599);
			expression(0);
			setState(600);
			match(T__21);
			setState(601);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(ContinueKeyword);
			setState(604);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(BreakKeyword);
			setState(607);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__45);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
				{
				setState(610);
				expression(0);
				}
			}

			setState(613);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(T__46);
			setState(616);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequireStatementContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public RequireStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requireStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterRequireStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitRequireStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitRequireStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequireStatementContext requireStatement() throws RecognitionException {
		RequireStatementContext _localctx = new RequireStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_requireStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(T__47);
			setState(619);
			match(T__20);
			setState(620);
			expressionList();
			setState(621);
			match(T__21);
			setState(622);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevertStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RevertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterRevertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitRevertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitRevertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevertStatementContext revertStatement() throws RecognitionException {
		RevertStatementContext _localctx = new RevertStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_revertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__48);
			setState(625);
			match(T__20);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
				{
				setState(626);
				expression(0);
				}
			}

			setState(629);
			match(T__21);
			setState(630);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEmitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(T__49);
			setState(633);
			functionCall();
			setState(634);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(636);
				match(T__50);
				setState(637);
				identifierList();
				}
				break;
			case 2:
				{
				setState(638);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(639);
				match(T__20);
				setState(640);
				variableDeclarationList();
				setState(641);
				match(T__21);
				}
				break;
			}
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(645);
				match(T__8);
				setState(646);
				expression(0);
				}
			}

			setState(649);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(651);
				variableDeclaration();
				}
			}

			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(654);
				match(T__14);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
					{
					setState(655);
					variableDeclaration();
					}
				}

				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(T__20);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__39 || _la==Identifier) {
						{
						setState(664);
						identifier();
						}
					}

					setState(667);
					match(T__14);
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(673);
				identifier();
				}
			}

			setState(676);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementaryTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitElementaryTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(681);
				match(T__56);
				setState(682);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(683);
				match(T__20);
				setState(684);
				expression(0);
				setState(685);
				match(T__21);
				}
				break;
			case 3:
				{
				setState(687);
				match(T__54);
				setState(688);
				expression(40);
				}
				break;
			case 4:
				{
				setState(689);
				match(T__55);
				setState(690);
				expression(39);
				}
				break;
			case 5:
				{
				setState(691);
				match(T__57);
				setState(692);
				expression(38);
				}
				break;
			case 6:
				{
				setState(693);
				match(T__58);
				setState(694);
				expression(37);
				}
				break;
			case 7:
				{
				setState(695);
				match(T__59);
				setState(696);
				expression(36);
				}
				break;
			case 8:
				{
				setState(697);
				match(T__60);
				setState(698);
				expression(35);
				}
				break;
			case 9:
				{
				setState(699);
				match(T__61);
				setState(700);
				expression(34);
				}
				break;
			case 10:
				{
				setState(701);
				match(T__3);
				setState(702);
				expression(33);
				}
				break;
			case 11:
				{
				setState(703);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(819);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(706);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(707);
						match(T__62);
						setState(708);
						expression(33);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(709);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(710);
						match(T__11);
						setState(711);
						expression(32);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(712);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(713);
						match(T__63);
						setState(714);
						expression(31);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(715);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(716);
						match(T__64);
						setState(717);
						expression(30);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(718);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(719);
						match(T__57);
						setState(720);
						expression(29);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(721);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(722);
						match(T__58);
						setState(723);
						expression(28);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(724);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(725);
						match(T__65);
						setState(726);
						expression(27);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(727);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(728);
						match(T__66);
						setState(729);
						expression(26);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(730);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(731);
						match(T__67);
						setState(732);
						expression(25);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(733);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(734);
						match(T__2);
						setState(735);
						expression(24);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(736);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(737);
						match(T__68);
						setState(738);
						expression(23);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(739);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(740);
						match(T__6);
						setState(741);
						expression(22);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(742);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(743);
						match(T__5);
						setState(744);
						expression(21);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(746);
						match(T__7);
						setState(747);
						expression(20);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(749);
						match(T__4);
						setState(750);
						expression(19);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(751);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(752);
						match(T__69);
						setState(753);
						expression(18);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(755);
						match(T__70);
						setState(756);
						expression(17);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(757);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(758);
						match(T__71);
						setState(759);
						expression(16);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(761);
						match(T__72);
						setState(762);
						expression(15);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(763);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(764);
						match(T__8);
						setState(765);
						expression(14);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(766);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(767);
						match(T__73);
						setState(768);
						expression(13);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(769);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(770);
						match(T__74);
						setState(771);
						expression(12);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(772);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(773);
						match(T__75);
						setState(774);
						expression(11);
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(775);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(776);
						match(T__76);
						setState(777);
						expression(10);
						}
						break;
					case 25:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(778);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(779);
						match(T__77);
						setState(780);
						expression(9);
						}
						break;
					case 26:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(781);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(782);
						match(T__78);
						setState(783);
						expression(8);
						}
						break;
					case 27:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(784);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(785);
						match(T__79);
						setState(786);
						expression(7);
						}
						break;
					case 28:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(787);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(788);
						match(T__80);
						setState(789);
						expression(6);
						}
						break;
					case 29:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(791);
						match(T__81);
						setState(792);
						expression(5);
						}
						break;
					case 30:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(793);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(794);
						match(T__82);
						setState(795);
						expression(4);
						}
						break;
					case 31:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(797);
						match(T__83);
						setState(798);
						expression(0);
						setState(799);
						match(T__84);
						setState(800);
						expression(3);
						}
						break;
					case 32:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(802);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(803);
						match(T__54);
						}
						break;
					case 33:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(804);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(805);
						match(T__55);
						}
						break;
					case 34:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(806);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(807);
						match(T__31);
						setState(808);
						expression(0);
						setState(809);
						match(T__32);
						}
						break;
					case 35:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(811);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(812);
						match(T__20);
						setState(813);
						functionCallArguments();
						setState(814);
						match(T__21);
						}
						break;
					case 36:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(816);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(817);
						match(T__34);
						setState(818);
						identifier();
						}
						break;
					}
					} 
				}
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameExpressionContext typeNameExpression() {
			return getRuleContext(TypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primaryExpression);
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(827);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(828);
				identifier();
				setState(831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(829);
					match(T__31);
					setState(830);
					match(T__32);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(833);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(834);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(835);
				typeNameExpression();
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(836);
					match(T__31);
					setState(837);
					match(T__32);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			expression(0);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(843);
				match(T__14);
				setState(844);
				expression(0);
				}
				}
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNameValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			nameValue();
			setState(855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(851);
					match(T__14);
					setState(852);
					nameValue();
					}
					} 
				}
				setState(857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(858);
				match(T__14);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			identifier();
			setState(862);
			match(T__84);
			setState(863);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionCallArguments);
		int _la;
		try {
			setState(873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				match(T__13);
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__39 || _la==Identifier) {
					{
					setState(866);
					nameValueList();
					}
				}

				setState(869);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__21:
			case T__31:
			case T__33:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
					{
					setState(870);
					expressionList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			expression(0);
			setState(876);
			match(T__20);
			setState(877);
			functionCallArguments();
			setState(878);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(T__13);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__27) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__43) | (1L << T__45) | (1L << T__53))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (T__85 - 86)) | (1L << (T__87 - 86)) | (1L << (T__88 - 86)) | (1L << (DecimalNumber - 86)) | (1L << (HexNumber - 86)) | (1L << (HexLiteral - 86)) | (1L << (BreakKeyword - 86)) | (1L << (ContinueKeyword - 86)) | (1L << (Identifier - 86)) | (1L << (StringLiteral - 86)))) != 0)) {
				{
				{
				setState(881);
				assemblyItem();
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(887);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assemblyItem);
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(891);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(892);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(893);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(894);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(895);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(896);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(897);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(898);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(899);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(900);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(901);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(902);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(903);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(904);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(905);
				match(HexLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assemblyExpression);
		try {
			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__33:
			case T__39:
			case T__45:
			case T__53:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				assemblyLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				{
				setState(912);
				match(T__45);
				}
				break;
			case T__33:
				{
				setState(913);
				match(T__33);
				}
				break;
			case T__53:
				{
				setState(914);
				match(T__53);
				}
				break;
			case T__12:
			case T__39:
			case Identifier:
				{
				setState(915);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(918);
				match(T__20);
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__33) | (1L << T__39) | (1L << T__45) | (1L << T__53))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
					{
					setState(919);
					assemblyExpression();
					}
				}

				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(922);
					match(T__14);
					setState(923);
					assemblyExpression();
					}
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(929);
				match(T__21);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLocalDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyLocalDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(T__85);
			setState(933);
			assemblyIdentifierOrList();
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__86) {
				{
				setState(934);
				match(T__86);
				setState(935);
				assemblyExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			assemblyIdentifierOrList();
			setState(939);
			match(T__86);
			setState(940);
			assemblyExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierOrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIdentifierOrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assemblyIdentifierOrList);
		try {
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__39:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				identifier();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				match(T__20);
				setState(944);
				assemblyIdentifierList();
				setState(945);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			identifier();
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(950);
				match(T__14);
				setState(951);
				identifier();
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyStackAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyStackAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(T__87);
			setState(958);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			identifier();
			setState(961);
			match(T__84);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblySwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblySwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(T__88);
			setState(964);
			assemblyExpression();
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__89 || _la==T__90) {
				{
				{
				setState(965);
				assemblyCase();
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyCase);
		try {
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__89:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(T__89);
				setState(972);
				assemblyLiteral();
				setState(973);
				assemblyBlock();
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				match(T__90);
				setState(976);
				assemblyBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(T__27);
			setState(980);
			identifier();
			setState(981);
			match(T__20);
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(982);
				assemblyIdentifierList();
				}
			}

			setState(985);
			match(T__21);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__91) {
				{
				setState(986);
				assemblyFunctionReturns();
				}
			}

			setState(989);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFunctionReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(991);
			match(T__91);
			setState(992);
			assemblyIdentifierList();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(T__23);
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(995);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__33:
			case T__39:
			case T__45:
			case T__53:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(996);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(999);
			assemblyExpression();
			setState(1002);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(1000);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__33:
			case T__39:
			case T__45:
			case T__53:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(1001);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1004);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(T__40);
			setState(1007);
			assemblyExpression();
			setState(1008);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (StringLiteral - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSubAssembly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSubAssembly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(T__43);
			setState(1013);
			identifier();
			setState(1014);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_tupleExpression);
		int _la;
		try {
			setState(1042);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				match(T__20);
				{
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
					{
					setState(1017);
					expression(0);
					}
				}

				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1020);
					match(T__14);
					setState(1022);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
						{
						setState(1021);
						expression(0);
						}
					}

					}
					}
					setState(1028);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1029);
				match(T__21);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				match(T__31);
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (TypeKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
					{
					setState(1031);
					expression(0);
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(1032);
						match(T__14);
						setState(1033);
						expression(0);
						}
						}
						setState(1038);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1041);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public TypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_typeNameExpression);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__39:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				userDefinedTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1049);
				match(NumberUnit);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__39 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 58:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 32);
		case 2:
			return precpred(_ctx, 31);
		case 3:
			return precpred(_ctx, 30);
		case 4:
			return precpred(_ctx, 29);
		case 5:
			return precpred(_ctx, 28);
		case 6:
			return precpred(_ctx, 27);
		case 7:
			return precpred(_ctx, 26);
		case 8:
			return precpred(_ctx, 25);
		case 9:
			return precpred(_ctx, 24);
		case 10:
			return precpred(_ctx, 23);
		case 11:
			return precpred(_ctx, 22);
		case 12:
			return precpred(_ctx, 21);
		case 13:
			return precpred(_ctx, 20);
		case 14:
			return precpred(_ctx, 19);
		case 15:
			return precpred(_ctx, 18);
		case 16:
			return precpred(_ctx, 17);
		case 17:
			return precpred(_ctx, 16);
		case 18:
			return precpred(_ctx, 15);
		case 19:
			return precpred(_ctx, 14);
		case 20:
			return precpred(_ctx, 13);
		case 21:
			return precpred(_ctx, 12);
		case 22:
			return precpred(_ctx, 11);
		case 23:
			return precpred(_ctx, 10);
		case 24:
			return precpred(_ctx, 9);
		case 25:
			return precpred(_ctx, 8);
		case 26:
			return precpred(_ctx, 7);
		case 27:
			return precpred(_ctx, 6);
		case 28:
			return precpred(_ctx, 5);
		case 29:
			return precpred(_ctx, 4);
		case 30:
			return precpred(_ctx, 3);
		case 31:
			return precpred(_ctx, 2);
		case 32:
			return precpred(_ctx, 47);
		case 33:
			return precpred(_ctx, 46);
		case 34:
			return precpred(_ctx, 44);
		case 35:
			return precpred(_ctx, 43);
		case 36:
			return precpred(_ctx, 42);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001|\u041f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u00b2\b\u0000\n\u0000\f\u0000\u00b5\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00c2\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00c6\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006\u00cb\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00d2\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00d8\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\b"+
		"\u0001\b\u0003\b\u00e2\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00ec\b\b\n\b\f\b\u00ef\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00f6\b\b\u0001\t\u0001\t\u0001\n\u0003"+
		"\n\u00fb\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0103"+
		"\b\n\n\n\f\n\u0106\t\n\u0003\n\u0108\b\n\u0001\n\u0001\n\u0005\n\u010c"+
		"\b\n\n\n\f\n\u010f\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0116\b\u000b\u0001\u000b\u0003\u000b\u0119\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0123"+
		"\b\f\u0001\r\u0001\r\u0005\r\u0127\b\r\n\r\f\r\u012a\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u012f\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0138\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0144\b\u000f\n\u000f\f\u000f"+
		"\u0147\t\u000f\u0003\u000f\u0149\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0155\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u015c\b\u0012\u0001\u0012\u0003"+
		"\u0012\u015f\b\u0012\u0001\u0013\u0003\u0013\u0162\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0166\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u016b\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u016f\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u017a\b\u0015\n"+
		"\u0015\f\u0015\u017d\t\u0015\u0001\u0016\u0003\u0016\u0180\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0186\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0190\b\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0194\b\u0018\n\u0018\f\u0018\u0197\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u019f\b\u0019"+
		"\n\u0019\f\u0019\u01a2\t\u0019\u0003\u0019\u01a4\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01aa\b\u001a\u0001\u001a\u0003"+
		"\u001a\u01ad\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u01b3\b\u001b\n\u001b\f\u001b\u01b6\t\u001b\u0003\u001b\u01b8\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u01be"+
		"\b\u001c\u0001\u001c\u0003\u001c\u01c1\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u01c7\b\u001d\n\u001d\f\u001d\u01ca"+
		"\t\u001d\u0003\u001d\u01cc\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u01d2\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u01d6\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01e1\b \u0001 \u0001 \u0001 \u0003 \u01e6\b \u0001"+
		" \u0005 \u01e9\b \n \f \u01ec\t \u0001!\u0001!\u0001!\u0005!\u01f1\b!"+
		"\n!\f!\u01f4\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0202\b#\n#\f#\u0205\t#\u0001"+
		"#\u0001#\u0003#\u0209\b#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0005"+
		"&\u0211\b&\n&\f&\u0214\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0226\b\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u0232\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0003+\u023c\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0242\b,\u0001,\u0001,\u0003,\u0246\b,\u0001,\u0003,\u0249\b"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u0250\b-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00011\u00011\u00031\u0264\b1\u00011\u00011\u0001"+
		"2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00034\u0274\b4\u00014\u00014\u00014\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u0284\b6\u0001"+
		"6\u00016\u00036\u0288\b6\u00016\u00016\u00017\u00037\u028d\b7\u00017\u0001"+
		"7\u00037\u0291\b7\u00057\u0293\b7\n7\f7\u0296\t7\u00018\u00018\u00038"+
		"\u029a\b8\u00018\u00058\u029d\b8\n8\f8\u02a0\t8\u00018\u00038\u02a3\b"+
		"8\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u02c1"+
		"\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0005:\u0334\b:\n:\f:\u0337\t:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u0340\b;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0003;\u0347\b;\u0003;\u0349\b;\u0001<\u0001<\u0001<\u0005<\u034e"+
		"\b<\n<\f<\u0351\t<\u0001=\u0001=\u0001=\u0005=\u0356\b=\n=\f=\u0359\t"+
		"=\u0001=\u0003=\u035c\b=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0003"+
		"?\u0364\b?\u0001?\u0001?\u0003?\u0368\b?\u0003?\u036a\b?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001A\u0001A\u0005A\u0373\bA\nA\fA\u0376\tA\u0001"+
		"A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u038b"+
		"\bB\u0001C\u0001C\u0003C\u038f\bC\u0001D\u0001D\u0001D\u0001D\u0003D\u0395"+
		"\bD\u0001D\u0001D\u0003D\u0399\bD\u0001D\u0001D\u0005D\u039d\bD\nD\fD"+
		"\u03a0\tD\u0001D\u0003D\u03a3\bD\u0001E\u0001E\u0001E\u0001E\u0003E\u03a9"+
		"\bE\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u03b4\bG\u0001H\u0001H\u0001H\u0005H\u03b9\bH\nH\fH\u03bc\tH\u0001I"+
		"\u0001I\u0001I\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0005K\u03c7"+
		"\bK\nK\fK\u03ca\tK\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u03d2"+
		"\bL\u0001M\u0001M\u0001M\u0001M\u0003M\u03d8\bM\u0001M\u0001M\u0003M\u03dc"+
		"\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0003O\u03e6"+
		"\bO\u0001O\u0001O\u0001O\u0003O\u03eb\bO\u0001O\u0001O\u0001P\u0001P\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0003"+
		"S\u03fb\bS\u0001S\u0001S\u0003S\u03ff\bS\u0005S\u0401\bS\nS\fS\u0404\t"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0005S\u040b\bS\nS\fS\u040e\tS\u0003"+
		"S\u0410\bS\u0001S\u0003S\u0413\bS\u0001T\u0001T\u0003T\u0417\bT\u0001"+
		"U\u0001U\u0003U\u041b\bU\u0001V\u0001V\u0001V\u0000\u0002@tW\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u0000\n\u0001\u0000\u0003\t"+
		"\u0001\u0000]^\u0001\u0000\u0011\u0013\u0003\u0000mmqqst\u0001\u0000&"+
		"(\u0004\u0000mmrruuww\u0003\u0000\"\"36_c\u0003\u0000fgiiyy\u0001\u0000"+
		"fg\u0003\u0000\r\r((xx\u0493\u0000\u00b3\u0001\u0000\u0000\u0000\u0002"+
		"\u00b8\u0001\u0000\u0000\u0000\u0004\u00bd\u0001\u0000\u0000\u0000\u0006"+
		"\u00c1\u0001\u0000\u0000\u0000\b\u00c3\u0001\u0000\u0000\u0000\n\u00c7"+
		"\u0001\u0000\u0000\u0000\f\u00ca\u0001\u0000\u0000\u0000\u000e\u00ce\u0001"+
		"\u0000\u0000\u0000\u0010\u00f5\u0001\u0000\u0000\u0000\u0012\u00f7\u0001"+
		"\u0000\u0000\u0000\u0014\u00fa\u0001\u0000\u0000\u0000\u0016\u0112\u0001"+
		"\u0000\u0000\u0000\u0018\u0122\u0001\u0000\u0000\u0000\u001a\u0124\u0001"+
		"\u0000\u0000\u0000\u001c\u0132\u0001\u0000\u0000\u0000\u001e\u013b\u0001"+
		"\u0000\u0000\u0000 \u014c\u0001\u0000\u0000\u0000\"\u0151\u0001\u0000"+
		"\u0000\u0000$\u0158\u0001\u0000\u0000\u0000&\u0161\u0001\u0000\u0000\u0000"+
		"(\u0170\u0001\u0000\u0000\u0000*\u017b\u0001\u0000\u0000\u0000,\u017f"+
		"\u0001\u0000\u0000\u0000.\u0189\u0001\u0000\u0000\u00000\u018b\u0001\u0000"+
		"\u0000\u00002\u019a\u0001\u0000\u0000\u00004\u01a7\u0001\u0000\u0000\u0000"+
		"6\u01ae\u0001\u0000\u0000\u00008\u01bb\u0001\u0000\u0000\u0000:\u01c2"+
		"\u0001\u0000\u0000\u0000<\u01cf\u0001\u0000\u0000\u0000>\u01d3\u0001\u0000"+
		"\u0000\u0000@\u01e0\u0001\u0000\u0000\u0000B\u01ed\u0001\u0000\u0000\u0000"+
		"D\u01f5\u0001\u0000\u0000\u0000F\u01fc\u0001\u0000\u0000\u0000H\u020a"+
		"\u0001\u0000\u0000\u0000J\u020c\u0001\u0000\u0000\u0000L\u020e\u0001\u0000"+
		"\u0000\u0000N\u0225\u0001\u0000\u0000\u0000P\u0227\u0001\u0000\u0000\u0000"+
		"R\u022a\u0001\u0000\u0000\u0000T\u0233\u0001\u0000\u0000\u0000V\u023b"+
		"\u0001\u0000\u0000\u0000X\u023d\u0001\u0000\u0000\u0000Z\u024d\u0001\u0000"+
		"\u0000\u0000\\\u0253\u0001\u0000\u0000\u0000^\u025b\u0001\u0000\u0000"+
		"\u0000`\u025e\u0001\u0000\u0000\u0000b\u0261\u0001\u0000\u0000\u0000d"+
		"\u0267\u0001\u0000\u0000\u0000f\u026a\u0001\u0000\u0000\u0000h\u0270\u0001"+
		"\u0000\u0000\u0000j\u0278\u0001\u0000\u0000\u0000l\u0283\u0001\u0000\u0000"+
		"\u0000n\u028c\u0001\u0000\u0000\u0000p\u0297\u0001\u0000\u0000\u0000r"+
		"\u02a6\u0001\u0000\u0000\u0000t\u02c0\u0001\u0000\u0000\u0000v\u0348\u0001"+
		"\u0000\u0000\u0000x\u034a\u0001\u0000\u0000\u0000z\u0352\u0001\u0000\u0000"+
		"\u0000|\u035d\u0001\u0000\u0000\u0000~\u0369\u0001\u0000\u0000\u0000\u0080"+
		"\u036b\u0001\u0000\u0000\u0000\u0082\u0370\u0001\u0000\u0000\u0000\u0084"+
		"\u038a\u0001\u0000\u0000\u0000\u0086\u038e\u0001\u0000\u0000\u0000\u0088"+
		"\u0394\u0001\u0000\u0000\u0000\u008a\u03a4\u0001\u0000\u0000\u0000\u008c"+
		"\u03aa\u0001\u0000\u0000\u0000\u008e\u03b3\u0001\u0000\u0000\u0000\u0090"+
		"\u03b5\u0001\u0000\u0000\u0000\u0092\u03bd\u0001\u0000\u0000\u0000\u0094"+
		"\u03c0\u0001\u0000\u0000\u0000\u0096\u03c3\u0001\u0000\u0000\u0000\u0098"+
		"\u03d1\u0001\u0000\u0000\u0000\u009a\u03d3\u0001\u0000\u0000\u0000\u009c"+
		"\u03df\u0001\u0000\u0000\u0000\u009e\u03e2\u0001\u0000\u0000\u0000\u00a0"+
		"\u03ee\u0001\u0000\u0000\u0000\u00a2\u03f2\u0001\u0000\u0000\u0000\u00a4"+
		"\u03f4\u0001\u0000\u0000\u0000\u00a6\u0412\u0001\u0000\u0000\u0000\u00a8"+
		"\u0416\u0001\u0000\u0000\u0000\u00aa\u0418\u0001\u0000\u0000\u0000\u00ac"+
		"\u041c\u0001\u0000\u0000\u0000\u00ae\u00b2\u0003\u0002\u0001\u0000\u00af"+
		"\u00b2\u0003\u0010\b\u0000\u00b0\u00b2\u0003\u0014\n\u0000\u00b1\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0000\u0000\u0001\u00b7\u0001\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0001\u0000\u0000\u00b9\u00ba\u0003\u0004\u0002\u0000\u00ba\u00bb"+
		"\u0003\u0006\u0003\u0000\u00bb\u00bc\u0005\u0002\u0000\u0000\u00bc\u0003"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u00acV\u0000\u00be\u0005\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0003\b\u0004\u0000\u00c0\u00c2\u0003t"+
		":\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u0007\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003\f\u0006\u0000"+
		"\u00c4\u00c6\u0003\f\u0006\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\t\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0007\u0000\u0000\u0000\u00c8\u000b\u0001\u0000\u0000\u0000\u00c9\u00cb"+
		"\u0003\n\u0005\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		"d\u0000\u0000\u00cd\r\u0001\u0000\u0000\u0000\u00ce\u00d1\u0003\u00ac"+
		"V\u0000\u00cf\u00d0\u0005\n\u0000\u0000\u00d0\u00d2\u0003\u00acV\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u000f\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u000b\u0000\u0000"+
		"\u00d4\u00d7\u0005y\u0000\u0000\u00d5\u00d6\u0005\n\u0000\u0000\u00d6"+
		"\u00d8\u0003\u00acV\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00f6"+
		"\u0005\u0002\u0000\u0000\u00da\u00dd\u0005\u000b\u0000\u0000\u00db\u00de"+
		"\u0005\f\u0000\u0000\u00dc\u00de\u0003\u00acV\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005\n\u0000\u0000\u00e0\u00e2\u0003\u00ac"+
		"V\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\r\u0000\u0000"+
		"\u00e4\u00e5\u0005y\u0000\u0000\u00e5\u00f6\u0005\u0002\u0000\u0000\u00e6"+
		"\u00e7\u0005\u000b\u0000\u0000\u00e7\u00e8\u0005\u000e\u0000\u0000\u00e8"+
		"\u00ed\u0003\u000e\u0007\u0000\u00e9\u00ea\u0005\u000f\u0000\u0000\u00ea"+
		"\u00ec\u0003\u000e\u0007\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0010\u0000\u0000\u00f1"+
		"\u00f2\u0005\r\u0000\u0000\u00f2\u00f3\u0005y\u0000\u0000\u00f3\u00f4"+
		"\u0005\u0002\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00da\u0001\u0000\u0000\u0000\u00f5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00f6\u0011\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0007\u0001\u0000\u0000\u00f8\u0013\u0001\u0000\u0000\u0000\u00f9\u00fb"+
		"\u0003\u0012\t\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0007"+
		"\u0002\u0000\u0000\u00fd\u0107\u0003\u00acV\u0000\u00fe\u00ff\u0005\u0014"+
		"\u0000\u0000\u00ff\u0104\u0003\u0016\u000b\u0000\u0100\u0101\u0005\u000f"+
		"\u0000\u0000\u0101\u0103\u0003\u0016\u000b\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u00fe\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010d\u0005\u000e\u0000\u0000\u010a\u010c\u0003\u0018"+
		"\f\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0005\u0010\u0000\u0000\u0111\u0015\u0001\u0000\u0000"+
		"\u0000\u0112\u0118\u0003B!\u0000\u0113\u0115\u0005\u0015\u0000\u0000\u0114"+
		"\u0116\u0003x<\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0005"+
		"\u0016\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u0017\u0001\u0000\u0000\u0000\u011a\u0123\u0003"+
		"\u001a\r\u0000\u011b\u0123\u0003\u001c\u000e\u0000\u011c\u0123\u0003\u001e"+
		"\u000f\u0000\u011d\u0123\u0003 \u0010\u0000\u011e\u0123\u0003\"\u0011"+
		"\u0000\u011f\u0123\u0003&\u0013\u0000\u0120\u0123\u0003,\u0016\u0000\u0121"+
		"\u0123\u00030\u0018\u0000\u0122\u011a\u0001\u0000\u0000\u0000\u0122\u011b"+
		"\u0001\u0000\u0000\u0000\u0122\u011c\u0001\u0000\u0000\u0000\u0122\u011d"+
		"\u0001\u0000\u0000\u0000\u0122\u011e\u0001\u0000\u0000\u0000\u0122\u011f"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0121"+
		"\u0001\u0000\u0000\u0000\u0123\u0019\u0001\u0000\u0000\u0000\u0124\u0128"+
		"\u0003@ \u0000\u0125\u0127\u0007\u0003\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012e\u0003\u00ac"+
		"V\u0000\u012c\u012d\u0005\t\u0000\u0000\u012d\u012f\u0003t:\u0000\u012e"+
		"\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u0002\u0000\u0000\u0131"+
		"\u001b\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0017\u0000\u0000\u0133"+
		"\u0134\u0003\u00acV\u0000\u0134\u0137\u0005\u0018\u0000\u0000\u0135\u0138"+
		"\u0005\f\u0000\u0000\u0136\u0138\u0003@ \u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0005\u0002\u0000\u0000\u013a\u001d\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0005\u0019\u0000\u0000\u013c\u013d\u0003\u00ac"+
		"V\u0000\u013d\u0148\u0005\u000e\u0000\u0000\u013e\u013f\u0003>\u001f\u0000"+
		"\u013f\u0145\u0005\u0002\u0000\u0000\u0140\u0141\u0003>\u001f\u0000\u0141"+
		"\u0142\u0005\u0002\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143"+
		"\u0140\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146"+
		"\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148"+
		"\u013e\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0010\u0000\u0000\u014b"+
		"\u001f\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u001a\u0000\u0000\u014d"+
		"\u014e\u00032\u0019\u0000\u014e\u014f\u0003*\u0015\u0000\u014f\u0150\u0003"+
		"L&\u0000\u0150!\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u001b\u0000"+
		"\u0000\u0152\u0154\u0003\u00acV\u0000\u0153\u0155\u00032\u0019\u0000\u0154"+
		"\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0003L&\u0000\u0157#\u0001"+
		"\u0000\u0000\u0000\u0158\u015e\u0003\u00acV\u0000\u0159\u015b\u0005\u0015"+
		"\u0000\u0000\u015a\u015c\u0003x<\u0000\u015b\u015a\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000"+
		"\u015d\u015f\u0005\u0016\u0000\u0000\u015e\u0159\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f%\u0001\u0000\u0000\u0000\u0160"+
		"\u0162\u0003\u0012\t\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165"+
		"\u0005\u001c\u0000\u0000\u0164\u0166\u0003\u00acV\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u00032\u0019\u0000\u0168\u016a\u0003*\u0015"+
		"\u0000\u0169\u016b\u0003(\u0014\u0000\u016a\u0169\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000"+
		"\u016c\u016f\u0005\u0002\u0000\u0000\u016d\u016f\u0003L&\u0000\u016e\u016c"+
		"\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f\'\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005\u001d\u0000\u0000\u0171\u0172\u0003"+
		"2\u0019\u0000\u0172)\u0001\u0000\u0000\u0000\u0173\u017a\u0003$\u0012"+
		"\u0000\u0174\u017a\u0003J%\u0000\u0175\u017a\u0005o\u0000\u0000\u0176"+
		"\u017a\u0005t\u0000\u0000\u0177\u017a\u0005q\u0000\u0000\u0178\u017a\u0005"+
		"s\u0000\u0000\u0179\u0173\u0001\u0000\u0000\u0000\u0179\u0174\u0001\u0000"+
		"\u0000\u0000\u0179\u0175\u0001\u0000\u0000\u0000\u0179\u0176\u0001\u0000"+
		"\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c+\u0001\u0000\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0180\u0003\u0012\t\u0000"+
		"\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u001e\u0000\u0000"+
		"\u0182\u0183\u0003\u00acV\u0000\u0183\u0185\u00036\u001b\u0000\u0184\u0186"+
		"\u0005k\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0005"+
		"\u0002\u0000\u0000\u0188-\u0001\u0000\u0000\u0000\u0189\u018a\u0003\u00ac"+
		"V\u0000\u018a/\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u001f\u0000\u0000"+
		"\u018c\u018d\u0003\u00acV\u0000\u018d\u018f\u0005\u000e\u0000\u0000\u018e"+
		"\u0190\u0003.\u0017\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0195\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\u0005\u000f\u0000\u0000\u0192\u0194\u0003.\u0017\u0000\u0193\u0191\u0001"+
		"\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001"+
		"\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0005"+
		"\u0010\u0000\u0000\u01991\u0001\u0000\u0000\u0000\u019a\u01a3\u0005\u0015"+
		"\u0000\u0000\u019b\u01a0\u00034\u001a\u0000\u019c\u019d\u0005\u000f\u0000"+
		"\u0000\u019d\u019f\u00034\u001a\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u019b\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0005\u0016\u0000\u0000\u01a63\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a9\u0003@ \u0000\u01a8\u01aa\u0003H$\u0000\u01a9\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ad\u0003\u00acV\u0000\u01ac\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad5\u0001\u0000\u0000\u0000"+
		"\u01ae\u01b7\u0005\u0015\u0000\u0000\u01af\u01b4\u00038\u001c\u0000\u01b0"+
		"\u01b1\u0005\u000f\u0000\u0000\u01b1\u01b3\u00038\u001c\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01af"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005\u0016\u0000\u0000\u01ba7\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bd\u0003@ \u0000\u01bc\u01be\u0005p\u0000"+
		"\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003\u00acV\u0000"+
		"\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c19\u0001\u0000\u0000\u0000\u01c2\u01cb\u0005\u0015\u0000\u0000\u01c3"+
		"\u01c8\u0003<\u001e\u0000\u01c4\u01c5\u0005\u000f\u0000\u0000\u01c5\u01c7"+
		"\u0003<\u001e\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001"+
		"\u0000\u0000\u0000\u01cb\u01c3\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005"+
		"\u0016\u0000\u0000\u01ce;\u0001\u0000\u0000\u0000\u01cf\u01d1\u0003@ "+
		"\u0000\u01d0\u01d2\u0003H$\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d2=\u0001\u0000\u0000\u0000\u01d3\u01d5"+
		"\u0003@ \u0000\u01d4\u01d6\u0003H$\u0000\u01d5\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0003\u00acV\u0000\u01d8?\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0006 \uffff\uffff\u0000\u01da\u01e1\u0003r9\u0000\u01db\u01e1"+
		"\u0003B!\u0000\u01dc\u01e1\u0003D\"\u0000\u01dd\u01e1\u0003F#\u0000\u01de"+
		"\u01df\u0005\"\u0000\u0000\u01df\u01e1\u0005r\u0000\u0000\u01e0\u01d9"+
		"\u0001\u0000\u0000\u0000\u01e0\u01db\u0001\u0000\u0000\u0000\u01e0\u01dc"+
		"\u0001\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000\u01e0\u01de"+
		"\u0001\u0000\u0000\u0000\u01e1\u01ea\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\n\u0003\u0000\u0000\u01e3\u01e5\u0005 \u0000\u0000\u01e4\u01e6\u0003"+
		"t:\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e9\u0005!\u0000\u0000"+
		"\u01e8\u01e2\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ebA\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed"+
		"\u01f2\u0003\u00acV\u0000\u01ee\u01ef\u0005#\u0000\u0000\u01ef\u01f1\u0003"+
		"\u00acV\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3C\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0005$\u0000\u0000\u01f6\u01f7\u0005\u0015\u0000\u0000"+
		"\u01f7\u01f8\u0003r9\u0000\u01f8\u01f9\u0005%\u0000\u0000\u01f9\u01fa"+
		"\u0003@ \u0000\u01fa\u01fb\u0005\u0016\u0000\u0000\u01fbE\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0005\u001c\u0000\u0000\u01fd\u0203\u0003:\u001d"+
		"\u0000\u01fe\u0202\u0005q\u0000\u0000\u01ff\u0202\u0005o\u0000\u0000\u0200"+
		"\u0202\u0003J%\u0000\u0201\u01fe\u0001\u0000\u0000\u0000\u0201\u01ff\u0001"+
		"\u0000\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202\u0205\u0001"+
		"\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001"+
		"\u0000\u0000\u0000\u0204\u0208\u0001\u0000\u0000\u0000\u0205\u0203\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0005\u001d\u0000\u0000\u0207\u0209\u0003"+
		":\u001d\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209G\u0001\u0000\u0000\u0000\u020a\u020b\u0007\u0004\u0000"+
		"\u0000\u020bI\u0001\u0000\u0000\u0000\u020c\u020d\u0007\u0005\u0000\u0000"+
		"\u020dK\u0001\u0000\u0000\u0000\u020e\u0212\u0005\u000e\u0000\u0000\u020f"+
		"\u0211\u0003N\'\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0211\u0214"+
		"\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0001\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u0212"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u0010\u0000\u0000\u0216M\u0001"+
		"\u0000\u0000\u0000\u0217\u0226\u0003R)\u0000\u0218\u0226\u0003T*\u0000"+
		"\u0219\u0226\u0003X,\u0000\u021a\u0226\u0003L&\u0000\u021b\u0226\u0003"+
		"Z-\u0000\u021c\u0226\u0003\\.\u0000\u021d\u0226\u0003^/\u0000\u021e\u0226"+
		"\u0003`0\u0000\u021f\u0226\u0003b1\u0000\u0220\u0226\u0003d2\u0000\u0221"+
		"\u0226\u0003j5\u0000\u0222\u0226\u0003V+\u0000\u0223\u0226\u0003f3\u0000"+
		"\u0224\u0226\u0003h4\u0000\u0225\u0217\u0001\u0000\u0000\u0000\u0225\u0218"+
		"\u0001\u0000\u0000\u0000\u0225\u0219\u0001\u0000\u0000\u0000\u0225\u021a"+
		"\u0001\u0000\u0000\u0000\u0225\u021b\u0001\u0000\u0000\u0000\u0225\u021c"+
		"\u0001\u0000\u0000\u0000\u0225\u021d\u0001\u0000\u0000\u0000\u0225\u021e"+
		"\u0001\u0000\u0000\u0000\u0225\u021f\u0001\u0000\u0000\u0000\u0225\u0220"+
		"\u0001\u0000\u0000\u0000\u0225\u0221\u0001\u0000\u0000\u0000\u0225\u0222"+
		"\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0224"+
		"\u0001\u0000\u0000\u0000\u0226O\u0001\u0000\u0000\u0000\u0227\u0228\u0003"+
		"t:\u0000\u0228\u0229\u0005\u0002\u0000\u0000\u0229Q\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0005)\u0000\u0000\u022b\u022c\u0005\u0015\u0000\u0000"+
		"\u022c\u022d\u0003t:\u0000\u022d\u022e\u0005\u0016\u0000\u0000\u022e\u0231"+
		"\u0003N\'\u0000\u022f\u0230\u0005*\u0000\u0000\u0230\u0232\u0003N\'\u0000"+
		"\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232S\u0001\u0000\u0000\u0000\u0233\u0234\u0005+\u0000\u0000\u0234\u0235"+
		"\u0005\u0015\u0000\u0000\u0235\u0236\u0003t:\u0000\u0236\u0237\u0005\u0016"+
		"\u0000\u0000\u0237\u0238\u0003N\'\u0000\u0238U\u0001\u0000\u0000\u0000"+
		"\u0239\u023c\u0003l6\u0000\u023a\u023c\u0003P(\u0000\u023b\u0239\u0001"+
		"\u0000\u0000\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023cW\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0005\u0018\u0000\u0000\u023e\u0241\u0005\u0015"+
		"\u0000\u0000\u023f\u0242\u0003V+\u0000\u0240\u0242\u0005\u0002\u0000\u0000"+
		"\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0240\u0001\u0000\u0000\u0000"+
		"\u0242\u0245\u0001\u0000\u0000\u0000\u0243\u0246\u0003P(\u0000\u0244\u0246"+
		"\u0005\u0002\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0244"+
		"\u0001\u0000\u0000\u0000\u0246\u0248\u0001\u0000\u0000\u0000\u0247\u0249"+
		"\u0003t:\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000"+
		"\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024b\u0005\u0016"+
		"\u0000\u0000\u024b\u024c\u0003N\'\u0000\u024cY\u0001\u0000\u0000\u0000"+
		"\u024d\u024f\u0005,\u0000\u0000\u024e\u0250\u0005y\u0000\u0000\u024f\u024e"+
		"\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251"+
		"\u0001\u0000\u0000\u0000\u0251\u0252\u0003\u0082A\u0000\u0252[\u0001\u0000"+
		"\u0000\u0000\u0253\u0254\u0005-\u0000\u0000\u0254\u0255\u0003N\'\u0000"+
		"\u0255\u0256\u0005+\u0000\u0000\u0256\u0257\u0005\u0015\u0000\u0000\u0257"+
		"\u0258\u0003t:\u0000\u0258\u0259\u0005\u0016\u0000\u0000\u0259\u025a\u0005"+
		"\u0002\u0000\u0000\u025a]\u0001\u0000\u0000\u0000\u025b\u025c\u0005n\u0000"+
		"\u0000\u025c\u025d\u0005\u0002\u0000\u0000\u025d_\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0005l\u0000\u0000\u025f\u0260\u0005\u0002\u0000\u0000\u0260"+
		"a\u0001\u0000\u0000\u0000\u0261\u0263\u0005.\u0000\u0000\u0262\u0264\u0003"+
		"t:\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u0002\u0000"+
		"\u0000\u0266c\u0001\u0000\u0000\u0000\u0267\u0268\u0005/\u0000\u0000\u0268"+
		"\u0269\u0005\u0002\u0000\u0000\u0269e\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u00050\u0000\u0000\u026b\u026c\u0005\u0015\u0000\u0000\u026c\u026d\u0003"+
		"x<\u0000\u026d\u026e\u0005\u0016\u0000\u0000\u026e\u026f\u0005\u0002\u0000"+
		"\u0000\u026fg\u0001\u0000\u0000\u0000\u0270\u0271\u00051\u0000\u0000\u0271"+
		"\u0273\u0005\u0015\u0000\u0000\u0272\u0274\u0003t:\u0000\u0273\u0272\u0001"+
		"\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275\u0001"+
		"\u0000\u0000\u0000\u0275\u0276\u0005\u0016\u0000\u0000\u0276\u0277\u0005"+
		"\u0002\u0000\u0000\u0277i\u0001\u0000\u0000\u0000\u0278\u0279\u00052\u0000"+
		"\u0000\u0279\u027a\u0003\u0080@\u0000\u027a\u027b\u0005\u0002\u0000\u0000"+
		"\u027bk\u0001\u0000\u0000\u0000\u027c\u027d\u00053\u0000\u0000\u027d\u0284"+
		"\u0003p8\u0000\u027e\u0284\u0003>\u001f\u0000\u027f\u0280\u0005\u0015"+
		"\u0000\u0000\u0280\u0281\u0003n7\u0000\u0281\u0282\u0005\u0016\u0000\u0000"+
		"\u0282\u0284\u0001\u0000\u0000\u0000\u0283\u027c\u0001\u0000\u0000\u0000"+
		"\u0283\u027e\u0001\u0000\u0000\u0000\u0283\u027f\u0001\u0000\u0000\u0000"+
		"\u0284\u0287\u0001\u0000\u0000\u0000\u0285\u0286\u0005\t\u0000\u0000\u0286"+
		"\u0288\u0003t:\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0005"+
		"\u0002\u0000\u0000\u028am\u0001\u0000\u0000\u0000\u028b\u028d\u0003>\u001f"+
		"\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000"+
		"\u0000\u028d\u0294\u0001\u0000\u0000\u0000\u028e\u0290\u0005\u000f\u0000"+
		"\u0000\u028f\u0291\u0003>\u001f\u0000\u0290\u028f\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0293\u0001\u0000\u0000\u0000"+
		"\u0292\u028e\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000"+
		"\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000"+
		"\u0295o\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0297"+
		"\u029e\u0005\u0015\u0000\u0000\u0298\u029a\u0003\u00acV\u0000\u0299\u0298"+
		"\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\u0001\u0000\u0000\u0000\u029b\u029d\u0005\u000f\u0000\u0000\u029c\u0299"+
		"\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000\u0000\u0000\u029e\u029c"+
		"\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1\u02a3"+
		"\u0003\u00acV\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005"+
		"\u0016\u0000\u0000\u02a5q\u0001\u0000\u0000\u0000\u02a6\u02a7\u0007\u0006"+
		"\u0000\u0000\u02a7s\u0001\u0000\u0000\u0000\u02a8\u02a9\u0006:\uffff\uffff"+
		"\u0000\u02a9\u02aa\u00059\u0000\u0000\u02aa\u02c1\u0003@ \u0000\u02ab"+
		"\u02ac\u0005\u0015\u0000\u0000\u02ac\u02ad\u0003t:\u0000\u02ad\u02ae\u0005"+
		"\u0016\u0000\u0000\u02ae\u02c1\u0001\u0000\u0000\u0000\u02af\u02b0\u0005"+
		"7\u0000\u0000\u02b0\u02c1\u0003t:(\u02b1\u02b2\u00058\u0000\u0000\u02b2"+
		"\u02c1\u0003t:\'\u02b3\u02b4\u0005:\u0000\u0000\u02b4\u02c1\u0003t:&\u02b5"+
		"\u02b6\u0005;\u0000\u0000\u02b6\u02c1\u0003t:%\u02b7\u02b8\u0005<\u0000"+
		"\u0000\u02b8\u02c1\u0003t:$\u02b9\u02ba\u0005=\u0000\u0000\u02ba\u02c1"+
		"\u0003t:#\u02bb\u02bc\u0005>\u0000\u0000\u02bc\u02c1\u0003t:\"\u02bd\u02be"+
		"\u0005\u0004\u0000\u0000\u02be\u02c1\u0003t:!\u02bf\u02c1\u0003v;\u0000"+
		"\u02c0\u02a8\u0001\u0000\u0000\u0000\u02c0\u02ab\u0001\u0000\u0000\u0000"+
		"\u02c0\u02af\u0001\u0000\u0000\u0000\u02c0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02c0\u02b3\u0001\u0000\u0000\u0000\u02c0\u02b5\u0001\u0000\u0000\u0000"+
		"\u02c0\u02b7\u0001\u0000\u0000\u0000\u02c0\u02b9\u0001\u0000\u0000\u0000"+
		"\u02c0\u02bb\u0001\u0000\u0000\u0000\u02c0\u02bd\u0001\u0000\u0000\u0000"+
		"\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c1\u0335\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c3\n \u0000\u0000\u02c3\u02c4\u0005?\u0000\u0000\u02c4\u0334"+
		"\u0003t:!\u02c5\u02c6\n\u001f\u0000\u0000\u02c6\u02c7\u0005\f\u0000\u0000"+
		"\u02c7\u0334\u0003t: \u02c8\u02c9\n\u001e\u0000\u0000\u02c9\u02ca\u0005"+
		"@\u0000\u0000\u02ca\u0334\u0003t:\u001f\u02cb\u02cc\n\u001d\u0000\u0000"+
		"\u02cc\u02cd\u0005A\u0000\u0000\u02cd\u0334\u0003t:\u001e\u02ce\u02cf"+
		"\n\u001c\u0000\u0000\u02cf\u02d0\u0005:\u0000\u0000\u02d0\u0334\u0003"+
		"t:\u001d\u02d1\u02d2\n\u001b\u0000\u0000\u02d2\u02d3\u0005;\u0000\u0000"+
		"\u02d3\u0334\u0003t:\u001c\u02d4\u02d5\n\u001a\u0000\u0000\u02d5\u02d6"+
		"\u0005B\u0000\u0000\u02d6\u0334\u0003t:\u001b\u02d7\u02d8\n\u0019\u0000"+
		"\u0000\u02d8\u02d9\u0005C\u0000\u0000\u02d9\u0334\u0003t:\u001a\u02da"+
		"\u02db\n\u0018\u0000\u0000\u02db\u02dc\u0005D\u0000\u0000\u02dc\u0334"+
		"\u0003t:\u0019\u02dd\u02de\n\u0017\u0000\u0000\u02de\u02df\u0005\u0003"+
		"\u0000\u0000\u02df\u0334\u0003t:\u0018\u02e0\u02e1\n\u0016\u0000\u0000"+
		"\u02e1\u02e2\u0005E\u0000\u0000\u02e2\u0334\u0003t:\u0017\u02e3\u02e4"+
		"\n\u0015\u0000\u0000\u02e4\u02e5\u0005\u0007\u0000\u0000\u02e5\u0334\u0003"+
		"t:\u0016\u02e6\u02e7\n\u0014\u0000\u0000\u02e7\u02e8\u0005\u0006\u0000"+
		"\u0000\u02e8\u0334\u0003t:\u0015\u02e9\u02ea\n\u0013\u0000\u0000\u02ea"+
		"\u02eb\u0005\b\u0000\u0000\u02eb\u0334\u0003t:\u0014\u02ec\u02ed\n\u0012"+
		"\u0000\u0000\u02ed\u02ee\u0005\u0005\u0000\u0000\u02ee\u0334\u0003t:\u0013"+
		"\u02ef\u02f0\n\u0011\u0000\u0000\u02f0\u02f1\u0005F\u0000\u0000\u02f1"+
		"\u0334\u0003t:\u0012\u02f2\u02f3\n\u0010\u0000\u0000\u02f3\u02f4\u0005"+
		"G\u0000\u0000\u02f4\u0334\u0003t:\u0011\u02f5\u02f6\n\u000f\u0000\u0000"+
		"\u02f6\u02f7\u0005H\u0000\u0000\u02f7\u0334\u0003t:\u0010\u02f8\u02f9"+
		"\n\u000e\u0000\u0000\u02f9\u02fa\u0005I\u0000\u0000\u02fa\u0334\u0003"+
		"t:\u000f\u02fb\u02fc\n\r\u0000\u0000\u02fc\u02fd\u0005\t\u0000\u0000\u02fd"+
		"\u0334\u0003t:\u000e\u02fe\u02ff\n\f\u0000\u0000\u02ff\u0300\u0005J\u0000"+
		"\u0000\u0300\u0334\u0003t:\r\u0301\u0302\n\u000b\u0000\u0000\u0302\u0303"+
		"\u0005K\u0000\u0000\u0303\u0334\u0003t:\f\u0304\u0305\n\n\u0000\u0000"+
		"\u0305\u0306\u0005L\u0000\u0000\u0306\u0334\u0003t:\u000b\u0307\u0308"+
		"\n\t\u0000\u0000\u0308\u0309\u0005M\u0000\u0000\u0309\u0334\u0003t:\n"+
		"\u030a\u030b\n\b\u0000\u0000\u030b\u030c\u0005N\u0000\u0000\u030c\u0334"+
		"\u0003t:\t\u030d\u030e\n\u0007\u0000\u0000\u030e\u030f\u0005O\u0000\u0000"+
		"\u030f\u0334\u0003t:\b\u0310\u0311\n\u0006\u0000\u0000\u0311\u0312\u0005"+
		"P\u0000\u0000\u0312\u0334\u0003t:\u0007\u0313\u0314\n\u0005\u0000\u0000"+
		"\u0314\u0315\u0005Q\u0000\u0000\u0315\u0334\u0003t:\u0006\u0316\u0317"+
		"\n\u0004\u0000\u0000\u0317\u0318\u0005R\u0000\u0000\u0318\u0334\u0003"+
		"t:\u0005\u0319\u031a\n\u0003\u0000\u0000\u031a\u031b\u0005S\u0000\u0000"+
		"\u031b\u0334\u0003t:\u0004\u031c\u031d\n\u0002\u0000\u0000\u031d\u031e"+
		"\u0005T\u0000\u0000\u031e\u031f\u0003t:\u0000\u031f\u0320\u0005U\u0000"+
		"\u0000\u0320\u0321\u0003t:\u0003\u0321\u0334\u0001\u0000\u0000\u0000\u0322"+
		"\u0323\n/\u0000\u0000\u0323\u0334\u00057\u0000\u0000\u0324\u0325\n.\u0000"+
		"\u0000\u0325\u0334\u00058\u0000\u0000\u0326\u0327\n,\u0000\u0000\u0327"+
		"\u0328\u0005 \u0000\u0000\u0328\u0329\u0003t:\u0000\u0329\u032a\u0005"+
		"!\u0000\u0000\u032a\u0334\u0001\u0000\u0000\u0000\u032b\u032c\n+\u0000"+
		"\u0000\u032c\u032d\u0005\u0015\u0000\u0000\u032d\u032e\u0003~?\u0000\u032e"+
		"\u032f\u0005\u0016\u0000\u0000\u032f\u0334\u0001\u0000\u0000\u0000\u0330"+
		"\u0331\n*\u0000\u0000\u0331\u0332\u0005#\u0000\u0000\u0332\u0334\u0003"+
		"\u00acV\u0000\u0333\u02c2\u0001\u0000\u0000\u0000\u0333\u02c5\u0001\u0000"+
		"\u0000\u0000\u0333\u02c8\u0001\u0000\u0000\u0000\u0333\u02cb\u0001\u0000"+
		"\u0000\u0000\u0333\u02ce\u0001\u0000\u0000\u0000\u0333\u02d1\u0001\u0000"+
		"\u0000\u0000\u0333\u02d4\u0001\u0000\u0000\u0000\u0333\u02d7\u0001\u0000"+
		"\u0000\u0000\u0333\u02da\u0001\u0000\u0000\u0000\u0333\u02dd\u0001\u0000"+
		"\u0000\u0000\u0333\u02e0\u0001\u0000\u0000\u0000\u0333\u02e3\u0001\u0000"+
		"\u0000\u0000\u0333\u02e6\u0001\u0000\u0000\u0000\u0333\u02e9\u0001\u0000"+
		"\u0000\u0000\u0333\u02ec\u0001\u0000\u0000\u0000\u0333\u02ef\u0001\u0000"+
		"\u0000\u0000\u0333\u02f2\u0001\u0000\u0000\u0000\u0333\u02f5\u0001\u0000"+
		"\u0000\u0000\u0333\u02f8\u0001\u0000\u0000\u0000\u0333\u02fb\u0001\u0000"+
		"\u0000\u0000\u0333\u02fe\u0001\u0000\u0000\u0000\u0333\u0301\u0001\u0000"+
		"\u0000\u0000\u0333\u0304\u0001\u0000\u0000\u0000\u0333\u0307\u0001\u0000"+
		"\u0000\u0000\u0333\u030a\u0001\u0000\u0000\u0000\u0333\u030d\u0001\u0000"+
		"\u0000\u0000\u0333\u0310\u0001\u0000\u0000\u0000\u0333\u0313\u0001\u0000"+
		"\u0000\u0000\u0333\u0316\u0001\u0000\u0000\u0000\u0333\u0319\u0001\u0000"+
		"\u0000\u0000\u0333\u031c\u0001\u0000\u0000\u0000\u0333\u0322\u0001\u0000"+
		"\u0000\u0000\u0333\u0324\u0001\u0000\u0000\u0000\u0333\u0326\u0001\u0000"+
		"\u0000\u0000\u0333\u032b\u0001\u0000\u0000\u0000\u0333\u0330\u0001\u0000"+
		"\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335\u0333\u0001\u0000"+
		"\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336u\u0001\u0000\u0000"+
		"\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338\u0349\u0005e\u0000\u0000"+
		"\u0339\u0349\u0003\u00aaU\u0000\u033a\u0349\u0005i\u0000\u0000\u033b\u0349"+
		"\u0005y\u0000\u0000\u033c\u033f\u0003\u00acV\u0000\u033d\u033e\u0005 "+
		"\u0000\u0000\u033e\u0340\u0005!\u0000\u0000\u033f\u033d\u0001\u0000\u0000"+
		"\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0349\u0001\u0000\u0000"+
		"\u0000\u0341\u0349\u0005v\u0000\u0000\u0342\u0349\u0003\u00a6S\u0000\u0343"+
		"\u0346\u0003\u00a8T\u0000\u0344\u0345\u0005 \u0000\u0000\u0345\u0347\u0005"+
		"!\u0000\u0000\u0346\u0344\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000"+
		"\u0000\u0000\u0347\u0349\u0001\u0000\u0000\u0000\u0348\u0338\u0001\u0000"+
		"\u0000\u0000\u0348\u0339\u0001\u0000\u0000\u0000\u0348\u033a\u0001\u0000"+
		"\u0000\u0000\u0348\u033b\u0001\u0000\u0000\u0000\u0348\u033c\u0001\u0000"+
		"\u0000\u0000\u0348\u0341\u0001\u0000\u0000\u0000\u0348\u0342\u0001\u0000"+
		"\u0000\u0000\u0348\u0343\u0001\u0000\u0000\u0000\u0349w\u0001\u0000\u0000"+
		"\u0000\u034a\u034f\u0003t:\u0000\u034b\u034c\u0005\u000f\u0000\u0000\u034c"+
		"\u034e\u0003t:\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e\u0351\u0001"+
		"\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u034f\u0350\u0001"+
		"\u0000\u0000\u0000\u0350y\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000"+
		"\u0000\u0000\u0352\u0357\u0003|>\u0000\u0353\u0354\u0005\u000f\u0000\u0000"+
		"\u0354\u0356\u0003|>\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0356\u0359"+
		"\u0001\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0357\u0358"+
		"\u0001\u0000\u0000\u0000\u0358\u035b\u0001\u0000\u0000\u0000\u0359\u0357"+
		"\u0001\u0000\u0000\u0000\u035a\u035c\u0005\u000f\u0000\u0000\u035b\u035a"+
		"\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c{\u0001"+
		"\u0000\u0000\u0000\u035d\u035e\u0003\u00acV\u0000\u035e\u035f\u0005U\u0000"+
		"\u0000\u035f\u0360\u0003t:\u0000\u0360}\u0001\u0000\u0000\u0000\u0361"+
		"\u0363\u0005\u000e\u0000\u0000\u0362\u0364\u0003z=\u0000\u0363\u0362\u0001"+
		"\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0365\u0001"+
		"\u0000\u0000\u0000\u0365\u036a\u0005\u0010\u0000\u0000\u0366\u0368\u0003"+
		"x<\u0000\u0367\u0366\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000"+
		"\u0000\u0368\u036a\u0001\u0000\u0000\u0000\u0369\u0361\u0001\u0000\u0000"+
		"\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u036a\u007f\u0001\u0000\u0000"+
		"\u0000\u036b\u036c\u0003t:\u0000\u036c\u036d\u0005\u0015\u0000\u0000\u036d"+
		"\u036e\u0003~?\u0000\u036e\u036f\u0005\u0016\u0000\u0000\u036f\u0081\u0001"+
		"\u0000\u0000\u0000\u0370\u0374\u0005\u000e\u0000\u0000\u0371\u0373\u0003"+
		"\u0084B\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0373\u0376\u0001\u0000"+
		"\u0000\u0000\u0374\u0372\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000"+
		"\u0000\u0000\u0375\u0377\u0001\u0000\u0000\u0000\u0376\u0374\u0001\u0000"+
		"\u0000\u0000\u0377\u0378\u0005\u0010\u0000\u0000\u0378\u0083\u0001\u0000"+
		"\u0000\u0000\u0379\u038b\u0003\u00acV\u0000\u037a\u038b\u0003\u0082A\u0000"+
		"\u037b\u038b\u0003\u0086C\u0000\u037c\u038b\u0003\u008aE\u0000\u037d\u038b"+
		"\u0003\u008cF\u0000\u037e\u038b\u0003\u0092I\u0000\u037f\u038b\u0003\u0094"+
		"J\u0000\u0380\u038b\u0003\u0096K\u0000\u0381\u038b\u0003\u009aM\u0000"+
		"\u0382\u038b\u0003\u009eO\u0000\u0383\u038b\u0003\u00a0P\u0000\u0384\u038b"+
		"\u0005l\u0000\u0000\u0385\u038b\u0005n\u0000\u0000\u0386\u038b\u0003\u00a4"+
		"R\u0000\u0387\u038b\u0003\u00aaU\u0000\u0388\u038b\u0005y\u0000\u0000"+
		"\u0389\u038b\u0005i\u0000\u0000\u038a\u0379\u0001\u0000\u0000\u0000\u038a"+
		"\u037a\u0001\u0000\u0000\u0000\u038a\u037b\u0001\u0000\u0000\u0000\u038a"+
		"\u037c\u0001\u0000\u0000\u0000\u038a\u037d\u0001\u0000\u0000\u0000\u038a"+
		"\u037e\u0001\u0000\u0000\u0000\u038a\u037f\u0001\u0000\u0000\u0000\u038a"+
		"\u0380\u0001\u0000\u0000\u0000\u038a\u0381\u0001\u0000\u0000\u0000\u038a"+
		"\u0382\u0001\u0000\u0000\u0000\u038a\u0383\u0001\u0000\u0000\u0000\u038a"+
		"\u0384\u0001\u0000\u0000\u0000\u038a\u0385\u0001\u0000\u0000\u0000\u038a"+
		"\u0386\u0001\u0000\u0000\u0000\u038a\u0387\u0001\u0000\u0000\u0000\u038a"+
		"\u0388\u0001\u0000\u0000\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038b"+
		"\u0085\u0001\u0000\u0000\u0000\u038c\u038f\u0003\u0088D\u0000\u038d\u038f"+
		"\u0003\u00a2Q\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038d\u0001"+
		"\u0000\u0000\u0000\u038f\u0087\u0001\u0000\u0000\u0000\u0390\u0395\u0005"+
		".\u0000\u0000\u0391\u0395\u0005\"\u0000\u0000\u0392\u0395\u00056\u0000"+
		"\u0000\u0393\u0395\u0003\u00acV\u0000\u0394\u0390\u0001\u0000\u0000\u0000"+
		"\u0394\u0391\u0001\u0000\u0000\u0000\u0394\u0392\u0001\u0000\u0000\u0000"+
		"\u0394\u0393\u0001\u0000\u0000\u0000\u0395\u03a2\u0001\u0000\u0000\u0000"+
		"\u0396\u0398\u0005\u0015\u0000\u0000\u0397\u0399\u0003\u0086C\u0000\u0398"+
		"\u0397\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399"+
		"\u039e\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u000f\u0000\u0000\u039b"+
		"\u039d\u0003\u0086C\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039d\u03a0"+
		"\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000\u0000\u0000\u039e\u039f"+
		"\u0001\u0000\u0000\u0000\u039f\u03a1\u0001\u0000\u0000\u0000\u03a0\u039e"+
		"\u0001\u0000\u0000\u0000\u03a1\u03a3\u0005\u0016\u0000\u0000\u03a2\u0396"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u0089"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a5\u0005V\u0000\u0000\u03a5\u03a8\u0003"+
		"\u008eG\u0000\u03a6\u03a7\u0005W\u0000\u0000\u03a7\u03a9\u0003\u0086C"+
		"\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a9\u008b\u0001\u0000\u0000\u0000\u03aa\u03ab\u0003\u008eG\u0000"+
		"\u03ab\u03ac\u0005W\u0000\u0000\u03ac\u03ad\u0003\u0086C\u0000\u03ad\u008d"+
		"\u0001\u0000\u0000\u0000\u03ae\u03b4\u0003\u00acV\u0000\u03af\u03b0\u0005"+
		"\u0015\u0000\u0000\u03b0\u03b1\u0003\u0090H\u0000\u03b1\u03b2\u0005\u0016"+
		"\u0000\u0000\u03b2\u03b4\u0001\u0000\u0000\u0000\u03b3\u03ae\u0001\u0000"+
		"\u0000\u0000\u03b3\u03af\u0001\u0000\u0000\u0000\u03b4\u008f\u0001\u0000"+
		"\u0000\u0000\u03b5\u03ba\u0003\u00acV\u0000\u03b6\u03b7\u0005\u000f\u0000"+
		"\u0000\u03b7\u03b9\u0003\u00acV\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000"+
		"\u03b9\u03bc\u0001\u0000\u0000\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000"+
		"\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u0091\u0001\u0000\u0000\u0000"+
		"\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bd\u03be\u0005X\u0000\u0000\u03be"+
		"\u03bf\u0003\u00acV\u0000\u03bf\u0093\u0001\u0000\u0000\u0000\u03c0\u03c1"+
		"\u0003\u00acV\u0000\u03c1\u03c2\u0005U\u0000\u0000\u03c2\u0095\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c4\u0005Y\u0000\u0000\u03c4\u03c8\u0003\u0086C\u0000"+
		"\u03c5\u03c7\u0003\u0098L\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c7"+
		"\u03ca\u0001\u0000\u0000\u0000\u03c8\u03c6\u0001\u0000\u0000\u0000\u03c8"+
		"\u03c9\u0001\u0000\u0000\u0000\u03c9\u0097\u0001\u0000\u0000\u0000\u03ca"+
		"\u03c8\u0001\u0000\u0000\u0000\u03cb\u03cc\u0005Z\u0000\u0000\u03cc\u03cd"+
		"\u0003\u00a2Q\u0000\u03cd\u03ce\u0003\u0082A\u0000\u03ce\u03d2\u0001\u0000"+
		"\u0000\u0000\u03cf\u03d0\u0005[\u0000\u0000\u03d0\u03d2\u0003\u0082A\u0000"+
		"\u03d1\u03cb\u0001\u0000\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000"+
		"\u03d2\u0099\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005\u001c\u0000\u0000"+
		"\u03d4\u03d5\u0003\u00acV\u0000\u03d5\u03d7\u0005\u0015\u0000\u0000\u03d6"+
		"\u03d8\u0003\u0090H\u0000\u03d7\u03d6\u0001\u0000\u0000\u0000\u03d7\u03d8"+
		"\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9\u03db"+
		"\u0005\u0016\u0000\u0000\u03da\u03dc\u0003\u009cN\u0000\u03db\u03da\u0001"+
		"\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0003\u0082A\u0000\u03de\u009b\u0001\u0000"+
		"\u0000\u0000\u03df\u03e0\u0005\\\u0000\u0000\u03e0\u03e1\u0003\u0090H"+
		"\u0000\u03e1\u009d\u0001\u0000\u0000\u0000\u03e2\u03e5\u0005\u0018\u0000"+
		"\u0000\u03e3\u03e6\u0003\u0082A\u0000\u03e4\u03e6\u0003\u0086C\u0000\u03e5"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e6"+
		"\u03e7\u0001\u0000\u0000\u0000\u03e7\u03ea\u0003\u0086C\u0000\u03e8\u03eb"+
		"\u0003\u0082A\u0000\u03e9\u03eb\u0003\u0086C\u0000\u03ea\u03e8\u0001\u0000"+
		"\u0000\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000"+
		"\u0000\u0000\u03ec\u03ed\u0003\u0082A\u0000\u03ed\u009f\u0001\u0000\u0000"+
		"\u0000\u03ee\u03ef\u0005)\u0000\u0000\u03ef\u03f0\u0003\u0086C\u0000\u03f0"+
		"\u03f1\u0003\u0082A\u0000\u03f1\u00a1\u0001\u0000\u0000\u0000\u03f2\u03f3"+
		"\u0007\u0007\u0000\u0000\u03f3\u00a3\u0001\u0000\u0000\u0000\u03f4\u03f5"+
		"\u0005,\u0000\u0000\u03f5\u03f6\u0003\u00acV\u0000\u03f6\u03f7\u0003\u0082"+
		"A\u0000\u03f7\u00a5\u0001\u0000\u0000\u0000\u03f8\u03fa\u0005\u0015\u0000"+
		"\u0000\u03f9\u03fb\u0003t:\u0000\u03fa\u03f9\u0001\u0000\u0000\u0000\u03fa"+
		"\u03fb\u0001\u0000\u0000\u0000\u03fb\u0402\u0001\u0000\u0000\u0000\u03fc"+
		"\u03fe\u0005\u000f\u0000\u0000\u03fd\u03ff\u0003t:\u0000\u03fe\u03fd\u0001"+
		"\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0401\u0001"+
		"\u0000\u0000\u0000\u0400\u03fc\u0001\u0000\u0000\u0000\u0401\u0404\u0001"+
		"\u0000\u0000\u0000\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001"+
		"\u0000\u0000\u0000\u0403\u0405\u0001\u0000\u0000\u0000\u0404\u0402\u0001"+
		"\u0000\u0000\u0000\u0405\u0413\u0005\u0016\u0000\u0000\u0406\u040f\u0005"+
		" \u0000\u0000\u0407\u040c\u0003t:\u0000\u0408\u0409\u0005\u000f\u0000"+
		"\u0000\u0409\u040b\u0003t:\u0000\u040a\u0408\u0001\u0000\u0000\u0000\u040b"+
		"\u040e\u0001\u0000\u0000\u0000\u040c\u040a\u0001\u0000\u0000\u0000\u040c"+
		"\u040d\u0001\u0000\u0000\u0000\u040d\u0410\u0001\u0000\u0000\u0000\u040e"+
		"\u040c\u0001\u0000\u0000\u0000\u040f\u0407\u0001\u0000\u0000\u0000\u040f"+
		"\u0410\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411"+
		"\u0413\u0005!\u0000\u0000\u0412\u03f8\u0001\u0000\u0000\u0000\u0412\u0406"+
		"\u0001\u0000\u0000\u0000\u0413\u00a7\u0001\u0000\u0000\u0000\u0414\u0417"+
		"\u0003r9\u0000\u0415\u0417\u0003B!\u0000\u0416\u0414\u0001\u0000\u0000"+
		"\u0000\u0416\u0415\u0001\u0000\u0000\u0000\u0417\u00a9\u0001\u0000\u0000"+
		"\u0000\u0418\u041a\u0007\b\u0000\u0000\u0419\u041b\u0005h\u0000\u0000"+
		"\u041a\u0419\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000"+
		"\u041b\u00ab\u0001\u0000\u0000\u0000\u041c\u041d\u0007\t\u0000\u0000\u041d"+
		"\u00ad\u0001\u0000\u0000\u0000m\u00b1\u00b3\u00c1\u00c5\u00ca\u00d1\u00d7"+
		"\u00dd\u00e1\u00ed\u00f5\u00fa\u0104\u0107\u010d\u0115\u0118\u0122\u0128"+
		"\u012e\u0137\u0145\u0148\u0154\u015b\u015e\u0161\u0165\u016a\u016e\u0179"+
		"\u017b\u017f\u0185\u018f\u0195\u01a0\u01a3\u01a9\u01ac\u01b4\u01b7\u01bd"+
		"\u01c0\u01c8\u01cb\u01d1\u01d5\u01e0\u01e5\u01ea\u01f2\u0201\u0203\u0208"+
		"\u0212\u0225\u0231\u023b\u0241\u0245\u0248\u024f\u0263\u0273\u0283\u0287"+
		"\u028c\u0290\u0294\u0299\u029e\u02a2\u02c0\u0333\u0335\u033f\u0346\u0348"+
		"\u034f\u0357\u035b\u0363\u0367\u0369\u0374\u038a\u038e\u0394\u0398\u039e"+
		"\u03a2\u03a8\u03b3\u03ba\u03c8\u03d1\u03d7\u03db\u03e5\u03ea\u03fa\u03fe"+
		"\u0402\u040c\u040f\u0412\u0416\u041a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}