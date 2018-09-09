// Generated from /Users/felipereis/git/strongly-typed-schema-builder/src/main/resources/GraphQL.g4 by ANTLR 4.7
package antlr.tool;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NAME=27, STRING=28, BOOLEAN=29, NUMBER=30, COMMENT_LINE=31, 
		WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "NAME", "STRING", "BOOLEAN", "ESC", "UNICODE", "HEX", "NUMBER", 
		"INT", "EXP", "COMMENT_LINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'query'", "'fragment'", "'input'", "'type'", "'union'", "'scalar'", 
		"'interface'", "'{'", "','", "'}'", "':'", "'='", "'|'", "'enum'", "'implements'", 
		"'&'", "'('", "')'", "'mutation'", "'...'", "'on'", "'@'", "'$'", "'['", 
		"']'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NAME", "STRING", "BOOLEAN", "NUMBER", "COMMENT_LINE", 
		"WS"
	};
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


	public GraphQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\7\34\u00bd\n\34\f\34\16"+
		"\34\u00c0\13\34\3\35\3\35\3\35\7\35\u00c5\n\35\f\35\16\35\u00c8\13\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00d5\n\36"+
		"\3\37\3\37\3\37\5\37\u00da\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\5\"\u00e5"+
		"\n\"\3\"\3\"\3\"\6\"\u00ea\n\"\r\"\16\"\u00eb\3\"\5\"\u00ef\n\"\3\"\5"+
		"\"\u00f2\n\"\3\"\3\"\3\"\3\"\5\"\u00f8\n\"\3\"\5\"\u00fb\n\"\3#\3#\3#"+
		"\7#\u0100\n#\f#\16#\u0103\13#\5#\u0105\n#\3$\3$\5$\u0109\n$\3$\3$\3%\3"+
		"%\6%\u010f\n%\r%\16%\u0110\3%\3%\3%\3%\3&\6&\u0118\n&\r&\16&\u0119\3&"+
		"\3&\3\u0110\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37=\2?\2A\2C E\2G\2I!K\"\3\2\r\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\3\2\63;\4\2GGg"+
		"g\4\2--//\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0128\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2C\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5S\3\2\2\2\7\\\3\2\2\2\tb\3\2\2\2\13g\3\2"+
		"\2\2\rm\3\2\2\2\17t\3\2\2\2\21~\3\2\2\2\23\u0080\3\2\2\2\25\u0082\3\2"+
		"\2\2\27\u0084\3\2\2\2\31\u0086\3\2\2\2\33\u0088\3\2\2\2\35\u008a\3\2\2"+
		"\2\37\u008f\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u009e\3\2\2\2\'\u00a0"+
		"\3\2\2\2)\u00a9\3\2\2\2+\u00ad\3\2\2\2-\u00b0\3\2\2\2/\u00b2\3\2\2\2\61"+
		"\u00b4\3\2\2\2\63\u00b6\3\2\2\2\65\u00b8\3\2\2\2\67\u00ba\3\2\2\29\u00c1"+
		"\3\2\2\2;\u00d4\3\2\2\2=\u00d6\3\2\2\2?\u00db\3\2\2\2A\u00e1\3\2\2\2C"+
		"\u00fa\3\2\2\2E\u0104\3\2\2\2G\u0106\3\2\2\2I\u010c\3\2\2\2K\u0117\3\2"+
		"\2\2MN\7s\2\2NO\7w\2\2OP\7g\2\2PQ\7t\2\2QR\7{\2\2R\4\3\2\2\2ST\7h\2\2"+
		"TU\7t\2\2UV\7c\2\2VW\7i\2\2WX\7o\2\2XY\7g\2\2YZ\7p\2\2Z[\7v\2\2[\6\3\2"+
		"\2\2\\]\7k\2\2]^\7p\2\2^_\7r\2\2_`\7w\2\2`a\7v\2\2a\b\3\2\2\2bc\7v\2\2"+
		"cd\7{\2\2de\7r\2\2ef\7g\2\2f\n\3\2\2\2gh\7w\2\2hi\7p\2\2ij\7k\2\2jk\7"+
		"q\2\2kl\7p\2\2l\f\3\2\2\2mn\7u\2\2no\7e\2\2op\7c\2\2pq\7n\2\2qr\7c\2\2"+
		"rs\7t\2\2s\16\3\2\2\2tu\7k\2\2uv\7p\2\2vw\7v\2\2wx\7g\2\2xy\7t\2\2yz\7"+
		"h\2\2z{\7c\2\2{|\7e\2\2|}\7g\2\2}\20\3\2\2\2~\177\7}\2\2\177\22\3\2\2"+
		"\2\u0080\u0081\7.\2\2\u0081\24\3\2\2\2\u0082\u0083\7\177\2\2\u0083\26"+
		"\3\2\2\2\u0084\u0085\7<\2\2\u0085\30\3\2\2\2\u0086\u0087\7?\2\2\u0087"+
		"\32\3\2\2\2\u0088\u0089\7~\2\2\u0089\34\3\2\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7w\2\2\u008d\u008e\7o\2\2\u008e\36\3\2\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7o\2\2\u0091\u0092\7r\2\2\u0092\u0093\7n\2\2"+
		"\u0093\u0094\7g\2\2\u0094\u0095\7o\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7p\2\2\u0097\u0098\7v\2\2\u0098\u0099\7u\2\2\u0099 \3\2\2\2\u009a\u009b"+
		"\7(\2\2\u009b\"\3\2\2\2\u009c\u009d\7*\2\2\u009d$\3\2\2\2\u009e\u009f"+
		"\7+\2\2\u009f&\3\2\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7q\2\2\u00a7\u00a8\7p\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7\60\2\2\u00aa"+
		"\u00ab\7\60\2\2\u00ab\u00ac\7\60\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7q\2\2"+
		"\u00ae\u00af\7p\2\2\u00af,\3\2\2\2\u00b0\u00b1\7B\2\2\u00b1.\3\2\2\2\u00b2"+
		"\u00b3\7&\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\7]\2\2\u00b5\62\3\2\2\2\u00b6"+
		"\u00b7\7_\2\2\u00b7\64\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9\66\3\2\2\2\u00ba"+
		"\u00be\t\2\2\2\u00bb\u00bd\t\3\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf8\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c6\7$\2\2\u00c2\u00c5\5=\37\2\u00c3\u00c5\n\4\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7$\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\u00ce\7w\2\2\u00ce\u00d5\7g\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7c\2\2"+
		"\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d5\7g\2\2\u00d4\u00cb"+
		"\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5<\3\2\2\2\u00d6\u00d9\7^\2\2\u00d7\u00da"+
		"\t\5\2\2\u00d8\u00da\5? \2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		">\3\2\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\5A!\2\u00dd\u00de\5A!\2\u00de"+
		"\u00df\5A!\2\u00df\u00e0\5A!\2\u00e0@\3\2\2\2\u00e1\u00e2\t\6\2\2\u00e2"+
		"B\3\2\2\2\u00e3\u00e5\7/\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\5E#\2\u00e7\u00e9\7\60\2\2\u00e8\u00ea\t\7"+
		"\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\5G$\2\u00ee\u00ed\3\2\2"+
		"\2\u00ee\u00ef\3\2\2\2\u00ef\u00fb\3\2\2\2\u00f0\u00f2\7/\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\5E#\2\u00f4"+
		"\u00f5\5G$\2\u00f5\u00fb\3\2\2\2\u00f6\u00f8\7/\2\2\u00f7\u00f6\3\2\2"+
		"\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\5E#\2\u00fa\u00e4"+
		"\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fbD\3\2\2\2\u00fc"+
		"\u0105\7\62\2\2\u00fd\u0101\t\b\2\2\u00fe\u0100\t\7\2\2\u00ff\u00fe\3"+
		"\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u00fd\3\2"+
		"\2\2\u0105F\3\2\2\2\u0106\u0108\t\t\2\2\u0107\u0109\t\n\2\2\u0108\u0107"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\5E#\2\u010b"+
		"H\3\2\2\2\u010c\u010e\7%\2\2\u010d\u010f\13\2\2\2\u010e\u010d\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\t\13\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b%\2\2\u0115"+
		"J\3\2\2\2\u0116\u0118\t\f\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c"+
		"\b&\2\2\u011cL\3\2\2\2\23\2\u00be\u00c4\u00c6\u00d4\u00d9\u00e4\u00eb"+
		"\u00ee\u00f1\u00f7\u00fa\u0101\u0104\u0108\u0110\u0119\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}