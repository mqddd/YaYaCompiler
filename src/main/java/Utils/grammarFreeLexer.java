package Utils;// Generated from grammarFree.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarFreeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD_VOID=1, KEYWORD_INT=2, KEYWORD_DOUBLE=3, KEYWORD_BOOL=4, KEYWORD_STRING=5, 
		KEYWORD_NULL=6, KEYWORD_THIS=7, KEYWORD_FOR=8, KEYWORD_WHILE=9, KEYWORD_IF=10, 
		KEYWORD_ELSE=11, KEYWORD_RETURN=12, KEYWORD_BREAK=13, KEYWORD_NEW=14, 
		KEYWORD_NEWARRAY=15, KEYWORD_PRINT=16, KEYWORD_READiNTEGER=17, KEYWORD_READLINE=18, 
		T_INT=19, T_DOUBLE=20, T_STRING=21, T_BOOLEAN=22, T_ID=23, OP_PLUS=24, 
		OP_DASH=25, OP_STAR=26, OP_SLASH=27, OP_PERCENT=28, OP_LESS=29, OP_LESSEQUAL=30, 
		OP_GREATER=31, OP_GREATEREQUAL=32, OP_ASSIGN=33, OP_EQUAL=34, OP_NOTEQUAL=35, 
		OP_AND=36, OP_OR=37, OP_NOT=38, OP_SEMICOLON=39, OP_COMA=40, OP_DOT=41, 
		OP_OPENCLOSEBRACKET=42, OP_OPENBRACKET=43, OP_CLOSEBRACKET=44, OP_OPENPARENTHESIS=45, 
		OP_CLOSEPARENTHESIS=46, OP_OPENBRACE=47, OP_CLOSEBRACE=48, COMMENT_MULTILINE=49, 
		COMMENT_SINGLELINE=50, WHITESPACE=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORD_VOID", "KEYWORD_INT", "KEYWORD_DOUBLE", "KEYWORD_BOOL", "KEYWORD_STRING", 
			"KEYWORD_NULL", "KEYWORD_THIS", "KEYWORD_FOR", "KEYWORD_WHILE", "KEYWORD_IF", 
			"KEYWORD_ELSE", "KEYWORD_RETURN", "KEYWORD_BREAK", "KEYWORD_NEW", "KEYWORD_NEWARRAY", 
			"KEYWORD_PRINT", "KEYWORD_READiNTEGER", "KEYWORD_READLINE", "T_INT", 
			"T_DOUBLE", "T_STRING", "T_BOOLEAN", "T_ID", "OP_PLUS", "OP_DASH", "OP_STAR", 
			"OP_SLASH", "OP_PERCENT", "OP_LESS", "OP_LESSEQUAL", "OP_GREATER", "OP_GREATEREQUAL", 
			"OP_ASSIGN", "OP_EQUAL", "OP_NOTEQUAL", "OP_AND", "OP_OR", "OP_NOT", 
			"OP_SEMICOLON", "OP_COMA", "OP_DOT", "OP_OPENCLOSEBRACKET", "OP_OPENBRACKET", 
			"OP_CLOSEBRACKET", "OP_OPENPARENTHESIS", "OP_CLOSEPARENTHESIS", "OP_OPENBRACE", 
			"OP_CLOSEBRACE", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'int'", "'double'", "'bool'", "'string'", "'null'", 
			"'this'", "'for'", "'while'", "'if'", "'else'", "'return'", "'break'", 
			"'new'", "'NewArray'", "'Print'", "'ReadInteger'", "'ReadLine'", null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", 
			"'>'", "'>='", "'='", "'=='", "'!='", "'&&'", "'||'", "'!'", "';'", "','", 
			"'.'", "'[]'", "'['", "']'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD_VOID", "KEYWORD_INT", "KEYWORD_DOUBLE", "KEYWORD_BOOL", 
			"KEYWORD_STRING", "KEYWORD_NULL", "KEYWORD_THIS", "KEYWORD_FOR", "KEYWORD_WHILE", 
			"KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_RETURN", "KEYWORD_BREAK", "KEYWORD_NEW", 
			"KEYWORD_NEWARRAY", "KEYWORD_PRINT", "KEYWORD_READiNTEGER", "KEYWORD_READLINE", 
			"T_INT", "T_DOUBLE", "T_STRING", "T_BOOLEAN", "T_ID", "OP_PLUS", "OP_DASH", 
			"OP_STAR", "OP_SLASH", "OP_PERCENT", "OP_LESS", "OP_LESSEQUAL", "OP_GREATER", 
			"OP_GREATEREQUAL", "OP_ASSIGN", "OP_EQUAL", "OP_NOTEQUAL", "OP_AND", 
			"OP_OR", "OP_NOT", "OP_SEMICOLON", "OP_COMA", "OP_DOT", "OP_OPENCLOSEBRACKET", 
			"OP_OPENBRACKET", "OP_CLOSEBRACKET", "OP_OPENPARENTHESIS", "OP_CLOSEPARENTHESIS", 
			"OP_OPENBRACE", "OP_CLOSEBRACE", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", 
			"WHITESPACE"
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


	public grammarFreeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Utils/grammarFree.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0178\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\6\24\u00db\n\24\r\24\16\24\u00dc\3\24\6\24\u00e0"+
		"\n\24\r\24\16\24\u00e1\5\24\u00e4\n\24\3\25\6\25\u00e7\n\25\r\25\16\25"+
		"\u00e8\3\25\3\25\7\25\u00ed\n\25\f\25\16\25\u00f0\13\25\3\25\3\25\5\25"+
		"\u00f4\n\25\3\25\6\25\u00f7\n\25\r\25\16\25\u00f8\5\25\u00fb\n\25\3\26"+
		"\3\26\7\26\u00ff\n\26\f\26\16\26\u0102\13\26\3\26\5\26\u0105\n\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0112\n\27\3\30"+
		"\3\30\7\30\u0116\n\30\f\30\16\30\u0119\13\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\7\62\u0158\n\62\f\62\16\62\u015b\13\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\7\63\u0166\n\63\f\63\16\63\u0169\13\63\3\63\5\63\u016c"+
		"\n\63\3\63\3\63\3\63\3\63\3\64\6\64\u0173\n\64\r\64\16\64\u0174\3\64\3"+
		"\64\3\u0159\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65\3\2\13\4\2ZZzz\5\2\62;CHch\4\2GGgg\4\2--//\5\2\f\f\17\17$$\4\2C\\"+
		"c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0187\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5n\3\2\2\2\7r\3\2\2\2\ty\3\2\2\2"+
		"\13~\3\2\2\2\r\u0085\3\2\2\2\17\u008a\3\2\2\2\21\u008f\3\2\2\2\23\u0093"+
		"\3\2\2\2\25\u0099\3\2\2\2\27\u009c\3\2\2\2\31\u00a1\3\2\2\2\33\u00a8\3"+
		"\2\2\2\35\u00ae\3\2\2\2\37\u00b2\3\2\2\2!\u00bb\3\2\2\2#\u00c1\3\2\2\2"+
		"%\u00cd\3\2\2\2\'\u00e3\3\2\2\2)\u00e6\3\2\2\2+\u00fc\3\2\2\2-\u0111\3"+
		"\2\2\2/\u0113\3\2\2\2\61\u011a\3\2\2\2\63\u011c\3\2\2\2\65\u011e\3\2\2"+
		"\2\67\u0120\3\2\2\29\u0122\3\2\2\2;\u0124\3\2\2\2=\u0126\3\2\2\2?\u0129"+
		"\3\2\2\2A\u012b\3\2\2\2C\u012e\3\2\2\2E\u0130\3\2\2\2G\u0133\3\2\2\2I"+
		"\u0136\3\2\2\2K\u0139\3\2\2\2M\u013c\3\2\2\2O\u013e\3\2\2\2Q\u0140\3\2"+
		"\2\2S\u0142\3\2\2\2U\u0144\3\2\2\2W\u0147\3\2\2\2Y\u0149\3\2\2\2[\u014b"+
		"\3\2\2\2]\u014d\3\2\2\2_\u014f\3\2\2\2a\u0151\3\2\2\2c\u0153\3\2\2\2e"+
		"\u0161\3\2\2\2g\u0172\3\2\2\2ij\7x\2\2jk\7q\2\2kl\7k\2\2lm\7f\2\2m\4\3"+
		"\2\2\2no\7k\2\2op\7p\2\2pq\7v\2\2q\6\3\2\2\2rs\7f\2\2st\7q\2\2tu\7w\2"+
		"\2uv\7d\2\2vw\7n\2\2wx\7g\2\2x\b\3\2\2\2yz\7d\2\2z{\7q\2\2{|\7q\2\2|}"+
		"\7n\2\2}\n\3\2\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081"+
		"\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7i\2\2\u0084\f\3\2\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7w\2\2\u0087\u0088\7n\2\2\u0088\u0089\7n\2\2"+
		"\u0089\16\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7j\2\2\u008c\u008d\7"+
		"k\2\2\u008d\u008e\7u\2\2\u008e\20\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0092\7t\2\2\u0092\22\3\2\2\2\u0093\u0094\7y\2\2\u0094\u0095"+
		"\7j\2\2\u0095\u0096\7k\2\2\u0096\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098"+
		"\24\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7h\2\2\u009b\26\3\2\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\30\3\2\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7"+
		"v\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7p\2\2\u00a7\32"+
		"\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7m\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7p\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7y\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7P\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7t\2\2"+
		"\u00b7\u00b8\7t\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7{\2\2\u00ba \3\2\2"+
		"\2\u00bb\u00bc\7R\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf"+
		"\7p\2\2\u00bf\u00c0\7v\2\2\u00c0\"\3\2\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7K\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7i\2\2"+
		"\u00ca\u00cb\7g\2\2\u00cb\u00cc\7t\2\2\u00cc$\3\2\2\2\u00cd\u00ce\7T\2"+
		"\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2"+
		"\7N\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7g\2\2\u00d5"+
		"&\3\2\2\2\u00d6\u00d7\7\62\2\2\u00d7\u00d8\t\2\2\2\u00d8\u00da\3\2\2\2"+
		"\u00d9\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e4\3\2\2\2\u00de\u00e0\4\62;\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00d6\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4"+
		"(\3\2\2\2\u00e5\u00e7\4\62;\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee"+
		"\7\60\2\2\u00eb\u00ed\4\62;\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00fa\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f3\t\4\2\2\u00f2\u00f4\t\5\2\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\4\62;\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb*\3\2\2\2"+
		"\u00fc\u0100\7$\2\2\u00fd\u00ff\n\6\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0105\7\17\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7$\2\2\u0107,\3\2\2\2\u0108\u0109"+
		"\7v\2\2\u0109\u010a\7t\2\2\u010a\u010b\7w\2\2\u010b\u0112\7g\2\2\u010c"+
		"\u010d\7h\2\2\u010d\u010e\7c\2\2\u010e\u010f\7n\2\2\u010f\u0110\7u\2\2"+
		"\u0110\u0112\7g\2\2\u0111\u0108\3\2\2\2\u0111\u010c\3\2\2\2\u0112.\3\2"+
		"\2\2\u0113\u0117\t\7\2\2\u0114\u0116\t\b\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\60\3\2\2"+
		"\2\u0119\u0117\3\2\2\2\u011a\u011b\7-\2\2\u011b\62\3\2\2\2\u011c\u011d"+
		"\7/\2\2\u011d\64\3\2\2\2\u011e\u011f\7,\2\2\u011f\66\3\2\2\2\u0120\u0121"+
		"\7\61\2\2\u01218\3\2\2\2\u0122\u0123\7\'\2\2\u0123:\3\2\2\2\u0124\u0125"+
		"\7>\2\2\u0125<\3\2\2\2\u0126\u0127\7>\2\2\u0127\u0128\7?\2\2\u0128>\3"+
		"\2\2\2\u0129\u012a\7@\2\2\u012a@\3\2\2\2\u012b\u012c\7@\2\2\u012c\u012d"+
		"\7?\2\2\u012dB\3\2\2\2\u012e\u012f\7?\2\2\u012fD\3\2\2\2\u0130\u0131\7"+
		"?\2\2\u0131\u0132\7?\2\2\u0132F\3\2\2\2\u0133\u0134\7#\2\2\u0134\u0135"+
		"\7?\2\2\u0135H\3\2\2\2\u0136\u0137\7(\2\2\u0137\u0138\7(\2\2\u0138J\3"+
		"\2\2\2\u0139\u013a\7~\2\2\u013a\u013b\7~\2\2\u013bL\3\2\2\2\u013c\u013d"+
		"\7#\2\2\u013dN\3\2\2\2\u013e\u013f\7=\2\2\u013fP\3\2\2\2\u0140\u0141\7"+
		".\2\2\u0141R\3\2\2\2\u0142\u0143\7\60\2\2\u0143T\3\2\2\2\u0144\u0145\7"+
		"]\2\2\u0145\u0146\7_\2\2\u0146V\3\2\2\2\u0147\u0148\7]\2\2\u0148X\3\2"+
		"\2\2\u0149\u014a\7_\2\2\u014aZ\3\2\2\2\u014b\u014c\7*\2\2\u014c\\\3\2"+
		"\2\2\u014d\u014e\7+\2\2\u014e^\3\2\2\2\u014f\u0150\7}\2\2\u0150`\3\2\2"+
		"\2\u0151\u0152\7\177\2\2\u0152b\3\2\2\2\u0153\u0154\7\61\2\2\u0154\u0155"+
		"\7,\2\2\u0155\u0159\3\2\2\2\u0156\u0158\13\2\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7,\2\2\u015d\u015e\7\61\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\b\62\2\2\u0160d\3\2\2\2\u0161\u0162\7\61\2"+
		"\2\u0162\u0163\7\61\2\2\u0163\u0167\3\2\2\2\u0164\u0166\n\t\2\2\u0165"+
		"\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\7\17\2\2\u016b"+
		"\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7\f"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b\63\2\2\u0170f\3\2\2\2\u0171\u0173"+
		"\t\n\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b\64\3\2\u0177h\3\2\2\2"+
		"\23\2\u00dc\u00e1\u00e3\u00e8\u00ee\u00f3\u00f8\u00fa\u0100\u0104\u0111"+
		"\u0117\u0159\u0167\u016b\u0174\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}