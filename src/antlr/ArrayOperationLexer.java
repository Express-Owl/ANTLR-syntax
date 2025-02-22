// Generated from D:/Home/Documents/DUT3/Syntax/projet/untitled/src/antlr/ArrayOperation.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArrayOperationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, SUM=8, PROD=9, 
		MAX=10, MIN=11, SORT=12, ARRAY_TYPE=13, INT_TYPE=14, CONCAT=15, ID=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT", "SUM", "PROD", 
			"MAX", "MIN", "SORT", "ARRAY_TYPE", "INT_TYPE", "CONCAT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'+'", "'('", "','", "')'", null, "'sum'", "'prod'", 
			"'max'", "'min'", "'sort'", "'array'", "'int'", "'concat'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INT", "SUM", "PROD", "MAX", 
			"MIN", "SORT", "ARRAY_TYPE", "INT_TYPE", "CONCAT", "ID", "WS"
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


	public ArrayOperationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArrayOperation.g4"; }

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
		"\u0004\u0000\u0011n\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u00063\b\u0006\n\u0006\f\u00066\t\u0006\u0003\u00068\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000fc\b\u000f"+
		"\n\u000f\f\u000ff\t\u000f\u0001\u0010\u0004\u0010i\b\u0010\u000b\u0010"+
		"\f\u0010j\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011\u0001\u0000\u0005\u0001\u000019\u0001\u000009\u0001\u0000az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  q\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000"+
		"\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000"+
		"\u0000\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b"+
		"-\u0001\u0000\u0000\u0000\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000"+
		"\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013B\u0001\u0000\u0000\u0000"+
		"\u0015F\u0001\u0000\u0000\u0000\u0017J\u0001\u0000\u0000\u0000\u0019O"+
		"\u0001\u0000\u0000\u0000\u001bU\u0001\u0000\u0000\u0000\u001dY\u0001\u0000"+
		"\u0000\u0000\u001f`\u0001\u0000\u0000\u0000!h\u0001\u0000\u0000\u0000"+
		"#$\u0005;\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000"+
		"&\u0004\u0001\u0000\u0000\u0000\'(\u0005+\u0000\u0000(\u0006\u0001\u0000"+
		"\u0000\u0000)*\u0005(\u0000\u0000*\b\u0001\u0000\u0000\u0000+,\u0005,"+
		"\u0000\u0000,\n\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\f\u0001"+
		"\u0000\u0000\u0000/8\u00050\u0000\u000004\u0007\u0000\u0000\u000013\u0007"+
		"\u0001\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u00007/\u0001\u0000\u0000\u000070\u0001\u0000"+
		"\u0000\u00008\u000e\u0001\u0000\u0000\u00009:\u0005s\u0000\u0000:;\u0005"+
		"u\u0000\u0000;<\u0005m\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005"+
		"p\u0000\u0000>?\u0005r\u0000\u0000?@\u0005o\u0000\u0000@A\u0005d\u0000"+
		"\u0000A\u0012\u0001\u0000\u0000\u0000BC\u0005m\u0000\u0000CD\u0005a\u0000"+
		"\u0000DE\u0005x\u0000\u0000E\u0014\u0001\u0000\u0000\u0000FG\u0005m\u0000"+
		"\u0000GH\u0005i\u0000\u0000HI\u0005n\u0000\u0000I\u0016\u0001\u0000\u0000"+
		"\u0000JK\u0005s\u0000\u0000KL\u0005o\u0000\u0000LM\u0005r\u0000\u0000"+
		"MN\u0005t\u0000\u0000N\u0018\u0001\u0000\u0000\u0000OP\u0005a\u0000\u0000"+
		"PQ\u0005r\u0000\u0000QR\u0005r\u0000\u0000RS\u0005a\u0000\u0000ST\u0005"+
		"y\u0000\u0000T\u001a\u0001\u0000\u0000\u0000UV\u0005i\u0000\u0000VW\u0005"+
		"n\u0000\u0000WX\u0005t\u0000\u0000X\u001c\u0001\u0000\u0000\u0000YZ\u0005"+
		"c\u0000\u0000Z[\u0005o\u0000\u0000[\\\u0005n\u0000\u0000\\]\u0005c\u0000"+
		"\u0000]^\u0005a\u0000\u0000^_\u0005t\u0000\u0000_\u001e\u0001\u0000\u0000"+
		"\u0000`d\u0007\u0002\u0000\u0000ac\u0007\u0003\u0000\u0000ba\u0001\u0000"+
		"\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000e \u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gi\u0007\u0004\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0006\u0010\u0000\u0000m\"\u0001\u0000\u0000\u0000\u0005"+
		"\u000047dj\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}