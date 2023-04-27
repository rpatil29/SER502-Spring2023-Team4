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
		T__9=10, T__10=11, T__11=12, IDENTIFIER=13, BOOLEAN_L=14, INTEGER_L=15, 
		STRING_L=16, DIGIT=17, BOOLEAN_TRUE=18, BOOLEAN_FALSE=19, OP_ASSIGN=20, 
		OP_ADD=21, OP_SUB=22, OP_MUL=23, OP_DIV=24, OP_SUCCESSOR=25, OP_PREDECESSOR=26, 
		OP_EQUALS=27, OP_SMALLER=28, OP_GREATER=29, OP_SMALLER_EQUALS=30, OP_GREATER_EQUALS=31, 
		OP_LOGICAL_AND=32, OP_LOGICAL_OR=33, OP_LOGICAL_NOT=34, OP_TERNARY_TRUE=35, 
		OP_TERNARY_FALSE=36, OP_SEMICOLON=37, WS=38;
	public static final int
		RULE_program = 0, RULE_statement_list = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_print = 4, RULE_print_argument_list = 5, RULE_conditional = 6, RULE_loop = 7, 
		RULE_traditional_for_loop = 8, RULE_traditional_while_loop = 9, RULE_range_for_loop = 10, 
		RULE_expression = 11, RULE_boolean_expression = 12, RULE_comparison_expression = 13, 
		RULE_numeric_expression = 14, RULE_string_expression = 15, RULE_string_term = 16, 
		RULE_ternary_expression = 17, RULE_expression_term = 18, RULE_literal = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement_list", "statement", "assignment", "print", "print_argument_list", 
			"conditional", "loop", "traditional_for_loop", "traditional_while_loop", 
			"range_for_loop", "expression", "boolean_expression", "comparison_expression", 
			"numeric_expression", "string_expression", "string_term", "ternary_expression", 
			"expression_term", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'('", "')'", "','", "'if'", "'{'", "'}'", "'else'", 
			"'for'", "'while'", "'in'", "'range'", null, null, null, null, null, 
			"'true'", "'false'", "'='", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", 
			"'=='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'!'", "'?'", "':'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IDENTIFIER", "BOOLEAN_L", "INTEGER_L", "STRING_L", "DIGIT", "BOOLEAN_TRUE", 
			"BOOLEAN_FALSE", "OP_ASSIGN", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", 
			"OP_SUCCESSOR", "OP_PREDECESSOR", "OP_EQUALS", "OP_SMALLER", "OP_GREATER", 
			"OP_SMALLER_EQUALS", "OP_GREATER_EQUALS", "OP_LOGICAL_AND", "OP_LOGICAL_OR", 
			"OP_LOGICAL_NOT", "OP_TERNARY_TRUE", "OP_TERNARY_FALSE", "OP_SEMICOLON", 
			"WS"
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
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
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
		public List<TerminalNode> OP_SEMICOLON() { return getTokens(OrangeParser.OP_SEMICOLON); }
		public TerminalNode OP_SEMICOLON(int i) {
			return getToken(OrangeParser.OP_SEMICOLON, i);
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
			setState(42);
			statement();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SEMICOLON) {
				{
				{
				setState(43);
				match(OP_SEMICOLON);
				setState(44);
				statement();
				}
				}
				setState(49);
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
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				assignment();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				print();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				conditional();
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
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
		public TerminalNode IDENTIFIER() { return getToken(OrangeParser.IDENTIFIER, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(OrangeParser.OP_ASSIGN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IDENTIFIER);
			setState(57);
			match(OP_ASSIGN);
			setState(58);
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
	public static class PrintContext extends ParserRuleContext {
		public Print_argument_listContext print_argument_list() {
			return getRuleContext(Print_argument_listContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			match(T__1);
			setState(62);
			print_argument_list();
			setState(63);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
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
	public static class Print_argument_listContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OrangeParser.IDENTIFIER, 0); }
		public Print_argument_listContext print_argument_list() {
			return getRuleContext(Print_argument_listContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Print_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterPrint_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitPrint_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitPrint_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_argument_listContext print_argument_list() throws RecognitionException {
		Print_argument_listContext _localctx = new Print_argument_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_argument_list);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(IDENTIFIER);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(66);
					match(T__3);
					setState(67);
					print_argument_list();
					}
				}

				}
				break;
			case BOOLEAN_L:
			case INTEGER_L:
			case STRING_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				literal();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(71);
					match(T__3);
					setState(72);
					print_argument_list();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__4);
			setState(78);
			match(T__1);
			setState(79);
			expression();
			setState(80);
			match(T__2);
			setState(81);
			match(T__5);
			setState(82);
			statement_list();
			setState(83);
			match(T__6);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(84);
				match(T__7);
				setState(85);
				match(T__5);
				setState(86);
				statement_list();
				setState(87);
				match(T__6);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				traditional_for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				traditional_while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
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
		public TerminalNode IDENTIFIER() { return getToken(OrangeParser.IDENTIFIER, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(OrangeParser.OP_ASSIGN, 0); }
		public Expression_termContext expression_term() {
			return getRuleContext(Expression_termContext.class,0);
		}
		public List<TerminalNode> OP_SEMICOLON() { return getTokens(OrangeParser.OP_SEMICOLON); }
		public TerminalNode OP_SEMICOLON(int i) {
			return getToken(OrangeParser.OP_SEMICOLON, i);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitTraditional_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Traditional_for_loopContext traditional_for_loop() throws RecognitionException {
		Traditional_for_loopContext _localctx = new Traditional_for_loopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_traditional_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__8);
			setState(97);
			match(T__1);
			setState(98);
			match(IDENTIFIER);
			setState(99);
			match(OP_ASSIGN);
			setState(100);
			expression_term();
			setState(101);
			match(OP_SEMICOLON);
			setState(102);
			comparison_expression();
			setState(103);
			match(OP_SEMICOLON);
			setState(104);
			expression();
			setState(105);
			match(T__2);
			setState(106);
			match(T__5);
			setState(107);
			statement_list();
			setState(108);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitTraditional_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Traditional_while_loopContext traditional_while_loop() throws RecognitionException {
		Traditional_while_loopContext _localctx = new Traditional_while_loopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_traditional_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__9);
			setState(111);
			match(T__1);
			setState(112);
			expression();
			setState(113);
			match(T__2);
			setState(114);
			match(T__5);
			setState(115);
			statement_list();
			setState(116);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER() { return getToken(OrangeParser.IDENTIFIER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitRange_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_for_loopContext range_for_loop() throws RecognitionException {
		Range_for_loopContext _localctx = new Range_for_loopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_range_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__8);
			setState(119);
			match(IDENTIFIER);
			setState(120);
			match(T__10);
			setState(121);
			match(T__11);
			setState(122);
			match(T__1);
			setState(123);
			expression();
			setState(124);
			match(T__2);
			setState(125);
			match(T__5);
			setState(126);
			statement_list();
			setState(127);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
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
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Ternary_expressionContext ternary_expression() {
			return getRuleContext(Ternary_expressionContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				boolean_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				numeric_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				comparison_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				ternary_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				string_expression();
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
		public List<Expression_termContext> expression_term() {
			return getRuleContexts(Expression_termContext.class);
		}
		public Expression_termContext expression_term(int i) {
			return getRuleContext(Expression_termContext.class,i);
		}
		public TerminalNode OP_LOGICAL_AND() { return getToken(OrangeParser.OP_LOGICAL_AND, 0); }
		public TerminalNode OP_LOGICAL_OR() { return getToken(OrangeParser.OP_LOGICAL_OR, 0); }
		public TerminalNode OP_LOGICAL_NOT() { return getToken(OrangeParser.OP_LOGICAL_NOT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boolean_expression);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				expression_term();
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==OP_LOGICAL_AND || _la==OP_LOGICAL_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				expression_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(OP_LOGICAL_NOT);
				setState(141);
				expression_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				expression_term();
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
		public List<Expression_termContext> expression_term() {
			return getRuleContexts(Expression_termContext.class);
		}
		public Expression_termContext expression_term(int i) {
			return getRuleContext(Expression_termContext.class,i);
		}
		public TerminalNode OP_EQUALS() { return getToken(OrangeParser.OP_EQUALS, 0); }
		public TerminalNode OP_GREATER() { return getToken(OrangeParser.OP_GREATER, 0); }
		public TerminalNode OP_SMALLER() { return getToken(OrangeParser.OP_SMALLER, 0); }
		public TerminalNode OP_GREATER_EQUALS() { return getToken(OrangeParser.OP_GREATER_EQUALS, 0); }
		public TerminalNode OP_SMALLER_EQUALS() { return getToken(OrangeParser.OP_SMALLER_EQUALS, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitComparison_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			expression_term();
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			expression_term();
			}
		}
		catch (RecognitionException re) {
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
		public Expression_termContext expression_term() {
			return getRuleContext(Expression_termContext.class,0);
		}
		public List<Numeric_expressionContext> numeric_expression() {
			return getRuleContexts(Numeric_expressionContext.class);
		}
		public Numeric_expressionContext numeric_expression(int i) {
			return getRuleContext(Numeric_expressionContext.class,i);
		}
		public TerminalNode OP_ADD() { return getToken(OrangeParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(OrangeParser.OP_SUB, 0); }
		public TerminalNode OP_MUL() { return getToken(OrangeParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(OrangeParser.OP_DIV, 0); }
		public TerminalNode OP_SUCCESSOR() { return getToken(OrangeParser.OP_SUCCESSOR, 0); }
		public TerminalNode OP_PREDECESSOR() { return getToken(OrangeParser.OP_PREDECESSOR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitNumeric_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_expressionContext numeric_expression() throws RecognitionException {
		return numeric_expression(0);
	}

	private Numeric_expressionContext numeric_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Numeric_expressionContext _localctx = new Numeric_expressionContext(_ctx, _parentState);
		Numeric_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_numeric_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case BOOLEAN_L:
			case INTEGER_L:
			case STRING_L:
			case BOOLEAN_TRUE:
			case BOOLEAN_FALSE:
				{
				setState(150);
				expression_term();
				}
				break;
			case T__1:
				{
				setState(151);
				match(T__1);
				setState(152);
				numeric_expression(0);
				setState(153);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(157);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(158);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						numeric_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(160);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(161);
						_la = _input.LA(1);
						if ( !(_la==OP_MUL || _la==OP_DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						numeric_expression(3);
						}
						break;
					case 3:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(163);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(164);
						_la = _input.LA(1);
						if ( !(_la==OP_SUCCESSOR || _la==OP_PREDECESSOR) ) {
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
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_expressionContext extends ParserRuleContext {
		public List<String_termContext> string_term() {
			return getRuleContexts(String_termContext.class);
		}
		public String_termContext string_term(int i) {
			return getRuleContext(String_termContext.class,i);
		}
		public List<TerminalNode> OP_ADD() { return getTokens(OrangeParser.OP_ADD); }
		public TerminalNode OP_ADD(int i) {
			return getToken(OrangeParser.OP_ADD, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitString_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			string_term();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD) {
				{
				{
				setState(171);
				match(OP_ADD);
				setState(172);
				string_term();
				}
				}
				setState(177);
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
		public TerminalNode STRING_L() { return getToken(OrangeParser.STRING_L, 0); }
		public TerminalNode IDENTIFIER() { return getToken(OrangeParser.IDENTIFIER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitString_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_termContext string_term() throws RecognitionException {
		String_termContext _localctx = new String_termContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_L) ) {
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
	public static class Ternary_expressionContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode OP_TERNARY_TRUE() { return getToken(OrangeParser.OP_TERNARY_TRUE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_TERNARY_FALSE() { return getToken(OrangeParser.OP_TERNARY_FALSE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitTernary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_expressionContext ternary_expression() throws RecognitionException {
		Ternary_expressionContext _localctx = new Ternary_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ternary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			boolean_expression();
			setState(181);
			match(OP_TERNARY_TRUE);
			setState(182);
			expression();
			setState(183);
			match(OP_TERNARY_FALSE);
			setState(184);
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
	public static class Expression_termContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OrangeParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode BOOLEAN_FALSE() { return getToken(OrangeParser.BOOLEAN_FALSE, 0); }
		public TerminalNode BOOLEAN_TRUE() { return getToken(OrangeParser.BOOLEAN_TRUE, 0); }
		public Expression_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterExpression_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitExpression_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitExpression_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_termContext expression_term() throws RecognitionException {
		Expression_termContext _localctx = new Expression_termContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression_term);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN_L:
			case INTEGER_L:
			case STRING_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				literal();
				}
				break;
			case BOOLEAN_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(BOOLEAN_FALSE);
				}
				break;
			case BOOLEAN_TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(BOOLEAN_TRUE);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_L() { return getToken(OrangeParser.STRING_L, 0); }
		public TerminalNode INTEGER_L() { return getToken(OrangeParser.INTEGER_L, 0); }
		public TerminalNode BOOLEAN_L() { return getToken(OrangeParser.BOOLEAN_L, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
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
		case 14:
			return numeric_expression_sempred((Numeric_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numeric_expression_sempred(Numeric_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"E\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005J\b\u0005\u0003"+
		"\u0005L\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007_\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0087\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u0090\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009c\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00a6\b\u000e\n\u000e\f\u000e\u00a9"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ae\b\u000f"+
		"\n\u000f\f\u000f\u00b1\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bf\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0000\u0001\u001c\u0014\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0007"+
		"\u0001\u0000 !\u0001\u0000\u001b\u001f\u0001\u0000\u0015\u0016\u0001\u0000"+
		"\u0017\u0018\u0001\u0000\u0019\u001a\u0002\u0000\r\r\u0010\u0010\u0001"+
		"\u0000\u000e\u0010\u00c6\u0000(\u0001\u0000\u0000\u0000\u0002*\u0001\u0000"+
		"\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000"+
		"\b<\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\fM\u0001\u0000"+
		"\u0000\u0000\u000e^\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000"+
		"\u0012n\u0001\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000\u0016\u0086"+
		"\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000\u0000\u001a\u0091"+
		"\u0001\u0000\u0000\u0000\u001c\u009b\u0001\u0000\u0000\u0000\u001e\u00aa"+
		"\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00b4\u0001"+
		"\u0000\u0000\u0000$\u00be\u0001\u0000\u0000\u0000&\u00c0\u0001\u0000\u0000"+
		"\u0000()\u0003\u0002\u0001\u0000)\u0001\u0001\u0000\u0000\u0000*/\u0003"+
		"\u0004\u0002\u0000+,\u0005%\u0000\u0000,.\u0003\u0004\u0002\u0000-+\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000027\u0003\u0006\u0003\u000037\u0003\b\u0004\u000047\u0003\f"+
		"\u0006\u000057\u0003\u000e\u0007\u000062\u0001\u0000\u0000\u000063\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"7\u0005\u0001\u0000\u0000\u000089\u0005\r\u0000\u00009:\u0005\u0014\u0000"+
		"\u0000:;\u0003\u0016\u000b\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0005"+
		"\u0001\u0000\u0000=>\u0005\u0002\u0000\u0000>?\u0003\n\u0005\u0000?@\u0005"+
		"\u0003\u0000\u0000@\t\u0001\u0000\u0000\u0000AD\u0005\r\u0000\u0000BC"+
		"\u0005\u0004\u0000\u0000CE\u0003\n\u0005\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EL\u0001\u0000\u0000\u0000FI\u0003&\u0013\u0000"+
		"GH\u0005\u0004\u0000\u0000HJ\u0003\n\u0005\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KA\u0001\u0000\u0000"+
		"\u0000KF\u0001\u0000\u0000\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0005"+
		"\u0005\u0000\u0000NO\u0005\u0002\u0000\u0000OP\u0003\u0016\u000b\u0000"+
		"PQ\u0005\u0003\u0000\u0000QR\u0005\u0006\u0000\u0000RS\u0003\u0002\u0001"+
		"\u0000SY\u0005\u0007\u0000\u0000TU\u0005\b\u0000\u0000UV\u0005\u0006\u0000"+
		"\u0000VW\u0003\u0002\u0001\u0000WX\u0005\u0007\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000YT\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\r\u0001"+
		"\u0000\u0000\u0000[_\u0003\u0010\b\u0000\\_\u0003\u0012\t\u0000]_\u0003"+
		"\u0014\n\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]"+
		"\u0001\u0000\u0000\u0000_\u000f\u0001\u0000\u0000\u0000`a\u0005\t\u0000"+
		"\u0000ab\u0005\u0002\u0000\u0000bc\u0005\r\u0000\u0000cd\u0005\u0014\u0000"+
		"\u0000de\u0003$\u0012\u0000ef\u0005%\u0000\u0000fg\u0003\u001a\r\u0000"+
		"gh\u0005%\u0000\u0000hi\u0003\u0016\u000b\u0000ij\u0005\u0003\u0000\u0000"+
		"jk\u0005\u0006\u0000\u0000kl\u0003\u0002\u0001\u0000lm\u0005\u0007\u0000"+
		"\u0000m\u0011\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000op\u0005\u0002"+
		"\u0000\u0000pq\u0003\u0016\u000b\u0000qr\u0005\u0003\u0000\u0000rs\u0005"+
		"\u0006\u0000\u0000st\u0003\u0002\u0001\u0000tu\u0005\u0007\u0000\u0000"+
		"u\u0013\u0001\u0000\u0000\u0000vw\u0005\t\u0000\u0000wx\u0005\r\u0000"+
		"\u0000xy\u0005\u000b\u0000\u0000yz\u0005\f\u0000\u0000z{\u0005\u0002\u0000"+
		"\u0000{|\u0003\u0016\u000b\u0000|}\u0005\u0003\u0000\u0000}~\u0005\u0006"+
		"\u0000\u0000~\u007f\u0003\u0002\u0001\u0000\u007f\u0080\u0005\u0007\u0000"+
		"\u0000\u0080\u0015\u0001\u0000\u0000\u0000\u0081\u0087\u0003\u0018\f\u0000"+
		"\u0082\u0087\u0003\u001c\u000e\u0000\u0083\u0087\u0003\u001a\r\u0000\u0084"+
		"\u0087\u0003\"\u0011\u0000\u0085\u0087\u0003\u001e\u000f\u0000\u0086\u0081"+
		"\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0086\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0017\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0003$\u0012\u0000\u0089\u008a\u0007\u0000\u0000\u0000\u008a\u008b\u0003"+
		"$\u0012\u0000\u008b\u0090\u0001\u0000\u0000\u0000\u008c\u008d\u0005\""+
		"\u0000\u0000\u008d\u0090\u0003$\u0012\u0000\u008e\u0090\u0003$\u0012\u0000"+
		"\u008f\u0088\u0001\u0000\u0000\u0000\u008f\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0019\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0003$\u0012\u0000\u0092\u0093\u0007\u0001\u0000\u0000\u0093"+
		"\u0094\u0003$\u0012\u0000\u0094\u001b\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0006\u000e\uffff\uffff\u0000\u0096\u009c\u0003$\u0012\u0000\u0097\u0098"+
		"\u0005\u0002\u0000\u0000\u0098\u0099\u0003\u001c\u000e\u0000\u0099\u009a"+
		"\u0005\u0003\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0095"+
		"\u0001\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009c\u00a7"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\n\u0003\u0000\u0000\u009e\u009f\u0007"+
		"\u0002\u0000\u0000\u009f\u00a6\u0003\u001c\u000e\u0004\u00a0\u00a1\n\u0002"+
		"\u0000\u0000\u00a1\u00a2\u0007\u0003\u0000\u0000\u00a2\u00a6\u0003\u001c"+
		"\u000e\u0003\u00a3\u00a4\n\u0001\u0000\u0000\u00a4\u00a6\u0007\u0004\u0000"+
		"\u0000\u00a5\u009d\u0001\u0000\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u001d\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00af\u0003 \u0010\u0000\u00ab\u00ac\u0005\u0015\u0000\u0000"+
		"\u00ac\u00ae\u0003 \u0010\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0007\u0005\u0000\u0000\u00b3"+
		"!\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003\u0018\f\u0000\u00b5\u00b6"+
		"\u0005#\u0000\u0000\u00b6\u00b7\u0003\u0016\u000b\u0000\u00b7\u00b8\u0005"+
		"$\u0000\u0000\u00b8\u00b9\u0003\u0016\u000b\u0000\u00b9#\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bf\u0005\r\u0000\u0000\u00bb\u00bf\u0003&\u0013\u0000"+
		"\u00bc\u00bf\u0005\u0013\u0000\u0000\u00bd\u00bf\u0005\u0012\u0000\u0000"+
		"\u00be\u00ba\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf%\u0001\u0000\u0000\u0000\u00c0\u00c1\u0007\u0006\u0000\u0000\u00c1"+
		"\'\u0001\u0000\u0000\u0000\u000e/6DIKY^\u0086\u008f\u009b\u00a5\u00a7"+
		"\u00af\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}