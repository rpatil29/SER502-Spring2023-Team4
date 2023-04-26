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
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFIER=14, LETTER=15, DIGIT=16, 
		BOOLEAN_TRUE=17, BOOLEAN_FALSE=18, OP_ASSIGN=19, OP_ADD=20, OP_SUB=21, 
		OP_MUL=22, OP_DIV=23, OP_SUCCESSOR=24, OP_PREDECESSOR=25, OP_EQUALS=26, 
		OP_SMALLER=27, OP_GREATER=28, OP_SMALLER_EQUALS=29, OP_GREATER_EQUALS=30, 
		OP_LOGICAL_AND=31, OP_LOGICAL_OR=32, OP_LOGICAL_NOT=33, OP_TERNARY_TRUE=34, 
		OP_TERNARY_FALSE=35, OP_SEMICOLON=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "IDENTIFIER", "LETTER", "DIGIT", "BOOLEAN_TRUE", 
			"BOOLEAN_FALSE", "OP_ASSIGN", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", 
			"OP_SUCCESSOR", "OP_PREDECESSOR", "OP_EQUALS", "OP_SMALLER", "OP_GREATER", 
			"OP_SMALLER_EQUALS", "OP_GREATER_EQUALS", "OP_LOGICAL_AND", "OP_LOGICAL_OR", 
			"OP_LOGICAL_NOT", "OP_TERNARY_TRUE", "OP_TERNARY_FALSE", "OP_SEMICOLON", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'('", "')'", "','", "'if'", "'{'", "'}'", "'else'", 
			"'for'", "'while'", "'in'", "'range'", "'\"'", null, null, null, "'true'", 
			"'false'", "'='", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'=='", 
			"'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'!'", "'?'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "LETTER", "DIGIT", "BOOLEAN_TRUE", "BOOLEAN_FALSE", 
			"OP_ASSIGN", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_SUCCESSOR", 
			"OP_PREDECESSOR", "OP_EQUALS", "OP_SMALLER", "OP_GREATER", "OP_SMALLER_EQUALS", 
			"OP_GREATER_EQUALS", "OP_LOGICAL_AND", "OP_LOGICAL_OR", "OP_LOGICAL_NOT", 
			"OP_TERNARY_TRUE", "OP_TERNARY_FALSE", "OP_SEMICOLON", "WS"
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
		"\u0004\u0000%\u00d1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r{\b\r\n\r\f\r~\t\r"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0082\b\u000e\n\u000e\f\u000e\u0085"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f\u008a\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u008e\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u0092\b\u000f\u000b\u000f\f\u000f\u0093\u0003\u000f\u0096"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"\u0083\u0000%\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%\u0001\u0000\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az"+
		"\u0002\u0000++--\u0001\u000009\u0001\u000019\u0002\u0000\t\n\r\r\u00d6"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0001K"+
		"\u0001\u0000\u0000\u0000\u0003Q\u0001\u0000\u0000\u0000\u0005S\u0001\u0000"+
		"\u0000\u0000\u0007U\u0001\u0000\u0000\u0000\tW\u0001\u0000\u0000\u0000"+
		"\u000bZ\u0001\u0000\u0000\u0000\r\\\u0001\u0000\u0000\u0000\u000f^\u0001"+
		"\u0000\u0000\u0000\u0011c\u0001\u0000\u0000\u0000\u0013g\u0001\u0000\u0000"+
		"\u0000\u0015m\u0001\u0000\u0000\u0000\u0017p\u0001\u0000\u0000\u0000\u0019"+
		"v\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000\u0000\u001d\u007f\u0001"+
		"\u0000\u0000\u0000\u001f\u0095\u0001\u0000\u0000\u0000!\u0097\u0001\u0000"+
		"\u0000\u0000#\u009c\u0001\u0000\u0000\u0000%\u00a2\u0001\u0000\u0000\u0000"+
		"\'\u00a4\u0001\u0000\u0000\u0000)\u00a6\u0001\u0000\u0000\u0000+\u00a8"+
		"\u0001\u0000\u0000\u0000-\u00aa\u0001\u0000\u0000\u0000/\u00ac\u0001\u0000"+
		"\u0000\u00001\u00af\u0001\u0000\u0000\u00003\u00b2\u0001\u0000\u0000\u0000"+
		"5\u00b5\u0001\u0000\u0000\u00007\u00b7\u0001\u0000\u0000\u00009\u00b9"+
		"\u0001\u0000\u0000\u0000;\u00bc\u0001\u0000\u0000\u0000=\u00bf\u0001\u0000"+
		"\u0000\u0000?\u00c2\u0001\u0000\u0000\u0000A\u00c5\u0001\u0000\u0000\u0000"+
		"C\u00c7\u0001\u0000\u0000\u0000E\u00c9\u0001\u0000\u0000\u0000G\u00cb"+
		"\u0001\u0000\u0000\u0000I\u00cd\u0001\u0000\u0000\u0000KL\u0005p\u0000"+
		"\u0000LM\u0005r\u0000\u0000MN\u0005i\u0000\u0000NO\u0005n\u0000\u0000"+
		"OP\u0005t\u0000\u0000P\u0002\u0001\u0000\u0000\u0000QR\u0005(\u0000\u0000"+
		"R\u0004\u0001\u0000\u0000\u0000ST\u0005)\u0000\u0000T\u0006\u0001\u0000"+
		"\u0000\u0000UV\u0005,\u0000\u0000V\b\u0001\u0000\u0000\u0000WX\u0005i"+
		"\u0000\u0000XY\u0005f\u0000\u0000Y\n\u0001\u0000\u0000\u0000Z[\u0005{"+
		"\u0000\u0000[\f\u0001\u0000\u0000\u0000\\]\u0005}\u0000\u0000]\u000e\u0001"+
		"\u0000\u0000\u0000^_\u0005e\u0000\u0000_`\u0005l\u0000\u0000`a\u0005s"+
		"\u0000\u0000ab\u0005e\u0000\u0000b\u0010\u0001\u0000\u0000\u0000cd\u0005"+
		"f\u0000\u0000de\u0005o\u0000\u0000ef\u0005r\u0000\u0000f\u0012\u0001\u0000"+
		"\u0000\u0000gh\u0005w\u0000\u0000hi\u0005h\u0000\u0000ij\u0005i\u0000"+
		"\u0000jk\u0005l\u0000\u0000kl\u0005e\u0000\u0000l\u0014\u0001\u0000\u0000"+
		"\u0000mn\u0005i\u0000\u0000no\u0005n\u0000\u0000o\u0016\u0001\u0000\u0000"+
		"\u0000pq\u0005r\u0000\u0000qr\u0005a\u0000\u0000rs\u0005n\u0000\u0000"+
		"st\u0005g\u0000\u0000tu\u0005e\u0000\u0000u\u0018\u0001\u0000\u0000\u0000"+
		"vw\u0005\"\u0000\u0000w\u001a\u0001\u0000\u0000\u0000x|\u0007\u0000\u0000"+
		"\u0000y{\u0007\u0001\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u001c"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0083\u0005\""+
		"\u0000\u0000\u0080\u0082\t\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005\"\u0000\u0000"+
		"\u0087\u001e\u0001\u0000\u0000\u0000\u0088\u008a\u0007\u0002\u0000\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0096\u0007\u0003\u0000\u0000"+
		"\u008c\u008e\u0007\u0002\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0007\u0004\u0000\u0000\u0090\u0092\u0007\u0003\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0089\u0001\u0000\u0000\u0000"+
		"\u0095\u008d\u0001\u0000\u0000\u0000\u0096 \u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005t\u0000\u0000\u0098\u0099\u0005r\u0000\u0000\u0099\u009a\u0005"+
		"u\u0000\u0000\u009a\u009b\u0005e\u0000\u0000\u009b\"\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005f\u0000\u0000\u009d\u009e\u0005a\u0000\u0000\u009e"+
		"\u009f\u0005l\u0000\u0000\u009f\u00a0\u0005s\u0000\u0000\u00a0\u00a1\u0005"+
		"e\u0000\u0000\u00a1$\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005=\u0000"+
		"\u0000\u00a3&\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005+\u0000\u0000\u00a5"+
		"(\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005-\u0000\u0000\u00a7*\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005*\u0000\u0000\u00a9,\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005/\u0000\u0000\u00ab.\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005+\u0000\u0000\u00ad\u00ae\u0005+\u0000\u0000\u00ae0\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005-\u0000\u0000\u00b0\u00b1\u0005-\u0000"+
		"\u0000\u00b12\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005=\u0000\u0000\u00b3"+
		"\u00b4\u0005=\u0000\u0000\u00b44\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"<\u0000\u0000\u00b66\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005>\u0000"+
		"\u0000\u00b88\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005<\u0000\u0000\u00ba"+
		"\u00bb\u0005=\u0000\u0000\u00bb:\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		">\u0000\u0000\u00bd\u00be\u0005=\u0000\u0000\u00be<\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005&\u0000\u0000\u00c0\u00c1\u0005&\u0000\u0000\u00c1"+
		">\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005|\u0000\u0000\u00c3\u00c4\u0005"+
		"|\u0000\u0000\u00c4@\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005!\u0000"+
		"\u0000\u00c6B\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005?\u0000\u0000\u00c8"+
		"D\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005:\u0000\u0000\u00caF\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005;\u0000\u0000\u00ccH\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0007\u0005\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0006$\u0000\u0000\u00d0J\u0001\u0000\u0000\u0000\u0007"+
		"\u0000|\u0083\u0089\u008d\u0093\u0095\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}