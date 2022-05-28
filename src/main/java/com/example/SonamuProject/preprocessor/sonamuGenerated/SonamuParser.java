// Generated from C:/Users/User/Desktop/Project/SonamuProjectPage/src/main/g4\Sonamu.g4 by ANTLR 4.10.1

    package com.example.SonamuProject.preprocessor.sonamuGenerated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SonamuParser extends Parser {
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
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, NatSpecSingleLine=99, NatSpecMultiLine=100, 
		Int=101, Uint=102, Byte=103, Fixed=104, Ufixed=105, VersionLiteral=106, 
		BooleanLiteral=107, DecimalNumber=108, HexNumber=109, NumberUnit=110, 
		HexLiteral=111, ReservedKeyword=112, AnonymousKeyword=113, BreakKeyword=114, 
		ConstantKeyword=115, ContinueKeyword=116, ExternalKeyword=117, IndexedKeyword=118, 
		InternalKeyword=119, PayableKeyword=120, PrivateKeyword=121, PublicKeyword=122, 
		PureKeyword=123, TypeKeyword=124, ViewKeyword=125, Identifier=126, StringLiteral=127, 
		WS=128, COMMENT=129, LINE_COMMENT=130;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaValue = 2, RULE_version = 3, 
		RULE_versionOperator = 4, RULE_versionConstraint = 5, RULE_importDeclaration = 6, 
		RULE_importDirective = 7, RULE_natSpec = 8, RULE_contractDefinition = 9, 
		RULE_inheritanceSpecifier = 10, RULE_contractPart = 11, RULE_stateVariableDeclaration = 12, 
		RULE_usingForDeclaration = 13, RULE_structDefinition = 14, RULE_constructorDefinition = 15, 
		RULE_modifierDefinition = 16, RULE_modifierInvocation = 17, RULE_functionDefinition = 18, 
		RULE_returnParameters = 19, RULE_modifierList = 20, RULE_eventDefinition = 21, 
		RULE_enumValue = 22, RULE_enumDefinition = 23, RULE_parameterList = 24, 
		RULE_parameter = 25, RULE_eventParameterList = 26, RULE_eventParameter = 27, 
		RULE_functionTypeParameterList = 28, RULE_functionTypeParameter = 29, 
		RULE_variableDeclaration = 30, RULE_typeName = 31, RULE_userDefinedTypeName = 32, 
		RULE_mapping = 33, RULE_functionTypeName = 34, RULE_storageLocation = 35, 
		RULE_stateMutability = 36, RULE_block = 37, RULE_statement = 38, RULE_expressionStatement = 39, 
		RULE_ifStatement = 40, RULE_whileStatement = 41, RULE_simpleStatement = 42, 
		RULE_forStatement = 43, RULE_inlineAssemblyStatement = 44, RULE_doWhileStatement = 45, 
		RULE_continueStatement = 46, RULE_breakStatement = 47, RULE_returnStatement = 48, 
		RULE_throwStatement = 49, RULE_emitStatement = 50, RULE_variableDeclarationStatement = 51, 
		RULE_variableDeclarationList = 52, RULE_identifierList = 53, RULE_elementaryTypeName = 54, 
		RULE_expression = 55, RULE_primaryExpression = 56, RULE_expressionList = 57, 
		RULE_nameValueList = 58, RULE_nameValue = 59, RULE_functionCallArguments = 60, 
		RULE_functionCall = 61, RULE_assemblyBlock = 62, RULE_assemblyItem = 63, 
		RULE_assemblyExpression = 64, RULE_assemblyCall = 65, RULE_assemblyLocalDefinition = 66, 
		RULE_assemblyAssignment = 67, RULE_assemblyIdentifierOrList = 68, RULE_assemblyIdentifierList = 69, 
		RULE_assemblyStackAssignment = 70, RULE_labelDefinition = 71, RULE_assemblySwitch = 72, 
		RULE_assemblyCase = 73, RULE_assemblyFunctionDefinition = 74, RULE_assemblyFunctionReturns = 75, 
		RULE_assemblyFor = 76, RULE_assemblyIf = 77, RULE_assemblyLiteral = 78, 
		RULE_subAssembly = 79, RULE_tupleExpression = 80, RULE_typeNameExpression = 81, 
		RULE_numberLiteral = 82, RULE_identifier = 83;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaValue", "version", "versionOperator", 
			"versionConstraint", "importDeclaration", "importDirective", "natSpec", 
			"contractDefinition", "inheritanceSpecifier", "contractPart", "stateVariableDeclaration", 
			"usingForDeclaration", "structDefinition", "constructorDefinition", "modifierDefinition", 
			"modifierInvocation", "functionDefinition", "returnParameters", "modifierList", 
			"eventDefinition", "enumValue", "enumDefinition", "parameterList", "parameter", 
			"eventParameterList", "eventParameter", "functionTypeParameterList", 
			"functionTypeParameter", "variableDeclaration", "typeName", "userDefinedTypeName", 
			"mapping", "functionTypeName", "storageLocation", "stateMutability", 
			"block", "statement", "expressionStatement", "ifStatement", "whileStatement", 
			"simpleStatement", "forStatement", "inlineAssemblyStatement", "doWhileStatement", 
			"continueStatement", "breakStatement", "returnStatement", "throwStatement", 
			"emitStatement", "variableDeclarationStatement", "variableDeclarationList", 
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
			null, "'\\uBC84\\uC804'", "';'", "'^'", "'~'", "'>='", "'>'", "'<'", 
			"'<='", "'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", 
			"'\\uACC4\\uC57D'", "'\\uC778\\uD130\\uD398\\uC774\\uC2A4'", "'\\uB77C\\uC774\\uBE0C\\uB7EC\\uB9AC'", 
			"'is'", "'('", "')'", "'using'", "'for'", "'struct'", "'\\uCD08\\uC548'", 
			"'\\uCD94\\uAC00\\uB3D9\\uC791'", "'\\uACC4\\uC57D\\uB0B4\\uC6A9'", "'==>'", 
			"'\\uAE30\\uB85D'", "'enum'", "'['", "']'", "'\\uC9C0\\uBD88\\uAC00\\uB2A5\\uD55C'", 
			"'\\uC8FC\\uC18C'", "'.'", "'\\uC9DD\\uAFCD'", "'=>'", "'memory'", "'storage'", 
			"'calldata'", "'\\uACBD\\uC6B0'", "'\\uADF8\\uC678'", "'\\uB3D9\\uC548\\uC740'", 
			"'assembly'", "'do'", "'while'", "'\\uBC18\\uD658'", "'throw'", "'\\uAE30\\uB85D\\uD558\\uB2E4'", 
			"'\\uBCC0\\uC218'", "'\\uC8FC\\uC18C\\uD615'", "'\\uB17C\\uB9AC\\uC5F0\\uC0B0\\uC790'", 
			"'\\uBB38\\uC790\\uC5F4'", "'\\uBC14\\uC774\\uD2B8'", "'++'", "'--'", 
			"'\\uC0DD\\uC131'", "'+'", "'-'", "'after'", "'delete'", "'!'", "'**'", 
			"'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'=='", "'!='", "'&&'", "'||'", 
			"'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'?'", "':'", "'return'", "'address'", "'byte'", "'let'", "':='", 
			"'=:'", "'switch'", "'case'", "'default'", "'function'", "'->'", "'if'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'anonymous'", "'break'", "'constant'", "'continue'", "':\\uC678\\uBD80\\uC6A9'", 
			"'indexed'", "':\\uC0C1\\uC18D\\uC6A9'", "':\\uC9C0\\uBD88\\uAC00\\uB2A5'", 
			"':\\uAC1C\\uC778\\uC6A9'", "':\\uACF5\\uC6A9'", "'pure'", "'type'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NatSpecSingleLine", "NatSpecMultiLine", "Int", "Uint", 
			"Byte", "Fixed", "Ufixed", "VersionLiteral", "BooleanLiteral", "DecimalNumber", 
			"HexNumber", "NumberUnit", "HexLiteral", "ReservedKeyword", "AnonymousKeyword", 
			"BreakKeyword", "ConstantKeyword", "ContinueKeyword", "ExternalKeyword", 
			"IndexedKeyword", "InternalKeyword", "PayableKeyword", "PrivateKeyword", 
			"PublicKeyword", "PureKeyword", "TypeKeyword", "ViewKeyword", "Identifier", 
			"StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Sonamu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SonamuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SonamuParser.EOF, 0); }
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitSourceUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitSourceUnit(this);
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
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__12) | (1L << T__40))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NatSpecSingleLine - 99)) | (1L << (NatSpecMultiLine - 99)) | (1L << (Identifier - 99)))) != 0)) {
				{
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(168);
					pragmaDirective();
					}
					break;
				case T__10:
					{
					setState(169);
					importDirective();
					}
					break;
				case T__12:
				case T__40:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
				case Identifier:
					{
					setState(170);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
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
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitPragmaDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitPragmaDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__0);
			setState(179);
			pragmaValue();
			setState(180);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterPragmaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitPragmaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitPragmaValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaValue);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			versionConstraint();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==VersionLiteral) {
				{
				setState(187);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterVersionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitVersionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitVersionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		public TerminalNode VersionLiteral() { return getToken(SonamuParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterVersionConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitVersionConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitVersionConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(192);
				versionOperator();
				}
			}

			setState(195);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			identifier();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(198);
				match(T__9);
				setState(199);
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
		public TerminalNode StringLiteral() { return getToken(SonamuParser.StringLiteral, 0); }
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitImportDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitImportDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDirective);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__10);
				setState(203);
				match(StringLiteral);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(204);
					match(T__9);
					setState(205);
					identifier();
					}
				}

				setState(208);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__10);
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(210);
					match(T__11);
					}
					break;
				case T__12:
				case T__40:
				case Identifier:
					{
					setState(211);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(214);
					match(T__9);
					setState(215);
					identifier();
					}
				}

				setState(218);
				match(T__12);
				setState(219);
				match(StringLiteral);
				setState(220);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__10);
				setState(222);
				match(T__13);
				setState(223);
				importDeclaration();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(224);
					match(T__14);
					setState(225);
					importDeclaration();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(T__15);
				setState(232);
				match(T__12);
				setState(233);
				match(StringLiteral);
				setState(234);
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
		public TerminalNode NatSpecSingleLine() { return getToken(SonamuParser.NatSpecSingleLine, 0); }
		public TerminalNode NatSpecMultiLine() { return getToken(SonamuParser.NatSpecMultiLine, 0); }
		public NatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterNatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitNatSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitNatSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NatSpecContext natSpec() throws RecognitionException {
		NatSpecContext _localctx = new NatSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_natSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(240);
				natSpec();
				}
			}

			setState(243);
			identifier();
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(245);
				match(T__19);
				setState(246);
				inheritanceSpecifier();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(247);
					match(T__14);
					setState(248);
					inheritanceSpecifier();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(256);
			match(T__13);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NatSpecSingleLine - 99)) | (1L << (NatSpecMultiLine - 99)) | (1L << (Int - 99)) | (1L << (Uint - 99)) | (1L << (Byte - 99)) | (1L << (Fixed - 99)) | (1L << (Ufixed - 99)) | (1L << (Identifier - 99)))) != 0)) {
				{
				{
				setState(257);
				contractPart();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitInheritanceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitInheritanceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			userDefinedTypeName();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(266);
				match(T__20);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
					{
					setState(267);
					expressionList();
					}
				}

				setState(270);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitContractPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitContractPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractPart);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
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
		public List<TerminalNode> PublicKeyword() { return getTokens(SonamuParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SonamuParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SonamuParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SonamuParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SonamuParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SonamuParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SonamuParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SonamuParser.ConstantKeyword, i);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitStateVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitStateVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			typeName(0);
			setState(284);
			identifier();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (ConstantKeyword - 115)) | (1L << (InternalKeyword - 115)) | (1L << (PrivateKeyword - 115)) | (1L << (PublicKeyword - 115)))) != 0)) {
				{
				{
				setState(285);
				_la = _input.LA(1);
				if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (ConstantKeyword - 115)) | (1L << (InternalKeyword - 115)) | (1L << (PrivateKeyword - 115)) | (1L << (PublicKeyword - 115)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(291);
				match(T__8);
				setState(292);
				expression(0);
				}
			}

			setState(295);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitUsingForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitUsingForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__22);
			setState(298);
			identifier();
			setState(299);
			match(T__23);
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(300);
				match(T__11);
				}
				break;
			case T__12:
			case T__27:
			case T__33:
			case T__36:
			case T__40:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(301);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__24);
			setState(307);
			identifier();
			setState(308);
			match(T__13);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(309);
				variableDeclaration();
				setState(310);
				match(T__1);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
					{
					{
					setState(311);
					variableDeclaration();
					setState(312);
					match(T__1);
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(321);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitConstructorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitConstructorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__25);
			setState(324);
			parameterList();
			setState(325);
			modifierList();
			setState(326);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitModifierDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitModifierDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__26);
			setState(329);
			identifier();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(330);
				parameterList();
				}
			}

			setState(333);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitModifierInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitModifierInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			identifier();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(336);
				match(T__20);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
					{
					setState(337);
					expressionList();
					}
				}

				setState(340);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(343);
				natSpec();
				}
			}

			setState(346);
			match(T__27);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(347);
				identifier();
				}
			}

			setState(350);
			parameterList();
			setState(351);
			modifierList();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(352);
				returnParameters();
				}
			}

			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(355);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(356);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitReturnParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitReturnParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__28);
			setState(360);
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
		public List<TerminalNode> ExternalKeyword() { return getTokens(SonamuParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SonamuParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SonamuParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SonamuParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SonamuParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SonamuParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SonamuParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SonamuParser.PrivateKeyword, i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__40 || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (ConstantKeyword - 115)) | (1L << (ExternalKeyword - 115)) | (1L << (InternalKeyword - 115)) | (1L << (PayableKeyword - 115)) | (1L << (PrivateKeyword - 115)) | (1L << (PublicKeyword - 115)) | (1L << (PureKeyword - 115)) | (1L << (ViewKeyword - 115)) | (1L << (Identifier - 115)))) != 0)) {
				{
				setState(368);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__40:
				case Identifier:
					{
					setState(362);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(363);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(364);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(365);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(366);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(367);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(372);
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
		public TerminalNode AnonymousKeyword() { return getToken(SonamuParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitEventDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitEventDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(373);
				natSpec();
				}
			}

			setState(376);
			identifier();
			setState(377);
			match(T__29);
			setState(378);
			eventParameterList();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(379);
				match(AnonymousKeyword);
				}
			}

			setState(382);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitEnumDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitEnumDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__30);
			setState(387);
			identifier();
			setState(388);
			match(T__13);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(389);
				enumValue();
				}
			}

			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(392);
				match(T__14);
				setState(393);
				enumValue();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__20);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(402);
				parameter();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(403);
					match(T__14);
					setState(404);
					parameter();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(412);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			typeName(0);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(415);
				storageLocation();
				}
				break;
			}
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(418);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitEventParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitEventParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__20);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(422);
				eventParameter();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(423);
					match(T__14);
					setState(424);
					eventParameter();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(432);
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
		public TerminalNode IndexedKeyword() { return getToken(SonamuParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitEventParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitEventParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			typeName(0);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(435);
				match(IndexedKeyword);
				}
			}

			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(438);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitFunctionTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitFunctionTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__20);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(442);
				functionTypeParameter();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(443);
					match(T__14);
					setState(444);
					functionTypeParameter();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(452);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitFunctionTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitFunctionTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			typeName(0);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) {
				{
				setState(455);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			typeName(0);
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(459);
				storageLocation();
				}
				break;
			}
			setState(462);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitTypeName(this);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				{
				setState(465);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__40:
			case Identifier:
				{
				setState(466);
				userDefinedTypeName();
				}
				break;
			case T__36:
				{
				setState(467);
				mapping();
				}
				break;
			case T__27:
				{
				setState(468);
				functionTypeName();
				}
				break;
			case T__33:
				{
				setState(469);
				match(T__33);
				setState(470);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(481);
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
					setState(473);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(474);
					match(T__31);
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
						{
						setState(475);
						expression(0);
						}
					}

					setState(478);
					match(T__32);
					}
					} 
				}
				setState(483);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitUserDefinedTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitUserDefinedTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			identifier();
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(485);
					match(T__35);
					setState(486);
					identifier();
					}
					} 
				}
				setState(491);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__36);
			setState(493);
			match(T__20);
			setState(494);
			elementaryTypeName();
			setState(495);
			match(T__37);
			setState(496);
			typeName(0);
			setState(497);
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
		public List<TerminalNode> InternalKeyword() { return getTokens(SonamuParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SonamuParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SonamuParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SonamuParser.ExternalKeyword, i);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitFunctionTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitFunctionTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__27);
			setState(500);
			functionTypeParameterList();
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(504);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(501);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(502);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(503);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(509);
				match(T__28);
				setState(510);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitStorageLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitStorageLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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
		public TerminalNode PureKeyword() { return getToken(SonamuParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SonamuParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SonamuParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SonamuParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitStateMutability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitStateMutability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (ConstantKeyword - 115)) | (1L << (PayableKeyword - 115)) | (1L << (PureKeyword - 115)) | (1L << (ViewKeyword - 115)))) != 0)) ) {
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(T__13);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__27) | (1L << T__31) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (BreakKeyword - 101)) | (1L << (ContinueKeyword - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
				{
				{
				setState(518);
				statement();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(530);
				inlineAssemblyStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(531);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(532);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(533);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(534);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(535);
				throwStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(536);
				emitStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(537);
				simpleStatement();
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			expression(0);
			setState(541);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(T__41);
			setState(544);
			match(T__20);
			setState(545);
			expression(0);
			setState(546);
			match(T__21);
			setState(547);
			statement();
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(548);
				match(T__42);
				setState(549);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__20);
			setState(553);
			expression(0);
			setState(554);
			match(T__21);
			setState(555);
			match(T__43);
			setState(556);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(558);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(559);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(T__23);
			setState(563);
			match(T__20);
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__27:
			case T__31:
			case T__33:
			case T__36:
			case T__40:
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
			case T__62:
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
				setState(564);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(565);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__31:
			case T__40:
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
			case T__62:
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
				setState(568);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(569);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
				{
				setState(572);
				expression(0);
				}
			}

			setState(575);
			match(T__21);
			setState(576);
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
		public TerminalNode StringLiteral() { return getToken(SonamuParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitInlineAssemblyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitInlineAssemblyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__44);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(579);
				match(StringLiteral);
				}
			}

			setState(582);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(T__45);
			setState(585);
			statement();
			setState(586);
			match(T__46);
			setState(587);
			match(T__20);
			setState(588);
			expression(0);
			setState(589);
			match(T__21);
			setState(590);
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
		public TerminalNode ContinueKeyword() { return getToken(SonamuParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(ContinueKeyword);
			setState(593);
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
		public TerminalNode BreakKeyword() { return getToken(SonamuParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(BreakKeyword);
			setState(596);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__47);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
				{
				setState(599);
				expression(0);
				}
			}

			setState(602);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(T__48);
			setState(605);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitEmitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitEmitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			functionCall();
			setState(608);
			match(T__49);
			setState(609);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(611);
				match(T__50);
				setState(612);
				identifierList();
				}
				break;
			case 2:
				{
				setState(613);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(614);
				match(T__20);
				setState(615);
				variableDeclarationList();
				setState(616);
				match(T__21);
				}
				break;
			}
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(620);
				match(T__8);
				setState(621);
				expression(0);
				}
			}

			setState(624);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(626);
				variableDeclaration();
				}
			}

			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(629);
				match(T__14);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
					{
					setState(630);
					variableDeclaration();
					}
				}

				}
				}
				setState(637);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(T__20);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__40 || _la==Identifier) {
						{
						setState(639);
						identifier();
						}
					}

					setState(642);
					match(T__14);
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(648);
				identifier();
				}
			}

			setState(651);
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
		public TerminalNode Int() { return getToken(SonamuParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SonamuParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SonamuParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SonamuParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SonamuParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitElementaryTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitElementaryTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (T__50 - 51)) | (1L << (T__51 - 51)) | (1L << (T__52 - 51)) | (1L << (T__53 - 51)) | (1L << (T__54 - 51)) | (1L << (Int - 51)) | (1L << (Uint - 51)) | (1L << (Byte - 51)) | (1L << (Fixed - 51)) | (1L << (Ufixed - 51)))) != 0)) ) {
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(656);
				match(T__57);
				setState(657);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(658);
				match(T__20);
				setState(659);
				expression(0);
				setState(660);
				match(T__21);
				}
				break;
			case 3:
				{
				setState(662);
				match(T__55);
				setState(663);
				expression(40);
				}
				break;
			case 4:
				{
				setState(664);
				match(T__56);
				setState(665);
				expression(39);
				}
				break;
			case 5:
				{
				setState(666);
				match(T__58);
				setState(667);
				expression(38);
				}
				break;
			case 6:
				{
				setState(668);
				match(T__59);
				setState(669);
				expression(37);
				}
				break;
			case 7:
				{
				setState(670);
				match(T__60);
				setState(671);
				expression(36);
				}
				break;
			case 8:
				{
				setState(672);
				match(T__61);
				setState(673);
				expression(35);
				}
				break;
			case 9:
				{
				setState(674);
				match(T__62);
				setState(675);
				expression(34);
				}
				break;
			case 10:
				{
				setState(676);
				match(T__3);
				setState(677);
				expression(33);
				}
				break;
			case 11:
				{
				setState(678);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(796);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(794);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(681);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(682);
						match(T__63);
						setState(683);
						expression(33);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(684);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(685);
						match(T__11);
						setState(686);
						expression(32);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(687);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(688);
						match(T__64);
						setState(689);
						expression(31);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(690);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(691);
						match(T__65);
						setState(692);
						expression(30);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(693);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(694);
						match(T__58);
						setState(695);
						expression(29);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(696);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(697);
						match(T__59);
						setState(698);
						expression(28);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(700);
						match(T__66);
						setState(701);
						expression(27);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(702);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(703);
						match(T__67);
						setState(704);
						expression(26);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(705);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(706);
						match(T__68);
						setState(707);
						expression(25);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(708);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(709);
						match(T__2);
						setState(710);
						expression(24);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(711);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(712);
						match(T__69);
						setState(713);
						expression(23);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(714);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(715);
						match(T__6);
						setState(716);
						expression(22);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(717);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(718);
						match(T__5);
						setState(719);
						expression(21);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(720);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(721);
						match(T__7);
						setState(722);
						expression(20);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(723);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(724);
						match(T__4);
						setState(725);
						expression(19);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(726);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(727);
						match(T__70);
						setState(728);
						expression(18);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(729);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(730);
						match(T__71);
						setState(731);
						expression(17);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(732);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(733);
						match(T__72);
						setState(734);
						expression(16);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(736);
						match(T__73);
						setState(737);
						expression(15);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(738);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(739);
						match(T__8);
						setState(740);
						expression(14);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(741);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(742);
						match(T__74);
						setState(743);
						expression(13);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(744);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(745);
						match(T__75);
						setState(746);
						expression(12);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(747);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(748);
						match(T__76);
						setState(749);
						expression(11);
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(751);
						match(T__77);
						setState(752);
						expression(10);
						}
						break;
					case 25:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(753);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(754);
						match(T__78);
						setState(755);
						expression(9);
						}
						break;
					case 26:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(756);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(757);
						match(T__79);
						setState(758);
						expression(8);
						}
						break;
					case 27:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(759);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(760);
						match(T__80);
						setState(761);
						expression(7);
						}
						break;
					case 28:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(762);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(763);
						match(T__81);
						setState(764);
						expression(6);
						}
						break;
					case 29:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(765);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(766);
						match(T__82);
						setState(767);
						expression(5);
						}
						break;
					case 30:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(768);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(769);
						match(T__83);
						setState(770);
						expression(4);
						}
						break;
					case 31:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(771);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(772);
						match(T__84);
						setState(773);
						expression(0);
						setState(774);
						match(T__85);
						setState(775);
						expression(3);
						}
						break;
					case 32:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(777);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(778);
						match(T__55);
						}
						break;
					case 33:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(779);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(780);
						match(T__56);
						}
						break;
					case 34:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(781);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(782);
						match(T__31);
						setState(783);
						expression(0);
						setState(784);
						match(T__32);
						}
						break;
					case 35:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(786);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(787);
						match(T__20);
						setState(788);
						functionCallArguments();
						setState(789);
						match(T__21);
						}
						break;
					case 36:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(791);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(792);
						match(T__35);
						setState(793);
						identifier();
						}
						break;
					}
					} 
				}
				setState(798);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		public TerminalNode BooleanLiteral() { return getToken(SonamuParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SonamuParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SonamuParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SonamuParser.TypeKeyword, 0); }
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primaryExpression);
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(801);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(802);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(803);
				identifier();
				setState(806);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(804);
					match(T__31);
					setState(805);
					match(T__32);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(808);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(809);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(810);
				typeNameExpression();
				setState(813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(811);
					match(T__31);
					setState(812);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			expression(0);
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(818);
				match(T__14);
				setState(819);
				expression(0);
				}
				}
				setState(824);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitNameValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitNameValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			nameValue();
			setState(830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(826);
					match(T__14);
					setState(827);
					nameValue();
					}
					} 
				}
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(833);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			identifier();
			setState(837);
			match(T__85);
			setState(838);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionCallArguments);
		int _la;
		try {
			setState(848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				match(T__13);
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__40 || _la==Identifier) {
					{
					setState(841);
					nameValueList();
					}
				}

				setState(844);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__21:
			case T__31:
			case T__40:
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
			case T__62:
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
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
					{
					setState(845);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			expression(0);
			setState(851);
			match(T__20);
			setState(852);
			functionCallArguments();
			setState(853);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(T__13);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__40) | (1L << T__44))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)) | (1L << (T__89 - 87)) | (1L << (T__91 - 87)) | (1L << (T__92 - 87)) | (1L << (T__95 - 87)) | (1L << (T__97 - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (BreakKeyword - 87)) | (1L << (ContinueKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				{
				setState(856);
				assemblyItem();
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
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
		public TerminalNode BreakKeyword() { return getToken(SonamuParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SonamuParser.ContinueKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SonamuParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(SonamuParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assemblyItem);
		try {
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(866);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(867);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(868);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(869);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(870);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(871);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(872);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(873);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(874);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(875);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(876);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(877);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(878);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(879);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(880);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assemblyExpression);
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__40:
			case T__86:
			case T__87:
			case T__88:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				{
				setState(887);
				match(T__86);
				}
				break;
			case T__87:
				{
				setState(888);
				match(T__87);
				}
				break;
			case T__88:
				{
				setState(889);
				match(T__88);
				}
				break;
			case T__12:
			case T__40:
			case Identifier:
				{
				setState(890);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(893);
				match(T__20);
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__40 || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(894);
					assemblyExpression();
					}
				}

				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(897);
					match(T__14);
					setState(898);
					assemblyExpression();
					}
					}
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(904);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyLocalDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyLocalDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(T__89);
			setState(908);
			assemblyIdentifierOrList();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__90) {
				{
				setState(909);
				match(T__90);
				setState(910);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			assemblyIdentifierOrList();
			setState(914);
			match(T__90);
			setState(915);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyIdentifierOrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyIdentifierOrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyIdentifierOrList);
		try {
			setState(922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				identifier();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				match(T__20);
				setState(919);
				assemblyIdentifierList();
				setState(920);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			identifier();
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(925);
				match(T__14);
				setState(926);
				identifier();
				}
				}
				setState(931);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyStackAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyStackAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(T__91);
			setState(933);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			identifier();
			setState(936);
			match(T__85);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblySwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblySwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			match(T__92);
			setState(939);
			assemblyExpression();
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__93 || _la==T__94) {
				{
				{
				setState(940);
				assemblyCase();
				}
				}
				setState(945);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblyCase);
		try {
			setState(952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__93:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				match(T__93);
				setState(947);
				assemblyLiteral();
				setState(948);
				assemblyBlock();
				}
				break;
			case T__94:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				match(T__94);
				setState(951);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(T__95);
			setState(955);
			identifier();
			setState(956);
			match(T__20);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(957);
				assemblyIdentifierList();
				}
			}

			setState(960);
			match(T__21);
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(961);
				assemblyFunctionReturns();
				}
			}

			setState(964);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyFunctionReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyFunctionReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(966);
			match(T__96);
			setState(967);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(T__23);
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(970);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__40:
			case T__86:
			case T__87:
			case T__88:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(971);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(974);
			assemblyExpression();
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(975);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__40:
			case T__86:
			case T__87:
			case T__88:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(976);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(979);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(T__97);
			setState(982);
			assemblyExpression();
			setState(983);
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
		public TerminalNode StringLiteral() { return getToken(SonamuParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(SonamuParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SonamuParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(SonamuParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitAssemblyLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitAssemblyLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (DecimalNumber - 108)) | (1L << (HexNumber - 108)) | (1L << (HexLiteral - 108)) | (1L << (StringLiteral - 108)))) != 0)) ) {
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitSubAssembly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitSubAssembly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(T__44);
			setState(988);
			identifier();
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tupleExpression);
		int _la;
		try {
			setState(1017);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				match(T__20);
				{
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
					{
					setState(992);
					expression(0);
					}
				}

				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(995);
					match(T__14);
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
						{
						setState(996);
						expression(0);
						}
					}

					}
					}
					setState(1003);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1004);
				match(T__21);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				match(T__31);
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__40) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (BooleanLiteral - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (TypeKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
					{
					setState(1006);
					expression(0);
					setState(1011);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(1007);
						match(T__14);
						setState(1008);
						expression(0);
						}
						}
						setState(1013);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1016);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterTypeNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitTypeNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitTypeNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeNameExpression);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
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
		public TerminalNode DecimalNumber() { return getToken(SonamuParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SonamuParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SonamuParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1024);
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
		public TerminalNode Identifier() { return getToken(SonamuParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__40 || _la==Identifier) ) {
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
		case 31:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 55:
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
		"\u0004\u0001\u0082\u0406\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u00ac\b\u0000\n\u0000\f\u0000\u00af"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u00b9\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00bd\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0003"+
		"\u0005\u00c2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00c9\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00cf\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00d5\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d9"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e3\b\u0007\n\u0007\f\u0007"+
		"\u00e6\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00ed\b\u0007\u0001\b\u0001\b\u0001\t\u0003\t\u00f2\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00fa\b\t\n\t\f\t\u00fd"+
		"\t\t\u0003\t\u00ff\b\t\u0001\t\u0001\t\u0005\t\u0103\b\t\n\t\f\t\u0106"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u010d\b\n\u0001\n"+
		"\u0003\n\u0110\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011a\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u011f\b\f\n\f\f\f\u0122\t\f\u0001\f\u0001\f"+
		"\u0003\f\u0126\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u012f\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u013b\b\u000e\n\u000e\f\u000e\u013e\t\u000e\u0003\u000e\u0140\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u014c\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0153\b\u0011\u0001\u0011\u0003\u0011\u0156\b\u0011\u0001\u0012\u0003"+
		"\u0012\u0159\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u015d\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0162\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0166\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0171\b\u0014\n\u0014\f\u0014\u0174\t\u0014\u0001\u0015\u0003"+
		"\u0015\u0177\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u017d\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0187\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u018b\b\u0017\n\u0017\f\u0017\u018e\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0196\b\u0018\n\u0018\f\u0018\u0199\t\u0018\u0003\u0018\u019b"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01a1"+
		"\b\u0019\u0001\u0019\u0003\u0019\u01a4\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u01aa\b\u001a\n\u001a\f\u001a\u01ad"+
		"\t\u001a\u0003\u001a\u01af\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01b5\b\u001b\u0001\u001b\u0003\u001b\u01b8\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01be"+
		"\b\u001c\n\u001c\f\u001c\u01c1\t\u001c\u0003\u001c\u01c3\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01c9\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01cd\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01d8\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u01dd\b\u001f\u0001\u001f\u0005\u001f\u01e0\b\u001f\n\u001f\f\u001f"+
		"\u01e3\t\u001f\u0001 \u0001 \u0001 \u0005 \u01e8\b \n \f \u01eb\t \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u01f9\b\"\n\"\f\"\u01fc\t\"\u0001\"\u0001\"\u0003\""+
		"\u0200\b\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0005%\u0208\b%\n"+
		"%\f%\u020b\t%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u021b\b&\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0227"+
		"\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0003*\u0231"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0003+\u0237\b+\u0001+\u0001+\u0003+\u023b"+
		"\b+\u0001+\u0003+\u023e\b+\u0001+\u0001+\u0001+\u0001,\u0001,\u0003,\u0245"+
		"\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00030\u0259"+
		"\b0\u00010\u00010\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u026b\b3\u00013\u0001"+
		"3\u00033\u026f\b3\u00013\u00013\u00014\u00034\u0274\b4\u00014\u00014\u0003"+
		"4\u0278\b4\u00054\u027a\b4\n4\f4\u027d\t4\u00015\u00015\u00035\u0281\b"+
		"5\u00015\u00055\u0284\b5\n5\f5\u0287\t5\u00015\u00035\u028a\b5\u00015"+
		"\u00015\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u02a8\b7\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00057\u031b\b7\n7\f7\u031e\t7\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u0327\b8\u00018\u00018\u00018\u00018\u0001"+
		"8\u00038\u032e\b8\u00038\u0330\b8\u00019\u00019\u00019\u00059\u0335\b"+
		"9\n9\f9\u0338\t9\u0001:\u0001:\u0001:\u0005:\u033d\b:\n:\f:\u0340\t:\u0001"+
		":\u0003:\u0343\b:\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0003<\u034b"+
		"\b<\u0001<\u0001<\u0003<\u034f\b<\u0003<\u0351\b<\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001>\u0001>\u0005>\u035a\b>\n>\f>\u035d\t>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u0372\b?\u0001"+
		"@\u0001@\u0003@\u0376\b@\u0001A\u0001A\u0001A\u0001A\u0003A\u037c\bA\u0001"+
		"A\u0001A\u0003A\u0380\bA\u0001A\u0001A\u0005A\u0384\bA\nA\fA\u0387\tA"+
		"\u0001A\u0003A\u038a\bA\u0001B\u0001B\u0001B\u0001B\u0003B\u0390\bB\u0001"+
		"C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u039b"+
		"\bD\u0001E\u0001E\u0001E\u0005E\u03a0\bE\nE\fE\u03a3\tE\u0001F\u0001F"+
		"\u0001F\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0005H\u03ae\bH\nH\f"+
		"H\u03b1\tH\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u03b9\bI\u0001"+
		"J\u0001J\u0001J\u0001J\u0003J\u03bf\bJ\u0001J\u0001J\u0003J\u03c3\bJ\u0001"+
		"J\u0001J\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0003L\u03cd\bL\u0001"+
		"L\u0001L\u0001L\u0003L\u03d2\bL\u0001L\u0001L\u0001M\u0001M\u0001M\u0001"+
		"M\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001P\u0001P\u0003P\u03e2"+
		"\bP\u0001P\u0001P\u0003P\u03e6\bP\u0005P\u03e8\bP\nP\fP\u03eb\tP\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0005P\u03f2\bP\nP\fP\u03f5\tP\u0003P\u03f7"+
		"\bP\u0001P\u0003P\u03fa\bP\u0001Q\u0001Q\u0003Q\u03fe\bQ\u0001R\u0001"+
		"R\u0003R\u0402\bR\u0001S\u0001S\u0001S\u0000\u0002>nT\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u0000\n\u0001\u0000\u0003\t\u0001\u0000cd\u0001"+
		"\u0000\u0011\u0013\u0003\u0000sswwyz\u0001\u0000\')\u0004\u0000ssxx{{"+
		"}}\u0002\u000037ei\u0003\u0000lmoo\u007f\u007f\u0001\u0000lm\u0003\u0000"+
		"\r\r))~~\u047a\u0000\u00ad\u0001\u0000\u0000\u0000\u0002\u00b2\u0001\u0000"+
		"\u0000\u0000\u0004\u00b8\u0001\u0000\u0000\u0000\u0006\u00ba\u0001\u0000"+
		"\u0000\u0000\b\u00be\u0001\u0000\u0000\u0000\n\u00c1\u0001\u0000\u0000"+
		"\u0000\f\u00c5\u0001\u0000\u0000\u0000\u000e\u00ec\u0001\u0000\u0000\u0000"+
		"\u0010\u00ee\u0001\u0000\u0000\u0000\u0012\u00f1\u0001\u0000\u0000\u0000"+
		"\u0014\u0109\u0001\u0000\u0000\u0000\u0016\u0119\u0001\u0000\u0000\u0000"+
		"\u0018\u011b\u0001\u0000\u0000\u0000\u001a\u0129\u0001\u0000\u0000\u0000"+
		"\u001c\u0132\u0001\u0000\u0000\u0000\u001e\u0143\u0001\u0000\u0000\u0000"+
		" \u0148\u0001\u0000\u0000\u0000\"\u014f\u0001\u0000\u0000\u0000$\u0158"+
		"\u0001\u0000\u0000\u0000&\u0167\u0001\u0000\u0000\u0000(\u0172\u0001\u0000"+
		"\u0000\u0000*\u0176\u0001\u0000\u0000\u0000,\u0180\u0001\u0000\u0000\u0000"+
		".\u0182\u0001\u0000\u0000\u00000\u0191\u0001\u0000\u0000\u00002\u019e"+
		"\u0001\u0000\u0000\u00004\u01a5\u0001\u0000\u0000\u00006\u01b2\u0001\u0000"+
		"\u0000\u00008\u01b9\u0001\u0000\u0000\u0000:\u01c6\u0001\u0000\u0000\u0000"+
		"<\u01ca\u0001\u0000\u0000\u0000>\u01d7\u0001\u0000\u0000\u0000@\u01e4"+
		"\u0001\u0000\u0000\u0000B\u01ec\u0001\u0000\u0000\u0000D\u01f3\u0001\u0000"+
		"\u0000\u0000F\u0201\u0001\u0000\u0000\u0000H\u0203\u0001\u0000\u0000\u0000"+
		"J\u0205\u0001\u0000\u0000\u0000L\u021a\u0001\u0000\u0000\u0000N\u021c"+
		"\u0001\u0000\u0000\u0000P\u021f\u0001\u0000\u0000\u0000R\u0228\u0001\u0000"+
		"\u0000\u0000T\u0230\u0001\u0000\u0000\u0000V\u0232\u0001\u0000\u0000\u0000"+
		"X\u0242\u0001\u0000\u0000\u0000Z\u0248\u0001\u0000\u0000\u0000\\\u0250"+
		"\u0001\u0000\u0000\u0000^\u0253\u0001\u0000\u0000\u0000`\u0256\u0001\u0000"+
		"\u0000\u0000b\u025c\u0001\u0000\u0000\u0000d\u025f\u0001\u0000\u0000\u0000"+
		"f\u026a\u0001\u0000\u0000\u0000h\u0273\u0001\u0000\u0000\u0000j\u027e"+
		"\u0001\u0000\u0000\u0000l\u028d\u0001\u0000\u0000\u0000n\u02a7\u0001\u0000"+
		"\u0000\u0000p\u032f\u0001\u0000\u0000\u0000r\u0331\u0001\u0000\u0000\u0000"+
		"t\u0339\u0001\u0000\u0000\u0000v\u0344\u0001\u0000\u0000\u0000x\u0350"+
		"\u0001\u0000\u0000\u0000z\u0352\u0001\u0000\u0000\u0000|\u0357\u0001\u0000"+
		"\u0000\u0000~\u0371\u0001\u0000\u0000\u0000\u0080\u0375\u0001\u0000\u0000"+
		"\u0000\u0082\u037b\u0001\u0000\u0000\u0000\u0084\u038b\u0001\u0000\u0000"+
		"\u0000\u0086\u0391\u0001\u0000\u0000\u0000\u0088\u039a\u0001\u0000\u0000"+
		"\u0000\u008a\u039c\u0001\u0000\u0000\u0000\u008c\u03a4\u0001\u0000\u0000"+
		"\u0000\u008e\u03a7\u0001\u0000\u0000\u0000\u0090\u03aa\u0001\u0000\u0000"+
		"\u0000\u0092\u03b8\u0001\u0000\u0000\u0000\u0094\u03ba\u0001\u0000\u0000"+
		"\u0000\u0096\u03c6\u0001\u0000\u0000\u0000\u0098\u03c9\u0001\u0000\u0000"+
		"\u0000\u009a\u03d5\u0001\u0000\u0000\u0000\u009c\u03d9\u0001\u0000\u0000"+
		"\u0000\u009e\u03db\u0001\u0000\u0000\u0000\u00a0\u03f9\u0001\u0000\u0000"+
		"\u0000\u00a2\u03fd\u0001\u0000\u0000\u0000\u00a4\u03ff\u0001\u0000\u0000"+
		"\u0000\u00a6\u0403\u0001\u0000\u0000\u0000\u00a8\u00ac\u0003\u0002\u0001"+
		"\u0000\u00a9\u00ac\u0003\u000e\u0007\u0000\u00aa\u00ac\u0003\u0012\t\u0000"+
		"\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005\u0000\u0000\u0001\u00b1\u0001\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3\u00b4\u0003\u0004\u0002\u0000"+
		"\u00b4\u00b5\u0005\u0002\u0000\u0000\u00b5\u0003\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b9\u0003\u0006\u0003\u0000\u00b7\u00b9\u0003n7\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u0005"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003\n\u0005\u0000\u00bb\u00bd\u0003"+
		"\n\u0005\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u0007\u0001\u0000\u0000\u0000\u00be\u00bf\u0007\u0000"+
		"\u0000\u0000\u00bf\t\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003\b\u0004"+
		"\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005j\u0000\u0000"+
		"\u00c4\u000b\u0001\u0000\u0000\u0000\u00c5\u00c8\u0003\u00a6S\u0000\u00c6"+
		"\u00c7\u0005\n\u0000\u0000\u00c7\u00c9\u0003\u00a6S\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\r\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\u000b\u0000\u0000\u00cb\u00ce\u0005"+
		"\u007f\u0000\u0000\u00cc\u00cd\u0005\n\u0000\u0000\u00cd\u00cf\u0003\u00a6"+
		"S\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00ed\u0005\u0002\u0000"+
		"\u0000\u00d1\u00d4\u0005\u000b\u0000\u0000\u00d2\u00d5\u0005\f\u0000\u0000"+
		"\u00d3\u00d5\u0003\u00a6S\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005\n\u0000\u0000\u00d7\u00d9\u0003\u00a6S\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0005\r\u0000\u0000\u00db\u00dc\u0005"+
		"\u007f\u0000\u0000\u00dc\u00ed\u0005\u0002\u0000\u0000\u00dd\u00de\u0005"+
		"\u000b\u0000\u0000\u00de\u00df\u0005\u000e\u0000\u0000\u00df\u00e4\u0003"+
		"\f\u0006\u0000\u00e0\u00e1\u0005\u000f\u0000\u0000\u00e1\u00e3\u0003\f"+
		"\u0006\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0010\u0000\u0000\u00e8\u00e9\u0005\r\u0000"+
		"\u0000\u00e9\u00ea\u0005\u007f\u0000\u0000\u00ea\u00eb\u0005\u0002\u0000"+
		"\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ec\u00d1\u0001\u0000\u0000\u0000\u00ec\u00dd\u0001\u0000\u0000"+
		"\u0000\u00ed\u000f\u0001\u0000\u0000\u0000\u00ee\u00ef\u0007\u0001\u0000"+
		"\u0000\u00ef\u0011\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003\u0010\b\u0000"+
		"\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003\u00a6S\u0000\u00f4"+
		"\u00fe\u0007\u0002\u0000\u0000\u00f5\u00f6\u0005\u0014\u0000\u0000\u00f6"+
		"\u00fb\u0003\u0014\n\u0000\u00f7\u00f8\u0005\u000f\u0000\u0000\u00f8\u00fa"+
		"\u0003\u0014\n\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u00f5\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0104\u0005"+
		"\u000e\u0000\u0000\u0101\u0103\u0003\u0016\u000b\u0000\u0102\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001"+
		"\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"\u0010\u0000\u0000\u0108\u0013\u0001\u0000\u0000\u0000\u0109\u010f\u0003"+
		"@ \u0000\u010a\u010c\u0005\u0015\u0000\u0000\u010b\u010d\u0003r9\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0005\u0016\u0000\u0000"+
		"\u010f\u010a\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u0015\u0001\u0000\u0000\u0000\u0111\u011a\u0003\u0018\f\u0000\u0112"+
		"\u011a\u0003\u001a\r\u0000\u0113\u011a\u0003\u001c\u000e\u0000\u0114\u011a"+
		"\u0003\u001e\u000f\u0000\u0115\u011a\u0003 \u0010\u0000\u0116\u011a\u0003"+
		"$\u0012\u0000\u0117\u011a\u0003*\u0015\u0000\u0118\u011a\u0003.\u0017"+
		"\u0000\u0119\u0111\u0001\u0000\u0000\u0000\u0119\u0112\u0001\u0000\u0000"+
		"\u0000\u0119\u0113\u0001\u0000\u0000\u0000\u0119\u0114\u0001\u0000\u0000"+
		"\u0000\u0119\u0115\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u0017\u0001\u0000\u0000\u0000\u011b\u011c\u0003>\u001f\u0000"+
		"\u011c\u0120\u0003\u00a6S\u0000\u011d\u011f\u0007\u0003\u0000\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"\u0125\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005\t\u0000\u0000\u0124\u0126\u0003n7\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0005\u0002\u0000\u0000\u0128\u0019\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0005\u0017\u0000\u0000\u012a\u012b\u0003"+
		"\u00a6S\u0000\u012b\u012e\u0005\u0018\u0000\u0000\u012c\u012f\u0005\f"+
		"\u0000\u0000\u012d\u012f\u0003>\u001f\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005\u0002\u0000\u0000\u0131\u001b\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0005\u0019\u0000\u0000\u0133\u0134\u0003\u00a6S\u0000"+
		"\u0134\u013f\u0005\u000e\u0000\u0000\u0135\u0136\u0003<\u001e\u0000\u0136"+
		"\u013c\u0005\u0002\u0000\u0000\u0137\u0138\u0003<\u001e\u0000\u0138\u0139"+
		"\u0005\u0002\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0137"+
		"\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u0140"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0135"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0010\u0000\u0000\u0142\u001d"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0005\u001a\u0000\u0000\u0144\u0145"+
		"\u00030\u0018\u0000\u0145\u0146\u0003(\u0014\u0000\u0146\u0147\u0003J"+
		"%\u0000\u0147\u001f\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u001b\u0000"+
		"\u0000\u0149\u014b\u0003\u00a6S\u0000\u014a\u014c\u00030\u0018\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0003J%\u0000\u014e!\u0001"+
		"\u0000\u0000\u0000\u014f\u0155\u0003\u00a6S\u0000\u0150\u0152\u0005\u0015"+
		"\u0000\u0000\u0151\u0153\u0003r9\u0000\u0152\u0151\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000"+
		"\u0154\u0156\u0005\u0016\u0000\u0000\u0155\u0150\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156#\u0001\u0000\u0000\u0000\u0157"+
		"\u0159\u0003\u0010\b\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u0005\u001c\u0000\u0000\u015b\u015d\u0003\u00a6S\u0000\u015c\u015b\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u00030\u0018\u0000\u015f\u0161\u0003(\u0014"+
		"\u0000\u0160\u0162\u0003&\u0013\u0000\u0161\u0160\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000"+
		"\u0163\u0166\u0005\u0002\u0000\u0000\u0164\u0166\u0003J%\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166%\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0005\u001d\u0000\u0000\u0168\u0169\u0003"+
		"0\u0018\u0000\u0169\'\u0001\u0000\u0000\u0000\u016a\u0171\u0003\"\u0011"+
		"\u0000\u016b\u0171\u0003H$\u0000\u016c\u0171\u0005u\u0000\u0000\u016d"+
		"\u0171\u0005z\u0000\u0000\u016e\u0171\u0005w\u0000\u0000\u016f\u0171\u0005"+
		"y\u0000\u0000\u0170\u016a\u0001\u0000\u0000\u0000\u0170\u016b\u0001\u0000"+
		"\u0000\u0000\u0170\u016c\u0001\u0000\u0000\u0000\u0170\u016d\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173)\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0177\u0003\u0010\b\u0000"+
		"\u0176\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0003\u00a6S\u0000\u0179"+
		"\u017a\u0005\u001e\u0000\u0000\u017a\u017c\u00034\u001a\u0000\u017b\u017d"+
		"\u0005q\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0005"+
		"\u0002\u0000\u0000\u017f+\u0001\u0000\u0000\u0000\u0180\u0181\u0003\u00a6"+
		"S\u0000\u0181-\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u001f\u0000\u0000"+
		"\u0183\u0184\u0003\u00a6S\u0000\u0184\u0186\u0005\u000e\u0000\u0000\u0185"+
		"\u0187\u0003,\u0016\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0001\u0000\u0000\u0000\u0187\u018c\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0005\u000f\u0000\u0000\u0189\u018b\u0003,\u0016\u0000\u018a\u0188\u0001"+
		"\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001"+
		"\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0005"+
		"\u0010\u0000\u0000\u0190/\u0001\u0000\u0000\u0000\u0191\u019a\u0005\u0015"+
		"\u0000\u0000\u0192\u0197\u00032\u0019\u0000\u0193\u0194\u0005\u000f\u0000"+
		"\u0000\u0194\u0196\u00032\u0019\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000"+
		"\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u0192\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0005\u0016\u0000\u0000\u019d1\u0001\u0000\u0000\u0000\u019e"+
		"\u01a0\u0003>\u001f\u0000\u019f\u01a1\u0003F#\u0000\u01a0\u019f\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a4\u0003\u00a6S\u0000\u01a3\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a43\u0001\u0000\u0000"+
		"\u0000\u01a5\u01ae\u0005\u0015\u0000\u0000\u01a6\u01ab\u00036\u001b\u0000"+
		"\u01a7\u01a8\u0005\u000f\u0000\u0000\u01a8\u01aa\u00036\u001b\u0000\u01a9"+
		"\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae"+
		"\u01a6\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005\u0016\u0000\u0000\u01b1"+
		"5\u0001\u0000\u0000\u0000\u01b2\u01b4\u0003>\u001f\u0000\u01b3\u01b5\u0005"+
		"v\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b8\u0003\u00a6"+
		"S\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b87\u0001\u0000\u0000\u0000\u01b9\u01c2\u0005\u0015\u0000\u0000"+
		"\u01ba\u01bf\u0003:\u001d\u0000\u01bb\u01bc\u0005\u000f\u0000\u0000\u01bc"+
		"\u01be\u0003:\u001d\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1"+
		"\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0005\u0016\u0000\u0000\u01c59\u0001\u0000\u0000\u0000\u01c6\u01c8\u0003"+
		">\u001f\u0000\u01c7\u01c9\u0003F#\u0000\u01c8\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9;\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cc\u0003>\u001f\u0000\u01cb\u01cd\u0003F#\u0000\u01cc\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003\u00a6S\u0000\u01cf=\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d1\u0006\u001f\uffff\uffff\u0000\u01d1\u01d8\u0003"+
		"l6\u0000\u01d2\u01d8\u0003@ \u0000\u01d3\u01d8\u0003B!\u0000\u01d4\u01d8"+
		"\u0003D\"\u0000\u01d5\u01d6\u0005\"\u0000\u0000\u01d6\u01d8\u0005#\u0000"+
		"\u0000\u01d7\u01d0\u0001\u0000\u0000\u0000\u01d7\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d3\u0001\u0000\u0000\u0000\u01d7\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01e1\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\n\u0003\u0000\u0000\u01da\u01dc\u0005 \u0000\u0000"+
		"\u01db\u01dd\u0003n7\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0"+
		"\u0005!\u0000\u0000\u01df\u01d9\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e2?\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e9\u0003\u00a6S\u0000\u01e5\u01e6\u0005$\u0000\u0000"+
		"\u01e6\u01e8\u0003\u00a6S\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8"+
		"\u01eb\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0001\u0000\u0000\u0000\u01eaA\u0001\u0000\u0000\u0000\u01eb\u01e9"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005%\u0000\u0000\u01ed\u01ee\u0005"+
		"\u0015\u0000\u0000\u01ee\u01ef\u0003l6\u0000\u01ef\u01f0\u0005&\u0000"+
		"\u0000\u01f0\u01f1\u0003>\u001f\u0000\u01f1\u01f2\u0005\u0016\u0000\u0000"+
		"\u01f2C\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005\u001c\u0000\u0000\u01f4"+
		"\u01fa\u00038\u001c\u0000\u01f5\u01f9\u0005w\u0000\u0000\u01f6\u01f9\u0005"+
		"u\u0000\u0000\u01f7\u01f9\u0003H$\u0000\u01f8\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01ff\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005\u001d\u0000"+
		"\u0000\u01fe\u0200\u00038\u001c\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0001\u0000\u0000\u0000\u0200E\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0007\u0004\u0000\u0000\u0202G\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0007\u0005\u0000\u0000\u0204I\u0001\u0000\u0000\u0000\u0205\u0209\u0005"+
		"\u000e\u0000\u0000\u0206\u0208\u0003L&\u0000\u0207\u0206\u0001\u0000\u0000"+
		"\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000"+
		"\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0005\u0010\u0000"+
		"\u0000\u020dK\u0001\u0000\u0000\u0000\u020e\u021b\u0003P(\u0000\u020f"+
		"\u021b\u0003R)\u0000\u0210\u021b\u0003V+\u0000\u0211\u021b\u0003J%\u0000"+
		"\u0212\u021b\u0003X,\u0000\u0213\u021b\u0003Z-\u0000\u0214\u021b\u0003"+
		"\\.\u0000\u0215\u021b\u0003^/\u0000\u0216\u021b\u0003`0\u0000\u0217\u021b"+
		"\u0003b1\u0000\u0218\u021b\u0003d2\u0000\u0219\u021b\u0003T*\u0000\u021a"+
		"\u020e\u0001\u0000\u0000\u0000\u021a\u020f\u0001\u0000\u0000\u0000\u021a"+
		"\u0210\u0001\u0000\u0000\u0000\u021a\u0211\u0001\u0000\u0000\u0000\u021a"+
		"\u0212\u0001\u0000\u0000\u0000\u021a\u0213\u0001\u0000\u0000\u0000\u021a"+
		"\u0214\u0001\u0000\u0000\u0000\u021a\u0215\u0001\u0000\u0000\u0000\u021a"+
		"\u0216\u0001\u0000\u0000\u0000\u021a\u0217\u0001\u0000\u0000\u0000\u021a"+
		"\u0218\u0001\u0000\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b"+
		"M\u0001\u0000\u0000\u0000\u021c\u021d\u0003n7\u0000\u021d\u021e\u0005"+
		"\u0002\u0000\u0000\u021eO\u0001\u0000\u0000\u0000\u021f\u0220\u0005*\u0000"+
		"\u0000\u0220\u0221\u0005\u0015\u0000\u0000\u0221\u0222\u0003n7\u0000\u0222"+
		"\u0223\u0005\u0016\u0000\u0000\u0223\u0226\u0003L&\u0000\u0224\u0225\u0005"+
		"+\u0000\u0000\u0225\u0227\u0003L&\u0000\u0226\u0224\u0001\u0000\u0000"+
		"\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227Q\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0005\u0015\u0000\u0000\u0229\u022a\u0003n7\u0000\u022a\u022b"+
		"\u0005\u0016\u0000\u0000\u022b\u022c\u0005,\u0000\u0000\u022c\u022d\u0003"+
		"L&\u0000\u022dS\u0001\u0000\u0000\u0000\u022e\u0231\u0003f3\u0000\u022f"+
		"\u0231\u0003N\'\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u022f"+
		"\u0001\u0000\u0000\u0000\u0231U\u0001\u0000\u0000\u0000\u0232\u0233\u0005"+
		"\u0018\u0000\u0000\u0233\u0236\u0005\u0015\u0000\u0000\u0234\u0237\u0003"+
		"T*\u0000\u0235\u0237\u0005\u0002\u0000\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0237\u023a\u0001\u0000\u0000"+
		"\u0000\u0238\u023b\u0003N\'\u0000\u0239\u023b\u0005\u0002\u0000\u0000"+
		"\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u0239\u0001\u0000\u0000\u0000"+
		"\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u023e\u0003n7\u0000\u023d\u023c"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0005\u0016\u0000\u0000\u0240\u0241"+
		"\u0003L&\u0000\u0241W\u0001\u0000\u0000\u0000\u0242\u0244\u0005-\u0000"+
		"\u0000\u0243\u0245\u0005\u007f\u0000\u0000\u0244\u0243\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0003|>\u0000\u0247Y\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u0005.\u0000\u0000\u0249\u024a\u0003L&\u0000\u024a\u024b\u0005"+
		"/\u0000\u0000\u024b\u024c\u0005\u0015\u0000\u0000\u024c\u024d\u0003n7"+
		"\u0000\u024d\u024e\u0005\u0016\u0000\u0000\u024e\u024f\u0005\u0002\u0000"+
		"\u0000\u024f[\u0001\u0000\u0000\u0000\u0250\u0251\u0005t\u0000\u0000\u0251"+
		"\u0252\u0005\u0002\u0000\u0000\u0252]\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0005r\u0000\u0000\u0254\u0255\u0005\u0002\u0000\u0000\u0255_\u0001\u0000"+
		"\u0000\u0000\u0256\u0258\u00050\u0000\u0000\u0257\u0259\u0003n7\u0000"+
		"\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0005\u0002\u0000\u0000"+
		"\u025ba\u0001\u0000\u0000\u0000\u025c\u025d\u00051\u0000\u0000\u025d\u025e"+
		"\u0005\u0002\u0000\u0000\u025ec\u0001\u0000\u0000\u0000\u025f\u0260\u0003"+
		"z=\u0000\u0260\u0261\u00052\u0000\u0000\u0261\u0262\u0005\u0002\u0000"+
		"\u0000\u0262e\u0001\u0000\u0000\u0000\u0263\u0264\u00053\u0000\u0000\u0264"+
		"\u026b\u0003j5\u0000\u0265\u026b\u0003<\u001e\u0000\u0266\u0267\u0005"+
		"\u0015\u0000\u0000\u0267\u0268\u0003h4\u0000\u0268\u0269\u0005\u0016\u0000"+
		"\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u0263\u0001\u0000\u0000"+
		"\u0000\u026a\u0265\u0001\u0000\u0000\u0000\u026a\u0266\u0001\u0000\u0000"+
		"\u0000\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026d\u0005\t\u0000\u0000"+
		"\u026d\u026f\u0003n7\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271"+
		"\u0005\u0002\u0000\u0000\u0271g\u0001\u0000\u0000\u0000\u0272\u0274\u0003"+
		"<\u001e\u0000\u0273\u0272\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000"+
		"\u0000\u0000\u0274\u027b\u0001\u0000\u0000\u0000\u0275\u0277\u0005\u000f"+
		"\u0000\u0000\u0276\u0278\u0003<\u001e\u0000\u0277\u0276\u0001\u0000\u0000"+
		"\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a\u0001\u0000\u0000"+
		"\u0000\u0279\u0275\u0001\u0000\u0000\u0000\u027a\u027d\u0001\u0000\u0000"+
		"\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000"+
		"\u0000\u027ci\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000"+
		"\u027e\u0285\u0005\u0015\u0000\u0000\u027f\u0281\u0003\u00a6S\u0000\u0280"+
		"\u027f\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0001\u0000\u0000\u0000\u0282\u0284\u0005\u000f\u0000\u0000\u0283"+
		"\u0280\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285"+
		"\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286"+
		"\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288"+
		"\u028a\u0003\u00a6S\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u0289\u028a"+
		"\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c"+
		"\u0005\u0016\u0000\u0000\u028ck\u0001\u0000\u0000\u0000\u028d\u028e\u0007"+
		"\u0006\u0000\u0000\u028em\u0001\u0000\u0000\u0000\u028f\u0290\u00067\uffff"+
		"\uffff\u0000\u0290\u0291\u0005:\u0000\u0000\u0291\u02a8\u0003>\u001f\u0000"+
		"\u0292\u0293\u0005\u0015\u0000\u0000\u0293\u0294\u0003n7\u0000\u0294\u0295"+
		"\u0005\u0016\u0000\u0000\u0295\u02a8\u0001\u0000\u0000\u0000\u0296\u0297"+
		"\u00058\u0000\u0000\u0297\u02a8\u0003n7(\u0298\u0299\u00059\u0000\u0000"+
		"\u0299\u02a8\u0003n7\'\u029a\u029b\u0005;\u0000\u0000\u029b\u02a8\u0003"+
		"n7&\u029c\u029d\u0005<\u0000\u0000\u029d\u02a8\u0003n7%\u029e\u029f\u0005"+
		"=\u0000\u0000\u029f\u02a8\u0003n7$\u02a0\u02a1\u0005>\u0000\u0000\u02a1"+
		"\u02a8\u0003n7#\u02a2\u02a3\u0005?\u0000\u0000\u02a3\u02a8\u0003n7\"\u02a4"+
		"\u02a5\u0005\u0004\u0000\u0000\u02a5\u02a8\u0003n7!\u02a6\u02a8\u0003"+
		"p8\u0000\u02a7\u028f\u0001\u0000\u0000\u0000\u02a7\u0292\u0001\u0000\u0000"+
		"\u0000\u02a7\u0296\u0001\u0000\u0000\u0000\u02a7\u0298\u0001\u0000\u0000"+
		"\u0000\u02a7\u029a\u0001\u0000\u0000\u0000\u02a7\u029c\u0001\u0000\u0000"+
		"\u0000\u02a7\u029e\u0001\u0000\u0000\u0000\u02a7\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a2\u0001\u0000\u0000\u0000\u02a7\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8\u031c\u0001\u0000\u0000"+
		"\u0000\u02a9\u02aa\n \u0000\u0000\u02aa\u02ab\u0005@\u0000\u0000\u02ab"+
		"\u031b\u0003n7!\u02ac\u02ad\n\u001f\u0000\u0000\u02ad\u02ae\u0005\f\u0000"+
		"\u0000\u02ae\u031b\u0003n7 \u02af\u02b0\n\u001e\u0000\u0000\u02b0\u02b1"+
		"\u0005A\u0000\u0000\u02b1\u031b\u0003n7\u001f\u02b2\u02b3\n\u001d\u0000"+
		"\u0000\u02b3\u02b4\u0005B\u0000\u0000\u02b4\u031b\u0003n7\u001e\u02b5"+
		"\u02b6\n\u001c\u0000\u0000\u02b6\u02b7\u0005;\u0000\u0000\u02b7\u031b"+
		"\u0003n7\u001d\u02b8\u02b9\n\u001b\u0000\u0000\u02b9\u02ba\u0005<\u0000"+
		"\u0000\u02ba\u031b\u0003n7\u001c\u02bb\u02bc\n\u001a\u0000\u0000\u02bc"+
		"\u02bd\u0005C\u0000\u0000\u02bd\u031b\u0003n7\u001b\u02be\u02bf\n\u0019"+
		"\u0000\u0000\u02bf\u02c0\u0005D\u0000\u0000\u02c0\u031b\u0003n7\u001a"+
		"\u02c1\u02c2\n\u0018\u0000\u0000\u02c2\u02c3\u0005E\u0000\u0000\u02c3"+
		"\u031b\u0003n7\u0019\u02c4\u02c5\n\u0017\u0000\u0000\u02c5\u02c6\u0005"+
		"\u0003\u0000\u0000\u02c6\u031b\u0003n7\u0018\u02c7\u02c8\n\u0016\u0000"+
		"\u0000\u02c8\u02c9\u0005F\u0000\u0000\u02c9\u031b\u0003n7\u0017\u02ca"+
		"\u02cb\n\u0015\u0000\u0000\u02cb\u02cc\u0005\u0007\u0000\u0000\u02cc\u031b"+
		"\u0003n7\u0016\u02cd\u02ce\n\u0014\u0000\u0000\u02ce\u02cf\u0005\u0006"+
		"\u0000\u0000\u02cf\u031b\u0003n7\u0015\u02d0\u02d1\n\u0013\u0000\u0000"+
		"\u02d1\u02d2\u0005\b\u0000\u0000\u02d2\u031b\u0003n7\u0014\u02d3\u02d4"+
		"\n\u0012\u0000\u0000\u02d4\u02d5\u0005\u0005\u0000\u0000\u02d5\u031b\u0003"+
		"n7\u0013\u02d6\u02d7\n\u0011\u0000\u0000\u02d7\u02d8\u0005G\u0000\u0000"+
		"\u02d8\u031b\u0003n7\u0012\u02d9\u02da\n\u0010\u0000\u0000\u02da\u02db"+
		"\u0005H\u0000\u0000\u02db\u031b\u0003n7\u0011\u02dc\u02dd\n\u000f\u0000"+
		"\u0000\u02dd\u02de\u0005I\u0000\u0000\u02de\u031b\u0003n7\u0010\u02df"+
		"\u02e0\n\u000e\u0000\u0000\u02e0\u02e1\u0005J\u0000\u0000\u02e1\u031b"+
		"\u0003n7\u000f\u02e2\u02e3\n\r\u0000\u0000\u02e3\u02e4\u0005\t\u0000\u0000"+
		"\u02e4\u031b\u0003n7\u000e\u02e5\u02e6\n\f\u0000\u0000\u02e6\u02e7\u0005"+
		"K\u0000\u0000\u02e7\u031b\u0003n7\r\u02e8\u02e9\n\u000b\u0000\u0000\u02e9"+
		"\u02ea\u0005L\u0000\u0000\u02ea\u031b\u0003n7\f\u02eb\u02ec\n\n\u0000"+
		"\u0000\u02ec\u02ed\u0005M\u0000\u0000\u02ed\u031b\u0003n7\u000b\u02ee"+
		"\u02ef\n\t\u0000\u0000\u02ef\u02f0\u0005N\u0000\u0000\u02f0\u031b\u0003"+
		"n7\n\u02f1\u02f2\n\b\u0000\u0000\u02f2\u02f3\u0005O\u0000\u0000\u02f3"+
		"\u031b\u0003n7\t\u02f4\u02f5\n\u0007\u0000\u0000\u02f5\u02f6\u0005P\u0000"+
		"\u0000\u02f6\u031b\u0003n7\b\u02f7\u02f8\n\u0006\u0000\u0000\u02f8\u02f9"+
		"\u0005Q\u0000\u0000\u02f9\u031b\u0003n7\u0007\u02fa\u02fb\n\u0005\u0000"+
		"\u0000\u02fb\u02fc\u0005R\u0000\u0000\u02fc\u031b\u0003n7\u0006\u02fd"+
		"\u02fe\n\u0004\u0000\u0000\u02fe\u02ff\u0005S\u0000\u0000\u02ff\u031b"+
		"\u0003n7\u0005\u0300\u0301\n\u0003\u0000\u0000\u0301\u0302\u0005T\u0000"+
		"\u0000\u0302\u031b\u0003n7\u0004\u0303\u0304\n\u0002\u0000\u0000\u0304"+
		"\u0305\u0005U\u0000\u0000\u0305\u0306\u0003n7\u0000\u0306\u0307\u0005"+
		"V\u0000\u0000\u0307\u0308\u0003n7\u0003\u0308\u031b\u0001\u0000\u0000"+
		"\u0000\u0309\u030a\n/\u0000\u0000\u030a\u031b\u00058\u0000\u0000\u030b"+
		"\u030c\n.\u0000\u0000\u030c\u031b\u00059\u0000\u0000\u030d\u030e\n,\u0000"+
		"\u0000\u030e\u030f\u0005 \u0000\u0000\u030f\u0310\u0003n7\u0000\u0310"+
		"\u0311\u0005!\u0000\u0000\u0311\u031b\u0001\u0000\u0000\u0000\u0312\u0313"+
		"\n+\u0000\u0000\u0313\u0314\u0005\u0015\u0000\u0000\u0314\u0315\u0003"+
		"x<\u0000\u0315\u0316\u0005\u0016\u0000\u0000\u0316\u031b\u0001\u0000\u0000"+
		"\u0000\u0317\u0318\n*\u0000\u0000\u0318\u0319\u0005$\u0000\u0000\u0319"+
		"\u031b\u0003\u00a6S\u0000\u031a\u02a9\u0001\u0000\u0000\u0000\u031a\u02ac"+
		"\u0001\u0000\u0000\u0000\u031a\u02af\u0001\u0000\u0000\u0000\u031a\u02b2"+
		"\u0001\u0000\u0000\u0000\u031a\u02b5\u0001\u0000\u0000\u0000\u031a\u02b8"+
		"\u0001\u0000\u0000\u0000\u031a\u02bb\u0001\u0000\u0000\u0000\u031a\u02be"+
		"\u0001\u0000\u0000\u0000\u031a\u02c1\u0001\u0000\u0000\u0000\u031a\u02c4"+
		"\u0001\u0000\u0000\u0000\u031a\u02c7\u0001\u0000\u0000\u0000\u031a\u02ca"+
		"\u0001\u0000\u0000\u0000\u031a\u02cd\u0001\u0000\u0000\u0000\u031a\u02d0"+
		"\u0001\u0000\u0000\u0000\u031a\u02d3\u0001\u0000\u0000\u0000\u031a\u02d6"+
		"\u0001\u0000\u0000\u0000\u031a\u02d9\u0001\u0000\u0000\u0000\u031a\u02dc"+
		"\u0001\u0000\u0000\u0000\u031a\u02df\u0001\u0000\u0000\u0000\u031a\u02e2"+
		"\u0001\u0000\u0000\u0000\u031a\u02e5\u0001\u0000\u0000\u0000\u031a\u02e8"+
		"\u0001\u0000\u0000\u0000\u031a\u02eb\u0001\u0000\u0000\u0000\u031a\u02ee"+
		"\u0001\u0000\u0000\u0000\u031a\u02f1\u0001\u0000\u0000\u0000\u031a\u02f4"+
		"\u0001\u0000\u0000\u0000\u031a\u02f7\u0001\u0000\u0000\u0000\u031a\u02fa"+
		"\u0001\u0000\u0000\u0000\u031a\u02fd\u0001\u0000\u0000\u0000\u031a\u0300"+
		"\u0001\u0000\u0000\u0000\u031a\u0303\u0001\u0000\u0000\u0000\u031a\u0309"+
		"\u0001\u0000\u0000\u0000\u031a\u030b\u0001\u0000\u0000\u0000\u031a\u030d"+
		"\u0001\u0000\u0000\u0000\u031a\u0312\u0001\u0000\u0000\u0000\u031a\u0317"+
		"\u0001\u0000\u0000\u0000\u031b\u031e\u0001\u0000\u0000\u0000\u031c\u031a"+
		"\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031do\u0001"+
		"\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0330\u0005"+
		"k\u0000\u0000\u0320\u0330\u0003\u00a4R\u0000\u0321\u0330\u0005o\u0000"+
		"\u0000\u0322\u0330\u0005\u007f\u0000\u0000\u0323\u0326\u0003\u00a6S\u0000"+
		"\u0324\u0325\u0005 \u0000\u0000\u0325\u0327\u0005!\u0000\u0000\u0326\u0324"+
		"\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0330"+
		"\u0001\u0000\u0000\u0000\u0328\u0330\u0005|\u0000\u0000\u0329\u0330\u0003"+
		"\u00a0P\u0000\u032a\u032d\u0003\u00a2Q\u0000\u032b\u032c\u0005 \u0000"+
		"\u0000\u032c\u032e\u0005!\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000"+
		"\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0330\u0001\u0000\u0000\u0000"+
		"\u032f\u031f\u0001\u0000\u0000\u0000\u032f\u0320\u0001\u0000\u0000\u0000"+
		"\u032f\u0321\u0001\u0000\u0000\u0000\u032f\u0322\u0001\u0000\u0000\u0000"+
		"\u032f\u0323\u0001\u0000\u0000\u0000\u032f\u0328\u0001\u0000\u0000\u0000"+
		"\u032f\u0329\u0001\u0000\u0000\u0000\u032f\u032a\u0001\u0000\u0000\u0000"+
		"\u0330q\u0001\u0000\u0000\u0000\u0331\u0336\u0003n7\u0000\u0332\u0333"+
		"\u0005\u000f\u0000\u0000\u0333\u0335\u0003n7\u0000\u0334\u0332\u0001\u0000"+
		"\u0000\u0000\u0335\u0338\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337s\u0001\u0000\u0000"+
		"\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0339\u033e\u0003v;\u0000\u033a"+
		"\u033b\u0005\u000f\u0000\u0000\u033b\u033d\u0003v;\u0000\u033c\u033a\u0001"+
		"\u0000\u0000\u0000\u033d\u0340\u0001\u0000\u0000\u0000\u033e\u033c\u0001"+
		"\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u0342\u0001"+
		"\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0341\u0343\u0005"+
		"\u000f\u0000\u0000\u0342\u0341\u0001\u0000\u0000\u0000\u0342\u0343\u0001"+
		"\u0000\u0000\u0000\u0343u\u0001\u0000\u0000\u0000\u0344\u0345\u0003\u00a6"+
		"S\u0000\u0345\u0346\u0005V\u0000\u0000\u0346\u0347\u0003n7\u0000\u0347"+
		"w\u0001\u0000\u0000\u0000\u0348\u034a\u0005\u000e\u0000\u0000\u0349\u034b"+
		"\u0003t:\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000"+
		"\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u0351\u0005\u0010"+
		"\u0000\u0000\u034d\u034f\u0003r9\u0000\u034e\u034d\u0001\u0000\u0000\u0000"+
		"\u034e\u034f\u0001\u0000\u0000\u0000\u034f\u0351\u0001\u0000\u0000\u0000"+
		"\u0350\u0348\u0001\u0000\u0000\u0000\u0350\u034e\u0001\u0000\u0000\u0000"+
		"\u0351y\u0001\u0000\u0000\u0000\u0352\u0353\u0003n7\u0000\u0353\u0354"+
		"\u0005\u0015\u0000\u0000\u0354\u0355\u0003x<\u0000\u0355\u0356\u0005\u0016"+
		"\u0000\u0000\u0356{\u0001\u0000\u0000\u0000\u0357\u035b\u0005\u000e\u0000"+
		"\u0000\u0358\u035a\u0003~?\u0000\u0359\u0358\u0001\u0000\u0000\u0000\u035a"+
		"\u035d\u0001\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035b"+
		"\u035c\u0001\u0000\u0000\u0000\u035c\u035e\u0001\u0000\u0000\u0000\u035d"+
		"\u035b\u0001\u0000\u0000\u0000\u035e\u035f\u0005\u0010\u0000\u0000\u035f"+
		"}\u0001\u0000\u0000\u0000\u0360\u0372\u0003\u00a6S\u0000\u0361\u0372\u0003"+
		"|>\u0000\u0362\u0372\u0003\u0080@\u0000\u0363\u0372\u0003\u0084B\u0000"+
		"\u0364\u0372\u0003\u0086C\u0000\u0365\u0372\u0003\u008cF\u0000\u0366\u0372"+
		"\u0003\u008eG\u0000\u0367\u0372\u0003\u0090H\u0000\u0368\u0372\u0003\u0094"+
		"J\u0000\u0369\u0372\u0003\u0098L\u0000\u036a\u0372\u0003\u009aM\u0000"+
		"\u036b\u0372\u0005r\u0000\u0000\u036c\u0372\u0005t\u0000\u0000\u036d\u0372"+
		"\u0003\u009eO\u0000\u036e\u0372\u0003\u00a4R\u0000\u036f\u0372\u0005\u007f"+
		"\u0000\u0000\u0370\u0372\u0005o\u0000\u0000\u0371\u0360\u0001\u0000\u0000"+
		"\u0000\u0371\u0361\u0001\u0000\u0000\u0000\u0371\u0362\u0001\u0000\u0000"+
		"\u0000\u0371\u0363\u0001\u0000\u0000\u0000\u0371\u0364\u0001\u0000\u0000"+
		"\u0000\u0371\u0365\u0001\u0000\u0000\u0000\u0371\u0366\u0001\u0000\u0000"+
		"\u0000\u0371\u0367\u0001\u0000\u0000\u0000\u0371\u0368\u0001\u0000\u0000"+
		"\u0000\u0371\u0369\u0001\u0000\u0000\u0000\u0371\u036a\u0001\u0000\u0000"+
		"\u0000\u0371\u036b\u0001\u0000\u0000\u0000\u0371\u036c\u0001\u0000\u0000"+
		"\u0000\u0371\u036d\u0001\u0000\u0000\u0000\u0371\u036e\u0001\u0000\u0000"+
		"\u0000\u0371\u036f\u0001\u0000\u0000\u0000\u0371\u0370\u0001\u0000\u0000"+
		"\u0000\u0372\u007f\u0001\u0000\u0000\u0000\u0373\u0376\u0003\u0082A\u0000"+
		"\u0374\u0376\u0003\u009cN\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0375"+
		"\u0374\u0001\u0000\u0000\u0000\u0376\u0081\u0001\u0000\u0000\u0000\u0377"+
		"\u037c\u0005W\u0000\u0000\u0378\u037c\u0005X\u0000\u0000\u0379\u037c\u0005"+
		"Y\u0000\u0000\u037a\u037c\u0003\u00a6S\u0000\u037b\u0377\u0001\u0000\u0000"+
		"\u0000\u037b\u0378\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000\u0000"+
		"\u0000\u037b\u037a\u0001\u0000\u0000\u0000\u037c\u0389\u0001\u0000\u0000"+
		"\u0000\u037d\u037f\u0005\u0015\u0000\u0000\u037e\u0380\u0003\u0080@\u0000"+
		"\u037f\u037e\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000"+
		"\u0380\u0385\u0001\u0000\u0000\u0000\u0381\u0382\u0005\u000f\u0000\u0000"+
		"\u0382\u0384\u0003\u0080@\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0384"+
		"\u0387\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0385"+
		"\u0386\u0001\u0000\u0000\u0000\u0386\u0388\u0001\u0000\u0000\u0000\u0387"+
		"\u0385\u0001\u0000\u0000\u0000\u0388\u038a\u0005\u0016\u0000\u0000\u0389"+
		"\u037d\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000\u0000\u0000\u038a"+
		"\u0083\u0001\u0000\u0000\u0000\u038b\u038c\u0005Z\u0000\u0000\u038c\u038f"+
		"\u0003\u0088D\u0000\u038d\u038e\u0005[\u0000\u0000\u038e\u0390\u0003\u0080"+
		"@\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000"+
		"\u0000\u0390\u0085\u0001\u0000\u0000\u0000\u0391\u0392\u0003\u0088D\u0000"+
		"\u0392\u0393\u0005[\u0000\u0000\u0393\u0394\u0003\u0080@\u0000\u0394\u0087"+
		"\u0001\u0000\u0000\u0000\u0395\u039b\u0003\u00a6S\u0000\u0396\u0397\u0005"+
		"\u0015\u0000\u0000\u0397\u0398\u0003\u008aE\u0000\u0398\u0399\u0005\u0016"+
		"\u0000\u0000\u0399\u039b\u0001\u0000\u0000\u0000\u039a\u0395\u0001\u0000"+
		"\u0000\u0000\u039a\u0396\u0001\u0000\u0000\u0000\u039b\u0089\u0001\u0000"+
		"\u0000\u0000\u039c\u03a1\u0003\u00a6S\u0000\u039d\u039e\u0005\u000f\u0000"+
		"\u0000\u039e\u03a0\u0003\u00a6S\u0000\u039f\u039d\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a3\u0001\u0000\u0000\u0000\u03a1\u039f\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2\u008b\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a4\u03a5\u0005\\\u0000\u0000\u03a5"+
		"\u03a6\u0003\u00a6S\u0000\u03a6\u008d\u0001\u0000\u0000\u0000\u03a7\u03a8"+
		"\u0003\u00a6S\u0000\u03a8\u03a9\u0005V\u0000\u0000\u03a9\u008f\u0001\u0000"+
		"\u0000\u0000\u03aa\u03ab\u0005]\u0000\u0000\u03ab\u03af\u0003\u0080@\u0000"+
		"\u03ac\u03ae\u0003\u0092I\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ae"+
		"\u03b1\u0001\u0000\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03af"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b0\u0091\u0001\u0000\u0000\u0000\u03b1"+
		"\u03af\u0001\u0000\u0000\u0000\u03b2\u03b3\u0005^\u0000\u0000\u03b3\u03b4"+
		"\u0003\u009cN\u0000\u03b4\u03b5\u0003|>\u0000\u03b5\u03b9\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b7\u0005_\u0000\u0000\u03b7\u03b9\u0003|>\u0000"+
		"\u03b8\u03b2\u0001\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000"+
		"\u03b9\u0093\u0001\u0000\u0000\u0000\u03ba\u03bb\u0005`\u0000\u0000\u03bb"+
		"\u03bc\u0003\u00a6S\u0000\u03bc\u03be\u0005\u0015\u0000\u0000\u03bd\u03bf"+
		"\u0003\u008aE\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03be\u03bf\u0001"+
		"\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u03c2\u0005"+
		"\u0016\u0000\u0000\u03c1\u03c3\u0003\u0096K\u0000\u03c2\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c5\u0003|>\u0000\u03c5\u0095\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c7\u0005a\u0000\u0000\u03c7\u03c8\u0003\u008aE\u0000\u03c8\u0097"+
		"\u0001\u0000\u0000\u0000\u03c9\u03cc\u0005\u0018\u0000\u0000\u03ca\u03cd"+
		"\u0003|>\u0000\u03cb\u03cd\u0003\u0080@\u0000\u03cc\u03ca\u0001\u0000"+
		"\u0000\u0000\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000"+
		"\u0000\u0000\u03ce\u03d1\u0003\u0080@\u0000\u03cf\u03d2\u0003|>\u0000"+
		"\u03d0\u03d2\u0003\u0080@\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d1"+
		"\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3"+
		"\u03d4\u0003|>\u0000\u03d4\u0099\u0001\u0000\u0000\u0000\u03d5\u03d6\u0005"+
		"b\u0000\u0000\u03d6\u03d7\u0003\u0080@\u0000\u03d7\u03d8\u0003|>\u0000"+
		"\u03d8\u009b\u0001\u0000\u0000\u0000\u03d9\u03da\u0007\u0007\u0000\u0000"+
		"\u03da\u009d\u0001\u0000\u0000\u0000\u03db\u03dc\u0005-\u0000\u0000\u03dc"+
		"\u03dd\u0003\u00a6S\u0000\u03dd\u03de\u0003|>\u0000\u03de\u009f\u0001"+
		"\u0000\u0000\u0000\u03df\u03e1\u0005\u0015\u0000\u0000\u03e0\u03e2\u0003"+
		"n7\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e9\u0001\u0000\u0000\u0000\u03e3\u03e5\u0005\u000f\u0000"+
		"\u0000\u03e4\u03e6\u0003n7\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e8\u0001\u0000\u0000\u0000\u03e7"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e8\u03eb\u0001\u0000\u0000\u0000\u03e9"+
		"\u03e7\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea"+
		"\u03ec\u0001\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03ec"+
		"\u03fa\u0005\u0016\u0000\u0000\u03ed\u03f6\u0005 \u0000\u0000\u03ee\u03f3"+
		"\u0003n7\u0000\u03ef\u03f0\u0005\u000f\u0000\u0000\u03f0\u03f2\u0003n"+
		"7\u0000\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f2\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f7\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000"+
		"\u0000\u03f6\u03ee\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03fa\u0005!\u0000\u0000"+
		"\u03f9\u03df\u0001\u0000\u0000\u0000\u03f9\u03ed\u0001\u0000\u0000\u0000"+
		"\u03fa\u00a1\u0001\u0000\u0000\u0000\u03fb\u03fe\u0003l6\u0000\u03fc\u03fe"+
		"\u0003@ \u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fd\u03fc\u0001\u0000"+
		"\u0000\u0000\u03fe\u00a3\u0001\u0000\u0000\u0000\u03ff\u0401\u0007\b\u0000"+
		"\u0000\u0400\u0402\u0005n\u0000\u0000\u0401\u0400\u0001\u0000\u0000\u0000"+
		"\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u00a5\u0001\u0000\u0000\u0000"+
		"\u0403\u0404\u0007\t\u0000\u0000\u0404\u00a7\u0001\u0000\u0000\u0000l"+
		"\u00ab\u00ad\u00b8\u00bc\u00c1\u00c8\u00ce\u00d4\u00d8\u00e4\u00ec\u00f1"+
		"\u00fb\u00fe\u0104\u010c\u010f\u0119\u0120\u0125\u012e\u013c\u013f\u014b"+
		"\u0152\u0155\u0158\u015c\u0161\u0165\u0170\u0172\u0176\u017c\u0186\u018c"+
		"\u0197\u019a\u01a0\u01a3\u01ab\u01ae\u01b4\u01b7\u01bf\u01c2\u01c8\u01cc"+
		"\u01d7\u01dc\u01e1\u01e9\u01f8\u01fa\u01ff\u0209\u021a\u0226\u0230\u0236"+
		"\u023a\u023d\u0244\u0258\u026a\u026e\u0273\u0277\u027b\u0280\u0285\u0289"+
		"\u02a7\u031a\u031c\u0326\u032d\u032f\u0336\u033e\u0342\u034a\u034e\u0350"+
		"\u035b\u0371\u0375\u037b\u037f\u0385\u0389\u038f\u039a\u03a1\u03af\u03b8"+
		"\u03be\u03c2\u03cc\u03d1\u03e1\u03e5\u03e9\u03f3\u03f6\u03f9\u03fd\u0401";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}