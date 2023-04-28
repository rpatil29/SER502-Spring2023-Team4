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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, BOOLEAN_L=16, 
		INTEGER_L=17, STRING_L=18, DIGIT=19, BOOLEAN_TRUE=20, BOOLEAN_FALSE=21, 
		OP_ASSIGN=22, OP_ADD=23, OP_SUB=24, OP_MUL=25, OP_DIV=26, OP_SUCCESSOR=27, 
		OP_PREDECESSOR=28, OP_EQUALS=29, OP_SMALLER=30, OP_GREATER=31, OP_SMALLER_EQUALS=32, 
		OP_GREATER_EQUALS=33, OP_LOGICAL_AND=34, OP_LOGICAL_OR=35, OP_LOGICAL_NOT=36, 
		OP_TERNARY_TRUE=37, OP_TERNARY_FALSE=38, OP_SEMICOLON=39, IDENTIFIER=40, 
		WS=41;
	public static final int
		RULE_program = 0, RULE_statement_list = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_print = 4, RULE_print_argument_list = 5, RULE_conditional = 6, RULE_loop = 7, 
		RULE_traditional_for_loop = 8, RULE_traditional_while_loop = 9, RULE_range_for_loop = 10, 
		RULE_range = 11, RULE_expression = 12, RULE_boolean_expression = 13, RULE_comparison_expression = 14, 
		RULE_numeric_expression = 15, RULE_string_expression = 16, RULE_string_term = 17, 
		RULE_ternary_expression = 18, RULE_expression_term = 19, RULE_literal = 20, 
		RULE_data_type = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement_list", "statement", "assignment", "print", "print_argument_list", 
			"conditional", "loop", "traditional_for_loop", "traditional_while_loop", 
			"range_for_loop", "range", "expression", "boolean_expression", "comparison_expression", 
			"numeric_expression", "string_expression", "string_term", "ternary_expression", 
			"expression_term", "literal", "data_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'('", "')'", "','", "'if'", "'{'", "'}'", "'else'", 
			"'for'", "'while'", "'in'", "'range'", "'int'", "'boolean'", "'string'", 
			null, null, null, null, "'true'", "'false'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'++'", "'--'", "'=='", "'<'", "'>'", "'<='", "'>='", "'&&'", 
			"'||'", "'!'", "'?'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "BOOLEAN_L", "INTEGER_L", "STRING_L", "DIGIT", 
			"BOOLEAN_TRUE", "BOOLEAN_FALSE", "OP_ASSIGN", "OP_ADD", "OP_SUB", "OP_MUL", 
			"OP_DIV", "OP_SUCCESSOR", "OP_PREDECESSOR", "OP_EQUALS", "OP_SMALLER", 
			"OP_GREATER", "OP_SMALLER_EQUALS", "OP_GREATER_EQUALS", "OP_LOGICAL_AND", 
			"OP_LOGICAL_OR", "OP_LOGICAL_NOT", "OP_TERNARY_TRUE", "OP_TERNARY_FALSE", 
			"OP_SEMICOLON", "IDENTIFIER", "WS"
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
			setState(44);
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
			setState(46);
			statement();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SEMICOLON) {
				{
				{
				setState(47);
				match(OP_SEMICOLON);
				setState(48);
				statement();
				}
				}
				setState(53);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				assignment();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				print();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				conditional();
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) {
				{
				setState(60);
				data_type();
				}
			}

			setState(63);
			match(IDENTIFIER);
			setState(64);
			match(OP_ASSIGN);
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(65);
				literal();
				}
				break;
			case 2:
				{
				setState(66);
				expression();
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
			setState(69);
			match(T__0);
			setState(70);
			match(T__1);
			setState(71);
			print_argument_list();
			setState(72);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Print_argument_listContext print_argument_list() {
			return getRuleContext(Print_argument_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(OrangeParser.IDENTIFIER, 0); }
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				literal();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(75);
					match(T__3);
					setState(76);
					print_argument_list();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(IDENTIFIER);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(80);
					match(T__3);
					setState(81);
					print_argument_list();
					}
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
			setState(86);
			match(T__4);
			setState(87);
			match(T__1);
			setState(88);
			expression();
			setState(89);
			match(T__2);
			setState(90);
			match(T__5);
			setState(91);
			statement_list();
			setState(92);
			match(T__6);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(93);
				match(T__7);
				setState(94);
				match(T__5);
				setState(95);
				statement_list();
				setState(96);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				traditional_for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				traditional_while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
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
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
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
			setState(105);
			match(T__8);
			setState(106);
			match(T__1);
			setState(107);
			data_type();
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(OP_ASSIGN);
			setState(110);
			expression_term();
			setState(111);
			match(OP_SEMICOLON);
			setState(112);
			comparison_expression();
			setState(113);
			match(OP_SEMICOLON);
			setState(114);
			expression();
			setState(115);
			match(T__2);
			setState(116);
			match(T__5);
			setState(117);
			statement_list();
			setState(118);
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
			setState(120);
			match(T__9);
			setState(121);
			match(T__1);
			setState(122);
			expression();
			setState(123);
			match(T__2);
			setState(124);
			match(T__5);
			setState(125);
			statement_list();
			setState(126);
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
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
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
			setState(128);
			match(T__8);
			setState(129);
			match(IDENTIFIER);
			setState(130);
			match(T__10);
			setState(131);
			match(T__11);
			setState(132);
			match(T__1);
			setState(133);
			range();
			setState(134);
			match(T__2);
			setState(135);
			match(T__5);
			setState(136);
			statement_list();
			setState(137);
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
	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_L() { return getTokens(OrangeParser.INTEGER_L); }
		public TerminalNode INTEGER_L(int i) {
			return getToken(OrangeParser.INTEGER_L, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(INTEGER_L);
			setState(140);
			match(T__3);
			setState(141);
			match(INTEGER_L);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				boolean_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				numeric_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				comparison_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
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
		enterRule(_localctx, 26, RULE_boolean_expression);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				expression_term();
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==OP_LOGICAL_AND || _la==OP_LOGICAL_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				expression_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(OP_LOGICAL_NOT);
				setState(154);
				expression_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
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
		enterRule(_localctx, 28, RULE_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			expression_term();
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16642998272L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(160);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_numeric_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_L:
			case INTEGER_L:
			case STRING_L:
			case BOOLEAN_TRUE:
			case BOOLEAN_FALSE:
			case IDENTIFIER:
				{
				setState(163);
				expression_term();
				}
				break;
			case T__1:
				{
				setState(164);
				match(T__1);
				setState(165);
				numeric_expression(0);
				setState(166);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						numeric_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						_la = _input.LA(1);
						if ( !(_la==OP_MUL || _la==OP_DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						numeric_expression(3);
						}
						break;
					case 3:
						{
						_localctx = new Numeric_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expression);
						setState(176);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(177);
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
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 32, RULE_string_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			string_term();
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					match(OP_ADD);
					setState(185);
					string_term();
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 34, RULE_string_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(_la==STRING_L || _la==IDENTIFIER) ) {
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
		enterRule(_localctx, 36, RULE_ternary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			boolean_expression();
			setState(194);
			match(OP_TERNARY_TRUE);
			setState(195);
			expression();
			setState(196);
			match(OP_TERNARY_FALSE);
			setState(197);
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
		enterRule(_localctx, 38, RULE_expression_term);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(BOOLEAN_FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(BOOLEAN_TRUE);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_L() { return getToken(OrangeParser.INTEGER_L, 0); }
		public TerminalNode BOOLEAN_L() { return getToken(OrangeParser.BOOLEAN_L, 0); }
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(INTEGER_L);
				}
				break;
			case BOOLEAN_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(BOOLEAN_L);
				}
				break;
			case STRING_L:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				string_expression();
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
	public static class Data_typeContext extends ParserRuleContext {
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OrangeListener ) ((OrangeListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OrangeVisitor ) return ((OrangeVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
		case 15:
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
		"\u0004\u0001)\u00d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"2\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003\u0003\u0003>\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005S\b\u0005\u0003\u0005U\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007h\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0094\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009d\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a9\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00b3\b\u000f\n\u000f\f\u000f\u00b6\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00bb\b\u0010\n\u0010"+
		"\f\u0010\u00be\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00cc\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00d1\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0000\u0001\u001e\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0007\u0001\u0000\""+
		"#\u0001\u0000\u001d!\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001a\u0001"+
		"\u0000\u001b\u001c\u0002\u0000\u0012\u0012((\u0001\u0000\r\u000f\u00d9"+
		"\u0000,\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u0004:"+
		"\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bE\u0001\u0000"+
		"\u0000\u0000\nT\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000e"+
		"g\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000\u0012x\u0001"+
		"\u0000\u0000\u0000\u0014\u0080\u0001\u0000\u0000\u0000\u0016\u008b\u0001"+
		"\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a\u009c\u0001"+
		"\u0000\u0000\u0000\u001c\u009e\u0001\u0000\u0000\u0000\u001e\u00a8\u0001"+
		"\u0000\u0000\u0000 \u00b7\u0001\u0000\u0000\u0000\"\u00bf\u0001\u0000"+
		"\u0000\u0000$\u00c1\u0001\u0000\u0000\u0000&\u00cb\u0001\u0000\u0000\u0000"+
		"(\u00d0\u0001\u0000\u0000\u0000*\u00d2\u0001\u0000\u0000\u0000,-\u0003"+
		"\u0002\u0001\u0000-\u0001\u0001\u0000\u0000\u0000.3\u0003\u0004\u0002"+
		"\u0000/0\u0005\'\u0000\u000002\u0003\u0004\u0002\u00001/\u0001\u0000\u0000"+
		"\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u00004\u0003\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"6;\u0003\u0006\u0003\u00007;\u0003\b\u0004\u00008;\u0003\f\u0006\u0000"+
		"9;\u0003\u000e\u0007\u0000:6\u0001\u0000\u0000\u0000:7\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;\u0005\u0001"+
		"\u0000\u0000\u0000<>\u0003*\u0015\u0000=<\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005(\u0000\u0000@C\u0005"+
		"\u0016\u0000\u0000AD\u0003(\u0014\u0000BD\u0003\u0018\f\u0000CA\u0001"+
		"\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0007\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0001\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0003\n\u0005"+
		"\u0000HI\u0005\u0003\u0000\u0000I\t\u0001\u0000\u0000\u0000JM\u0003(\u0014"+
		"\u0000KL\u0005\u0004\u0000\u0000LN\u0003\n\u0005\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NU\u0001\u0000\u0000\u0000OR\u0005(\u0000"+
		"\u0000PQ\u0005\u0004\u0000\u0000QS\u0003\n\u0005\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TJ\u0001\u0000"+
		"\u0000\u0000TO\u0001\u0000\u0000\u0000U\u000b\u0001\u0000\u0000\u0000"+
		"VW\u0005\u0005\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u0003\u0018\f\u0000"+
		"YZ\u0005\u0003\u0000\u0000Z[\u0005\u0006\u0000\u0000[\\\u0003\u0002\u0001"+
		"\u0000\\b\u0005\u0007\u0000\u0000]^\u0005\b\u0000\u0000^_\u0005\u0006"+
		"\u0000\u0000_`\u0003\u0002\u0001\u0000`a\u0005\u0007\u0000\u0000ac\u0001"+
		"\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"c\r\u0001\u0000\u0000\u0000dh\u0003\u0010\b\u0000eh\u0003\u0012\t\u0000"+
		"fh\u0003\u0014\n\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000h\u000f\u0001\u0000\u0000\u0000ij\u0005\t\u0000"+
		"\u0000jk\u0005\u0002\u0000\u0000kl\u0003*\u0015\u0000lm\u0005(\u0000\u0000"+
		"mn\u0005\u0016\u0000\u0000no\u0003&\u0013\u0000op\u0005\'\u0000\u0000"+
		"pq\u0003\u001c\u000e\u0000qr\u0005\'\u0000\u0000rs\u0003\u0018\f\u0000"+
		"st\u0005\u0003\u0000\u0000tu\u0005\u0006\u0000\u0000uv\u0003\u0002\u0001"+
		"\u0000vw\u0005\u0007\u0000\u0000w\u0011\u0001\u0000\u0000\u0000xy\u0005"+
		"\n\u0000\u0000yz\u0005\u0002\u0000\u0000z{\u0003\u0018\f\u0000{|\u0005"+
		"\u0003\u0000\u0000|}\u0005\u0006\u0000\u0000}~\u0003\u0002\u0001\u0000"+
		"~\u007f\u0005\u0007\u0000\u0000\u007f\u0013\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\t\u0000\u0000\u0081\u0082\u0005(\u0000\u0000\u0082\u0083"+
		"\u0005\u000b\u0000\u0000\u0083\u0084\u0005\f\u0000\u0000\u0084\u0085\u0005"+
		"\u0002\u0000\u0000\u0085\u0086\u0003\u0016\u000b\u0000\u0086\u0087\u0005"+
		"\u0003\u0000\u0000\u0087\u0088\u0005\u0006\u0000\u0000\u0088\u0089\u0003"+
		"\u0002\u0001\u0000\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u0015\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u0011\u0000\u0000\u008c\u008d\u0005"+
		"\u0004\u0000\u0000\u008d\u008e\u0005\u0011\u0000\u0000\u008e\u0017\u0001"+
		"\u0000\u0000\u0000\u008f\u0094\u0003\u001a\r\u0000\u0090\u0094\u0003\u001e"+
		"\u000f\u0000\u0091\u0094\u0003\u001c\u000e\u0000\u0092\u0094\u0003$\u0012"+
		"\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095\u0096\u0003&\u0013\u0000"+
		"\u0096\u0097\u0007\u0000\u0000\u0000\u0097\u0098\u0003&\u0013\u0000\u0098"+
		"\u009d\u0001\u0000\u0000\u0000\u0099\u009a\u0005$\u0000\u0000\u009a\u009d"+
		"\u0003&\u0013\u0000\u009b\u009d\u0003&\u0013\u0000\u009c\u0095\u0001\u0000"+
		"\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u001b\u0001\u0000\u0000\u0000\u009e\u009f\u0003&\u0013"+
		"\u0000\u009f\u00a0\u0007\u0001\u0000\u0000\u00a0\u00a1\u0003&\u0013\u0000"+
		"\u00a1\u001d\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006\u000f\uffff\uffff"+
		"\u0000\u00a3\u00a9\u0003&\u0013\u0000\u00a4\u00a5\u0005\u0002\u0000\u0000"+
		"\u00a5\u00a6\u0003\u001e\u000f\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000"+
		"\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a9\u00b4\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\n\u0003\u0000\u0000\u00ab\u00ac\u0007\u0002\u0000\u0000\u00ac"+
		"\u00b3\u0003\u001e\u000f\u0004\u00ad\u00ae\n\u0002\u0000\u0000\u00ae\u00af"+
		"\u0007\u0003\u0000\u0000\u00af\u00b3\u0003\u001e\u000f\u0003\u00b0\u00b1"+
		"\n\u0001\u0000\u0000\u00b1\u00b3\u0007\u0004\u0000\u0000\u00b2\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u001f\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00bc\u0003"+
		"\"\u0011\u0000\u00b8\u00b9\u0005\u0017\u0000\u0000\u00b9\u00bb\u0003\""+
		"\u0011\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0007\u0005\u0000\u0000\u00c0#\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0003\u001a\r\u0000\u00c2\u00c3\u0005%\u0000\u0000\u00c3"+
		"\u00c4\u0003\u0018\f\u0000\u00c4\u00c5\u0005&\u0000\u0000\u00c5\u00c6"+
		"\u0003\u0018\f\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00cc\u0005"+
		"(\u0000\u0000\u00c8\u00cc\u0003(\u0014\u0000\u00c9\u00cc\u0005\u0015\u0000"+
		"\u0000\u00ca\u00cc\u0005\u0014\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\'\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d1\u0005\u0011\u0000\u0000\u00ce\u00d1\u0005\u0010\u0000\u0000"+
		"\u00cf\u00d1\u0003 \u0010\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		")\u0001\u0000\u0000\u0000\u00d2\u00d3\u0007\u0006\u0000\u0000\u00d3+\u0001"+
		"\u0000\u0000\u0000\u00113:=CMRTbg\u0093\u009c\u00a8\u00b2\u00b4\u00bc"+
		"\u00cb\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}