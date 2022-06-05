// Generated from C:/Users/PC/Desktop/졸프/SonamuProjectPage/src/main/g4\Sonamu.g4 by ANTLR 4.10.1

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
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, NatSpecSingleLine=101, 
		NatSpecMultiLine=102, Int=103, Uint=104, Byte=105, Fixed=106, Ufixed=107, 
		VersionLiteral=108, BooleanLiteral=109, DecimalNumber=110, HexNumber=111, 
		NumberUnit=112, HexLiteral=113, ReservedKeyword=114, AnonymousKeyword=115, 
		BreakKeyword=116, ConstantKeyword=117, ContinueKeyword=118, ExternalKeyword=119, 
		IndexedKeyword=120, InternalKeyword=121, PayableKeyword=122, PrivateKeyword=123, 
		PublicKeyword=124, PureKeyword=125, TypeKeyword=126, ViewKeyword=127, 
		Identifier=128, StringLiteral=129, WS=130, COMMENT=131, LINE_COMMENT=132;
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
		RULE_revertStatement = 40, RULE_expressionStatement = 41, RULE_ifStatement = 42, 
		RULE_whileStatement = 43, RULE_simpleStatement = 44, RULE_forStatement = 45, 
		RULE_inlineAssemblyStatement = 46, RULE_doWhileStatement = 47, RULE_continueStatement = 48, 
		RULE_breakStatement = 49, RULE_returnStatement = 50, RULE_throwStatement = 51, 
		RULE_emitStatement = 52, RULE_variableDeclarationStatement = 53, RULE_variableDeclarationList = 54, 
		RULE_identifierList = 55, RULE_elementaryTypeName = 56, RULE_expression = 57, 
		RULE_primaryExpression = 58, RULE_expressionList = 59, RULE_nameValueList = 60, 
		RULE_nameValue = 61, RULE_functionCallArguments = 62, RULE_functionCall = 63, 
		RULE_assemblyBlock = 64, RULE_assemblyItem = 65, RULE_assemblyExpression = 66, 
		RULE_assemblyCall = 67, RULE_assemblyLocalDefinition = 68, RULE_assemblyAssignment = 69, 
		RULE_assemblyIdentifierOrList = 70, RULE_assemblyIdentifierList = 71, 
		RULE_assemblyStackAssignment = 72, RULE_labelDefinition = 73, RULE_assemblySwitch = 74, 
		RULE_assemblyCase = 75, RULE_assemblyFunctionDefinition = 76, RULE_assemblyFunctionReturns = 77, 
		RULE_assemblyFor = 78, RULE_assemblyIf = 79, RULE_assemblyLiteral = 80, 
		RULE_subAssembly = 81, RULE_tupleExpression = 82, RULE_typeNameExpression = 83, 
		RULE_numberLiteral = 84, RULE_identifier = 85;
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
			"block", "statement", "requireStatement", "revertStatement", "expressionStatement", 
			"ifStatement", "whileStatement", "simpleStatement", "forStatement", "inlineAssemblyStatement", 
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
			"':\\uC0C1\\uC18D'", "'('", "')'", "'using'", "'for'", "'struct'", "'\\uCD08\\uC548'", 
			"'\\uCD94\\uAC00\\uB3D9\\uC791'", "'\\uACC4\\uC57D\\uB0B4\\uC6A9'", "'==>'", 
			"'\\uAE30\\uB85D'", "'enum'", "'['", "']'", "'\\uC9C0\\uBD88\\uAC00\\uB2A5\\uD55C'", 
			"'\\uC8FC\\uC18C'", "'.'", "'\\uC9DD\\uAFCD'", "'=>'", "'memory'", "'storage'", 
			"'calldata'", "'\\uC2E4\\uD589\\uC870\\uAC74'", "'\\uC5D0\\uB7EC\\uBC1C\\uC0DD'", 
			"'\\uACBD\\uC6B0'", "'\\uADF8\\uC678'", "'\\uB3D9\\uC548\\uC740'", "'assembly'", 
			"'do'", "'while'", "'\\uBC18\\uD658'", "'throw'", "'\\uAE30\\uB85D\\uD558\\uB2E4'", 
			"'\\uBCC0\\uC218'", "'\\uC8FC\\uC18C\\uD615'", "'\\uB17C\\uB9AC\\uC5F0\\uC0B0\\uC790'", 
			"'\\uBB38\\uC790\\uC5F4'", "'\\uBC14\\uC774\\uD2B8'", "'++'", "'--'", 
			"'\\uC0DD\\uC131'", "'+'", "'-'", "'after'", "'delete'", "'!'", "'**'", 
			"'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'=='", "'!='", "'&&'", "'||'", 
			"'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'?'", "':'", "'return'", "'address'", "'byte'", "'let'", "':='", 
			"'=:'", "'switch'", "'case'", "'default'", "'function'", "'->'", "'if'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'anonymous'", "'\\uADF8\\uB9CC'", "':\\uBD88\\uBCC0\\uCC98\\uB9AC'", 
			"'\\uB2E4\\uC2DC'", "':\\uC678\\uBD80\\uC6A9'", "'\\uAC80\\uC0C9'", "':\\uC0C1\\uC18D\\uC6A9'", 
			"':\\uC9C0\\uBD88\\uAC00\\uB2A5'", "':\\uAC1C\\uC778\\uC6A9'", "':\\uACF5\\uC6A9'", 
			"':\\uC21C\\uC218\\uD568\\uC218'", "'type'", "':\\uC77D\\uAE30\\uC804\\uC6A9'"
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
			null, null, null, null, null, "NatSpecSingleLine", "NatSpecMultiLine", 
			"Int", "Uint", "Byte", "Fixed", "Ufixed", "VersionLiteral", "BooleanLiteral", 
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
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__12) | (1L << T__40))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (NatSpecSingleLine - 101)) | (1L << (NatSpecMultiLine - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(172);
					pragmaDirective();
					}
					break;
				case T__10:
					{
					setState(173);
					importDirective();
					}
					break;
				case T__12:
				case T__40:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
				case Identifier:
					{
					setState(174);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
			setState(182);
			match(T__0);
			setState(183);
			pragmaValue();
			setState(184);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
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
			setState(190);
			versionConstraint();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==VersionLiteral) {
				{
				setState(191);
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
			setState(194);
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
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(196);
				versionOperator();
				}
			}

			setState(199);
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
			setState(201);
			identifier();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(202);
				match(T__9);
				setState(203);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__10);
				setState(207);
				match(StringLiteral);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(208);
					match(T__9);
					setState(209);
					identifier();
					}
				}

				setState(212);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__10);
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(214);
					match(T__11);
					}
					break;
				case T__12:
				case T__40:
				case Identifier:
					{
					setState(215);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(218);
					match(T__9);
					setState(219);
					identifier();
					}
				}

				setState(222);
				match(T__12);
				setState(223);
				match(StringLiteral);
				setState(224);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(T__10);
				setState(226);
				match(T__13);
				setState(227);
				importDeclaration();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(228);
					match(T__14);
					setState(229);
					importDeclaration();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(T__15);
				setState(236);
				match(T__12);
				setState(237);
				match(StringLiteral);
				setState(238);
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
			setState(242);
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
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(244);
				natSpec();
				}
			}

			setState(247);
			identifier();
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(249);
				match(T__19);
				setState(250);
				inheritanceSpecifier();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(251);
					match(T__14);
					setState(252);
					inheritanceSpecifier();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(260);
			match(T__13);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (NatSpecSingleLine - 101)) | (1L << (NatSpecMultiLine - 101)) | (1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				{
				setState(261);
				contractPart();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
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
			setState(269);
			userDefinedTypeName();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(270);
				match(T__20);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
					{
					setState(271);
					expressionList();
					}
				}

				setState(274);
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
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(284);
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
			setState(287);
			typeName(0);
			setState(288);
			identifier();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ConstantKeyword - 117)) | (1L << (InternalKeyword - 117)) | (1L << (PrivateKeyword - 117)) | (1L << (PublicKeyword - 117)))) != 0)) {
				{
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ConstantKeyword - 117)) | (1L << (InternalKeyword - 117)) | (1L << (PrivateKeyword - 117)) | (1L << (PublicKeyword - 117)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(295);
				match(T__8);
				setState(296);
				expression(0);
				}
			}

			setState(299);
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
			setState(301);
			match(T__22);
			setState(302);
			identifier();
			setState(303);
			match(T__23);
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(304);
				match(T__11);
				}
				break;
			case T__12:
			case T__27:
			case T__33:
			case T__36:
			case T__40:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(305);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(308);
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
			setState(310);
			match(T__24);
			setState(311);
			identifier();
			setState(312);
			match(T__13);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(313);
				variableDeclaration();
				setState(314);
				match(T__1);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
					{
					{
					setState(315);
					variableDeclaration();
					setState(316);
					match(T__1);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(325);
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
			setState(327);
			match(T__25);
			setState(328);
			parameterList();
			setState(329);
			modifierList();
			setState(330);
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
			setState(332);
			match(T__26);
			setState(333);
			identifier();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(334);
				parameterList();
				}
			}

			setState(337);
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
			setState(339);
			identifier();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(340);
				match(T__20);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
					{
					setState(341);
					expressionList();
					}
				}

				setState(344);
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
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(347);
				natSpec();
				}
			}

			setState(350);
			match(T__27);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(351);
				identifier();
				}
			}

			setState(354);
			parameterList();
			setState(355);
			modifierList();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(356);
				returnParameters();
				}
			}

			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(359);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(360);
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
			setState(363);
			match(T__28);
			setState(364);
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
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__40 || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ConstantKeyword - 117)) | (1L << (ExternalKeyword - 117)) | (1L << (InternalKeyword - 117)) | (1L << (PayableKeyword - 117)) | (1L << (PrivateKeyword - 117)) | (1L << (PublicKeyword - 117)) | (1L << (PureKeyword - 117)) | (1L << (ViewKeyword - 117)) | (1L << (Identifier - 117)))) != 0)) {
				{
				setState(372);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__40:
				case Identifier:
					{
					setState(366);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(367);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(368);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(369);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(370);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(371);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(376);
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
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(377);
				natSpec();
				}
			}

			setState(380);
			identifier();
			setState(381);
			match(T__29);
			setState(382);
			eventParameterList();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(383);
				match(AnonymousKeyword);
				}
			}

			setState(386);
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
			setState(388);
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
			setState(390);
			match(T__30);
			setState(391);
			identifier();
			setState(392);
			match(T__13);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(393);
				enumValue();
				}
			}

			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(396);
				match(T__14);
				setState(397);
				enumValue();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
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
			setState(405);
			match(T__20);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(406);
				parameter();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(407);
					match(T__14);
					setState(408);
					parameter();
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(416);
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
			setState(418);
			typeName(0);
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(419);
				storageLocation();
				}
				break;
			}
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(422);
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
			setState(425);
			match(T__20);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(426);
				eventParameter();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(427);
					match(T__14);
					setState(428);
					eventParameter();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(436);
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
			setState(438);
			typeName(0);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(439);
				match(IndexedKeyword);
				}
			}

			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(442);
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
			setState(445);
			match(T__20);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(446);
				functionTypeParameter();
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(447);
					match(T__14);
					setState(448);
					functionTypeParameter();
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(456);
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
			setState(458);
			typeName(0);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) {
				{
				setState(459);
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
			setState(462);
			typeName(0);
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(463);
				storageLocation();
				}
				break;
			}
			setState(466);
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
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				{
				setState(469);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__40:
			case Identifier:
				{
				setState(470);
				userDefinedTypeName();
				}
				break;
			case T__36:
				{
				setState(471);
				mapping();
				}
				break;
			case T__27:
				{
				setState(472);
				functionTypeName();
				}
				break;
			case T__33:
				{
				setState(473);
				match(T__33);
				setState(474);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(485);
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
					setState(477);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(478);
					match(T__31);
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
						{
						setState(479);
						expression(0);
						}
					}

					setState(482);
					match(T__32);
					}
					} 
				}
				setState(487);
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
			setState(488);
			identifier();
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(489);
					match(T__35);
					setState(490);
					identifier();
					}
					} 
				}
				setState(495);
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
			setState(496);
			match(T__36);
			setState(497);
			match(T__20);
			setState(498);
			elementaryTypeName();
			setState(499);
			match(T__37);
			setState(500);
			typeName(0);
			setState(501);
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
			setState(503);
			match(T__27);
			setState(504);
			functionTypeParameterList();
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(508);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(505);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(506);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(507);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(513);
				match(T__28);
				setState(514);
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
			setState(517);
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
			setState(519);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ConstantKeyword - 117)) | (1L << (PayableKeyword - 117)) | (1L << (PureKeyword - 117)) | (1L << (ViewKeyword - 117)))) != 0)) ) {
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
			setState(521);
			match(T__13);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__13 - 4)) | (1L << (T__20 - 4)) | (1L << (T__23 - 4)) | (1L << (T__27 - 4)) | (1L << (T__31 - 4)) | (1L << (T__33 - 4)) | (1L << (T__36 - 4)) | (1L << (T__40 - 4)) | (1L << (T__41 - 4)) | (1L << (T__42 - 4)) | (1L << (T__43 - 4)) | (1L << (T__46 - 4)) | (1L << (T__47 - 4)) | (1L << (T__49 - 4)) | (1L << (T__50 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (BreakKeyword - 103)) | (1L << (ContinueKeyword - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
				{
				{
				setState(522);
				statement();
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
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
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534);
				inlineAssemblyStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(535);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(536);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(537);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(538);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(539);
				throwStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(540);
				emitStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(541);
				simpleStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(542);
				requireStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(543);
				revertStatement();
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
			setState(546);
			match(T__41);
			setState(547);
			match(T__20);
			setState(548);
			expressionList();
			setState(549);
			match(T__21);
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
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).enterRevertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SonamuListener ) ((SonamuListener)listener).exitRevertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SonamuVisitor ) return ((SonamuVisitor<? extends T>)visitor).visitRevertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevertStatementContext revertStatement() throws RecognitionException {
		RevertStatementContext _localctx = new RevertStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_revertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__42);
			setState(553);
			match(T__20);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
				{
				setState(554);
				expression(0);
				}
			}

			setState(557);
			match(T__21);
			setState(558);
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
		enterRule(_localctx, 82, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			expression(0);
			setState(561);
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
		enterRule(_localctx, 84, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__43);
			setState(564);
			match(T__20);
			setState(565);
			expression(0);
			setState(566);
			match(T__21);
			setState(567);
			statement();
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(568);
				match(T__44);
				setState(569);
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
		enterRule(_localctx, 86, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__20);
			setState(573);
			expression(0);
			setState(574);
			match(T__21);
			setState(575);
			match(T__45);
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
		enterRule(_localctx, 88, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(578);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(579);
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
		enterRule(_localctx, 90, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T__23);
			setState(583);
			match(T__20);
			setState(586);
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
			case T__64:
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
				setState(584);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(585);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__31:
			case T__40:
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
			case T__64:
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
				setState(588);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(589);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
				{
				setState(592);
				expression(0);
				}
			}

			setState(595);
			match(T__21);
			setState(596);
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
		enterRule(_localctx, 92, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__46);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(599);
				match(StringLiteral);
				}
			}

			setState(602);
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
		enterRule(_localctx, 94, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(T__47);
			setState(605);
			statement();
			setState(606);
			match(T__48);
			setState(607);
			match(T__20);
			setState(608);
			expression(0);
			setState(609);
			match(T__21);
			setState(610);
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
		enterRule(_localctx, 96, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(ContinueKeyword);
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
		enterRule(_localctx, 98, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(BreakKeyword);
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
		enterRule(_localctx, 100, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(T__49);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
				{
				setState(619);
				expression(0);
				}
			}

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
		enterRule(_localctx, 102, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__50);
			setState(625);
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
		enterRule(_localctx, 104, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			functionCall();
			setState(628);
			match(T__51);
			setState(629);
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
		enterRule(_localctx, 106, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(631);
				match(T__52);
				setState(632);
				identifierList();
				}
				break;
			case 2:
				{
				setState(633);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(634);
				match(T__20);
				setState(635);
				variableDeclarationList();
				setState(636);
				match(T__21);
				}
				break;
			}
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(640);
				match(T__8);
				setState(641);
				expression(0);
				}
			}

			setState(644);
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
		enterRule(_localctx, 108, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(646);
				variableDeclaration();
				}
			}

			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(649);
				match(T__14);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__36) | (1L << T__40) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
					{
					setState(650);
					variableDeclaration();
					}
				}

				}
				}
				setState(657);
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
		enterRule(_localctx, 110, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(T__20);
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__40 || _la==Identifier) {
						{
						setState(659);
						identifier();
						}
					}

					setState(662);
					match(T__14);
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(668);
				identifier();
				}
			}

			setState(671);
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
		enterRule(_localctx, 112, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (T__52 - 53)) | (1L << (T__53 - 53)) | (1L << (T__54 - 53)) | (1L << (T__55 - 53)) | (1L << (T__56 - 53)) | (1L << (Int - 53)) | (1L << (Uint - 53)) | (1L << (Byte - 53)) | (1L << (Fixed - 53)) | (1L << (Ufixed - 53)))) != 0)) ) {
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(676);
				match(T__59);
				setState(677);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(678);
				match(T__20);
				setState(679);
				expression(0);
				setState(680);
				match(T__21);
				}
				break;
			case 3:
				{
				setState(682);
				match(T__57);
				setState(683);
				expression(40);
				}
				break;
			case 4:
				{
				setState(684);
				match(T__58);
				setState(685);
				expression(39);
				}
				break;
			case 5:
				{
				setState(686);
				match(T__60);
				setState(687);
				expression(38);
				}
				break;
			case 6:
				{
				setState(688);
				match(T__61);
				setState(689);
				expression(37);
				}
				break;
			case 7:
				{
				setState(690);
				match(T__62);
				setState(691);
				expression(36);
				}
				break;
			case 8:
				{
				setState(692);
				match(T__63);
				setState(693);
				expression(35);
				}
				break;
			case 9:
				{
				setState(694);
				match(T__64);
				setState(695);
				expression(34);
				}
				break;
			case 10:
				{
				setState(696);
				match(T__3);
				setState(697);
				expression(33);
				}
				break;
			case 11:
				{
				setState(698);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(814);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(702);
						match(T__65);
						setState(703);
						expression(33);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(705);
						match(T__11);
						setState(706);
						expression(32);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(707);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(708);
						match(T__66);
						setState(709);
						expression(31);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(710);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(711);
						match(T__67);
						setState(712);
						expression(30);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(714);
						match(T__60);
						setState(715);
						expression(29);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(716);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(717);
						match(T__61);
						setState(718);
						expression(28);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(719);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(720);
						match(T__68);
						setState(721);
						expression(27);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(722);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(723);
						match(T__69);
						setState(724);
						expression(26);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(725);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(726);
						match(T__70);
						setState(727);
						expression(25);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(728);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(729);
						match(T__2);
						setState(730);
						expression(24);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(731);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(732);
						match(T__71);
						setState(733);
						expression(23);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(734);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(735);
						match(T__6);
						setState(736);
						expression(22);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(737);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(738);
						match(T__5);
						setState(739);
						expression(21);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(740);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(741);
						match(T__7);
						setState(742);
						expression(20);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(743);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(744);
						match(T__4);
						setState(745);
						expression(19);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(746);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(747);
						match(T__72);
						setState(748);
						expression(18);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(749);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(750);
						match(T__73);
						setState(751);
						expression(17);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(752);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(753);
						match(T__74);
						setState(754);
						expression(16);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(755);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(756);
						match(T__75);
						setState(757);
						expression(15);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(758);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(759);
						match(T__8);
						setState(760);
						expression(14);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(761);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(762);
						match(T__76);
						setState(763);
						expression(13);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(764);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(765);
						match(T__77);
						setState(766);
						expression(12);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(767);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(768);
						match(T__78);
						setState(769);
						expression(11);
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(770);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(771);
						match(T__79);
						setState(772);
						expression(10);
						}
						break;
					case 25:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(773);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(774);
						match(T__80);
						setState(775);
						expression(9);
						}
						break;
					case 26:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(776);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(777);
						match(T__81);
						setState(778);
						expression(8);
						}
						break;
					case 27:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(779);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(780);
						match(T__82);
						setState(781);
						expression(7);
						}
						break;
					case 28:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(782);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(783);
						match(T__83);
						setState(784);
						expression(6);
						}
						break;
					case 29:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(785);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(786);
						match(T__84);
						setState(787);
						expression(5);
						}
						break;
					case 30:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(788);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(789);
						match(T__85);
						setState(790);
						expression(4);
						}
						break;
					case 31:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(791);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(792);
						match(T__86);
						setState(793);
						expression(0);
						setState(794);
						match(T__87);
						setState(795);
						expression(3);
						}
						break;
					case 32:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(797);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(798);
						match(T__57);
						}
						break;
					case 33:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(799);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(800);
						match(T__58);
						}
						break;
					case 34:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(801);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(802);
						match(T__31);
						setState(803);
						expression(0);
						setState(804);
						match(T__32);
						}
						break;
					case 35:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(806);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(807);
						match(T__20);
						setState(808);
						functionCallArguments();
						setState(809);
						match(T__21);
						}
						break;
					case 36:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(811);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(812);
						match(T__35);
						setState(813);
						identifier();
						}
						break;
					}
					} 
				}
				setState(818);
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
		enterRule(_localctx, 116, RULE_primaryExpression);
		try {
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				identifier();
				setState(826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(824);
					match(T__31);
					setState(825);
					match(T__32);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(828);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(829);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(830);
				typeNameExpression();
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(831);
					match(T__31);
					setState(832);
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
		enterRule(_localctx, 118, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			expression(0);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(838);
				match(T__14);
				setState(839);
				expression(0);
				}
				}
				setState(844);
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
		enterRule(_localctx, 120, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			nameValue();
			setState(850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(846);
					match(T__14);
					setState(847);
					nameValue();
					}
					} 
				}
				setState(852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(853);
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
		enterRule(_localctx, 122, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			identifier();
			setState(857);
			match(T__87);
			setState(858);
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
		enterRule(_localctx, 124, RULE_functionCallArguments);
		int _la;
		try {
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				match(T__13);
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__40 || _la==Identifier) {
					{
					setState(861);
					nameValueList();
					}
				}

				setState(864);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__21:
			case T__31:
			case T__40:
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
			case T__64:
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
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
					{
					setState(865);
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
		enterRule(_localctx, 126, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			expression(0);
			setState(871);
			match(T__20);
			setState(872);
			functionCallArguments();
			setState(873);
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
		enterRule(_localctx, 128, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(T__13);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__40) | (1L << T__46))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__89 - 89)) | (1L << (T__90 - 89)) | (1L << (T__91 - 89)) | (1L << (T__93 - 89)) | (1L << (T__94 - 89)) | (1L << (T__97 - 89)) | (1L << (T__99 - 89)) | (1L << (DecimalNumber - 89)) | (1L << (HexNumber - 89)) | (1L << (HexLiteral - 89)) | (1L << (BreakKeyword - 89)) | (1L << (ContinueKeyword - 89)) | (1L << (Identifier - 89)) | (1L << (StringLiteral - 89)))) != 0)) {
				{
				{
				setState(876);
				assemblyItem();
				}
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(882);
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
		enterRule(_localctx, 130, RULE_assemblyItem);
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(886);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(887);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(888);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(889);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(890);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(891);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(892);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(893);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(894);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(895);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(896);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(897);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(898);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(899);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(900);
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
		enterRule(_localctx, 132, RULE_assemblyExpression);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__40:
			case T__88:
			case T__89:
			case T__90:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
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
		enterRule(_localctx, 134, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__88:
				{
				setState(907);
				match(T__88);
				}
				break;
			case T__89:
				{
				setState(908);
				match(T__89);
				}
				break;
			case T__90:
				{
				setState(909);
				match(T__90);
				}
				break;
			case T__12:
			case T__40:
			case Identifier:
				{
				setState(910);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(913);
				match(T__20);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__40 || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__89 - 89)) | (1L << (T__90 - 89)) | (1L << (DecimalNumber - 89)) | (1L << (HexNumber - 89)) | (1L << (HexLiteral - 89)) | (1L << (Identifier - 89)) | (1L << (StringLiteral - 89)))) != 0)) {
					{
					setState(914);
					assemblyExpression();
					}
				}

				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(917);
					match(T__14);
					setState(918);
					assemblyExpression();
					}
					}
					setState(923);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(924);
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
		enterRule(_localctx, 136, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(T__91);
			setState(928);
			assemblyIdentifierOrList();
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__92) {
				{
				setState(929);
				match(T__92);
				setState(930);
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
		enterRule(_localctx, 138, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			assemblyIdentifierOrList();
			setState(934);
			match(T__92);
			setState(935);
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
		enterRule(_localctx, 140, RULE_assemblyIdentifierOrList);
		try {
			setState(942);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				identifier();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(T__20);
				setState(939);
				assemblyIdentifierList();
				setState(940);
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
		enterRule(_localctx, 142, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			identifier();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(945);
				match(T__14);
				setState(946);
				identifier();
				}
				}
				setState(951);
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
		enterRule(_localctx, 144, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(T__93);
			setState(953);
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
		enterRule(_localctx, 146, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			identifier();
			setState(956);
			match(T__87);
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
		enterRule(_localctx, 148, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(T__94);
			setState(959);
			assemblyExpression();
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__95 || _la==T__96) {
				{
				{
				setState(960);
				assemblyCase();
				}
				}
				setState(965);
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
		enterRule(_localctx, 150, RULE_assemblyCase);
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__95:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				match(T__95);
				setState(967);
				assemblyLiteral();
				setState(968);
				assemblyBlock();
				}
				break;
			case T__96:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(T__96);
				setState(971);
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
		enterRule(_localctx, 152, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(T__97);
			setState(975);
			identifier();
			setState(976);
			match(T__20);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__40 || _la==Identifier) {
				{
				setState(977);
				assemblyIdentifierList();
				}
			}

			setState(980);
			match(T__21);
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__98) {
				{
				setState(981);
				assemblyFunctionReturns();
				}
			}

			setState(984);
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
		enterRule(_localctx, 154, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(986);
			match(T__98);
			setState(987);
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
		enterRule(_localctx, 156, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(T__23);
			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(990);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__40:
			case T__88:
			case T__89:
			case T__90:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(991);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(994);
			assemblyExpression();
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
			case T__40:
			case T__88:
			case T__89:
			case T__90:
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
		enterRule(_localctx, 158, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(T__99);
			setState(1002);
			assemblyExpression();
			setState(1003);
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
		enterRule(_localctx, 160, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (DecimalNumber - 110)) | (1L << (HexNumber - 110)) | (1L << (HexLiteral - 110)) | (1L << (StringLiteral - 110)))) != 0)) ) {
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
		enterRule(_localctx, 162, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(T__46);
			setState(1008);
			identifier();
			setState(1009);
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
		enterRule(_localctx, 164, RULE_tupleExpression);
		int _la;
		try {
			setState(1037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				match(T__20);
				{
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
					{
					setState(1012);
					expression(0);
					}
				}

				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1015);
					match(T__14);
					setState(1017);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
						{
						setState(1016);
						expression(0);
						}
					}

					}
					}
					setState(1023);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1024);
				match(T__21);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				match(T__31);
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__12 - 4)) | (1L << (T__20 - 4)) | (1L << (T__31 - 4)) | (1L << (T__40 - 4)) | (1L << (T__52 - 4)) | (1L << (T__53 - 4)) | (1L << (T__54 - 4)) | (1L << (T__55 - 4)) | (1L << (T__56 - 4)) | (1L << (T__57 - 4)) | (1L << (T__58 - 4)) | (1L << (T__59 - 4)) | (1L << (T__60 - 4)) | (1L << (T__61 - 4)) | (1L << (T__62 - 4)) | (1L << (T__63 - 4)) | (1L << (T__64 - 4)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
					{
					setState(1026);
					expression(0);
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(1027);
						match(T__14);
						setState(1028);
						expression(0);
						}
						}
						setState(1033);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1036);
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
		enterRule(_localctx, 166, RULE_typeNameExpression);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
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
		enterRule(_localctx, 168, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1044);
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
		enterRule(_localctx, 170, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
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
		case 57:
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
		"\u0004\u0001\u0084\u041a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"T\u0002U\u0007U\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00b0"+
		"\b\u0000\n\u0000\f\u0000\u00b3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00bd\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00c1\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0003\u0005\u00c6\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cd\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d3\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d9\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00dd\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00e7\b\u0007\n\u0007\f\u0007\u00ea\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f1\b\u0007\u0001\b"+
		"\u0001\b\u0001\t\u0003\t\u00f6\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00fe\b\t\n\t\f\t\u0101\t\t\u0003\t\u0103\b\t\u0001"+
		"\t\u0001\t\u0005\t\u0107\b\t\n\t\f\t\u010a\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u0111\b\n\u0001\n\u0003\n\u0114\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u011e\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u0123\b\f\n\f\f\f\u0126\t\f\u0001\f\u0001\f\u0003\f\u012a\b\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0133\b\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u013f\b\u000e\n\u000e"+
		"\f\u000e\u0142\t\u000e\u0003\u000e\u0144\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0150\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0157\b\u0011\u0001\u0011"+
		"\u0003\u0011\u015a\b\u0011\u0001\u0012\u0003\u0012\u015d\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0161\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0166\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u016a"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0175\b\u0014\n"+
		"\u0014\f\u0014\u0178\t\u0014\u0001\u0015\u0003\u0015\u017b\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0181\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u018b\b\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u018f\b\u0017\n\u0017\f\u0017\u0192\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u019a\b\u0018"+
		"\n\u0018\f\u0018\u019d\t\u0018\u0003\u0018\u019f\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01a5\b\u0019\u0001\u0019\u0003"+
		"\u0019\u01a8\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u01ae\b\u001a\n\u001a\f\u001a\u01b1\t\u001a\u0003\u001a\u01b3\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u01b9"+
		"\b\u001b\u0001\u001b\u0003\u001b\u01bc\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u01c2\b\u001c\n\u001c\f\u001c\u01c5"+
		"\t\u001c\u0003\u001c\u01c7\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01cd\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01d1\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01dc\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e1\b\u001f\u0001\u001f"+
		"\u0005\u001f\u01e4\b\u001f\n\u001f\f\u001f\u01e7\t\u001f\u0001 \u0001"+
		" \u0001 \u0005 \u01ec\b \n \f \u01ef\t \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01fd"+
		"\b\"\n\"\f\"\u0200\t\"\u0001\"\u0001\"\u0003\"\u0204\b\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0001%\u0005%\u020c\b%\n%\f%\u020f\t%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u0221\b&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0003(\u022c\b(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u023b\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0003,\u0245\b,\u0001-\u0001-\u0001-\u0001-\u0003-\u024b\b-\u0001"+
		"-\u0001-\u0003-\u024f\b-\u0001-\u0003-\u0252\b-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0003.\u0259\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
		"2\u00012\u00032\u026d\b2\u00012\u00012\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u027f\b5\u00015\u00015\u00035\u0283\b5\u00015\u00015\u00016\u00036\u0288"+
		"\b6\u00016\u00016\u00036\u028c\b6\u00056\u028e\b6\n6\f6\u0291\t6\u0001"+
		"7\u00017\u00037\u0295\b7\u00017\u00057\u0298\b7\n7\f7\u029b\t7\u00017"+
		"\u00037\u029e\b7\u00017\u00017\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00039\u02bc\b9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00059\u032f\b9\n9\f9\u0332\t9\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u033b\b:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u0342\b:\u0003:\u0344\b:\u0001;\u0001;\u0001"+
		";\u0005;\u0349\b;\n;\f;\u034c\t;\u0001<\u0001<\u0001<\u0005<\u0351\b<"+
		"\n<\f<\u0354\t<\u0001<\u0003<\u0357\b<\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0003>\u035f\b>\u0001>\u0001>\u0003>\u0363\b>\u0003>\u0365\b"+
		">\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0005@\u036e\b@\n@"+
		"\f@\u0371\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u0386\bA\u0001B\u0001B\u0003B\u038a\bB\u0001C\u0001C\u0001C\u0001"+
		"C\u0003C\u0390\bC\u0001C\u0001C\u0003C\u0394\bC\u0001C\u0001C\u0005C\u0398"+
		"\bC\nC\fC\u039b\tC\u0001C\u0003C\u039e\bC\u0001D\u0001D\u0001D\u0001D"+
		"\u0003D\u03a4\bD\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0003F\u03af\bF\u0001G\u0001G\u0001G\u0005G\u03b4\bG\nG\fG\u03b7"+
		"\tG\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0005"+
		"J\u03c2\bJ\nJ\fJ\u03c5\tJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003"+
		"K\u03cd\bK\u0001L\u0001L\u0001L\u0001L\u0003L\u03d3\bL\u0001L\u0001L\u0003"+
		"L\u03d7\bL\u0001L\u0001L\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0003"+
		"N\u03e1\bN\u0001N\u0001N\u0001N\u0003N\u03e6\bN\u0001N\u0001N\u0001O\u0001"+
		"O\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0003R\u03f6\bR\u0001R\u0001R\u0003R\u03fa\bR\u0005R\u03fc\bR\nR\fR"+
		"\u03ff\tR\u0001R\u0001R\u0001R\u0001R\u0001R\u0005R\u0406\bR\nR\fR\u0409"+
		"\tR\u0003R\u040b\bR\u0001R\u0003R\u040e\bR\u0001S\u0001S\u0003S\u0412"+
		"\bS\u0001T\u0001T\u0003T\u0416\bT\u0001U\u0001U\u0001U\u0000\u0002>rV"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u0000\n\u0001\u0000\u0003"+
		"\t\u0001\u0000ef\u0001\u0000\u0011\u0013\u0003\u0000uuyy{|\u0001\u0000"+
		"\')\u0004\u0000uuzz}}\u007f\u007f\u0002\u000059gk\u0003\u0000noqq\u0081"+
		"\u0081\u0001\u0000no\u0003\u0000\r\r))\u0080\u0080\u048f\u0000\u00b1\u0001"+
		"\u0000\u0000\u0000\u0002\u00b6\u0001\u0000\u0000\u0000\u0004\u00bc\u0001"+
		"\u0000\u0000\u0000\u0006\u00be\u0001\u0000\u0000\u0000\b\u00c2\u0001\u0000"+
		"\u0000\u0000\n\u00c5\u0001\u0000\u0000\u0000\f\u00c9\u0001\u0000\u0000"+
		"\u0000\u000e\u00f0\u0001\u0000\u0000\u0000\u0010\u00f2\u0001\u0000\u0000"+
		"\u0000\u0012\u00f5\u0001\u0000\u0000\u0000\u0014\u010d\u0001\u0000\u0000"+
		"\u0000\u0016\u011d\u0001\u0000\u0000\u0000\u0018\u011f\u0001\u0000\u0000"+
		"\u0000\u001a\u012d\u0001\u0000\u0000\u0000\u001c\u0136\u0001\u0000\u0000"+
		"\u0000\u001e\u0147\u0001\u0000\u0000\u0000 \u014c\u0001\u0000\u0000\u0000"+
		"\"\u0153\u0001\u0000\u0000\u0000$\u015c\u0001\u0000\u0000\u0000&\u016b"+
		"\u0001\u0000\u0000\u0000(\u0176\u0001\u0000\u0000\u0000*\u017a\u0001\u0000"+
		"\u0000\u0000,\u0184\u0001\u0000\u0000\u0000.\u0186\u0001\u0000\u0000\u0000"+
		"0\u0195\u0001\u0000\u0000\u00002\u01a2\u0001\u0000\u0000\u00004\u01a9"+
		"\u0001\u0000\u0000\u00006\u01b6\u0001\u0000\u0000\u00008\u01bd\u0001\u0000"+
		"\u0000\u0000:\u01ca\u0001\u0000\u0000\u0000<\u01ce\u0001\u0000\u0000\u0000"+
		">\u01db\u0001\u0000\u0000\u0000@\u01e8\u0001\u0000\u0000\u0000B\u01f0"+
		"\u0001\u0000\u0000\u0000D\u01f7\u0001\u0000\u0000\u0000F\u0205\u0001\u0000"+
		"\u0000\u0000H\u0207\u0001\u0000\u0000\u0000J\u0209\u0001\u0000\u0000\u0000"+
		"L\u0220\u0001\u0000\u0000\u0000N\u0222\u0001\u0000\u0000\u0000P\u0228"+
		"\u0001\u0000\u0000\u0000R\u0230\u0001\u0000\u0000\u0000T\u0233\u0001\u0000"+
		"\u0000\u0000V\u023c\u0001\u0000\u0000\u0000X\u0244\u0001\u0000\u0000\u0000"+
		"Z\u0246\u0001\u0000\u0000\u0000\\\u0256\u0001\u0000\u0000\u0000^\u025c"+
		"\u0001\u0000\u0000\u0000`\u0264\u0001\u0000\u0000\u0000b\u0267\u0001\u0000"+
		"\u0000\u0000d\u026a\u0001\u0000\u0000\u0000f\u0270\u0001\u0000\u0000\u0000"+
		"h\u0273\u0001\u0000\u0000\u0000j\u027e\u0001\u0000\u0000\u0000l\u0287"+
		"\u0001\u0000\u0000\u0000n\u0292\u0001\u0000\u0000\u0000p\u02a1\u0001\u0000"+
		"\u0000\u0000r\u02bb\u0001\u0000\u0000\u0000t\u0343\u0001\u0000\u0000\u0000"+
		"v\u0345\u0001\u0000\u0000\u0000x\u034d\u0001\u0000\u0000\u0000z\u0358"+
		"\u0001\u0000\u0000\u0000|\u0364\u0001\u0000\u0000\u0000~\u0366\u0001\u0000"+
		"\u0000\u0000\u0080\u036b\u0001\u0000\u0000\u0000\u0082\u0385\u0001\u0000"+
		"\u0000\u0000\u0084\u0389\u0001\u0000\u0000\u0000\u0086\u038f\u0001\u0000"+
		"\u0000\u0000\u0088\u039f\u0001\u0000\u0000\u0000\u008a\u03a5\u0001\u0000"+
		"\u0000\u0000\u008c\u03ae\u0001\u0000\u0000\u0000\u008e\u03b0\u0001\u0000"+
		"\u0000\u0000\u0090\u03b8\u0001\u0000\u0000\u0000\u0092\u03bb\u0001\u0000"+
		"\u0000\u0000\u0094\u03be\u0001\u0000\u0000\u0000\u0096\u03cc\u0001\u0000"+
		"\u0000\u0000\u0098\u03ce\u0001\u0000\u0000\u0000\u009a\u03da\u0001\u0000"+
		"\u0000\u0000\u009c\u03dd\u0001\u0000\u0000\u0000\u009e\u03e9\u0001\u0000"+
		"\u0000\u0000\u00a0\u03ed\u0001\u0000\u0000\u0000\u00a2\u03ef\u0001\u0000"+
		"\u0000\u0000\u00a4\u040d\u0001\u0000\u0000\u0000\u00a6\u0411\u0001\u0000"+
		"\u0000\u0000\u00a8\u0413\u0001\u0000\u0000\u0000\u00aa\u0417\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b0\u0003\u0002\u0001\u0000\u00ad\u00b0\u0003\u000e"+
		"\u0007\u0000\u00ae\u00b0\u0003\u0012\t\u0000\u00af\u00ac\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0000\u0000"+
		"\u0001\u00b5\u0001\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0001\u0000"+
		"\u0000\u00b7\u00b8\u0003\u0004\u0002\u0000\u00b8\u00b9\u0005\u0002\u0000"+
		"\u0000\u00b9\u0003\u0001\u0000\u0000\u0000\u00ba\u00bd\u0003\u0006\u0003"+
		"\u0000\u00bb\u00bd\u0003r9\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u0005\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0003\n\u0005\u0000\u00bf\u00c1\u0003\n\u0005\u0000\u00c0\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u0007"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0007\u0000\u0000\u0000\u00c3\t\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c6\u0003\b\u0004\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0005l\u0000\u0000\u00c8\u000b\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cc\u0003\u00aaU\u0000\u00ca\u00cb\u0005\n\u0000\u0000"+
		"\u00cb\u00cd\u0003\u00aaU\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\r\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005\u000b\u0000\u0000\u00cf\u00d2\u0005\u0081\u0000\u0000\u00d0\u00d1"+
		"\u0005\n\u0000\u0000\u00d1\u00d3\u0003\u00aaU\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00f1\u0005\u0002\u0000\u0000\u00d5\u00d8\u0005"+
		"\u000b\u0000\u0000\u00d6\u00d9\u0005\f\u0000\u0000\u00d7\u00d9\u0003\u00aa"+
		"U\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000"+
		"\u00db\u00dd\u0003\u00aaU\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005\r\u0000\u0000\u00df\u00e0\u0005\u0081\u0000\u0000\u00e0\u00f1"+
		"\u0005\u0002\u0000\u0000\u00e1\u00e2\u0005\u000b\u0000\u0000\u00e2\u00e3"+
		"\u0005\u000e\u0000\u0000\u00e3\u00e8\u0003\f\u0006\u0000\u00e4\u00e5\u0005"+
		"\u000f\u0000\u0000\u00e5\u00e7\u0003\f\u0006\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0010"+
		"\u0000\u0000\u00ec\u00ed\u0005\r\u0000\u0000\u00ed\u00ee\u0005\u0081\u0000"+
		"\u0000\u00ee\u00ef\u0005\u0002\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ce\u0001\u0000\u0000\u0000\u00f0\u00d5\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e1\u0001\u0000\u0000\u0000\u00f1\u000f\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0007\u0001\u0000\u0000\u00f3\u0011\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0003\u0010\b\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0003\u00aaU\u0000\u00f8\u0102\u0007\u0002\u0000\u0000\u00f9"+
		"\u00fa\u0005\u0014\u0000\u0000\u00fa\u00ff\u0003\u0014\n\u0000\u00fb\u00fc"+
		"\u0005\u000f\u0000\u0000\u00fc\u00fe\u0003\u0014\n\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0103\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u00f9\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0108\u0005\u000e\u0000\u0000\u0105\u0107\u0003"+
		"\u0016\u000b\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010a\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005\u0010\u0000\u0000\u010c\u0013\u0001"+
		"\u0000\u0000\u0000\u010d\u0113\u0003@ \u0000\u010e\u0110\u0005\u0015\u0000"+
		"\u0000\u010f\u0111\u0003v;\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0114\u0005\u0016\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0001\u0000\u0000\u0000\u0114\u0015\u0001\u0000\u0000\u0000\u0115"+
		"\u011e\u0003\u0018\f\u0000\u0116\u011e\u0003\u001a\r\u0000\u0117\u011e"+
		"\u0003\u001c\u000e\u0000\u0118\u011e\u0003\u001e\u000f\u0000\u0119\u011e"+
		"\u0003 \u0010\u0000\u011a\u011e\u0003$\u0012\u0000\u011b\u011e\u0003*"+
		"\u0015\u0000\u011c\u011e\u0003.\u0017\u0000\u011d\u0115\u0001\u0000\u0000"+
		"\u0000\u011d\u0116\u0001\u0000\u0000\u0000\u011d\u0117\u0001\u0000\u0000"+
		"\u0000\u011d\u0118\u0001\u0000\u0000\u0000\u011d\u0119\u0001\u0000\u0000"+
		"\u0000\u011d\u011a\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0017\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0003>\u001f\u0000\u0120\u0124\u0003\u00aaU\u0000\u0121"+
		"\u0123\u0007\u0003\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0129\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u0128\u0005\t\u0000\u0000\u0128\u012a"+
		"\u0003r9\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0002"+
		"\u0000\u0000\u012c\u0019\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0017"+
		"\u0000\u0000\u012e\u012f\u0003\u00aaU\u0000\u012f\u0132\u0005\u0018\u0000"+
		"\u0000\u0130\u0133\u0005\f\u0000\u0000\u0131\u0133\u0003>\u001f\u0000"+
		"\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0002\u0000\u0000"+
		"\u0135\u001b\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0019\u0000\u0000"+
		"\u0137\u0138\u0003\u00aaU\u0000\u0138\u0143\u0005\u000e\u0000\u0000\u0139"+
		"\u013a\u0003<\u001e\u0000\u013a\u0140\u0005\u0002\u0000\u0000\u013b\u013c"+
		"\u0003<\u001e\u0000\u013c\u013d\u0005\u0002\u0000\u0000\u013d\u013f\u0001"+
		"\u0000\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013f\u0142\u0001"+
		"\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0143\u0139\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"\u0010\u0000\u0000\u0146\u001d\u0001\u0000\u0000\u0000\u0147\u0148\u0005"+
		"\u001a\u0000\u0000\u0148\u0149\u00030\u0018\u0000\u0149\u014a\u0003(\u0014"+
		"\u0000\u014a\u014b\u0003J%\u0000\u014b\u001f\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0005\u001b\u0000\u0000\u014d\u014f\u0003\u00aaU\u0000\u014e\u0150"+
		"\u00030\u0018\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0003"+
		"J%\u0000\u0152!\u0001\u0000\u0000\u0000\u0153\u0159\u0003\u00aaU\u0000"+
		"\u0154\u0156\u0005\u0015\u0000\u0000\u0155\u0157\u0003v;\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u0158\u015a\u0005\u0016\u0000\u0000\u0159\u0154"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a#\u0001"+
		"\u0000\u0000\u0000\u015b\u015d\u0003\u0010\b\u0000\u015c\u015b\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u0160\u0005\u001c\u0000\u0000\u015f\u0161\u0003\u00aa"+
		"U\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u00030\u0018\u0000"+
		"\u0163\u0165\u0003(\u0014\u0000\u0164\u0166\u0003&\u0013\u0000\u0165\u0164"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0169"+
		"\u0001\u0000\u0000\u0000\u0167\u016a\u0005\u0002\u0000\u0000\u0168\u016a"+
		"\u0003J%\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000"+
		"\u0000\u0000\u016a%\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u001d\u0000"+
		"\u0000\u016c\u016d\u00030\u0018\u0000\u016d\'\u0001\u0000\u0000\u0000"+
		"\u016e\u0175\u0003\"\u0011\u0000\u016f\u0175\u0003H$\u0000\u0170\u0175"+
		"\u0005w\u0000\u0000\u0171\u0175\u0005|\u0000\u0000\u0172\u0175\u0005y"+
		"\u0000\u0000\u0173\u0175\u0005{\u0000\u0000\u0174\u016e\u0001\u0000\u0000"+
		"\u0000\u0174\u016f\u0001\u0000\u0000\u0000\u0174\u0170\u0001\u0000\u0000"+
		"\u0000\u0174\u0171\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000"+
		"\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000"+
		"\u0000\u0177)\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000"+
		"\u0179\u017b\u0003\u0010\b\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0003\u00aaU\u0000\u017d\u017e\u0005\u001e\u0000\u0000\u017e\u0180"+
		"\u00034\u001a\u0000\u017f\u0181\u0005s\u0000\u0000\u0180\u017f\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0005\u0002\u0000\u0000\u0183+\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0003\u00aaU\u0000\u0185-\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0005\u001f\u0000\u0000\u0187\u0188\u0003\u00aaU\u0000\u0188\u018a"+
		"\u0005\u000e\u0000\u0000\u0189\u018b\u0003,\u0016\u0000\u018a\u0189\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u0190\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0005\u000f\u0000\u0000\u018d\u018f\u0003"+
		",\u0016\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005\u0010\u0000\u0000\u0194/\u0001\u0000\u0000"+
		"\u0000\u0195\u019e\u0005\u0015\u0000\u0000\u0196\u019b\u00032\u0019\u0000"+
		"\u0197\u0198\u0005\u000f\u0000\u0000\u0198\u019a\u00032\u0019\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b"+
		"\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e"+
		"\u0196\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0016\u0000\u0000\u01a1"+
		"1\u0001\u0000\u0000\u0000\u01a2\u01a4\u0003>\u001f\u0000\u01a3\u01a5\u0003"+
		"F#\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003\u00aaU\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a83\u0001\u0000\u0000\u0000\u01a9\u01b2\u0005\u0015\u0000\u0000\u01aa"+
		"\u01af\u00036\u001b\u0000\u01ab\u01ac\u0005\u000f\u0000\u0000\u01ac\u01ae"+
		"\u00036\u001b\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001"+
		"\u0000\u0000\u0000\u01b2\u01aa\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005"+
		"\u0016\u0000\u0000\u01b55\u0001\u0000\u0000\u0000\u01b6\u01b8\u0003>\u001f"+
		"\u0000\u01b7\u01b9\u0005x\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bc\u0003\u00aaU\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bc7\u0001\u0000\u0000\u0000\u01bd\u01c6"+
		"\u0005\u0015\u0000\u0000\u01be\u01c3\u0003:\u001d\u0000\u01bf\u01c0\u0005"+
		"\u000f\u0000\u0000\u01c0\u01c2\u0003:\u001d\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01be\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0005\u0016\u0000\u0000\u01c99\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cc\u0003>\u001f\u0000\u01cb\u01cd\u0003F#\u0000\u01cc"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd"+
		";\u0001\u0000\u0000\u0000\u01ce\u01d0\u0003>\u001f\u0000\u01cf\u01d1\u0003"+
		"F#\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0003\u00aaU\u0000"+
		"\u01d3=\u0001\u0000\u0000\u0000\u01d4\u01d5\u0006\u001f\uffff\uffff\u0000"+
		"\u01d5\u01dc\u0003p8\u0000\u01d6\u01dc\u0003@ \u0000\u01d7\u01dc\u0003"+
		"B!\u0000\u01d8\u01dc\u0003D\"\u0000\u01d9\u01da\u0005\"\u0000\u0000\u01da"+
		"\u01dc\u0005#\u0000\u0000\u01db\u01d4\u0001\u0000\u0000\u0000\u01db\u01d6"+
		"\u0001\u0000\u0000\u0000\u01db\u01d7\u0001\u0000\u0000\u0000\u01db\u01d8"+
		"\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01e5"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\n\u0003\u0000\u0000\u01de\u01e0\u0005"+
		" \u0000\u0000\u01df\u01e1\u0003r9\u0000\u01e0\u01df\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e4\u0005!\u0000\u0000\u01e3\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6?\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e8\u01ed\u0003\u00aaU\u0000\u01e9\u01ea"+
		"\u0005$\u0000\u0000\u01ea\u01ec\u0003\u00aaU\u0000\u01eb\u01e9\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01eeA\u0001\u0000\u0000"+
		"\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005%\u0000\u0000"+
		"\u01f1\u01f2\u0005\u0015\u0000\u0000\u01f2\u01f3\u0003p8\u0000\u01f3\u01f4"+
		"\u0005&\u0000\u0000\u01f4\u01f5\u0003>\u001f\u0000\u01f5\u01f6\u0005\u0016"+
		"\u0000\u0000\u01f6C\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\u001c\u0000"+
		"\u0000\u01f8\u01fe\u00038\u001c\u0000\u01f9\u01fd\u0005y\u0000\u0000\u01fa"+
		"\u01fd\u0005w\u0000\u0000\u01fb\u01fd\u0003H$\u0000\u01fc\u01f9\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0203\u0001"+
		"\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0202\u0005"+
		"\u001d\u0000\u0000\u0202\u0204\u00038\u001c\u0000\u0203\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204E\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0007\u0004\u0000\u0000\u0206G\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0007\u0005\u0000\u0000\u0208I\u0001\u0000\u0000\u0000\u0209"+
		"\u020d\u0005\u000e\u0000\u0000\u020a\u020c\u0003L&\u0000\u020b\u020a\u0001"+
		"\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b\u0001"+
		"\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u0210\u0001"+
		"\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0211\u0005"+
		"\u0010\u0000\u0000\u0211K\u0001\u0000\u0000\u0000\u0212\u0221\u0003T*"+
		"\u0000\u0213\u0221\u0003V+\u0000\u0214\u0221\u0003Z-\u0000\u0215\u0221"+
		"\u0003J%\u0000\u0216\u0221\u0003\\.\u0000\u0217\u0221\u0003^/\u0000\u0218"+
		"\u0221\u0003`0\u0000\u0219\u0221\u0003b1\u0000\u021a\u0221\u0003d2\u0000"+
		"\u021b\u0221\u0003f3\u0000\u021c\u0221\u0003h4\u0000\u021d\u0221\u0003"+
		"X,\u0000\u021e\u0221\u0003N\'\u0000\u021f\u0221\u0003P(\u0000\u0220\u0212"+
		"\u0001\u0000\u0000\u0000\u0220\u0213\u0001\u0000\u0000\u0000\u0220\u0214"+
		"\u0001\u0000\u0000\u0000\u0220\u0215\u0001\u0000\u0000\u0000\u0220\u0216"+
		"\u0001\u0000\u0000\u0000\u0220\u0217\u0001\u0000\u0000\u0000\u0220\u0218"+
		"\u0001\u0000\u0000\u0000\u0220\u0219\u0001\u0000\u0000\u0000\u0220\u021a"+
		"\u0001\u0000\u0000\u0000\u0220\u021b\u0001\u0000\u0000\u0000\u0220\u021c"+
		"\u0001\u0000\u0000\u0000\u0220\u021d\u0001\u0000\u0000\u0000\u0220\u021e"+
		"\u0001\u0000\u0000\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0221M\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0005*\u0000\u0000\u0223\u0224\u0005\u0015"+
		"\u0000\u0000\u0224\u0225\u0003v;\u0000\u0225\u0226\u0005\u0016\u0000\u0000"+
		"\u0226\u0227\u0005\u0002\u0000\u0000\u0227O\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0005+\u0000\u0000\u0229\u022b\u0005\u0015\u0000\u0000\u022a\u022c"+
		"\u0003r9\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000"+
		"\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0005\u0016"+
		"\u0000\u0000\u022e\u022f\u0005\u0002\u0000\u0000\u022fQ\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0003r9\u0000\u0231\u0232\u0005\u0002\u0000\u0000\u0232"+
		"S\u0001\u0000\u0000\u0000\u0233\u0234\u0005,\u0000\u0000\u0234\u0235\u0005"+
		"\u0015\u0000\u0000\u0235\u0236\u0003r9\u0000\u0236\u0237\u0005\u0016\u0000"+
		"\u0000\u0237\u023a\u0003L&\u0000\u0238\u0239\u0005-\u0000\u0000\u0239"+
		"\u023b\u0003L&\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001"+
		"\u0000\u0000\u0000\u023bU\u0001\u0000\u0000\u0000\u023c\u023d\u0005\u0015"+
		"\u0000\u0000\u023d\u023e\u0003r9\u0000\u023e\u023f\u0005\u0016\u0000\u0000"+
		"\u023f\u0240\u0005.\u0000\u0000\u0240\u0241\u0003L&\u0000\u0241W\u0001"+
		"\u0000\u0000\u0000\u0242\u0245\u0003j5\u0000\u0243\u0245\u0003R)\u0000"+
		"\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0243\u0001\u0000\u0000\u0000"+
		"\u0245Y\u0001\u0000\u0000\u0000\u0246\u0247\u0005\u0018\u0000\u0000\u0247"+
		"\u024a\u0005\u0015\u0000\u0000\u0248\u024b\u0003X,\u0000\u0249\u024b\u0005"+
		"\u0002\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u0249\u0001"+
		"\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024f\u0003"+
		"R)\u0000\u024d\u024f\u0005\u0002\u0000\u0000\u024e\u024c\u0001\u0000\u0000"+
		"\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024f\u0251\u0001\u0000\u0000"+
		"\u0000\u0250\u0252\u0003r9\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0005\u0016\u0000\u0000\u0254\u0255\u0003L&\u0000\u0255[\u0001"+
		"\u0000\u0000\u0000\u0256\u0258\u0005/\u0000\u0000\u0257\u0259\u0005\u0081"+
		"\u0000\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000"+
		"\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0003\u0080"+
		"@\u0000\u025b]\u0001\u0000\u0000\u0000\u025c\u025d\u00050\u0000\u0000"+
		"\u025d\u025e\u0003L&\u0000\u025e\u025f\u00051\u0000\u0000\u025f\u0260"+
		"\u0005\u0015\u0000\u0000\u0260\u0261\u0003r9\u0000\u0261\u0262\u0005\u0016"+
		"\u0000\u0000\u0262\u0263\u0005\u0002\u0000\u0000\u0263_\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u0005v\u0000\u0000\u0265\u0266\u0005\u0002\u0000\u0000"+
		"\u0266a\u0001\u0000\u0000\u0000\u0267\u0268\u0005t\u0000\u0000\u0268\u0269"+
		"\u0005\u0002\u0000\u0000\u0269c\u0001\u0000\u0000\u0000\u026a\u026c\u0005"+
		"2\u0000\u0000\u026b\u026d\u0003r9\u0000\u026c\u026b\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0005\u0002\u0000\u0000\u026fe\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u00053\u0000\u0000\u0271\u0272\u0005\u0002\u0000\u0000\u0272"+
		"g\u0001\u0000\u0000\u0000\u0273\u0274\u0003~?\u0000\u0274\u0275\u0005"+
		"4\u0000\u0000\u0275\u0276\u0005\u0002\u0000\u0000\u0276i\u0001\u0000\u0000"+
		"\u0000\u0277\u0278\u00055\u0000\u0000\u0278\u027f\u0003n7\u0000\u0279"+
		"\u027f\u0003<\u001e\u0000\u027a\u027b\u0005\u0015\u0000\u0000\u027b\u027c"+
		"\u0003l6\u0000\u027c\u027d\u0005\u0016\u0000\u0000\u027d\u027f\u0001\u0000"+
		"\u0000\u0000\u027e\u0277\u0001\u0000\u0000\u0000\u027e\u0279\u0001\u0000"+
		"\u0000\u0000\u027e\u027a\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0005\t\u0000\u0000\u0281\u0283\u0003r9\u0000"+
		"\u0282\u0280\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0285\u0005\u0002\u0000\u0000"+
		"\u0285k\u0001\u0000\u0000\u0000\u0286\u0288\u0003<\u001e\u0000\u0287\u0286"+
		"\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u028f"+
		"\u0001\u0000\u0000\u0000\u0289\u028b\u0005\u000f\u0000\u0000\u028a\u028c"+
		"\u0003<\u001e\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028b\u028c\u0001"+
		"\u0000\u0000\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u0289\u0001"+
		"\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001"+
		"\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290m\u0001\u0000"+
		"\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0299\u0005\u0015"+
		"\u0000\u0000\u0293\u0295\u0003\u00aaU\u0000\u0294\u0293\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000"+
		"\u0000\u0296\u0298\u0005\u000f\u0000\u0000\u0297\u0294\u0001\u0000\u0000"+
		"\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000"+
		"\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029c\u029e\u0003\u00aaU\u0000"+
		"\u029d\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0\u0005\u0016\u0000\u0000"+
		"\u02a0o\u0001\u0000\u0000\u0000\u02a1\u02a2\u0007\u0006\u0000\u0000\u02a2"+
		"q\u0001\u0000\u0000\u0000\u02a3\u02a4\u00069\uffff\uffff\u0000\u02a4\u02a5"+
		"\u0005<\u0000\u0000\u02a5\u02bc\u0003>\u001f\u0000\u02a6\u02a7\u0005\u0015"+
		"\u0000\u0000\u02a7\u02a8\u0003r9\u0000\u02a8\u02a9\u0005\u0016\u0000\u0000"+
		"\u02a9\u02bc\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005:\u0000\u0000\u02ab"+
		"\u02bc\u0003r9(\u02ac\u02ad\u0005;\u0000\u0000\u02ad\u02bc\u0003r9\'\u02ae"+
		"\u02af\u0005=\u0000\u0000\u02af\u02bc\u0003r9&\u02b0\u02b1\u0005>\u0000"+
		"\u0000\u02b1\u02bc\u0003r9%\u02b2\u02b3\u0005?\u0000\u0000\u02b3\u02bc"+
		"\u0003r9$\u02b4\u02b5\u0005@\u0000\u0000\u02b5\u02bc\u0003r9#\u02b6\u02b7"+
		"\u0005A\u0000\u0000\u02b7\u02bc\u0003r9\"\u02b8\u02b9\u0005\u0004\u0000"+
		"\u0000\u02b9\u02bc\u0003r9!\u02ba\u02bc\u0003t:\u0000\u02bb\u02a3\u0001"+
		"\u0000\u0000\u0000\u02bb\u02a6\u0001\u0000\u0000\u0000\u02bb\u02aa\u0001"+
		"\u0000\u0000\u0000\u02bb\u02ac\u0001\u0000\u0000\u0000\u02bb\u02ae\u0001"+
		"\u0000\u0000\u0000\u02bb\u02b0\u0001\u0000\u0000\u0000\u02bb\u02b2\u0001"+
		"\u0000\u0000\u0000\u02bb\u02b4\u0001\u0000\u0000\u0000\u02bb\u02b6\u0001"+
		"\u0000\u0000\u0000\u02bb\u02b8\u0001\u0000\u0000\u0000\u02bb\u02ba\u0001"+
		"\u0000\u0000\u0000\u02bc\u0330\u0001\u0000\u0000\u0000\u02bd\u02be\n "+
		"\u0000\u0000\u02be\u02bf\u0005B\u0000\u0000\u02bf\u032f\u0003r9!\u02c0"+
		"\u02c1\n\u001f\u0000\u0000\u02c1\u02c2\u0005\f\u0000\u0000\u02c2\u032f"+
		"\u0003r9 \u02c3\u02c4\n\u001e\u0000\u0000\u02c4\u02c5\u0005C\u0000\u0000"+
		"\u02c5\u032f\u0003r9\u001f\u02c6\u02c7\n\u001d\u0000\u0000\u02c7\u02c8"+
		"\u0005D\u0000\u0000\u02c8\u032f\u0003r9\u001e\u02c9\u02ca\n\u001c\u0000"+
		"\u0000\u02ca\u02cb\u0005=\u0000\u0000\u02cb\u032f\u0003r9\u001d\u02cc"+
		"\u02cd\n\u001b\u0000\u0000\u02cd\u02ce\u0005>\u0000\u0000\u02ce\u032f"+
		"\u0003r9\u001c\u02cf\u02d0\n\u001a\u0000\u0000\u02d0\u02d1\u0005E\u0000"+
		"\u0000\u02d1\u032f\u0003r9\u001b\u02d2\u02d3\n\u0019\u0000\u0000\u02d3"+
		"\u02d4\u0005F\u0000\u0000\u02d4\u032f\u0003r9\u001a\u02d5\u02d6\n\u0018"+
		"\u0000\u0000\u02d6\u02d7\u0005G\u0000\u0000\u02d7\u032f\u0003r9\u0019"+
		"\u02d8\u02d9\n\u0017\u0000\u0000\u02d9\u02da\u0005\u0003\u0000\u0000\u02da"+
		"\u032f\u0003r9\u0018\u02db\u02dc\n\u0016\u0000\u0000\u02dc\u02dd\u0005"+
		"H\u0000\u0000\u02dd\u032f\u0003r9\u0017\u02de\u02df\n\u0015\u0000\u0000"+
		"\u02df\u02e0\u0005\u0007\u0000\u0000\u02e0\u032f\u0003r9\u0016\u02e1\u02e2"+
		"\n\u0014\u0000\u0000\u02e2\u02e3\u0005\u0006\u0000\u0000\u02e3\u032f\u0003"+
		"r9\u0015\u02e4\u02e5\n\u0013\u0000\u0000\u02e5\u02e6\u0005\b\u0000\u0000"+
		"\u02e6\u032f\u0003r9\u0014\u02e7\u02e8\n\u0012\u0000\u0000\u02e8\u02e9"+
		"\u0005\u0005\u0000\u0000\u02e9\u032f\u0003r9\u0013\u02ea\u02eb\n\u0011"+
		"\u0000\u0000\u02eb\u02ec\u0005I\u0000\u0000\u02ec\u032f\u0003r9\u0012"+
		"\u02ed\u02ee\n\u0010\u0000\u0000\u02ee\u02ef\u0005J\u0000\u0000\u02ef"+
		"\u032f\u0003r9\u0011\u02f0\u02f1\n\u000f\u0000\u0000\u02f1\u02f2\u0005"+
		"K\u0000\u0000\u02f2\u032f\u0003r9\u0010\u02f3\u02f4\n\u000e\u0000\u0000"+
		"\u02f4\u02f5\u0005L\u0000\u0000\u02f5\u032f\u0003r9\u000f\u02f6\u02f7"+
		"\n\r\u0000\u0000\u02f7\u02f8\u0005\t\u0000\u0000\u02f8\u032f\u0003r9\u000e"+
		"\u02f9\u02fa\n\f\u0000\u0000\u02fa\u02fb\u0005M\u0000\u0000\u02fb\u032f"+
		"\u0003r9\r\u02fc\u02fd\n\u000b\u0000\u0000\u02fd\u02fe\u0005N\u0000\u0000"+
		"\u02fe\u032f\u0003r9\f\u02ff\u0300\n\n\u0000\u0000\u0300\u0301\u0005O"+
		"\u0000\u0000\u0301\u032f\u0003r9\u000b\u0302\u0303\n\t\u0000\u0000\u0303"+
		"\u0304\u0005P\u0000\u0000\u0304\u032f\u0003r9\n\u0305\u0306\n\b\u0000"+
		"\u0000\u0306\u0307\u0005Q\u0000\u0000\u0307\u032f\u0003r9\t\u0308\u0309"+
		"\n\u0007\u0000\u0000\u0309\u030a\u0005R\u0000\u0000\u030a\u032f\u0003"+
		"r9\b\u030b\u030c\n\u0006\u0000\u0000\u030c\u030d\u0005S\u0000\u0000\u030d"+
		"\u032f\u0003r9\u0007\u030e\u030f\n\u0005\u0000\u0000\u030f\u0310\u0005"+
		"T\u0000\u0000\u0310\u032f\u0003r9\u0006\u0311\u0312\n\u0004\u0000\u0000"+
		"\u0312\u0313\u0005U\u0000\u0000\u0313\u032f\u0003r9\u0005\u0314\u0315"+
		"\n\u0003\u0000\u0000\u0315\u0316\u0005V\u0000\u0000\u0316\u032f\u0003"+
		"r9\u0004\u0317\u0318\n\u0002\u0000\u0000\u0318\u0319\u0005W\u0000\u0000"+
		"\u0319\u031a\u0003r9\u0000\u031a\u031b\u0005X\u0000\u0000\u031b\u031c"+
		"\u0003r9\u0003\u031c\u032f\u0001\u0000\u0000\u0000\u031d\u031e\n/\u0000"+
		"\u0000\u031e\u032f\u0005:\u0000\u0000\u031f\u0320\n.\u0000\u0000\u0320"+
		"\u032f\u0005;\u0000\u0000\u0321\u0322\n,\u0000\u0000\u0322\u0323\u0005"+
		" \u0000\u0000\u0323\u0324\u0003r9\u0000\u0324\u0325\u0005!\u0000\u0000"+
		"\u0325\u032f\u0001\u0000\u0000\u0000\u0326\u0327\n+\u0000\u0000\u0327"+
		"\u0328\u0005\u0015\u0000\u0000\u0328\u0329\u0003|>\u0000\u0329\u032a\u0005"+
		"\u0016\u0000\u0000\u032a\u032f\u0001\u0000\u0000\u0000\u032b\u032c\n*"+
		"\u0000\u0000\u032c\u032d\u0005$\u0000\u0000\u032d\u032f\u0003\u00aaU\u0000"+
		"\u032e\u02bd\u0001\u0000\u0000\u0000\u032e\u02c0\u0001\u0000\u0000\u0000"+
		"\u032e\u02c3\u0001\u0000\u0000\u0000\u032e\u02c6\u0001\u0000\u0000\u0000"+
		"\u032e\u02c9\u0001\u0000\u0000\u0000\u032e\u02cc\u0001\u0000\u0000\u0000"+
		"\u032e\u02cf\u0001\u0000\u0000\u0000\u032e\u02d2\u0001\u0000\u0000\u0000"+
		"\u032e\u02d5\u0001\u0000\u0000\u0000\u032e\u02d8\u0001\u0000\u0000\u0000"+
		"\u032e\u02db\u0001\u0000\u0000\u0000\u032e\u02de\u0001\u0000\u0000\u0000"+
		"\u032e\u02e1\u0001\u0000\u0000\u0000\u032e\u02e4\u0001\u0000\u0000\u0000"+
		"\u032e\u02e7\u0001\u0000\u0000\u0000\u032e\u02ea\u0001\u0000\u0000\u0000"+
		"\u032e\u02ed\u0001\u0000\u0000\u0000\u032e\u02f0\u0001\u0000\u0000\u0000"+
		"\u032e\u02f3\u0001\u0000\u0000\u0000\u032e\u02f6\u0001\u0000\u0000\u0000"+
		"\u032e\u02f9\u0001\u0000\u0000\u0000\u032e\u02fc\u0001\u0000\u0000\u0000"+
		"\u032e\u02ff\u0001\u0000\u0000\u0000\u032e\u0302\u0001\u0000\u0000\u0000"+
		"\u032e\u0305\u0001\u0000\u0000\u0000\u032e\u0308\u0001\u0000\u0000\u0000"+
		"\u032e\u030b\u0001\u0000\u0000\u0000\u032e\u030e\u0001\u0000\u0000\u0000"+
		"\u032e\u0311\u0001\u0000\u0000\u0000\u032e\u0314\u0001\u0000\u0000\u0000"+
		"\u032e\u0317\u0001\u0000\u0000\u0000\u032e\u031d\u0001\u0000\u0000\u0000"+
		"\u032e\u031f\u0001\u0000\u0000\u0000\u032e\u0321\u0001\u0000\u0000\u0000"+
		"\u032e\u0326\u0001\u0000\u0000\u0000\u032e\u032b\u0001\u0000\u0000\u0000"+
		"\u032f\u0332\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0001\u0000\u0000\u0000\u0331s\u0001\u0000\u0000\u0000\u0332"+
		"\u0330\u0001\u0000\u0000\u0000\u0333\u0344\u0005m\u0000\u0000\u0334\u0344"+
		"\u0003\u00a8T\u0000\u0335\u0344\u0005q\u0000\u0000\u0336\u0344\u0005\u0081"+
		"\u0000\u0000\u0337\u033a\u0003\u00aaU\u0000\u0338\u0339\u0005 \u0000\u0000"+
		"\u0339\u033b\u0005!\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a"+
		"\u033b\u0001\u0000\u0000\u0000\u033b\u0344\u0001\u0000\u0000\u0000\u033c"+
		"\u0344\u0005~\u0000\u0000\u033d\u0344\u0003\u00a4R\u0000\u033e\u0341\u0003"+
		"\u00a6S\u0000\u033f\u0340\u0005 \u0000\u0000\u0340\u0342\u0005!\u0000"+
		"\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000"+
		"\u0000\u0342\u0344\u0001\u0000\u0000\u0000\u0343\u0333\u0001\u0000\u0000"+
		"\u0000\u0343\u0334\u0001\u0000\u0000\u0000\u0343\u0335\u0001\u0000\u0000"+
		"\u0000\u0343\u0336\u0001\u0000\u0000\u0000\u0343\u0337\u0001\u0000\u0000"+
		"\u0000\u0343\u033c\u0001\u0000\u0000\u0000\u0343\u033d\u0001\u0000\u0000"+
		"\u0000\u0343\u033e\u0001\u0000\u0000\u0000\u0344u\u0001\u0000\u0000\u0000"+
		"\u0345\u034a\u0003r9\u0000\u0346\u0347\u0005\u000f\u0000\u0000\u0347\u0349"+
		"\u0003r9\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0349\u034c\u0001\u0000"+
		"\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000"+
		"\u0000\u0000\u034bw\u0001\u0000\u0000\u0000\u034c\u034a\u0001\u0000\u0000"+
		"\u0000\u034d\u0352\u0003z=\u0000\u034e\u034f\u0005\u000f\u0000\u0000\u034f"+
		"\u0351\u0003z=\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0351\u0354\u0001"+
		"\u0000\u0000\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0353\u0001"+
		"\u0000\u0000\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354\u0352\u0001"+
		"\u0000\u0000\u0000\u0355\u0357\u0005\u000f\u0000\u0000\u0356\u0355\u0001"+
		"\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357y\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u0003\u00aaU\u0000\u0359\u035a\u0005X\u0000\u0000"+
		"\u035a\u035b\u0003r9\u0000\u035b{\u0001\u0000\u0000\u0000\u035c\u035e"+
		"\u0005\u000e\u0000\u0000\u035d\u035f\u0003x<\u0000\u035e\u035d\u0001\u0000"+
		"\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000"+
		"\u0000\u0000\u0360\u0365\u0005\u0010\u0000\u0000\u0361\u0363\u0003v;\u0000"+
		"\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000"+
		"\u0363\u0365\u0001\u0000\u0000\u0000\u0364\u035c\u0001\u0000\u0000\u0000"+
		"\u0364\u0362\u0001\u0000\u0000\u0000\u0365}\u0001\u0000\u0000\u0000\u0366"+
		"\u0367\u0003r9\u0000\u0367\u0368\u0005\u0015\u0000\u0000\u0368\u0369\u0003"+
		"|>\u0000\u0369\u036a\u0005\u0016\u0000\u0000\u036a\u007f\u0001\u0000\u0000"+
		"\u0000\u036b\u036f\u0005\u000e\u0000\u0000\u036c\u036e\u0003\u0082A\u0000"+
		"\u036d\u036c\u0001\u0000\u0000\u0000\u036e\u0371\u0001\u0000\u0000\u0000"+
		"\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000"+
		"\u0370\u0372\u0001\u0000\u0000\u0000\u0371\u036f\u0001\u0000\u0000\u0000"+
		"\u0372\u0373\u0005\u0010\u0000\u0000\u0373\u0081\u0001\u0000\u0000\u0000"+
		"\u0374\u0386\u0003\u00aaU\u0000\u0375\u0386\u0003\u0080@\u0000\u0376\u0386"+
		"\u0003\u0084B\u0000\u0377\u0386\u0003\u0088D\u0000\u0378\u0386\u0003\u008a"+
		"E\u0000\u0379\u0386\u0003\u0090H\u0000\u037a\u0386\u0003\u0092I\u0000"+
		"\u037b\u0386\u0003\u0094J\u0000\u037c\u0386\u0003\u0098L\u0000\u037d\u0386"+
		"\u0003\u009cN\u0000\u037e\u0386\u0003\u009eO\u0000\u037f\u0386\u0005t"+
		"\u0000\u0000\u0380\u0386\u0005v\u0000\u0000\u0381\u0386\u0003\u00a2Q\u0000"+
		"\u0382\u0386\u0003\u00a8T\u0000\u0383\u0386\u0005\u0081\u0000\u0000\u0384"+
		"\u0386\u0005q\u0000\u0000\u0385\u0374\u0001\u0000\u0000\u0000\u0385\u0375"+
		"\u0001\u0000\u0000\u0000\u0385\u0376\u0001\u0000\u0000\u0000\u0385\u0377"+
		"\u0001\u0000\u0000\u0000\u0385\u0378\u0001\u0000\u0000\u0000\u0385\u0379"+
		"\u0001\u0000\u0000\u0000\u0385\u037a\u0001\u0000\u0000\u0000\u0385\u037b"+
		"\u0001\u0000\u0000\u0000\u0385\u037c\u0001\u0000\u0000\u0000\u0385\u037d"+
		"\u0001\u0000\u0000\u0000\u0385\u037e\u0001\u0000\u0000\u0000\u0385\u037f"+
		"\u0001\u0000\u0000\u0000\u0385\u0380\u0001\u0000\u0000\u0000\u0385\u0381"+
		"\u0001\u0000\u0000\u0000\u0385\u0382\u0001\u0000\u0000\u0000\u0385\u0383"+
		"\u0001\u0000\u0000\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0386\u0083"+
		"\u0001\u0000\u0000\u0000\u0387\u038a\u0003\u0086C\u0000\u0388\u038a\u0003"+
		"\u00a0P\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u0389\u0388\u0001\u0000"+
		"\u0000\u0000\u038a\u0085\u0001\u0000\u0000\u0000\u038b\u0390\u0005Y\u0000"+
		"\u0000\u038c\u0390\u0005Z\u0000\u0000\u038d\u0390\u0005[\u0000\u0000\u038e"+
		"\u0390\u0003\u00aaU\u0000\u038f\u038b\u0001\u0000\u0000\u0000\u038f\u038c"+
		"\u0001\u0000\u0000\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u038f\u038e"+
		"\u0001\u0000\u0000\u0000\u0390\u039d\u0001\u0000\u0000\u0000\u0391\u0393"+
		"\u0005\u0015\u0000\u0000\u0392\u0394\u0003\u0084B\u0000\u0393\u0392\u0001"+
		"\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0399\u0001"+
		"\u0000\u0000\u0000\u0395\u0396\u0005\u000f\u0000\u0000\u0396\u0398\u0003"+
		"\u0084B\u0000\u0397\u0395\u0001\u0000\u0000\u0000\u0398\u039b\u0001\u0000"+
		"\u0000\u0000\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000"+
		"\u0000\u0000\u039a\u039c\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000"+
		"\u0000\u0000\u039c\u039e\u0005\u0016\u0000\u0000\u039d\u0391\u0001\u0000"+
		"\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u0087\u0001\u0000"+
		"\u0000\u0000\u039f\u03a0\u0005\\\u0000\u0000\u03a0\u03a3\u0003\u008cF"+
		"\u0000\u03a1\u03a2\u0005]\u0000\u0000\u03a2\u03a4\u0003\u0084B\u0000\u03a3"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4"+
		"\u0089\u0001\u0000\u0000\u0000\u03a5\u03a6\u0003\u008cF\u0000\u03a6\u03a7"+
		"\u0005]\u0000\u0000\u03a7\u03a8\u0003\u0084B\u0000\u03a8\u008b\u0001\u0000"+
		"\u0000\u0000\u03a9\u03af\u0003\u00aaU\u0000\u03aa\u03ab\u0005\u0015\u0000"+
		"\u0000\u03ab\u03ac\u0003\u008eG\u0000\u03ac\u03ad\u0005\u0016\u0000\u0000"+
		"\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae\u03a9\u0001\u0000\u0000\u0000"+
		"\u03ae\u03aa\u0001\u0000\u0000\u0000\u03af\u008d\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b5\u0003\u00aaU\u0000\u03b1\u03b2\u0005\u000f\u0000\u0000\u03b2"+
		"\u03b4\u0003\u00aaU\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b4\u03b7"+
		"\u0001\u0000\u0000\u0000\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b5\u03b6"+
		"\u0001\u0000\u0000\u0000\u03b6\u008f\u0001\u0000\u0000\u0000\u03b7\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005^\u0000\u0000\u03b9\u03ba\u0003"+
		"\u00aaU\u0000\u03ba\u0091\u0001\u0000\u0000\u0000\u03bb\u03bc\u0003\u00aa"+
		"U\u0000\u03bc\u03bd\u0005X\u0000\u0000\u03bd\u0093\u0001\u0000\u0000\u0000"+
		"\u03be\u03bf\u0005_\u0000\u0000\u03bf\u03c3\u0003\u0084B\u0000\u03c0\u03c2"+
		"\u0003\u0096K\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c5\u0001"+
		"\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001"+
		"\u0000\u0000\u0000\u03c4\u0095\u0001\u0000\u0000\u0000\u03c5\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c7\u0005`\u0000\u0000\u03c7\u03c8\u0003\u00a0"+
		"P\u0000\u03c8\u03c9\u0003\u0080@\u0000\u03c9\u03cd\u0001\u0000\u0000\u0000"+
		"\u03ca\u03cb\u0005a\u0000\u0000\u03cb\u03cd\u0003\u0080@\u0000\u03cc\u03c6"+
		"\u0001\u0000\u0000\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cd\u0097"+
		"\u0001\u0000\u0000\u0000\u03ce\u03cf\u0005b\u0000\u0000\u03cf\u03d0\u0003"+
		"\u00aaU\u0000\u03d0\u03d2\u0005\u0015\u0000\u0000\u03d1\u03d3\u0003\u008e"+
		"G\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d6\u0005\u0016\u0000"+
		"\u0000\u03d5\u03d7\u0003\u009aM\u0000\u03d6\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7\u03d8\u0001\u0000\u0000\u0000"+
		"\u03d8\u03d9\u0003\u0080@\u0000\u03d9\u0099\u0001\u0000\u0000\u0000\u03da"+
		"\u03db\u0005c\u0000\u0000\u03db\u03dc\u0003\u008eG\u0000\u03dc\u009b\u0001"+
		"\u0000\u0000\u0000\u03dd\u03e0\u0005\u0018\u0000\u0000\u03de\u03e1\u0003"+
		"\u0080@\u0000\u03df\u03e1\u0003\u0084B\u0000\u03e0\u03de\u0001\u0000\u0000"+
		"\u0000\u03e0\u03df\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e5\u0003\u0084B\u0000\u03e3\u03e6\u0003\u0080@\u0000\u03e4"+
		"\u03e6\u0003\u0084B\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e4"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u03e8"+
		"\u0003\u0080@\u0000\u03e8\u009d\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005"+
		"d\u0000\u0000\u03ea\u03eb\u0003\u0084B\u0000\u03eb\u03ec\u0003\u0080@"+
		"\u0000\u03ec\u009f\u0001\u0000\u0000\u0000\u03ed\u03ee\u0007\u0007\u0000"+
		"\u0000\u03ee\u00a1\u0001\u0000\u0000\u0000\u03ef\u03f0\u0005/\u0000\u0000"+
		"\u03f0\u03f1\u0003\u00aaU\u0000\u03f1\u03f2\u0003\u0080@\u0000\u03f2\u00a3"+
		"\u0001\u0000\u0000\u0000\u03f3\u03f5\u0005\u0015\u0000\u0000\u03f4\u03f6"+
		"\u0003r9\u0000\u03f5\u03f4\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000"+
		"\u0000\u0000\u03f6\u03fd\u0001\u0000\u0000\u0000\u03f7\u03f9\u0005\u000f"+
		"\u0000\u0000\u03f8\u03fa\u0003r9\u0000\u03f9\u03f8\u0001\u0000\u0000\u0000"+
		"\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa\u03fc\u0001\u0000\u0000\u0000"+
		"\u03fb\u03f7\u0001\u0000\u0000\u0000\u03fc\u03ff\u0001\u0000\u0000\u0000"+
		"\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000\u0000"+
		"\u03fe\u0400\u0001\u0000\u0000\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000"+
		"\u0400\u040e\u0005\u0016\u0000\u0000\u0401\u040a\u0005 \u0000\u0000\u0402"+
		"\u0407\u0003r9\u0000\u0403\u0404\u0005\u000f\u0000\u0000\u0404\u0406\u0003"+
		"r9\u0000\u0405\u0403\u0001\u0000\u0000\u0000\u0406\u0409\u0001\u0000\u0000"+
		"\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000"+
		"\u0000\u0408\u040b\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000"+
		"\u0000\u040a\u0402\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000"+
		"\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040e\u0005!\u0000\u0000"+
		"\u040d\u03f3\u0001\u0000\u0000\u0000\u040d\u0401\u0001\u0000\u0000\u0000"+
		"\u040e\u00a5\u0001\u0000\u0000\u0000\u040f\u0412\u0003p8\u0000\u0410\u0412"+
		"\u0003@ \u0000\u0411\u040f\u0001\u0000\u0000\u0000\u0411\u0410\u0001\u0000"+
		"\u0000\u0000\u0412\u00a7\u0001\u0000\u0000\u0000\u0413\u0415\u0007\b\u0000"+
		"\u0000\u0414\u0416\u0005p\u0000\u0000\u0415\u0414\u0001\u0000\u0000\u0000"+
		"\u0415\u0416\u0001\u0000\u0000\u0000\u0416\u00a9\u0001\u0000\u0000\u0000"+
		"\u0417\u0418\u0007\t\u0000\u0000\u0418\u00ab\u0001\u0000\u0000\u0000m"+
		"\u00af\u00b1\u00bc\u00c0\u00c5\u00cc\u00d2\u00d8\u00dc\u00e8\u00f0\u00f5"+
		"\u00ff\u0102\u0108\u0110\u0113\u011d\u0124\u0129\u0132\u0140\u0143\u014f"+
		"\u0156\u0159\u015c\u0160\u0165\u0169\u0174\u0176\u017a\u0180\u018a\u0190"+
		"\u019b\u019e\u01a4\u01a7\u01af\u01b2\u01b8\u01bb\u01c3\u01c6\u01cc\u01d0"+
		"\u01db\u01e0\u01e5\u01ed\u01fc\u01fe\u0203\u020d\u0220\u022b\u023a\u0244"+
		"\u024a\u024e\u0251\u0258\u026c\u027e\u0282\u0287\u028b\u028f\u0294\u0299"+
		"\u029d\u02bb\u032e\u0330\u033a\u0341\u0343\u034a\u0352\u0356\u035e\u0362"+
		"\u0364\u036f\u0385\u0389\u038f\u0393\u0399\u039d\u03a3\u03ae\u03b5\u03c3"+
		"\u03cc\u03d2\u03d6\u03e0\u03e5\u03f5\u03f9\u03fd\u0407\u040a\u040d\u0411"+
		"\u0415";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}