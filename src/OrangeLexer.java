// Generated from Orange.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OrangeLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "IDENTIFIER", "BOOLEAN_L", "INTEGER_L", "STRING_L", 
			"DIGIT", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "OP_ASSIGN", "OP_ADD", "OP_SUB", 
			"OP_MUL", "OP_DIV", "OP_SUCCESSOR", "OP_PREDECESSOR", "OP_EQUALS", "OP_SMALLER", 
			"OP_GREATER", "OP_SMALLER_EQUALS", "OP_GREATER_EQUALS", "OP_LOGICAL_AND", 
			"OP_LOGICAL_OR", "OP_LOGICAL_NOT", "OP_TERNARY_TRUE", "OP_TERNARY_FALSE", 
			"OP_SEMICOLON", "WS"
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


	public OrangeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Orange.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000&\u00da\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f{\b\f\n\f\f\f~\t\f\u0001\r\u0001"+
		"\r\u0003\r\u0082\b\r\u0001\u000e\u0004\u000e\u0085\b\u000e\u000b\u000e"+
		"\f\u000e\u0086\u0001\u000f\u0001\u000f\u0005\u000f\u008b\b\u000f\n\u000f"+
		"\f\u000f\u008e\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010"+
		"\u0093\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0097\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u009b\b\u0010\u000b\u0010\f\u0010\u009c"+
		"\u0003\u0010\u009f\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001\u008c\u0000&\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? A!C\"E#G$I%K&\u0001\u0000\u0006\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0002\u0000++--\u0001\u000009\u0001\u000019\u0002\u0000\t\n\r"+
		"\r\u00e1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000"+
		"\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000"+
		"\u0000K\u0001\u0000\u0000\u0000\u0001M\u0001\u0000\u0000\u0000\u0003S"+
		"\u0001\u0000\u0000\u0000\u0005U\u0001\u0000\u0000\u0000\u0007W\u0001\u0000"+
		"\u0000\u0000\tY\u0001\u0000\u0000\u0000\u000b\\\u0001\u0000\u0000\u0000"+
		"\r^\u0001\u0000\u0000\u0000\u000f`\u0001\u0000\u0000\u0000\u0011e\u0001"+
		"\u0000\u0000\u0000\u0013i\u0001\u0000\u0000\u0000\u0015o\u0001\u0000\u0000"+
		"\u0000\u0017r\u0001\u0000\u0000\u0000\u0019x\u0001\u0000\u0000\u0000\u001b"+
		"\u0081\u0001\u0000\u0000\u0000\u001d\u0084\u0001\u0000\u0000\u0000\u001f"+
		"\u0088\u0001\u0000\u0000\u0000!\u009e\u0001\u0000\u0000\u0000#\u00a0\u0001"+
		"\u0000\u0000\u0000%\u00a5\u0001\u0000\u0000\u0000\'\u00ab\u0001\u0000"+
		"\u0000\u0000)\u00ad\u0001\u0000\u0000\u0000+\u00af\u0001\u0000\u0000\u0000"+
		"-\u00b1\u0001\u0000\u0000\u0000/\u00b3\u0001\u0000\u0000\u00001\u00b5"+
		"\u0001\u0000\u0000\u00003\u00b8\u0001\u0000\u0000\u00005\u00bb\u0001\u0000"+
		"\u0000\u00007\u00be\u0001\u0000\u0000\u00009\u00c0\u0001\u0000\u0000\u0000"+
		";\u00c2\u0001\u0000\u0000\u0000=\u00c5\u0001\u0000\u0000\u0000?\u00c8"+
		"\u0001\u0000\u0000\u0000A\u00cb\u0001\u0000\u0000\u0000C\u00ce\u0001\u0000"+
		"\u0000\u0000E\u00d0\u0001\u0000\u0000\u0000G\u00d2\u0001\u0000\u0000\u0000"+
		"I\u00d4\u0001\u0000\u0000\u0000K\u00d6\u0001\u0000\u0000\u0000MN\u0005"+
		"p\u0000\u0000NO\u0005r\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005n\u0000"+
		"\u0000QR\u0005t\u0000\u0000R\u0002\u0001\u0000\u0000\u0000ST\u0005(\u0000"+
		"\u0000T\u0004\u0001\u0000\u0000\u0000UV\u0005)\u0000\u0000V\u0006\u0001"+
		"\u0000\u0000\u0000WX\u0005,\u0000\u0000X\b\u0001\u0000\u0000\u0000YZ\u0005"+
		"i\u0000\u0000Z[\u0005f\u0000\u0000[\n\u0001\u0000\u0000\u0000\\]\u0005"+
		"{\u0000\u0000]\f\u0001\u0000\u0000\u0000^_\u0005}\u0000\u0000_\u000e\u0001"+
		"\u0000\u0000\u0000`a\u0005e\u0000\u0000ab\u0005l\u0000\u0000bc\u0005s"+
		"\u0000\u0000cd\u0005e\u0000\u0000d\u0010\u0001\u0000\u0000\u0000ef\u0005"+
		"f\u0000\u0000fg\u0005o\u0000\u0000gh\u0005r\u0000\u0000h\u0012\u0001\u0000"+
		"\u0000\u0000ij\u0005w\u0000\u0000jk\u0005h\u0000\u0000kl\u0005i\u0000"+
		"\u0000lm\u0005l\u0000\u0000mn\u0005e\u0000\u0000n\u0014\u0001\u0000\u0000"+
		"\u0000op\u0005i\u0000\u0000pq\u0005n\u0000\u0000q\u0016\u0001\u0000\u0000"+
		"\u0000rs\u0005r\u0000\u0000st\u0005a\u0000\u0000tu\u0005n\u0000\u0000"+
		"uv\u0005g\u0000\u0000vw\u0005e\u0000\u0000w\u0018\u0001\u0000\u0000\u0000"+
		"x|\u0007\u0000\u0000\u0000y{\u0007\u0001\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u001a\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0003%\u0012\u0000\u0080\u0082\u0003#\u0011\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u001c"+
		"\u0001\u0000\u0000\u0000\u0083\u0085\u0003!\u0010\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u001e\u0001"+
		"\u0000\u0000\u0000\u0088\u008c\u0005\"\u0000\u0000\u0089\u008b\t\u0000"+
		"\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\"\u0000\u0000\u0090 \u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0007\u0002\u0000\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u009f\u0007\u0003\u0000\u0000\u0095\u0097\u0007\u0002\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0007\u0004\u0000"+
		"\u0000\u0099\u009b\u0007\u0003\u0000\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u0092\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000\u0000"+
		"\u0000\u009f\"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005t\u0000\u0000"+
		"\u00a1\u00a2\u0005r\u0000\u0000\u00a2\u00a3\u0005u\u0000\u0000\u00a3\u00a4"+
		"\u0005e\u0000\u0000\u00a4$\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005f"+
		"\u0000\u0000\u00a6\u00a7\u0005a\u0000\u0000\u00a7\u00a8\u0005l\u0000\u0000"+
		"\u00a8\u00a9\u0005s\u0000\u0000\u00a9\u00aa\u0005e\u0000\u0000\u00aa&"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005=\u0000\u0000\u00ac(\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005+\u0000\u0000\u00ae*\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005-\u0000\u0000\u00b0,\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005*\u0000\u0000\u00b2.\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005/"+
		"\u0000\u0000\u00b40\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005+\u0000\u0000"+
		"\u00b6\u00b7\u0005+\u0000\u0000\u00b72\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005-\u0000\u0000\u00b9\u00ba\u0005-\u0000\u0000\u00ba4\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005=\u0000\u0000\u00bc\u00bd\u0005=\u0000\u0000"+
		"\u00bd6\u0001\u0000\u0000\u0000\u00be\u00bf\u0005<\u0000\u0000\u00bf8"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005>\u0000\u0000\u00c1:\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005<\u0000\u0000\u00c3\u00c4\u0005=\u0000\u0000"+
		"\u00c4<\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005>\u0000\u0000\u00c6\u00c7"+
		"\u0005=\u0000\u0000\u00c7>\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005&"+
		"\u0000\u0000\u00c9\u00ca\u0005&\u0000\u0000\u00ca@\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005|\u0000\u0000\u00cc\u00cd\u0005|\u0000\u0000\u00cdB"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005!\u0000\u0000\u00cfD\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005?\u0000\u0000\u00d1F\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005:\u0000\u0000\u00d3H\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0005;\u0000\u0000\u00d5J\u0001\u0000\u0000\u0000\u00d6\u00d7\u0007\u0005"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0006%\u0000"+
		"\u0000\u00d9L\u0001\u0000\u0000\u0000\t\u0000|\u0081\u0086\u008c\u0092"+
		"\u0096\u009c\u009e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}