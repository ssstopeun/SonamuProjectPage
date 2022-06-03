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
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, NatSpecSingleLine=100, 
		NatSpecMultiLine=101, Int=102, Uint=103, Byte=104, Fixed=105, Ufixed=106, 
		VersionLiteral=107, BooleanLiteral=108, DecimalNumber=109, HexNumber=110, 
		NumberUnit=111, HexLiteral=112, ReservedKeyword=113, AnonymousKeyword=114, 
		BreakKeyword=115, ConstantKeyword=116, ContinueKeyword=117, ExternalKeyword=118, 
		IndexedKeyword=119, InternalKeyword=120, PayableKeyword=121, PrivateKeyword=122, 
		PublicKeyword=123, PureKeyword=124, TypeKeyword=125, ViewKeyword=126, 
		Identifier=127, StringLiteral=128, WS=129, COMMENT=130, LINE_COMMENT=131;
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
		RULE_stateMutability = 36, RULE_block = 37, RULE_statement = 38, RULE_requireStatement = 39, 
		RULE_expressionStatement = 40, RULE_ifStatement = 41, RULE_whileStatement = 42, 
		RULE_simpleStatement = 43, RULE_forStatement = 44, RULE_inlineAssemblyStatement = 45, 
		RULE_doWhileStatement = 46, RULE_continueStatement = 47, RULE_breakStatement = 48, 
		RULE_returnStatement = 49, RULE_throwStatement = 50, RULE_emitStatement = 51, 
		RULE_variableDeclarationStatement = 52, RULE_variableDeclarationList = 53, 
		RULE_identifierList = 54, RULE_elementaryTypeName = 55, RULE_expression = 56, 
		RULE_primaryExpression = 57, RULE_expressionList = 58, RULE_nameValueList = 59, 
		RULE_nameValue = 60, RULE_functionCallArguments = 61, RULE_functionCall = 62, 
		RULE_assemblyBlock = 63, RULE_assemblyItem = 64, RULE_assemblyExpression = 65, 
		RULE_assemblyCall = 66, RULE_assemblyLocalDefinition = 67, RULE_assemblyAssignment = 68, 
		RULE_assemblyIdentifierOrList = 69, RULE_assemblyIdentifierList = 70, 
		RULE_assemblyStackAssignment = 71, RULE_labelDefinition = 72, RULE_assemblySwitch = 73, 
		RULE_assemblyCase = 74, RULE_assemblyFunctionDefinition = 75, RULE_assemblyFunctionReturns = 76, 
		RULE_assemblyFor = 77, RULE_assemblyIf = 78, RULE_assemblyLiteral = 79, 
		RULE_subAssembly = 80, RULE_tupleExpression = 81, RULE_typeNameExpression = 82, 
		RULE_numberLiteral = 83, RULE_identifier = 84;
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
			"block", "statement", "requireStatement", "expressionStatement", "ifStatement", 
			"whileStatement", "simpleStatement", "forStatement", "inlineAssemblyStatement", 
			"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
			"throwStatement", "emitStatement", "variableDeclarationStatement", "variableDeclarationList", 
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
			"'calldata'", "'\\uC2E4\\uD589\\uC870\\uAC74'", "'\\uACBD\\uC6B0'", "'\\uADF8\\uC678'", 
			"'\\uB3D9\\uC548\\uC740'", "'assembly'", "'do'", "'while'", "'\\uBC18\\uD658'", 
			"'throw'", "'\\uAE30\\uB85D\\uD558\\uB2E4'", "'\\uBCC0\\uC218'", "'\\uC8FC\\uC18C\\uD615'", 
			"'\\uB17C\\uB9AC\\uC5F0\\uC0B0\\uC790'", "'\\uBB38\\uC790\\uC5F4'", "'\\uBC14\\uC774\\uD2B8'", 
			"'++'", "'--'", "'\\uC0DD\\uC131'", "'+'", "'-'", "'after'", "'delete'", 
			"'!'", "'**'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'=='", "'!='", 
			"'&&'", "'||'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'?'", "':'", "'return'", "'address'", "'byte'", 
			"'let'", "':='", "'=:'", "'switch'", "'case'", "'default'", "'function'", 
			"'->'", "'if'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'anonymous'", "'break'", "'constant'", 
			"'continue'", "':\\uC678\\uBD80\\uC6A9'", "'indexed'", "':\\uC0C1\\uC18D\\uC6A9'", 
			"':\\uC9C0\\uBD88\\uAC00\\uB2A5'", "':\\uAC1C\\uC778\\uC6A9'", "':\\uACF5\\uC6A9'", 
			"'pure'", "'type'", "'view'"
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
			null, null, null, null, "NatSpecSingleLine", "NatSpecMultiLine", "Int", 
			"Uint", "Byte", "Fixed", "Ufixed", "VersionLiteral", "BooleanLiteral", 
			"DecimalNumber", "HexNumber", "NumberUnit", "HexLiteral", "ReservedKeyword", 
			"AnonymousKeyword", "BreakKeyword", "ConstantKeyword", "ContinueKeyword", 
			"ExternalKeyword", "IndexedKeyword", "InternalKeyword", "PayableKeyword", 
			"PrivateKeyword", "PublicKeyword", "PureKeyword", "TypeKeyword", "ViewKeyword", 
			"Identifier", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__12) | (1L << T__40))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NatSpecSingleLine - 100)) | (1L << (NatSpecMultiLine - 100)) | (1L << (Identifier - 100)))) != 0)) {
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(170);
					pragmaDirective();
					}
					break;
				case T__10:
					{
					setState(171);
					importDirective();
					}
					break;
				case T__12:
				case T__40:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
				case Identifier:
					{
					setState(172);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
			setState(180);
			match(T__0);
			setState(181);
			pragmaValue();
			setState(182);
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
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
			setState(188);
			versionConstraint();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==VersionLiteral) {
				{
				setState(189);
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
			setState(192);
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
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(194);
				versionOperator();
				}
			}

			setState(197);
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
			setState(199);
			identifier();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(200);
				match(T__9);
				setState(201);
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
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__10);
				setState(205);
				match(StringLiteral);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(206);
					match(T__9);
					setState(207);
					identifier();
					}
				}

				setState(210);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__10);
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(212);
					match(T__11);
					}
					break;
				case T__12:
				case T__40:
				case Identifier:
					{
					setState(213);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(216);
					match(T__9);
					setState(217);
					identifier();
					}
				}

				setState(220);
				match(T__12);
				setState(221);
				match(StringLiteral);
				setState(222);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(T__10);
				setState(224);
				match(T__13);
				setState(225);
				importDeclaration();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(226);
					match(T__14);
					setState(227);
					importDeclaration();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				match(T__15);
				setState(234);
				match(T__12);
				setState(235);
				match(StringLiteral);
				setState(236);
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
			setState(240);
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
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(242);
				natSpec();
				}
			}

			setState(245);
			identifier();
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(247);
				match(T__19);
				setState(248);
				inheritanceSpecifier();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(249);
					match(T__14);
					setState(250);
					inheritanceSpecifier();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(258);
			match(T__13);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NatSpecSingleLine - 100)) | (1L << (NatSpecMultiLine - 100)) | (1L << (Int - 100)) | (1L << (Uint - 100)) | (1L << (Byte - 100)) | (1L << (Fixed - 100)) | (1L << (Ufixed - 100)) | (1L << (Identifier - 100)))) != 0)) {
				{
				{
				setState(259);
				contractPart();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
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
			setState(267);
			userDefinedTypeName();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(268);
				match(T__20);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
					{
					setState(269);
					expressionList();
					}
				}

				setState(272);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(280);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(282);
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
			setState(285);
			typeName(0);
			setState(286);
			identifier();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (ConstantKeyword - 116)) | (1L << (InternalKeyword - 116)) | (1L << (PrivateKeyword - 116)) | (1L << (PublicKeyword - 116)))) != 0)) {
				{
				{
				setState(287);
				_la = _input.LA(1);
				if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (ConstantKeyword - 116)) | (1L << (InternalKeyword - 116)) | (1L << (PrivateKeyword - 116)) | (1L << (PublicKeyword - 116)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(293);
				match(T__8);
				setState(294);
				expression(0);
				}
			}

			setState(297);
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
			setState(299);
			match(T__22);
			setState(300);
			identifier();
			setState(301);
			match(T__23);
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(302);
				match(T__11);
				}
				break;
			case T__12:
			case T__27:
			case T__33:
			case T__36:
			case T__40:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(303);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(306);
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
			setState(308);
			match(T__24);
			setState(309);
			identifier();
			setState(310);
			match(T__13);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(311);
				variableDeclaration();
				setState(312);
				match(T__1);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
					{
					{
					setState(313);
					variableDeclaration();
					setState(314);
					match(T__1);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(323);
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
			setState(325);
			match(T__25);
			setState(326);
			parameterList();
			setState(327);
			modifierList();
			setState(328);
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
			setState(330);
			match(T__26);
			setState(331);
			identifier();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(332);
				parameterList();
				}
			}

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
			setState(337);
			identifier();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(338);
				match(T__20);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
					{
					setState(339);
					expressionList();
					}
				}

				setState(342);
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
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(345);
				natSpec();
				}
			}

			setState(348);
			match(T__27);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(349);
				identifier();
				}
			}

			setState(352);
			parameterList();
			setState(353);
			modifierList();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(354);
				returnParameters();
				}
			}

			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(357);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(358);
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
			setState(361);
			match(T__28);
			setState(362);
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
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__40 || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (ConstantKeyword - 116)) | (1L << (ExternalKeyword - 116)) | (1L << (InternalKeyword - 116)) | (1L << (PayableKeyword - 116)) | (1L << (PrivateKeyword - 116)) | (1L << (PublicKeyword - 116)) | (1L << (PureKeyword - 116)) | (1L << (ViewKeyword - 116)) | (1L << (Identifier - 116)))) != 0)) {
				{
				setState(370);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__40:
				case Identifier:
					{
					setState(364);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(365);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(366);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(367);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(368);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(369);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(374);
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
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(375);
				natSpec();
				}
			}

			setState(378);
			identifier();
			setState(379);
			match(T__29);
			setState(380);
			eventParameterList();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(381);
				match(AnonymousKeyword);
				}
			}

			setState(384);
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
			setState(386);
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
			setState(388);
			match(T__30);
			setState(389);
			identifier();
			setState(390);
			match(T__13);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(391);
				enumValue();
				}
			}

			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(394);
				match(T__14);
				setState(395);
				enumValue();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
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
			setState(403);
			match(T__20);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(404);
				parameter();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(405);
					match(T__14);
					setState(406);
					parameter();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(414);
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
			setState(416);
			typeName(0);
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(417);
				storageLocation();
				}
				break;
			}
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(420);
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
			setState(423);
			match(T__20);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(424);
				eventParameter();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(425);
					match(T__14);
					setState(426);
					eventParameter();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(434);
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
			setState(436);
			typeName(0);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(437);
				match(IndexedKeyword);
				}
			}

			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(440);
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
			setState(443);
			match(T__20);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(444);
				functionTypeParameter();
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(445);
					match(T__14);
					setState(446);
					functionTypeParameter();
					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(454);
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
			setState(456);
			typeName(0);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) {
				{
				setState(457);
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
			setState(460);
			typeName(0);
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(461);
				storageLocation();
				}
				break;
			}
			setState(464);
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
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				{
				setState(467);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__40:
			case Identifier:
				{
				setState(468);
				userDefinedTypeName();
				}
				break;
			case T__36:
				{
				setState(469);
				mapping();
				}
				break;
			case T__27:
				{
				setState(470);
				functionTypeName();
				}
				break;
			case T__33:
				{
				setState(471);
				match(T__33);
				setState(472);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
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
					setState(475);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(476);
					match(T__31);
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
						{
						setState(477);
						expression(0);
						}
					}

					setState(480);
					match(T__32);
					}
					} 
				}
				setState(485);
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
			setState(486);
			identifier();
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(487);
					match(T__35);
					setState(488);
					identifier();
					}
					} 
				}
				setState(493);
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
			setState(494);
			match(T__36);
			setState(495);
			match(T__20);
			setState(496);
			elementaryTypeName();
			setState(497);
			match(T__37);
			setState(498);
			typeName(0);
			setState(499);
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
			setState(501);
			match(T__27);
			setState(502);
			functionTypeParameterList();
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(506);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(503);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(504);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(505);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(511);
				match(T__28);
				setState(512);
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
			setState(515);
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
			setState(517);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (ConstantKeyword - 116)) | (1L << (PayableKeyword - 116)) | (1L << (PureKeyword - 116)) | (1L << (ViewKeyword - 116)))) != 0)) ) {
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
			setState(519);
			match(T__13);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__13 - 4)) | (1L << (T__20 - 4)) | (1L << (T__23 - 4)) | (1L << (T__27 - 4)) | (1L << (T__31 - 4)) | (1L << (T__33 - 4)) | (1L << (T__36 - 4)) | (1L << (T__40 - 4)) | (1L << (T__41 - 4)) | (1L << (T__42 - 4)) | (1L << (T__45 - 4)) | (1L << (T__46 - 4)) | (1L << (T__48 - 4)) | (1L << (T__49 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (BreakKeyword - 102)) | (1L << (ContinueKeyword - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
				{
				{
				setState(520);
				statement();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
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
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				inlineAssemblyStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(534);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(535);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(536);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(537);
				throwStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(538);
				emitStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(539);
				simpleStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(540);
				requireStatement();
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterRequireStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitRequireStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitRequireStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequireStatementContext requireStatement() throws RecognitionException {
		RequireStatementContext _localctx = new RequireStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_requireStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(T__41);
			setState(544);
			match(T__20);
			setState(545);
			expressionList();
			setState(546);
			match(T__21);
			setState(547);
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
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			expression(0);
			setState(550);
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
		enterRule(_localctx, 82, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__42);
			setState(553);
			match(T__20);
			setState(554);
			expression(0);
			setState(555);
			match(T__21);
			setState(556);
			statement();
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(557);
				match(T__43);
				setState(558);
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
		enterRule(_localctx, 84, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(T__20);
			setState(562);
			expression(0);
			setState(563);
			match(T__21);
			setState(564);
			match(T__44);
			setState(565);
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
		enterRule(_localctx, 86, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(567);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(568);
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
		enterRule(_localctx, 88, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(T__23);
			setState(572);
			match(T__20);
			setState(575);
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
			case T__63:
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
				setState(573);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(574);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__31:
			case T__40:
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
			case T__63:
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
				setState(577);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(578);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
				{
				setState(581);
				expression(0);
				}
			}

			setState(584);
			match(T__21);
			setState(585);
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
		enterRule(_localctx, 90, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__45);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(588);
				match(StringLiteral);
				}
			}

			setState(591);
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
		enterRule(_localctx, 92, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(T__46);
			setState(594);
			statement();
			setState(595);
			match(T__47);
			setState(596);
			match(T__20);
			setState(597);
			expression(0);
			setState(598);
			match(T__21);
			setState(599);
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
		enterRule(_localctx, 94, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(ContinueKeyword);
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
		enterRule(_localctx, 96, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(BreakKeyword);
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
		enterRule(_localctx, 98, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T__48);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
				{
				setState(608);
				expression(0);
				}
			}

			setState(611);
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
		enterRule(_localctx, 100, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(T__49);
			setState(614);
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
		enterRule(_localctx, 102, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			functionCall();
			setState(617);
			match(T__50);
			setState(618);
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
		enterRule(_localctx, 104, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(620);
				match(T__51);
				setState(621);
				identifierList();
				}
				break;
			case 2:
				{
				setState(622);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(623);
				match(T__20);
				setState(624);
				variableDeclarationList();
				setState(625);
				match(T__21);
				}
				break;
			}
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(629);
				match(T__8);
				setState(630);
				expression(0);
				}
			}

			setState(633);
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
		enterRule(_localctx, 106, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
				{
				setState(635);
				variableDeclaration();
				}
			}

			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(638);
				match(T__14);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (Identifier - 102)))) != 0)) {
					{
					setState(639);
					variableDeclaration();
					}
				}

				}
				}
				setState(646);
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
		enterRule(_localctx, 108, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__20);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					match(T__14);
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(657);
				identifier();
				}
			}

			setState(660);
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
		enterRule(_localctx, 110, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (T__51 - 52)) | (1L << (T__52 - 52)) | (1L << (T__53 - 52)) | (1L << (T__54 - 52)) | (1L << (T__55 - 52)) | (1L << (Int - 52)) | (1L << (Uint - 52)) | (1L << (Byte - 52)) | (1L << (Fixed - 52)) | (1L << (Ufixed - 52)))) != 0)) ) {
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(665);
				match(T__58);
				setState(666);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(667);
				match(T__20);
				setState(668);
				expression(0);
				setState(669);
				match(T__21);
				}
				break;
			case 3:
				{
				setState(671);
				match(T__56);
				setState(672);
				expression(40);
				}
				break;
			case 4:
				{
				setState(673);
				match(T__57);
				setState(674);
				expression(39);
				}
				break;
			case 5:
				{
				setState(675);
				match(T__59);
				setState(676);
				expression(38);
				}
				break;
			case 6:
				{
				setState(677);
				match(T__60);
				setState(678);
				expression(37);
				}
				break;
			case 7:
				{
				setState(679);
				match(T__61);
				setState(680);
				expression(36);
				}
				break;
			case 8:
				{
				setState(681);
				match(T__62);
				setState(682);
				expression(35);
				}
				break;
			case 9:
				{
				setState(683);
				match(T__63);
				setState(684);
				expression(34);
				}
				break;
			case 10:
				{
				setState(685);
				match(T__3);
				setState(686);
				expression(33);
				}
				break;
			case 11:
				{
				setState(687);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(803);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(690);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(691);
						match(T__64);
						setState(692);
						expression(33);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(693);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(694);
						match(T__11);
						setState(695);
						expression(32);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(696);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(697);
						match(T__65);
						setState(698);
						expression(31);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(700);
						match(T__66);
						setState(701);
						expression(30);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(702);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(703);
						match(T__59);
						setState(704);
						expression(29);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(705);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(706);
						match(T__60);
						setState(707);
						expression(28);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(708);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(709);
						match(T__67);
						setState(710);
						expression(27);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(711);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(712);
						match(T__68);
						setState(713);
						expression(26);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(714);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(715);
						match(T__69);
						setState(716);
						expression(25);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(717);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(718);
						match(T__2);
						setState(719);
						expression(24);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(720);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(721);
						match(T__70);
						setState(722);
						expression(23);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(723);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(724);
						match(T__6);
						setState(725);
						expression(22);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(726);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(727);
						match(T__5);
						setState(728);
						expression(21);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(729);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(730);
						match(T__7);
						setState(731);
						expression(20);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(732);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(733);
						match(T__4);
						setState(734);
						expression(19);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(736);
						match(T__71);
						setState(737);
						expression(18);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(738);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(739);
						match(T__72);
						setState(740);
						expression(17);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(741);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(742);
						match(T__73);
						setState(743);
						expression(16);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(744);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(745);
						match(T__74);
						setState(746);
						expression(15);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(747);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(748);
						match(T__8);
						setState(749);
						expression(14);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(751);
						match(T__75);
						setState(752);
						expression(13);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(753);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(754);
						match(T__76);
						setState(755);
						expression(12);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(756);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(757);
						match(T__77);
						setState(758);
						expression(11);
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(759);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(760);
						match(T__78);
						setState(761);
						expression(10);
						}
						break;
					case 25:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(762);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(763);
						match(T__79);
						setState(764);
						expression(9);
						}
						break;
					case 26:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(765);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(766);
						match(T__80);
						setState(767);
						expression(8);
						}
						break;
					case 27:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(768);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(769);
						match(T__81);
						setState(770);
						expression(7);
						}
						break;
					case 28:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(771);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(772);
						match(T__82);
						setState(773);
						expression(6);
						}
						break;
					case 29:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(774);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(775);
						match(T__83);
						setState(776);
						expression(5);
						}
						break;
					case 30:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(777);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(778);
						match(T__84);
						setState(779);
						expression(4);
						}
						break;
					case 31:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(780);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(781);
						match(T__85);
						setState(782);
						expression(0);
						setState(783);
						match(T__86);
						setState(784);
						expression(3);
						}
						break;
					case 32:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(786);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(787);
						match(T__56);
						}
						break;
					case 33:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(788);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(789);
						match(T__57);
						}
						break;
					case 34:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(791);
						match(T__31);
						setState(792);
						expression(0);
						setState(793);
						match(T__32);
						}
						break;
					case 35:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(795);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(796);
						match(T__20);
						setState(797);
						functionCallArguments();
						setState(798);
						match(T__21);
						}
						break;
					case 36:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(800);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(801);
						match(T__35);
						setState(802);
						identifier();
						}
						break;
					}
					} 
				}
				setState(807);
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
		enterRule(_localctx, 114, RULE_primaryExpression);
		try {
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(812);
				identifier();
				setState(815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(813);
					match(T__31);
					setState(814);
					match(T__32);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(817);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(818);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(819);
				typeNameExpression();
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(820);
					match(T__31);
					setState(821);
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
		enterRule(_localctx, 116, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			expression(0);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(827);
				match(T__14);
				setState(828);
				expression(0);
				}
				}
				setState(833);
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
		enterRule(_localctx, 118, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			nameValue();
			setState(839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(835);
					match(T__14);
					setState(836);
					nameValue();
					}
					} 
				}
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(842);
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
		enterRule(_localctx, 120, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			identifier();
			setState(846);
			match(T__86);
			setState(847);
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
		enterRule(_localctx, 122, RULE_functionCallArguments);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				match(T__13);
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__40 || _la==Identifier) {
					{
					setState(850);
					nameValueList();
					}
				}

				setState(853);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__21:
			case T__31:
			case T__40:
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
			case T__63:
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
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
					{
					setState(854);
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
		enterRule(_localctx, 124, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			expression(0);
			setState(860);
			match(T__20);
			setState(861);
			functionCallArguments();
			setState(862);
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
		enterRule(_localctx, 126, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__13);
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__40) | (1L << T__45))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T__87 - 88)) | (1L << (T__88 - 88)) | (1L << (T__89 - 88)) | (1L << (T__90 - 88)) | (1L << (T__92 - 88)) | (1L << (T__93 - 88)) | (1L << (T__96 - 88)) | (1L << (T__98 - 88)) | (1L << (DecimalNumber - 88)) | (1L << (HexNumber - 88)) | (1L << (HexLiteral - 88)) | (1L << (BreakKeyword - 88)) | (1L << (ContinueKeyword - 88)) | (1L << (Identifier - 88)) | (1L << (StringLiteral - 88)))) != 0)) {
				{
				{
				setState(865);
				assemblyItem();
				}
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871);
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
		enterRule(_localctx, 128, RULE_assemblyItem);
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(875);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(876);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(877);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(878);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(879);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(880);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(881);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(882);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(883);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(884);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(885);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(886);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(887);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(888);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(889);
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
		enterRule(_localctx, 130, RULE_assemblyExpression);
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__40:
			case T__87:
			case T__88:
			case T__89:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
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
		enterRule(_localctx, 132, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				{
				setState(896);
				match(T__87);
				}
				break;
			case T__88:
				{
				setState(897);
				match(T__88);
				}
				break;
			case T__89:
				{
				setState(898);
				match(T__89);
				}
				break;
			case T__12:
			case T__40:
			case Identifier:
				{
				setState(899);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(902);
				match(T__20);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__40 || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T__87 - 88)) | (1L << (T__88 - 88)) | (1L << (T__89 - 88)) | (1L << (DecimalNumber - 88)) | (1L << (HexNumber - 88)) | (1L << (HexLiteral - 88)) | (1L << (Identifier - 88)) | (1L << (StringLiteral - 88)))) != 0)) {
					{
					setState(903);
					assemblyExpression();
					}
				}

				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(906);
					match(T__14);
					setState(907);
					assemblyExpression();
					}
					}
					setState(912);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(913);
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
		enterRule(_localctx, 134, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(T__90);
			setState(917);
			assemblyIdentifierOrList();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__91) {
				{
				setState(918);
				match(T__91);
				setState(919);
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
		enterRule(_localctx, 136, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			assemblyIdentifierOrList();
			setState(923);
			match(T__91);
			setState(924);
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
		enterRule(_localctx, 138, RULE_assemblyIdentifierOrList);
		try {
			setState(931);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				identifier();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				match(T__20);
				setState(928);
				assemblyIdentifierList();
				setState(929);
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
		enterRule(_localctx, 140, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			identifier();
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(934);
				match(T__14);
				setState(935);
				identifier();
				}
				}
				setState(940);
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
		enterRule(_localctx, 142, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(T__92);
			setState(942);
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
		enterRule(_localctx, 144, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			identifier();
			setState(945);
			match(T__86);
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
		enterRule(_localctx, 146, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(T__93);
			setState(948);
			assemblyExpression();
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__94 || _la==T__95) {
				{
				{
				setState(949);
				assemblyCase();
				}
				}
				setState(954);
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
		enterRule(_localctx, 148, RULE_assemblyCase);
		try {
			setState(961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__94:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				match(T__94);
				setState(956);
				assemblyLiteral();
				setState(957);
				assemblyBlock();
				}
				break;
			case T__95:
				enterOuterAlt(_localctx, 2);
				{
				setState(959);
				match(T__95);
				setState(960);
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
		enterRule(_localctx, 150, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(T__96);
			setState(964);
			identifier();
			setState(965);
			match(T__20);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(966);
				assemblyIdentifierList();
				}
			}

			setState(969);
			match(T__21);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(970);
				assemblyFunctionReturns();
				}
			}

			setState(973);
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
		enterRule(_localctx, 152, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(975);
			match(T__97);
			setState(976);
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
		enterRule(_localctx, 154, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(T__23);
			setState(981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(979);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__40:
			case T__87:
			case T__88:
			case T__89:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(980);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(983);
			assemblyExpression();
			setState(986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(984);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__40:
			case T__87:
			case T__88:
			case T__89:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(985);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(988);
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
		enterRule(_localctx, 156, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(T__98);
			setState(991);
			assemblyExpression();
			setState(992);
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
		enterRule(_localctx, 158, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (DecimalNumber - 109)) | (1L << (HexNumber - 109)) | (1L << (HexLiteral - 109)) | (1L << (StringLiteral - 109)))) != 0)) ) {
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
		enterRule(_localctx, 160, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(T__45);
			setState(997);
			identifier();
			setState(998);
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
		enterRule(_localctx, 162, RULE_tupleExpression);
		int _la;
		try {
			setState(1026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				match(T__20);
				{
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
					{
					setState(1001);
					expression(0);
					}
				}

				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1004);
					match(T__14);
					setState(1006);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
						{
						setState(1005);
						expression(0);
						}
					}

					}
					}
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1013);
				match(T__21);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(T__31);
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__51 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Int - 102)) | (1L << (Uint - 102)) | (1L << (Byte - 102)) | (1L << (Fixed - 102)) | (1L << (Ufixed - 102)) | (1L << (BooleanLiteral - 102)) | (1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (TypeKeyword - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
					{
					setState(1015);
					expression(0);
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(1016);
						match(T__14);
						setState(1017);
						expression(0);
						}
						}
						setState(1022);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1025);
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
		enterRule(_localctx, 164, RULE_typeNameExpression);
		try {
			setState(1030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
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
		enterRule(_localctx, 166, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1033);
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
		enterRule(_localctx, 168, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
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
		case 56:
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
		"\u0004\u0001\u0083\u040f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00ae\b\u0000\n\u0000"+
		"\f\u0000\u00b1\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u00bb\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00bf\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0003\u0005\u00c4\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00cb\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00d1\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00d7\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00db\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e5\b\u0007"+
		"\n\u0007\f\u0007\u00e8\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00ef\b\u0007\u0001\b\u0001\b\u0001\t\u0003"+
		"\t\u00f4\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00fc"+
		"\b\t\n\t\f\t\u00ff\t\t\u0003\t\u0101\b\t\u0001\t\u0001\t\u0005\t\u0105"+
		"\b\t\n\t\f\t\u0108\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u010f\b\n\u0001\n\u0003\n\u0112\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u011c\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0121\b\f\n\f\f\f\u0124"+
		"\t\f\u0001\f\u0001\f\u0003\f\u0128\b\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u0131\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u013d\b\u000e\n\u000e\f\u000e\u0140\t\u000e\u0003"+
		"\u000e\u0142\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u014e\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0155\b\u0011\u0001\u0011\u0003\u0011\u0158\b\u0011"+
		"\u0001\u0012\u0003\u0012\u015b\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u015f\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0164\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0168\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0173\b\u0014\n\u0014\f\u0014\u0176\t\u0014"+
		"\u0001\u0015\u0003\u0015\u0179\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u017f\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0189\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u018d\b\u0017\n\u0017"+
		"\f\u0017\u0190\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0198\b\u0018\n\u0018\f\u0018\u019b"+
		"\t\u0018\u0003\u0018\u019d\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01a3\b\u0019\u0001\u0019\u0003\u0019\u01a6\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01ac"+
		"\b\u001a\n\u001a\f\u001a\u01af\t\u001a\u0003\u001a\u01b1\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u01b7\b\u001b\u0001"+
		"\u001b\u0003\u001b\u01ba\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u01c0\b\u001c\n\u001c\f\u001c\u01c3\t\u001c\u0003\u001c"+
		"\u01c5\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u01cb\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01cf\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01da\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01df\b\u001f\u0001\u001f\u0005\u001f\u01e2"+
		"\b\u001f\n\u001f\f\u001f\u01e5\t\u001f\u0001 \u0001 \u0001 \u0005 \u01ea"+
		"\b \n \f \u01ed\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01fb\b\"\n\"\f\"\u01fe\t\""+
		"\u0001\"\u0001\"\u0003\"\u0202\b\"\u0001#\u0001#\u0001$\u0001$\u0001%"+
		"\u0001%\u0005%\u020a\b%\n%\f%\u020d\t%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u021e\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u0230\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0003"+
		"+\u023a\b+\u0001,\u0001,\u0001,\u0001,\u0003,\u0240\b,\u0001,\u0001,\u0003"+
		",\u0244\b,\u0001,\u0003,\u0247\b,\u0001,\u0001,\u0001,\u0001-\u0001-\u0003"+
		"-\u024e\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00011\u00011\u0003"+
		"1\u0262\b1\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0274\b4\u0001"+
		"4\u00014\u00034\u0278\b4\u00014\u00014\u00015\u00035\u027d\b5\u00015\u0001"+
		"5\u00035\u0281\b5\u00055\u0283\b5\n5\f5\u0286\t5\u00016\u00016\u00036"+
		"\u028a\b6\u00016\u00056\u028d\b6\n6\f6\u0290\t6\u00016\u00036\u0293\b"+
		"6\u00016\u00016\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u02b1"+
		"\b8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00058\u0324\b8\n8\f8\u0327\t8\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u0330\b9\u00019\u00019\u00019\u0001"+
		"9\u00019\u00039\u0337\b9\u00039\u0339\b9\u0001:\u0001:\u0001:\u0005:\u033e"+
		"\b:\n:\f:\u0341\t:\u0001;\u0001;\u0001;\u0005;\u0346\b;\n;\f;\u0349\t"+
		";\u0001;\u0003;\u034c\b;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0003"+
		"=\u0354\b=\u0001=\u0001=\u0003=\u0358\b=\u0003=\u035a\b=\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001?\u0001?\u0005?\u0363\b?\n?\f?\u0366\t?\u0001"+
		"?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u037b"+
		"\b@\u0001A\u0001A\u0003A\u037f\bA\u0001B\u0001B\u0001B\u0001B\u0003B\u0385"+
		"\bB\u0001B\u0001B\u0003B\u0389\bB\u0001B\u0001B\u0005B\u038d\bB\nB\fB"+
		"\u0390\tB\u0001B\u0003B\u0393\bB\u0001C\u0001C\u0001C\u0001C\u0003C\u0399"+
		"\bC\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0003"+
		"E\u03a4\bE\u0001F\u0001F\u0001F\u0005F\u03a9\bF\nF\fF\u03ac\tF\u0001G"+
		"\u0001G\u0001G\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0005I\u03b7"+
		"\bI\nI\fI\u03ba\tI\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u03c2"+
		"\bJ\u0001K\u0001K\u0001K\u0001K\u0003K\u03c8\bK\u0001K\u0001K\u0003K\u03cc"+
		"\bK\u0001K\u0001K\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0003M\u03d6"+
		"\bM\u0001M\u0001M\u0001M\u0003M\u03db\bM\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0001N\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0003"+
		"Q\u03eb\bQ\u0001Q\u0001Q\u0003Q\u03ef\bQ\u0005Q\u03f1\bQ\nQ\fQ\u03f4\t"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u03fb\bQ\nQ\fQ\u03fe\tQ\u0003"+
		"Q\u0400\bQ\u0001Q\u0003Q\u0403\bQ\u0001R\u0001R\u0003R\u0407\bR\u0001"+
		"S\u0001S\u0003S\u040b\bS\u0001T\u0001T\u0001T\u0000\u0002>pU\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u0000\n\u0001\u0000\u0003\t\u0001\u0000"+
		"de\u0001\u0000\u0011\u0013\u0003\u0000ttxxz{\u0001\u0000\')\u0004\u0000"+
		"ttyy||~~\u0002\u000048fj\u0003\u0000mnpp\u0080\u0080\u0001\u0000mn\u0003"+
		"\u0000\r\r))\u007f\u007f\u0483\u0000\u00af\u0001\u0000\u0000\u0000\u0002"+
		"\u00b4\u0001\u0000\u0000\u0000\u0004\u00ba\u0001\u0000\u0000\u0000\u0006"+
		"\u00bc\u0001\u0000\u0000\u0000\b\u00c0\u0001\u0000\u0000\u0000\n\u00c3"+
		"\u0001\u0000\u0000\u0000\f\u00c7\u0001\u0000\u0000\u0000\u000e\u00ee\u0001"+
		"\u0000\u0000\u0000\u0010\u00f0\u0001\u0000\u0000\u0000\u0012\u00f3\u0001"+
		"\u0000\u0000\u0000\u0014\u010b\u0001\u0000\u0000\u0000\u0016\u011b\u0001"+
		"\u0000\u0000\u0000\u0018\u011d\u0001\u0000\u0000\u0000\u001a\u012b\u0001"+
		"\u0000\u0000\u0000\u001c\u0134\u0001\u0000\u0000\u0000\u001e\u0145\u0001"+
		"\u0000\u0000\u0000 \u014a\u0001\u0000\u0000\u0000\"\u0151\u0001\u0000"+
		"\u0000\u0000$\u015a\u0001\u0000\u0000\u0000&\u0169\u0001\u0000\u0000\u0000"+
		"(\u0174\u0001\u0000\u0000\u0000*\u0178\u0001\u0000\u0000\u0000,\u0182"+
		"\u0001\u0000\u0000\u0000.\u0184\u0001\u0000\u0000\u00000\u0193\u0001\u0000"+
		"\u0000\u00002\u01a0\u0001\u0000\u0000\u00004\u01a7\u0001\u0000\u0000\u0000"+
		"6\u01b4\u0001\u0000\u0000\u00008\u01bb\u0001\u0000\u0000\u0000:\u01c8"+
		"\u0001\u0000\u0000\u0000<\u01cc\u0001\u0000\u0000\u0000>\u01d9\u0001\u0000"+
		"\u0000\u0000@\u01e6\u0001\u0000\u0000\u0000B\u01ee\u0001\u0000\u0000\u0000"+
		"D\u01f5\u0001\u0000\u0000\u0000F\u0203\u0001\u0000\u0000\u0000H\u0205"+
		"\u0001\u0000\u0000\u0000J\u0207\u0001\u0000\u0000\u0000L\u021d\u0001\u0000"+
		"\u0000\u0000N\u021f\u0001\u0000\u0000\u0000P\u0225\u0001\u0000\u0000\u0000"+
		"R\u0228\u0001\u0000\u0000\u0000T\u0231\u0001\u0000\u0000\u0000V\u0239"+
		"\u0001\u0000\u0000\u0000X\u023b\u0001\u0000\u0000\u0000Z\u024b\u0001\u0000"+
		"\u0000\u0000\\\u0251\u0001\u0000\u0000\u0000^\u0259\u0001\u0000\u0000"+
		"\u0000`\u025c\u0001\u0000\u0000\u0000b\u025f\u0001\u0000\u0000\u0000d"+
		"\u0265\u0001\u0000\u0000\u0000f\u0268\u0001\u0000\u0000\u0000h\u0273\u0001"+
		"\u0000\u0000\u0000j\u027c\u0001\u0000\u0000\u0000l\u0287\u0001\u0000\u0000"+
		"\u0000n\u0296\u0001\u0000\u0000\u0000p\u02b0\u0001\u0000\u0000\u0000r"+
		"\u0338\u0001\u0000\u0000\u0000t\u033a\u0001\u0000\u0000\u0000v\u0342\u0001"+
		"\u0000\u0000\u0000x\u034d\u0001\u0000\u0000\u0000z\u0359\u0001\u0000\u0000"+
		"\u0000|\u035b\u0001\u0000\u0000\u0000~\u0360\u0001\u0000\u0000\u0000\u0080"+
		"\u037a\u0001\u0000\u0000\u0000\u0082\u037e\u0001\u0000\u0000\u0000\u0084"+
		"\u0384\u0001\u0000\u0000\u0000\u0086\u0394\u0001\u0000\u0000\u0000\u0088"+
		"\u039a\u0001\u0000\u0000\u0000\u008a\u03a3\u0001\u0000\u0000\u0000\u008c"+
		"\u03a5\u0001\u0000\u0000\u0000\u008e\u03ad\u0001\u0000\u0000\u0000\u0090"+
		"\u03b0\u0001\u0000\u0000\u0000\u0092\u03b3\u0001\u0000\u0000\u0000\u0094"+
		"\u03c1\u0001\u0000\u0000\u0000\u0096\u03c3\u0001\u0000\u0000\u0000\u0098"+
		"\u03cf\u0001\u0000\u0000\u0000\u009a\u03d2\u0001\u0000\u0000\u0000\u009c"+
		"\u03de\u0001\u0000\u0000\u0000\u009e\u03e2\u0001\u0000\u0000\u0000\u00a0"+
		"\u03e4\u0001\u0000\u0000\u0000\u00a2\u0402\u0001\u0000\u0000\u0000\u00a4"+
		"\u0406\u0001\u0000\u0000\u0000\u00a6\u0408\u0001\u0000\u0000\u0000\u00a8"+
		"\u040c\u0001\u0000\u0000\u0000\u00aa\u00ae\u0003\u0002\u0001\u0000\u00ab"+
		"\u00ae\u0003\u000e\u0007\u0000\u00ac\u00ae\u0003\u0012\t\u0000\u00ad\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0000\u0000\u0001\u00b3\u0001\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0001\u0000\u0000\u00b5\u00b6\u0003\u0004\u0002\u0000\u00b6\u00b7"+
		"\u0005\u0002\u0000\u0000\u00b7\u0003\u0001\u0000\u0000\u0000\u00b8\u00bb"+
		"\u0003\u0006\u0003\u0000\u00b9\u00bb\u0003p8\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u0005\u0001\u0000"+
		"\u0000\u0000\u00bc\u00be\u0003\n\u0005\u0000\u00bd\u00bf\u0003\n\u0005"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u0007\u0001\u0000\u0000\u0000\u00c0\u00c1\u0007\u0000\u0000"+
		"\u0000\u00c1\t\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003\b\u0004\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005k\u0000\u0000\u00c6"+
		"\u000b\u0001\u0000\u0000\u0000\u00c7\u00ca\u0003\u00a8T\u0000\u00c8\u00c9"+
		"\u0005\n\u0000\u0000\u00c9\u00cb\u0003\u00a8T\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\r\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005\u000b\u0000\u0000\u00cd\u00d0\u0005\u0080"+
		"\u0000\u0000\u00ce\u00cf\u0005\n\u0000\u0000\u00cf\u00d1\u0003\u00a8T"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00ef\u0005\u0002\u0000"+
		"\u0000\u00d3\u00d6\u0005\u000b\u0000\u0000\u00d4\u00d7\u0005\f\u0000\u0000"+
		"\u00d5\u00d7\u0003\u00a8T\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0005\n\u0000\u0000\u00d9\u00db\u0003\u00a8T\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\r\u0000\u0000\u00dd\u00de\u0005"+
		"\u0080\u0000\u0000\u00de\u00ef\u0005\u0002\u0000\u0000\u00df\u00e0\u0005"+
		"\u000b\u0000\u0000\u00e0\u00e1\u0005\u000e\u0000\u0000\u00e1\u00e6\u0003"+
		"\f\u0006\u0000\u00e2\u00e3\u0005\u000f\u0000\u0000\u00e3\u00e5\u0003\f"+
		"\u0006\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0005\u0010\u0000\u0000\u00ea\u00eb\u0005\r\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0080\u0000\u0000\u00ec\u00ed\u0005\u0002\u0000"+
		"\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ee\u00d3\u0001\u0000\u0000\u0000\u00ee\u00df\u0001\u0000\u0000"+
		"\u0000\u00ef\u000f\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007\u0001\u0000"+
		"\u0000\u00f1\u0011\u0001\u0000\u0000\u0000\u00f2\u00f4\u0003\u0010\b\u0000"+
		"\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0003\u00a8T\u0000\u00f6"+
		"\u0100\u0007\u0002\u0000\u0000\u00f7\u00f8\u0005\u0014\u0000\u0000\u00f8"+
		"\u00fd\u0003\u0014\n\u0000\u00f9\u00fa\u0005\u000f\u0000\u0000\u00fa\u00fc"+
		"\u0003\u0014\n\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u00f7\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0106\u0005"+
		"\u000e\u0000\u0000\u0103\u0105\u0003\u0016\u000b\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0005"+
		"\u0010\u0000\u0000\u010a\u0013\u0001\u0000\u0000\u0000\u010b\u0111\u0003"+
		"@ \u0000\u010c\u010e\u0005\u0015\u0000\u0000\u010d\u010f\u0003t:\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0005\u0016\u0000\u0000"+
		"\u0111\u010c\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112\u0015\u0001\u0000\u0000\u0000\u0113\u011c\u0003\u0018\f\u0000\u0114"+
		"\u011c\u0003\u001a\r\u0000\u0115\u011c\u0003\u001c\u000e\u0000\u0116\u011c"+
		"\u0003\u001e\u000f\u0000\u0117\u011c\u0003 \u0010\u0000\u0118\u011c\u0003"+
		"$\u0012\u0000\u0119\u011c\u0003*\u0015\u0000\u011a\u011c\u0003.\u0017"+
		"\u0000\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u0114\u0001\u0000\u0000"+
		"\u0000\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u0116\u0001\u0000\u0000"+
		"\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u0017\u0001\u0000\u0000\u0000\u011d\u011e\u0003>\u001f\u0000"+
		"\u011e\u0122\u0003\u00a8T\u0000\u011f\u0121\u0007\u0003\u0000\u0000\u0120"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123"+
		"\u0127\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0005\t\u0000\u0000\u0126\u0128\u0003p8\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0005\u0002\u0000\u0000\u012a\u0019\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0005\u0017\u0000\u0000\u012c\u012d\u0003"+
		"\u00a8T\u0000\u012d\u0130\u0005\u0018\u0000\u0000\u012e\u0131\u0005\f"+
		"\u0000\u0000\u012f\u0131\u0003>\u001f\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0005\u0002\u0000\u0000\u0133\u001b\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0005\u0019\u0000\u0000\u0135\u0136\u0003\u00a8T\u0000"+
		"\u0136\u0141\u0005\u000e\u0000\u0000\u0137\u0138\u0003<\u001e\u0000\u0138"+
		"\u013e\u0005\u0002\u0000\u0000\u0139\u013a\u0003<\u001e\u0000\u013a\u013b"+
		"\u0005\u0002\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0139"+
		"\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0142"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0137"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0005\u0010\u0000\u0000\u0144\u001d"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u001a\u0000\u0000\u0146\u0147"+
		"\u00030\u0018\u0000\u0147\u0148\u0003(\u0014\u0000\u0148\u0149\u0003J"+
		"%\u0000\u0149\u001f\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u001b\u0000"+
		"\u0000\u014b\u014d\u0003\u00a8T\u0000\u014c\u014e\u00030\u0018\u0000\u014d"+
		"\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0003J%\u0000\u0150!\u0001"+
		"\u0000\u0000\u0000\u0151\u0157\u0003\u00a8T\u0000\u0152\u0154\u0005\u0015"+
		"\u0000\u0000\u0153\u0155\u0003t:\u0000\u0154\u0153\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0158\u0005\u0016\u0000\u0000\u0157\u0152\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158#\u0001\u0000\u0000\u0000\u0159"+
		"\u015b\u0003\u0010\b\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e"+
		"\u0005\u001c\u0000\u0000\u015d\u015f\u0003\u00a8T\u0000\u015e\u015d\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u00030\u0018\u0000\u0161\u0163\u0003(\u0014"+
		"\u0000\u0162\u0164\u0003&\u0013\u0000\u0163\u0162\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000"+
		"\u0165\u0168\u0005\u0002\u0000\u0000\u0166\u0168\u0003J%\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168%\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0005\u001d\u0000\u0000\u016a\u016b\u0003"+
		"0\u0018\u0000\u016b\'\u0001\u0000\u0000\u0000\u016c\u0173\u0003\"\u0011"+
		"\u0000\u016d\u0173\u0003H$\u0000\u016e\u0173\u0005v\u0000\u0000\u016f"+
		"\u0173\u0005{\u0000\u0000\u0170\u0173\u0005x\u0000\u0000\u0171\u0173\u0005"+
		"z\u0000\u0000\u0172\u016c\u0001\u0000\u0000\u0000\u0172\u016d\u0001\u0000"+
		"\u0000\u0000\u0172\u016e\u0001\u0000\u0000\u0000\u0172\u016f\u0001\u0000"+
		"\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175)\u0001\u0000\u0000"+
		"\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u0179\u0003\u0010\b\u0000"+
		"\u0178\u0177\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0003\u00a8T\u0000\u017b"+
		"\u017c\u0005\u001e\u0000\u0000\u017c\u017e\u00034\u001a\u0000\u017d\u017f"+
		"\u0005r\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"\u0002\u0000\u0000\u0181+\u0001\u0000\u0000\u0000\u0182\u0183\u0003\u00a8"+
		"T\u0000\u0183-\u0001\u0000\u0000\u0000\u0184\u0185\u0005\u001f\u0000\u0000"+
		"\u0185\u0186\u0003\u00a8T\u0000\u0186\u0188\u0005\u000e\u0000\u0000\u0187"+
		"\u0189\u0003,\u0016\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0001\u0000\u0000\u0000\u0189\u018e\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0005\u000f\u0000\u0000\u018b\u018d\u0003,\u0016\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0192\u0005"+
		"\u0010\u0000\u0000\u0192/\u0001\u0000\u0000\u0000\u0193\u019c\u0005\u0015"+
		"\u0000\u0000\u0194\u0199\u00032\u0019\u0000\u0195\u0196\u0005\u000f\u0000"+
		"\u0000\u0196\u0198\u00032\u0019\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000"+
		"\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u0194\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0005\u0016\u0000\u0000\u019f1\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a2\u0003>\u001f\u0000\u01a1\u01a3\u0003F#\u0000\u01a2\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a6\u0003\u00a8T\u0000\u01a5\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a63\u0001\u0000\u0000"+
		"\u0000\u01a7\u01b0\u0005\u0015\u0000\u0000\u01a8\u01ad\u00036\u001b\u0000"+
		"\u01a9\u01aa\u0005\u000f\u0000\u0000\u01aa\u01ac\u00036\u001b\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae"+
		"\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0"+
		"\u01a8\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u0016\u0000\u0000\u01b3"+
		"5\u0001\u0000\u0000\u0000\u01b4\u01b6\u0003>\u001f\u0000\u01b5\u01b7\u0005"+
		"w\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01ba\u0003\u00a8"+
		"T\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba7\u0001\u0000\u0000\u0000\u01bb\u01c4\u0005\u0015\u0000\u0000"+
		"\u01bc\u01c1\u0003:\u001d\u0000\u01bd\u01be\u0005\u000f\u0000\u0000\u01be"+
		"\u01c0\u0003:\u001d\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c4\u01bc\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0005\u0016\u0000\u0000\u01c79\u0001\u0000\u0000\u0000\u01c8\u01ca\u0003"+
		">\u001f\u0000\u01c9\u01cb\u0003F#\u0000\u01ca\u01c9\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb;\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0003>\u001f\u0000\u01cd\u01cf\u0003F#\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0003\u00a8T\u0000\u01d1=\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0006\u001f\uffff\uffff\u0000\u01d3\u01da\u0003"+
		"n7\u0000\u01d4\u01da\u0003@ \u0000\u01d5\u01da\u0003B!\u0000\u01d6\u01da"+
		"\u0003D\"\u0000\u01d7\u01d8\u0005\"\u0000\u0000\u01d8\u01da\u0005#\u0000"+
		"\u0000\u01d9\u01d2\u0001\u0000\u0000\u0000\u01d9\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000\u01d9\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01e3\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\n\u0003\u0000\u0000\u01dc\u01de\u0005 \u0000\u0000"+
		"\u01dd\u01df\u0003p8\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2"+
		"\u0005!\u0000\u0000\u01e1\u01db\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4?\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e6\u01eb\u0003\u00a8T\u0000\u01e7\u01e8\u0005$\u0000\u0000"+
		"\u01e8\u01ea\u0003\u00a8T\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea"+
		"\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ecA\u0001\u0000\u0000\u0000\u01ed\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005%\u0000\u0000\u01ef\u01f0\u0005"+
		"\u0015\u0000\u0000\u01f0\u01f1\u0003n7\u0000\u01f1\u01f2\u0005&\u0000"+
		"\u0000\u01f2\u01f3\u0003>\u001f\u0000\u01f3\u01f4\u0005\u0016\u0000\u0000"+
		"\u01f4C\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\u001c\u0000\u0000\u01f6"+
		"\u01fc\u00038\u001c\u0000\u01f7\u01fb\u0005x\u0000\u0000\u01f8\u01fb\u0005"+
		"v\u0000\u0000\u01f9\u01fb\u0003H$\u0000\u01fa\u01f7\u0001\u0000\u0000"+
		"\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u0201\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0005\u001d\u0000"+
		"\u0000\u0200\u0202\u00038\u001c\u0000\u0201\u01ff\u0001\u0000\u0000\u0000"+
		"\u0201\u0202\u0001\u0000\u0000\u0000\u0202E\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0007\u0004\u0000\u0000\u0204G\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0007\u0005\u0000\u0000\u0206I\u0001\u0000\u0000\u0000\u0207\u020b\u0005"+
		"\u000e\u0000\u0000\u0208\u020a\u0003L&\u0000\u0209\u0208\u0001\u0000\u0000"+
		"\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000"+
		"\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020e\u0001\u0000\u0000"+
		"\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u0010\u0000"+
		"\u0000\u020fK\u0001\u0000\u0000\u0000\u0210\u021e\u0003R)\u0000\u0211"+
		"\u021e\u0003T*\u0000\u0212\u021e\u0003X,\u0000\u0213\u021e\u0003J%\u0000"+
		"\u0214\u021e\u0003Z-\u0000\u0215\u021e\u0003\\.\u0000\u0216\u021e\u0003"+
		"^/\u0000\u0217\u021e\u0003`0\u0000\u0218\u021e\u0003b1\u0000\u0219\u021e"+
		"\u0003d2\u0000\u021a\u021e\u0003f3\u0000\u021b\u021e\u0003V+\u0000\u021c"+
		"\u021e\u0003N\'\u0000\u021d\u0210\u0001\u0000\u0000\u0000\u021d\u0211"+
		"\u0001\u0000\u0000\u0000\u021d\u0212\u0001\u0000\u0000\u0000\u021d\u0213"+
		"\u0001\u0000\u0000\u0000\u021d\u0214\u0001\u0000\u0000\u0000\u021d\u0215"+
		"\u0001\u0000\u0000\u0000\u021d\u0216\u0001\u0000\u0000\u0000\u021d\u0217"+
		"\u0001\u0000\u0000\u0000\u021d\u0218\u0001\u0000\u0000\u0000\u021d\u0219"+
		"\u0001\u0000\u0000\u0000\u021d\u021a\u0001\u0000\u0000\u0000\u021d\u021b"+
		"\u0001\u0000\u0000\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021eM\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u0005*\u0000\u0000\u0220\u0221\u0005\u0015"+
		"\u0000\u0000\u0221\u0222\u0003t:\u0000\u0222\u0223\u0005\u0016\u0000\u0000"+
		"\u0223\u0224\u0005\u0002\u0000\u0000\u0224O\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0003p8\u0000\u0226\u0227\u0005\u0002\u0000\u0000\u0227Q\u0001"+
		"\u0000\u0000\u0000\u0228\u0229\u0005+\u0000\u0000\u0229\u022a\u0005\u0015"+
		"\u0000\u0000\u022a\u022b\u0003p8\u0000\u022b\u022c\u0005\u0016\u0000\u0000"+
		"\u022c\u022f\u0003L&\u0000\u022d\u022e\u0005,\u0000\u0000\u022e\u0230"+
		"\u0003L&\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000"+
		"\u0000\u0000\u0230S\u0001\u0000\u0000\u0000\u0231\u0232\u0005\u0015\u0000"+
		"\u0000\u0232\u0233\u0003p8\u0000\u0233\u0234\u0005\u0016\u0000\u0000\u0234"+
		"\u0235\u0005-\u0000\u0000\u0235\u0236\u0003L&\u0000\u0236U\u0001\u0000"+
		"\u0000\u0000\u0237\u023a\u0003h4\u0000\u0238\u023a\u0003P(\u0000\u0239"+
		"\u0237\u0001\u0000\u0000\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a"+
		"W\u0001\u0000\u0000\u0000\u023b\u023c\u0005\u0018\u0000\u0000\u023c\u023f"+
		"\u0005\u0015\u0000\u0000\u023d\u0240\u0003V+\u0000\u023e\u0240\u0005\u0002"+
		"\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000"+
		"\u0000\u0000\u0240\u0243\u0001\u0000\u0000\u0000\u0241\u0244\u0003P(\u0000"+
		"\u0242\u0244\u0005\u0002\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000"+
		"\u0243\u0242\u0001\u0000\u0000\u0000\u0244\u0246\u0001\u0000\u0000\u0000"+
		"\u0245\u0247\u0003p8\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0249"+
		"\u0005\u0016\u0000\u0000\u0249\u024a\u0003L&\u0000\u024aY\u0001\u0000"+
		"\u0000\u0000\u024b\u024d\u0005.\u0000\u0000\u024c\u024e\u0005\u0080\u0000"+
		"\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0003~?\u0000\u0250"+
		"[\u0001\u0000\u0000\u0000\u0251\u0252\u0005/\u0000\u0000\u0252\u0253\u0003"+
		"L&\u0000\u0253\u0254\u00050\u0000\u0000\u0254\u0255\u0005\u0015\u0000"+
		"\u0000\u0255\u0256\u0003p8\u0000\u0256\u0257\u0005\u0016\u0000\u0000\u0257"+
		"\u0258\u0005\u0002\u0000\u0000\u0258]\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0005u\u0000\u0000\u025a\u025b\u0005\u0002\u0000\u0000\u025b_\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0005s\u0000\u0000\u025d\u025e\u0005\u0002\u0000"+
		"\u0000\u025ea\u0001\u0000\u0000\u0000\u025f\u0261\u00051\u0000\u0000\u0260"+
		"\u0262\u0003p8\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264\u0005"+
		"\u0002\u0000\u0000\u0264c\u0001\u0000\u0000\u0000\u0265\u0266\u00052\u0000"+
		"\u0000\u0266\u0267\u0005\u0002\u0000\u0000\u0267e\u0001\u0000\u0000\u0000"+
		"\u0268\u0269\u0003|>\u0000\u0269\u026a\u00053\u0000\u0000\u026a\u026b"+
		"\u0005\u0002\u0000\u0000\u026bg\u0001\u0000\u0000\u0000\u026c\u026d\u0005"+
		"4\u0000\u0000\u026d\u0274\u0003l6\u0000\u026e\u0274\u0003<\u001e\u0000"+
		"\u026f\u0270\u0005\u0015\u0000\u0000\u0270\u0271\u0003j5\u0000\u0271\u0272"+
		"\u0005\u0016\u0000\u0000\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u026c"+
		"\u0001\u0000\u0000\u0000\u0273\u026e\u0001\u0000\u0000\u0000\u0273\u026f"+
		"\u0001\u0000\u0000\u0000\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0005\t\u0000\u0000\u0276\u0278\u0003p8\u0000\u0277\u0275\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0005\u0002\u0000\u0000\u027ai\u0001\u0000\u0000"+
		"\u0000\u027b\u027d\u0003<\u001e\u0000\u027c\u027b\u0001\u0000\u0000\u0000"+
		"\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u0284\u0001\u0000\u0000\u0000"+
		"\u027e\u0280\u0005\u000f\u0000\u0000\u027f\u0281\u0003<\u001e\u0000\u0280"+
		"\u027f\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281"+
		"\u0283\u0001\u0000\u0000\u0000\u0282\u027e\u0001\u0000\u0000\u0000\u0283"+
		"\u0286\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0001\u0000\u0000\u0000\u0285k\u0001\u0000\u0000\u0000\u0286\u0284"+
		"\u0001\u0000\u0000\u0000\u0287\u028e\u0005\u0015\u0000\u0000\u0288\u028a"+
		"\u0003\u00a8T\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u0289\u028a\u0001"+
		"\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028d\u0005"+
		"\u000f\u0000\u0000\u028c\u0289\u0001\u0000\u0000\u0000\u028d\u0290\u0001"+
		"\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028e\u028f\u0001"+
		"\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e\u0001"+
		"\u0000\u0000\u0000\u0291\u0293\u0003\u00a8T\u0000\u0292\u0291\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000"+
		"\u0000\u0000\u0294\u0295\u0005\u0016\u0000\u0000\u0295m\u0001\u0000\u0000"+
		"\u0000\u0296\u0297\u0007\u0006\u0000\u0000\u0297o\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u00068\uffff\uffff\u0000\u0299\u029a\u0005;\u0000\u0000\u029a"+
		"\u02b1\u0003>\u001f\u0000\u029b\u029c\u0005\u0015\u0000\u0000\u029c\u029d"+
		"\u0003p8\u0000\u029d\u029e\u0005\u0016\u0000\u0000\u029e\u02b1\u0001\u0000"+
		"\u0000\u0000\u029f\u02a0\u00059\u0000\u0000\u02a0\u02b1\u0003p8(\u02a1"+
		"\u02a2\u0005:\u0000\u0000\u02a2\u02b1\u0003p8\'\u02a3\u02a4\u0005<\u0000"+
		"\u0000\u02a4\u02b1\u0003p8&\u02a5\u02a6\u0005=\u0000\u0000\u02a6\u02b1"+
		"\u0003p8%\u02a7\u02a8\u0005>\u0000\u0000\u02a8\u02b1\u0003p8$\u02a9\u02aa"+
		"\u0005?\u0000\u0000\u02aa\u02b1\u0003p8#\u02ab\u02ac\u0005@\u0000\u0000"+
		"\u02ac\u02b1\u0003p8\"\u02ad\u02ae\u0005\u0004\u0000\u0000\u02ae\u02b1"+
		"\u0003p8!\u02af\u02b1\u0003r9\u0000\u02b0\u0298\u0001\u0000\u0000\u0000"+
		"\u02b0\u029b\u0001\u0000\u0000\u0000\u02b0\u029f\u0001\u0000\u0000\u0000"+
		"\u02b0\u02a1\u0001\u0000\u0000\u0000\u02b0\u02a3\u0001\u0000\u0000\u0000"+
		"\u02b0\u02a5\u0001\u0000\u0000\u0000\u02b0\u02a7\u0001\u0000\u0000\u0000"+
		"\u02b0\u02a9\u0001\u0000\u0000\u0000\u02b0\u02ab\u0001\u0000\u0000\u0000"+
		"\u02b0\u02ad\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000\u0000\u0000"+
		"\u02b1\u0325\u0001\u0000\u0000\u0000\u02b2\u02b3\n \u0000\u0000\u02b3"+
		"\u02b4\u0005A\u0000\u0000\u02b4\u0324\u0003p8!\u02b5\u02b6\n\u001f\u0000"+
		"\u0000\u02b6\u02b7\u0005\f\u0000\u0000\u02b7\u0324\u0003p8 \u02b8\u02b9"+
		"\n\u001e\u0000\u0000\u02b9\u02ba\u0005B\u0000\u0000\u02ba\u0324\u0003"+
		"p8\u001f\u02bb\u02bc\n\u001d\u0000\u0000\u02bc\u02bd\u0005C\u0000\u0000"+
		"\u02bd\u0324\u0003p8\u001e\u02be\u02bf\n\u001c\u0000\u0000\u02bf\u02c0"+
		"\u0005<\u0000\u0000\u02c0\u0324\u0003p8\u001d\u02c1\u02c2\n\u001b\u0000"+
		"\u0000\u02c2\u02c3\u0005=\u0000\u0000\u02c3\u0324\u0003p8\u001c\u02c4"+
		"\u02c5\n\u001a\u0000\u0000\u02c5\u02c6\u0005D\u0000\u0000\u02c6\u0324"+
		"\u0003p8\u001b\u02c7\u02c8\n\u0019\u0000\u0000\u02c8\u02c9\u0005E\u0000"+
		"\u0000\u02c9\u0324\u0003p8\u001a\u02ca\u02cb\n\u0018\u0000\u0000\u02cb"+
		"\u02cc\u0005F\u0000\u0000\u02cc\u0324\u0003p8\u0019\u02cd\u02ce\n\u0017"+
		"\u0000\u0000\u02ce\u02cf\u0005\u0003\u0000\u0000\u02cf\u0324\u0003p8\u0018"+
		"\u02d0\u02d1\n\u0016\u0000\u0000\u02d1\u02d2\u0005G\u0000\u0000\u02d2"+
		"\u0324\u0003p8\u0017\u02d3\u02d4\n\u0015\u0000\u0000\u02d4\u02d5\u0005"+
		"\u0007\u0000\u0000\u02d5\u0324\u0003p8\u0016\u02d6\u02d7\n\u0014\u0000"+
		"\u0000\u02d7\u02d8\u0005\u0006\u0000\u0000\u02d8\u0324\u0003p8\u0015\u02d9"+
		"\u02da\n\u0013\u0000\u0000\u02da\u02db\u0005\b\u0000\u0000\u02db\u0324"+
		"\u0003p8\u0014\u02dc\u02dd\n\u0012\u0000\u0000\u02dd\u02de\u0005\u0005"+
		"\u0000\u0000\u02de\u0324\u0003p8\u0013\u02df\u02e0\n\u0011\u0000\u0000"+
		"\u02e0\u02e1\u0005H\u0000\u0000\u02e1\u0324\u0003p8\u0012\u02e2\u02e3"+
		"\n\u0010\u0000\u0000\u02e3\u02e4\u0005I\u0000\u0000\u02e4\u0324\u0003"+
		"p8\u0011\u02e5\u02e6\n\u000f\u0000\u0000\u02e6\u02e7\u0005J\u0000\u0000"+
		"\u02e7\u0324\u0003p8\u0010\u02e8\u02e9\n\u000e\u0000\u0000\u02e9\u02ea"+
		"\u0005K\u0000\u0000\u02ea\u0324\u0003p8\u000f\u02eb\u02ec\n\r\u0000\u0000"+
		"\u02ec\u02ed\u0005\t\u0000\u0000\u02ed\u0324\u0003p8\u000e\u02ee\u02ef"+
		"\n\f\u0000\u0000\u02ef\u02f0\u0005L\u0000\u0000\u02f0\u0324\u0003p8\r"+
		"\u02f1\u02f2\n\u000b\u0000\u0000\u02f2\u02f3\u0005M\u0000\u0000\u02f3"+
		"\u0324\u0003p8\f\u02f4\u02f5\n\n\u0000\u0000\u02f5\u02f6\u0005N\u0000"+
		"\u0000\u02f6\u0324\u0003p8\u000b\u02f7\u02f8\n\t\u0000\u0000\u02f8\u02f9"+
		"\u0005O\u0000\u0000\u02f9\u0324\u0003p8\n\u02fa\u02fb\n\b\u0000\u0000"+
		"\u02fb\u02fc\u0005P\u0000\u0000\u02fc\u0324\u0003p8\t\u02fd\u02fe\n\u0007"+
		"\u0000\u0000\u02fe\u02ff\u0005Q\u0000\u0000\u02ff\u0324\u0003p8\b\u0300"+
		"\u0301\n\u0006\u0000\u0000\u0301\u0302\u0005R\u0000\u0000\u0302\u0324"+
		"\u0003p8\u0007\u0303\u0304\n\u0005\u0000\u0000\u0304\u0305\u0005S\u0000"+
		"\u0000\u0305\u0324\u0003p8\u0006\u0306\u0307\n\u0004\u0000\u0000\u0307"+
		"\u0308\u0005T\u0000\u0000\u0308\u0324\u0003p8\u0005\u0309\u030a\n\u0003"+
		"\u0000\u0000\u030a\u030b\u0005U\u0000\u0000\u030b\u0324\u0003p8\u0004"+
		"\u030c\u030d\n\u0002\u0000\u0000\u030d\u030e\u0005V\u0000\u0000\u030e"+
		"\u030f\u0003p8\u0000\u030f\u0310\u0005W\u0000\u0000\u0310\u0311\u0003"+
		"p8\u0003\u0311\u0324\u0001\u0000\u0000\u0000\u0312\u0313\n/\u0000\u0000"+
		"\u0313\u0324\u00059\u0000\u0000\u0314\u0315\n.\u0000\u0000\u0315\u0324"+
		"\u0005:\u0000\u0000\u0316\u0317\n,\u0000\u0000\u0317\u0318\u0005 \u0000"+
		"\u0000\u0318\u0319\u0003p8\u0000\u0319\u031a\u0005!\u0000\u0000\u031a"+
		"\u0324\u0001\u0000\u0000\u0000\u031b\u031c\n+\u0000\u0000\u031c\u031d"+
		"\u0005\u0015\u0000\u0000\u031d\u031e\u0003z=\u0000\u031e\u031f\u0005\u0016"+
		"\u0000\u0000\u031f\u0324\u0001\u0000\u0000\u0000\u0320\u0321\n*\u0000"+
		"\u0000\u0321\u0322\u0005$\u0000\u0000\u0322\u0324\u0003\u00a8T\u0000\u0323"+
		"\u02b2\u0001\u0000\u0000\u0000\u0323\u02b5\u0001\u0000\u0000\u0000\u0323"+
		"\u02b8\u0001\u0000\u0000\u0000\u0323\u02bb\u0001\u0000\u0000\u0000\u0323"+
		"\u02be\u0001\u0000\u0000\u0000\u0323\u02c1\u0001\u0000\u0000\u0000\u0323"+
		"\u02c4\u0001\u0000\u0000\u0000\u0323\u02c7\u0001\u0000\u0000\u0000\u0323"+
		"\u02ca\u0001\u0000\u0000\u0000\u0323\u02cd\u0001\u0000\u0000\u0000\u0323"+
		"\u02d0\u0001\u0000\u0000\u0000\u0323\u02d3\u0001\u0000\u0000\u0000\u0323"+
		"\u02d6\u0001\u0000\u0000\u0000\u0323\u02d9\u0001\u0000\u0000\u0000\u0323"+
		"\u02dc\u0001\u0000\u0000\u0000\u0323\u02df\u0001\u0000\u0000\u0000\u0323"+
		"\u02e2\u0001\u0000\u0000\u0000\u0323\u02e5\u0001\u0000\u0000\u0000\u0323"+
		"\u02e8\u0001\u0000\u0000\u0000\u0323\u02eb\u0001\u0000\u0000\u0000\u0323"+
		"\u02ee\u0001\u0000\u0000\u0000\u0323\u02f1\u0001\u0000\u0000\u0000\u0323"+
		"\u02f4\u0001\u0000\u0000\u0000\u0323\u02f7\u0001\u0000\u0000\u0000\u0323"+
		"\u02fa\u0001\u0000\u0000\u0000\u0323\u02fd\u0001\u0000\u0000\u0000\u0323"+
		"\u0300\u0001\u0000\u0000\u0000\u0323\u0303\u0001\u0000\u0000\u0000\u0323"+
		"\u0306\u0001\u0000\u0000\u0000\u0323\u0309\u0001\u0000\u0000\u0000\u0323"+
		"\u030c\u0001\u0000\u0000\u0000\u0323\u0312\u0001\u0000\u0000\u0000\u0323"+
		"\u0314\u0001\u0000\u0000\u0000\u0323\u0316\u0001\u0000\u0000\u0000\u0323"+
		"\u031b\u0001\u0000\u0000\u0000\u0323\u0320\u0001\u0000\u0000\u0000\u0324"+
		"\u0327\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325"+
		"\u0326\u0001\u0000\u0000\u0000\u0326q\u0001\u0000\u0000\u0000\u0327\u0325"+
		"\u0001\u0000\u0000\u0000\u0328\u0339\u0005l\u0000\u0000\u0329\u0339\u0003"+
		"\u00a6S\u0000\u032a\u0339\u0005p\u0000\u0000\u032b\u0339\u0005\u0080\u0000"+
		"\u0000\u032c\u032f\u0003\u00a8T\u0000\u032d\u032e\u0005 \u0000\u0000\u032e"+
		"\u0330\u0005!\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f\u0330"+
		"\u0001\u0000\u0000\u0000\u0330\u0339\u0001\u0000\u0000\u0000\u0331\u0339"+
		"\u0005}\u0000\u0000\u0332\u0339\u0003\u00a2Q\u0000\u0333\u0336\u0003\u00a4"+
		"R\u0000\u0334\u0335\u0005 \u0000\u0000\u0335\u0337\u0005!\u0000\u0000"+
		"\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000"+
		"\u0337\u0339\u0001\u0000\u0000\u0000\u0338\u0328\u0001\u0000\u0000\u0000"+
		"\u0338\u0329\u0001\u0000\u0000\u0000\u0338\u032a\u0001\u0000\u0000\u0000"+
		"\u0338\u032b\u0001\u0000\u0000\u0000\u0338\u032c\u0001\u0000\u0000\u0000"+
		"\u0338\u0331\u0001\u0000\u0000\u0000\u0338\u0332\u0001\u0000\u0000\u0000"+
		"\u0338\u0333\u0001\u0000\u0000\u0000\u0339s\u0001\u0000\u0000\u0000\u033a"+
		"\u033f\u0003p8\u0000\u033b\u033c\u0005\u000f\u0000\u0000\u033c\u033e\u0003"+
		"p8\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033e\u0341\u0001\u0000\u0000"+
		"\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000"+
		"\u0000\u0340u\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000"+
		"\u0342\u0347\u0003x<\u0000\u0343\u0344\u0005\u000f\u0000\u0000\u0344\u0346"+
		"\u0003x<\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0346\u0349\u0001\u0000"+
		"\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000"+
		"\u0000\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000"+
		"\u0000\u0000\u034a\u034c\u0005\u000f\u0000\u0000\u034b\u034a\u0001\u0000"+
		"\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034cw\u0001\u0000\u0000"+
		"\u0000\u034d\u034e\u0003\u00a8T\u0000\u034e\u034f\u0005W\u0000\u0000\u034f"+
		"\u0350\u0003p8\u0000\u0350y\u0001\u0000\u0000\u0000\u0351\u0353\u0005"+
		"\u000e\u0000\u0000\u0352\u0354\u0003v;\u0000\u0353\u0352\u0001\u0000\u0000"+
		"\u0000\u0353\u0354\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000"+
		"\u0000\u0355\u035a\u0005\u0010\u0000\u0000\u0356\u0358\u0003t:\u0000\u0357"+
		"\u0356\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358"+
		"\u035a\u0001\u0000\u0000\u0000\u0359\u0351\u0001\u0000\u0000\u0000\u0359"+
		"\u0357\u0001\u0000\u0000\u0000\u035a{\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0003p8\u0000\u035c\u035d\u0005\u0015\u0000\u0000\u035d\u035e\u0003z"+
		"=\u0000\u035e\u035f\u0005\u0016\u0000\u0000\u035f}\u0001\u0000\u0000\u0000"+
		"\u0360\u0364\u0005\u000e\u0000\u0000\u0361\u0363\u0003\u0080@\u0000\u0362"+
		"\u0361\u0001\u0000\u0000\u0000\u0363\u0366\u0001\u0000\u0000\u0000\u0364"+
		"\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365"+
		"\u0367\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0367"+
		"\u0368\u0005\u0010\u0000\u0000\u0368\u007f\u0001\u0000\u0000\u0000\u0369"+
		"\u037b\u0003\u00a8T\u0000\u036a\u037b\u0003~?\u0000\u036b\u037b\u0003"+
		"\u0082A\u0000\u036c\u037b\u0003\u0086C\u0000\u036d\u037b\u0003\u0088D"+
		"\u0000\u036e\u037b\u0003\u008eG\u0000\u036f\u037b\u0003\u0090H\u0000\u0370"+
		"\u037b\u0003\u0092I\u0000\u0371\u037b\u0003\u0096K\u0000\u0372\u037b\u0003"+
		"\u009aM\u0000\u0373\u037b\u0003\u009cN\u0000\u0374\u037b\u0005s\u0000"+
		"\u0000\u0375\u037b\u0005u\u0000\u0000\u0376\u037b\u0003\u00a0P\u0000\u0377"+
		"\u037b\u0003\u00a6S\u0000\u0378\u037b\u0005\u0080\u0000\u0000\u0379\u037b"+
		"\u0005p\u0000\u0000\u037a\u0369\u0001\u0000\u0000\u0000\u037a\u036a\u0001"+
		"\u0000\u0000\u0000\u037a\u036b\u0001\u0000\u0000\u0000\u037a\u036c\u0001"+
		"\u0000\u0000\u0000\u037a\u036d\u0001\u0000\u0000\u0000\u037a\u036e\u0001"+
		"\u0000\u0000\u0000\u037a\u036f\u0001\u0000\u0000\u0000\u037a\u0370\u0001"+
		"\u0000\u0000\u0000\u037a\u0371\u0001\u0000\u0000\u0000\u037a\u0372\u0001"+
		"\u0000\u0000\u0000\u037a\u0373\u0001\u0000\u0000\u0000\u037a\u0374\u0001"+
		"\u0000\u0000\u0000\u037a\u0375\u0001\u0000\u0000\u0000\u037a\u0376\u0001"+
		"\u0000\u0000\u0000\u037a\u0377\u0001\u0000\u0000\u0000\u037a\u0378\u0001"+
		"\u0000\u0000\u0000\u037a\u0379\u0001\u0000\u0000\u0000\u037b\u0081\u0001"+
		"\u0000\u0000\u0000\u037c\u037f\u0003\u0084B\u0000\u037d\u037f\u0003\u009e"+
		"O\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037d\u0001\u0000\u0000"+
		"\u0000\u037f\u0083\u0001\u0000\u0000\u0000\u0380\u0385\u0005X\u0000\u0000"+
		"\u0381\u0385\u0005Y\u0000\u0000\u0382\u0385\u0005Z\u0000\u0000\u0383\u0385"+
		"\u0003\u00a8T\u0000\u0384\u0380\u0001\u0000\u0000\u0000\u0384\u0381\u0001"+
		"\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0384\u0383\u0001"+
		"\u0000\u0000\u0000\u0385\u0392\u0001\u0000\u0000\u0000\u0386\u0388\u0005"+
		"\u0015\u0000\u0000\u0387\u0389\u0003\u0082A\u0000\u0388\u0387\u0001\u0000"+
		"\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u038e\u0001\u0000"+
		"\u0000\u0000\u038a\u038b\u0005\u000f\u0000\u0000\u038b\u038d\u0003\u0082"+
		"A\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038d\u0390\u0001\u0000\u0000"+
		"\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000"+
		"\u0000\u038f\u0391\u0001\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000"+
		"\u0000\u0391\u0393\u0005\u0016\u0000\u0000\u0392\u0386\u0001\u0000\u0000"+
		"\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u0085\u0001\u0000\u0000"+
		"\u0000\u0394\u0395\u0005[\u0000\u0000\u0395\u0398\u0003\u008aE\u0000\u0396"+
		"\u0397\u0005\\\u0000\u0000\u0397\u0399\u0003\u0082A\u0000\u0398\u0396"+
		"\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u0087"+
		"\u0001\u0000\u0000\u0000\u039a\u039b\u0003\u008aE\u0000\u039b\u039c\u0005"+
		"\\\u0000\u0000\u039c\u039d\u0003\u0082A\u0000\u039d\u0089\u0001\u0000"+
		"\u0000\u0000\u039e\u03a4\u0003\u00a8T\u0000\u039f\u03a0\u0005\u0015\u0000"+
		"\u0000\u03a0\u03a1\u0003\u008cF\u0000\u03a1\u03a2\u0005\u0016\u0000\u0000"+
		"\u03a2\u03a4\u0001\u0000\u0000\u0000\u03a3\u039e\u0001\u0000\u0000\u0000"+
		"\u03a3\u039f\u0001\u0000\u0000\u0000\u03a4\u008b\u0001\u0000\u0000\u0000"+
		"\u03a5\u03aa\u0003\u00a8T\u0000\u03a6\u03a7\u0005\u000f\u0000\u0000\u03a7"+
		"\u03a9\u0003\u00a8T\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a9\u03ac"+
		"\u0001\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03ab"+
		"\u0001\u0000\u0000\u0000\u03ab\u008d\u0001\u0000\u0000\u0000\u03ac\u03aa"+
		"\u0001\u0000\u0000\u0000\u03ad\u03ae\u0005]\u0000\u0000\u03ae\u03af\u0003"+
		"\u00a8T\u0000\u03af\u008f\u0001\u0000\u0000\u0000\u03b0\u03b1\u0003\u00a8"+
		"T\u0000\u03b1\u03b2\u0005W\u0000\u0000\u03b2\u0091\u0001\u0000\u0000\u0000"+
		"\u03b3\u03b4\u0005^\u0000\u0000\u03b4\u03b8\u0003\u0082A\u0000\u03b5\u03b7"+
		"\u0003\u0094J\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7\u03ba\u0001"+
		"\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001"+
		"\u0000\u0000\u0000\u03b9\u0093\u0001\u0000\u0000\u0000\u03ba\u03b8\u0001"+
		"\u0000\u0000\u0000\u03bb\u03bc\u0005_\u0000\u0000\u03bc\u03bd\u0003\u009e"+
		"O\u0000\u03bd\u03be\u0003~?\u0000\u03be\u03c2\u0001\u0000\u0000\u0000"+
		"\u03bf\u03c0\u0005`\u0000\u0000\u03c0\u03c2\u0003~?\u0000\u03c1\u03bb"+
		"\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c2\u0095"+
		"\u0001\u0000\u0000\u0000\u03c3\u03c4\u0005a\u0000\u0000\u03c4\u03c5\u0003"+
		"\u00a8T\u0000\u03c5\u03c7\u0005\u0015\u0000\u0000\u03c6\u03c8\u0003\u008c"+
		"F\u0000\u03c7\u03c6\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000"+
		"\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cb\u0005\u0016\u0000"+
		"\u0000\u03ca\u03cc\u0003\u0098L\u0000\u03cb\u03ca\u0001\u0000\u0000\u0000"+
		"\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000"+
		"\u03cd\u03ce\u0003~?\u0000\u03ce\u0097\u0001\u0000\u0000\u0000\u03cf\u03d0"+
		"\u0005b\u0000\u0000\u03d0\u03d1\u0003\u008cF\u0000\u03d1\u0099\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d5\u0005\u0018\u0000\u0000\u03d3\u03d6\u0003~?\u0000"+
		"\u03d4\u03d6\u0003\u0082A\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000\u03d5"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7"+
		"\u03da\u0003\u0082A\u0000\u03d8\u03db\u0003~?\u0000\u03d9\u03db\u0003"+
		"\u0082A\u0000\u03da\u03d8\u0001\u0000\u0000\u0000\u03da\u03d9\u0001\u0000"+
		"\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03dd\u0003~?\u0000"+
		"\u03dd\u009b\u0001\u0000\u0000\u0000\u03de\u03df\u0005c\u0000\u0000\u03df"+
		"\u03e0\u0003\u0082A\u0000\u03e0\u03e1\u0003~?\u0000\u03e1\u009d\u0001"+
		"\u0000\u0000\u0000\u03e2\u03e3\u0007\u0007\u0000\u0000\u03e3\u009f\u0001"+
		"\u0000\u0000\u0000\u03e4\u03e5\u0005.\u0000\u0000\u03e5\u03e6\u0003\u00a8"+
		"T\u0000\u03e6\u03e7\u0003~?\u0000\u03e7\u00a1\u0001\u0000\u0000\u0000"+
		"\u03e8\u03ea\u0005\u0015\u0000\u0000\u03e9\u03eb\u0003p8\u0000\u03ea\u03e9"+
		"\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000\u03eb\u03f2"+
		"\u0001\u0000\u0000\u0000\u03ec\u03ee\u0005\u000f\u0000\u0000\u03ed\u03ef"+
		"\u0003p8\u0000\u03ee\u03ed\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000"+
		"\u0000\u0000\u03ef\u03f1\u0001\u0000\u0000\u0000\u03f0\u03ec\u0001\u0000"+
		"\u0000\u0000\u03f1\u03f4\u0001\u0000\u0000\u0000\u03f2\u03f0\u0001\u0000"+
		"\u0000\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f5\u0001\u0000"+
		"\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f5\u0403\u0005\u0016"+
		"\u0000\u0000\u03f6\u03ff\u0005 \u0000\u0000\u03f7\u03fc\u0003p8\u0000"+
		"\u03f8\u03f9\u0005\u000f\u0000\u0000\u03f9\u03fb\u0003p8\u0000\u03fa\u03f8"+
		"\u0001\u0000\u0000\u0000\u03fb\u03fe\u0001\u0000\u0000\u0000\u03fc\u03fa"+
		"\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u0400"+
		"\u0001\u0000\u0000\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03ff\u03f7"+
		"\u0001\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000\u0000\u0400\u0401"+
		"\u0001\u0000\u0000\u0000\u0401\u0403\u0005!\u0000\u0000\u0402\u03e8\u0001"+
		"\u0000\u0000\u0000\u0402\u03f6\u0001\u0000\u0000\u0000\u0403\u00a3\u0001"+
		"\u0000\u0000\u0000\u0404\u0407\u0003n7\u0000\u0405\u0407\u0003@ \u0000"+
		"\u0406\u0404\u0001\u0000\u0000\u0000\u0406\u0405\u0001\u0000\u0000\u0000"+
		"\u0407\u00a5\u0001\u0000\u0000\u0000\u0408\u040a\u0007\b\u0000\u0000\u0409"+
		"\u040b\u0005o\u0000\u0000\u040a\u0409\u0001\u0000\u0000\u0000\u040a\u040b"+
		"\u0001\u0000\u0000\u0000\u040b\u00a7\u0001\u0000\u0000\u0000\u040c\u040d"+
		"\u0007\t\u0000\u0000\u040d\u00a9\u0001\u0000\u0000\u0000l\u00ad\u00af"+
		"\u00ba\u00be\u00c3\u00ca\u00d0\u00d6\u00da\u00e6\u00ee\u00f3\u00fd\u0100"+
		"\u0106\u010e\u0111\u011b\u0122\u0127\u0130\u013e\u0141\u014d\u0154\u0157"+
		"\u015a\u015e\u0163\u0167\u0172\u0174\u0178\u017e\u0188\u018e\u0199\u019c"+
		"\u01a2\u01a5\u01ad\u01b0\u01b6\u01b9\u01c1\u01c4\u01ca\u01ce\u01d9\u01de"+
		"\u01e3\u01eb\u01fa\u01fc\u0201\u020b\u021d\u022f\u0239\u023f\u0243\u0246"+
		"\u024d\u0261\u0273\u0277\u027c\u0280\u0284\u0289\u028e\u0292\u02b0\u0323"+
		"\u0325\u032f\u0336\u0338\u033f\u0347\u034b\u0353\u0357\u0359\u0364\u037a"+
		"\u037e\u0384\u0388\u038e\u0392\u0398\u03a3\u03aa\u03b8\u03c1\u03c7\u03cb"+
		"\u03d5\u03da\u03ea\u03ee\u03f2\u03fc\u03ff\u0402\u0406\u040a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}