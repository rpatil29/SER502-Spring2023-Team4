// Generated from Orange.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OrangeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		T__94=95, T__95=96, T__96=97, T__97=98, WS=99;
	public static final int
		RULE_program = 0, RULE_statement_list = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_print_statement = 4, RULE_conditional = 5, RULE_loop = 6, RULE_traditional_for_loop = 7, 
		RULE_traditional_while_loop = 8, RULE_range_for_loop = 9, RULE_expression = 10, 
		RULE_boolean_expression = 11, RULE_boolean_term = 12, RULE_boolean_factor = 13, 
		RULE_comparison_expression = 14, RULE_boolean_literal = 15, RULE_numeric_expression = 16, 
		RULE_numeric_term = 17, RULE_numeric_factor = 18, RULE_string_expression = 19, 
		RULE_string_term = 20, RULE_ternary_expression = 21, RULE_identifier = 22, 
		RULE_identifier_tail = 23, RULE_integer_literal = 24, RULE_string_literal = 25, 
		RULE_string_character = 26, RULE_letter = 27, RULE_digit = 28, RULE_special_character = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement_list", "statement", "assignment", "print_statement", 
			"conditional", "loop", "traditional_for_loop", "traditional_while_loop", 
			"range_for_loop", "expression", "boolean_expression", "boolean_term", 
			"boolean_factor", "comparison_expression", "boolean_literal", "numeric_expression", 
			"numeric_term", "numeric_factor", "string_expression", "string_term", 
			"ternary_expression", "identifier", "identifier_tail", "integer_literal", 
			"string_literal", "string_character", "letter", "digit", "special_character"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'print'", "'('", "')'", "'if'", "'{'", "'}'", "'else'", 
			"'for'", "'while'", "'in'", "'range'", "'or'", "'and'", "'not'", "'<'", 
			"'>'", "'<='", "'>='", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", 
			"'++'", "'--'", "'?'", "':'", "'_'", "'\"'", "'a'", "'b'", "'c'", "'d'", 
			"'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", 
			"'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", 
			"'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", 
			"'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", 
			"'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'0'", "'1'", 
			"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'%'", "'&'", 
			"'|'", "'!'"
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
			null, null, null, "WS"
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
	public String getGrammarFileName() { return "Orange.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OrangeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor) return ((OrangeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			statement();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(63);
				match(T__0);
				setState(64);
				statement();
				}
				}
				setState(69);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
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
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				assignment();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				print_statement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				conditional();
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				loop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			identifier();
			setState(77);
			match(T__1);
			setState(78);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__2);
			setState(81);
			match(T__3);
			setState(82);
			identifier();
			setState(83);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__5);
			setState(86);
			match(T__3);
			setState(87);
			expression();
			setState(88);
			match(T__4);
			setState(89);
			match(T__6);
			setState(90);
			statement_list();
			setState(91);
			match(T__7);
			setState(92);
			match(T__8);
			setState(93);
			match(T__6);
			setState(94);
			statement_list();
			setState(95);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public Traditional_for_loopContext traditional_for_loop() {
			return getRuleContext(Traditional_for_loopContext.class,0);
		}
		public Traditional_while_loopContext traditional_while_loop() {
			return getRuleContext(Traditional_while_loopContext.class,0);
		}
		public Range_for_loopContext range_for_loop() {
			return getRuleContext(Range_for_loopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loop);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				traditional_for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				traditional_while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				range_for_loop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Traditional_for_loopContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Traditional_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traditional_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterTraditional_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitTraditional_for_loop(this);
		}
	}

	public final Traditional_for_loopContext traditional_for_loop() throws RecognitionException {
		Traditional_for_loopContext _localctx = new Traditional_for_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_traditional_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__9);
			setState(103);
			match(T__3);
			setState(104);
			identifier();
			setState(105);
			match(T__1);
			setState(106);
			expression();
			setState(107);
			match(T__0);
			setState(108);
			expression();
			setState(109);
			match(T__0);
			setState(110);
			expression();
			setState(111);
			match(T__4);
			setState(112);
			match(T__6);
			setState(113);
			statement_list();
			setState(114);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Traditional_while_loopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Traditional_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traditional_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterTraditional_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitTraditional_while_loop(this);
		}
	}

	public final Traditional_while_loopContext traditional_while_loop() throws RecognitionException {
		Traditional_while_loopContext _localctx = new Traditional_while_loopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_traditional_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__10);
			setState(117);
			match(T__3);
			setState(118);
			expression();
			setState(119);
			match(T__4);
			setState(120);
			match(T__6);
			setState(121);
			statement_list();
			setState(122);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_for_loopContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Range_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterRange_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitRange_for_loop(this);
		}
	}

	public final Range_for_loopContext range_for_loop() throws RecognitionException {
		Range_for_loopContext _localctx = new Range_for_loopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_range_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__9);
			setState(125);
			identifier();
			setState(126);
			match(T__11);
			setState(127);
			match(T__12);
			setState(128);
			match(T__3);
			setState(129);
			expression();
			setState(130);
			match(T__4);
			setState(131);
			match(T__6);
			setState(132);
			statement_list();
			setState(133);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Ternary_expressionContext ternary_expression() {
			return getRuleContext(Ternary_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				boolean_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				numeric_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				string_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				ternary_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_expressionContext extends ParserRuleContext {
		public List<Boolean_termContext> boolean_term() {
			return getRuleContexts(Boolean_termContext.class);
		}
		public Boolean_termContext boolean_term(int i) {
			return getRuleContext(Boolean_termContext.class,i);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitBoolean_expression(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolean_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			boolean_term();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(142);
				match(T__13);
				setState(143);
				boolean_term();
				}
				}
				setState(148);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_termContext extends ParserRuleContext {
		public List<Boolean_factorContext> boolean_factor() {
			return getRuleContexts(Boolean_factorContext.class);
		}
		public Boolean_factorContext boolean_factor(int i) {
			return getRuleContext(Boolean_factorContext.class,i);
		}
		public Boolean_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterBoolean_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitBoolean_term(this);
		}
	}

	public final Boolean_termContext boolean_term() throws RecognitionException {
		Boolean_termContext _localctx = new Boolean_termContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boolean_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			boolean_factor();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(150);
				match(T__14);
				setState(151);
				boolean_factor();
				}
				}
				setState(156);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_factorContext extends ParserRuleContext {
		public Boolean_factorContext boolean_factor() {
			return getRuleContext(Boolean_factorContext.class,0);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Boolean_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterBoolean_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitBoolean_factor(this);
		}
	}

	public final Boolean_factorContext boolean_factor() throws RecognitionException {
		Boolean_factorContext _localctx = new Boolean_factorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolean_factor);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__15);
				setState(158);
				boolean_factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				comparison_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(T__3);
				setState(162);
				boolean_expression();
				setState(163);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_expressionContext extends ParserRuleContext {
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterComparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitComparison_expression(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			numeric_expression();
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			numeric_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitBoolean_literal(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_expressionContext extends ParserRuleContext {
		public List<Numeric_termContext> numeric_term() {
			return getRuleContexts(Numeric_termContext.class);
		}
		public Numeric_termContext numeric_term(int i) {
			return getRuleContext(Numeric_termContext.class,i);
		}
		public Numeric_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterNumeric_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitNumeric_expression(this);
		}
	}

	public final Numeric_expressionContext numeric_expression() throws RecognitionException {
		Numeric_expressionContext _localctx = new Numeric_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numeric_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			numeric_term();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__23) {
				{
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				numeric_term();
				}
				}
				setState(180);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_termContext extends ParserRuleContext {
		public List<Numeric_factorContext> numeric_factor() {
			return getRuleContexts(Numeric_factorContext.class);
		}
		public Numeric_factorContext numeric_factor(int i) {
			return getRuleContext(Numeric_factorContext.class,i);
		}
		public Numeric_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterNumeric_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitNumeric_term(this);
		}
	}

	public final Numeric_termContext numeric_term() throws RecognitionException {
		Numeric_termContext _localctx = new Numeric_termContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numeric_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			numeric_factor();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__25) {
				{
				{
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				numeric_factor();
				}
				}
				setState(188);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_factorContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Numeric_expressionContext numeric_expression() {
			return getRuleContext(Numeric_expressionContext.class,0);
		}
		public Numeric_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterNumeric_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitNumeric_factor(this);
		}
	}

	public final Numeric_factorContext numeric_factor() throws RecognitionException {
		Numeric_factorContext _localctx = new Numeric_factorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numeric_factor);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(T__3);
				setState(192);
				numeric_expression();
				setState(193);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				identifier();
				setState(196);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_expressionContext extends ParserRuleContext {
		public List<String_termContext> string_term() {
			return getRuleContexts(String_termContext.class);
		}
		public String_termContext string_term(int i) {
			return getRuleContext(String_termContext.class,i);
		}
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitString_expression(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			string_term();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(201);
				match(T__22);
				setState(202);
				string_term();
				}
				}
				setState(207);
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_termContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterString_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitString_term(this);
		}
	}

	public final String_termContext string_term() throws RecognitionException {
		String_termContext _localctx = new String_termContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_string_term);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				string_literal();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
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
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ternary_expressionContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Ternary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterTernary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitTernary_expression(this);
		}
	}

	public final Ternary_expressionContext ternary_expression() throws RecognitionException {
		Ternary_expressionContext _localctx = new Ternary_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ternary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			boolean_expression();
			setState(213);
			match(T__28);
			setState(214);
			expression();
			setState(215);
			match(T__29);
			setState(216);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public List<Identifier_tailContext> identifier_tail() {
			return getRuleContexts(Identifier_tailContext.class);
		}
		public Identifier_tailContext identifier_tail(int i) {
			return getRuleContext(Identifier_tailContext.class,i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			letter();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & -3L) != 0)) {
				{
				{
				setState(219);
				identifier_tail();
				}
				}
				setState(224);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Identifier_tailContext extends ParserRuleContext {
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Identifier_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterIdentifier_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitIdentifier_tail(this);
		}
	}

	public final Identifier_tailContext identifier_tail() throws RecognitionException {
		Identifier_tailContext _localctx = new Identifier_tailContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifier_tail);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
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
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				letter();
				}
				break;
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				digit();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(T__30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Integer_literalContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitInteger_literal(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				digit();
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 1023L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public List<String_characterContext> string_character() {
			return getRuleContexts(String_characterContext.class);
		}
		public String_characterContext string_character(int i) {
			return getRuleContext(String_characterContext.class,i);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__31);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6316621824L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 34359738367L) != 0)) {
				{
				{
				setState(236);
				string_character();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_characterContext extends ParserRuleContext {
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Special_characterContext special_character() {
			return getRuleContext(Special_characterContext.class,0);
		}
		public String_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterString_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitString_character(this);
		}
	}

	public final String_characterContext string_character() throws RecognitionException {
		String_characterContext _localctx = new String_characterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_string_character);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
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
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				letter();
				}
				break;
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				digit();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__30:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				special_character();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetterContext extends ParserRuleContext {
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitLetter(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & 4503599627370495L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DigitContext extends ParserRuleContext {
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 1023L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Special_characterContext extends ParserRuleContext {
		public Special_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterSpecial_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitSpecial_character(this);
		}
	}

	public final Special_characterContext special_character() throws RecognitionException {
		Special_characterContext _localctx = new Special_characterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_special_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2273312768L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 15L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001c\u0100\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001B\b\u0001\n\u0001\f\u0001"+
		"E\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"K\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006e\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u008c\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0091\b\u000b\n\u000b\f\u000b\u0094\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u0099\b\f\n\f\f\f\u009c\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a6\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00b1\b\u0010\n\u0010\f\u0010\u00b4"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00b9\b\u0011"+
		"\n\u0011\f\u0011\u00bc\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00c7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00cc"+
		"\b\u0013\n\u0013\f\u0013\u00cf\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00d3\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u00dd\b\u0016\n\u0016"+
		"\f\u0016\u00e0\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00e5\b\u0017\u0001\u0018\u0004\u0018\u00e8\b\u0018\u000b\u0018\f\u0018"+
		"\u00e9\u0001\u0019\u0001\u0019\u0005\u0019\u00ee\b\u0019\n\u0019\f\u0019"+
		"\u00f1\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u00f8\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:\u0000\b\u0001\u0000\u0011\u0014\u0001\u0000\u0015\u0016\u0001"+
		"\u0000\u0017\u0018\u0001\u0000\u0019\u001a\u0001\u0000\u001b\u001c\u0001"+
		"\u0000!T\u0001\u0000U^\u0003\u0000\u0017\u001a\u001f\u001f_b\u00fd\u0000"+
		"<\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004J\u0001"+
		"\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000"+
		"\u0000\nU\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000ef\u0001"+
		"\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000"+
		"\u0000\u0014\u008b\u0001\u0000\u0000\u0000\u0016\u008d\u0001\u0000\u0000"+
		"\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a\u00a5\u0001\u0000\u0000"+
		"\u0000\u001c\u00a7\u0001\u0000\u0000\u0000\u001e\u00ab\u0001\u0000\u0000"+
		"\u0000 \u00ad\u0001\u0000\u0000\u0000\"\u00b5\u0001\u0000\u0000\u0000"+
		"$\u00c6\u0001\u0000\u0000\u0000&\u00c8\u0001\u0000\u0000\u0000(\u00d2"+
		"\u0001\u0000\u0000\u0000*\u00d4\u0001\u0000\u0000\u0000,\u00da\u0001\u0000"+
		"\u0000\u0000.\u00e4\u0001\u0000\u0000\u00000\u00e7\u0001\u0000\u0000\u0000"+
		"2\u00eb\u0001\u0000\u0000\u00004\u00f7\u0001\u0000\u0000\u00006\u00f9"+
		"\u0001\u0000\u0000\u00008\u00fb\u0001\u0000\u0000\u0000:\u00fd\u0001\u0000"+
		"\u0000\u0000<=\u0003\u0002\u0001\u0000=\u0001\u0001\u0000\u0000\u0000"+
		">C\u0003\u0004\u0002\u0000?@\u0005\u0001\u0000\u0000@B\u0003\u0004\u0002"+
		"\u0000A?\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0003\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000FK\u0003\u0006\u0003\u0000GK\u0003\b\u0004\u0000"+
		"HK\u0003\n\u0005\u0000IK\u0003\f\u0006\u0000JF\u0001\u0000\u0000\u0000"+
		"JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0003,\u0016\u0000MN\u0005\u0002"+
		"\u0000\u0000NO\u0003\u0014\n\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u0003\u0000\u0000QR\u0005\u0004\u0000\u0000RS\u0003,\u0016\u0000ST\u0005"+
		"\u0005\u0000\u0000T\t\u0001\u0000\u0000\u0000UV\u0005\u0006\u0000\u0000"+
		"VW\u0005\u0004\u0000\u0000WX\u0003\u0014\n\u0000XY\u0005\u0005\u0000\u0000"+
		"YZ\u0005\u0007\u0000\u0000Z[\u0003\u0002\u0001\u0000[\\\u0005\b\u0000"+
		"\u0000\\]\u0005\t\u0000\u0000]^\u0005\u0007\u0000\u0000^_\u0003\u0002"+
		"\u0001\u0000_`\u0005\b\u0000\u0000`\u000b\u0001\u0000\u0000\u0000ae\u0003"+
		"\u000e\u0007\u0000be\u0003\u0010\b\u0000ce\u0003\u0012\t\u0000da\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000"+
		"e\r\u0001\u0000\u0000\u0000fg\u0005\n\u0000\u0000gh\u0005\u0004\u0000"+
		"\u0000hi\u0003,\u0016\u0000ij\u0005\u0002\u0000\u0000jk\u0003\u0014\n"+
		"\u0000kl\u0005\u0001\u0000\u0000lm\u0003\u0014\n\u0000mn\u0005\u0001\u0000"+
		"\u0000no\u0003\u0014\n\u0000op\u0005\u0005\u0000\u0000pq\u0005\u0007\u0000"+
		"\u0000qr\u0003\u0002\u0001\u0000rs\u0005\b\u0000\u0000s\u000f\u0001\u0000"+
		"\u0000\u0000tu\u0005\u000b\u0000\u0000uv\u0005\u0004\u0000\u0000vw\u0003"+
		"\u0014\n\u0000wx\u0005\u0005\u0000\u0000xy\u0005\u0007\u0000\u0000yz\u0003"+
		"\u0002\u0001\u0000z{\u0005\b\u0000\u0000{\u0011\u0001\u0000\u0000\u0000"+
		"|}\u0005\n\u0000\u0000}~\u0003,\u0016\u0000~\u007f\u0005\f\u0000\u0000"+
		"\u007f\u0080\u0005\r\u0000\u0000\u0080\u0081\u0005\u0004\u0000\u0000\u0081"+
		"\u0082\u0003\u0014\n\u0000\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0084"+
		"\u0005\u0007\u0000\u0000\u0084\u0085\u0003\u0002\u0001\u0000\u0085\u0086"+
		"\u0005\b\u0000\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u008c\u0003"+
		"\u0016\u000b\u0000\u0088\u008c\u0003 \u0010\u0000\u0089\u008c\u0003&\u0013"+
		"\u0000\u008a\u008c\u0003*\u0015\u0000\u008b\u0087\u0001\u0000\u0000\u0000"+
		"\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0015\u0001\u0000\u0000\u0000"+
		"\u008d\u0092\u0003\u0018\f\u0000\u008e\u008f\u0005\u000e\u0000\u0000\u008f"+
		"\u0091\u0003\u0018\f\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u009a\u0003\u001a\r\u0000\u0096\u0097\u0005"+
		"\u000f\u0000\u0000\u0097\u0099\u0003\u001a\r\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0019\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0010"+
		"\u0000\u0000\u009e\u00a6\u0003\u001a\r\u0000\u009f\u00a6\u0003\u001c\u000e"+
		"\u0000\u00a0\u00a6\u0003\u001e\u000f\u0000\u00a1\u00a2\u0005\u0004\u0000"+
		"\u0000\u00a2\u00a3\u0003\u0016\u000b\u0000\u00a3\u00a4\u0005\u0005\u0000"+
		"\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u009d\u0001\u0000\u0000"+
		"\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a6\u001b\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0003 \u0010\u0000\u00a8\u00a9\u0007\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0003 \u0010\u0000\u00aa\u001d\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0007\u0001\u0000\u0000\u00ac\u001f\u0001\u0000\u0000\u0000\u00ad"+
		"\u00b2\u0003\"\u0011\u0000\u00ae\u00af\u0007\u0002\u0000\u0000\u00af\u00b1"+
		"\u0003\"\u0011\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3!\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00ba\u0003$\u0012\u0000\u00b6\u00b7\u0007\u0003\u0000"+
		"\u0000\u00b7\u00b9\u0003$\u0012\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb#\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c7\u00030\u0018\u0000\u00be\u00c7"+
		"\u0003,\u0016\u0000\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0\u00c1\u0003"+
		" \u0010\u0000\u00c1\u00c2\u0005\u0005\u0000\u0000\u00c2\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0003,\u0016\u0000\u00c4\u00c5\u0007\u0004\u0000"+
		"\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c7%\u0001\u0000\u0000\u0000"+
		"\u00c8\u00cd\u0003(\u0014\u0000\u00c9\u00ca\u0005\u0017\u0000\u0000\u00ca"+
		"\u00cc\u0003(\u0014\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\'\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d3\u00032\u0019\u0000\u00d1\u00d3\u0003,\u0016"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3)\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0016\u000b\u0000"+
		"\u00d5\u00d6\u0005\u001d\u0000\u0000\u00d6\u00d7\u0003\u0014\n\u0000\u00d7"+
		"\u00d8\u0005\u001e\u0000\u0000\u00d8\u00d9\u0003\u0014\n\u0000\u00d9+"+
		"\u0001\u0000\u0000\u0000\u00da\u00de\u00036\u001b\u0000\u00db\u00dd\u0003"+
		".\u0017\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df-\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e5\u00036\u001b\u0000\u00e2\u00e5\u00038\u001c\u0000\u00e3"+
		"\u00e5\u0005\u001f\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"/\u0001\u0000\u0000\u0000\u00e6\u00e8\u00038\u001c\u0000\u00e7\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea1\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ef\u0005 \u0000\u0000\u00ec\u00ee\u00034\u001a\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0005 \u0000\u0000\u00f33\u0001\u0000\u0000\u0000\u00f4\u00f8"+
		"\u00036\u001b\u0000\u00f5\u00f8\u00038\u001c\u0000\u00f6\u00f8\u0003:"+
		"\u001d\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f85\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0007\u0005\u0000\u0000\u00fa7\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0007\u0006\u0000\u0000\u00fc9\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0007\u0007\u0000\u0000\u00fe;\u0001\u0000\u0000\u0000\u0011CJ"+
		"d\u008b\u0092\u009a\u00a5\u00b2\u00ba\u00c6\u00cd\u00d2\u00de\u00e4\u00e9"+
		"\u00ef\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
