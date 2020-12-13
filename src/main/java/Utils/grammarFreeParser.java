package Utils;// Generated from grammarFree.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarFreeParser extends Parser {
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
	public static final int
		RULE_firs_rule = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"firs_rule"
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

	@Override
	public String getGrammarFileName() { return "Utils/grammarFree.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarFreeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Firs_ruleContext extends ParserRuleContext {
		public Firs_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firs_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFreeListener ) ((grammarFreeListener)listener).enterFirs_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFreeListener ) ((grammarFreeListener)listener).exitFirs_rule(this);
		}
	}

	public final Firs_ruleContext firs_rule() throws RecognitionException {
		Firs_ruleContext _localctx = new Firs_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_firs_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\7\4\2\t\2\3\2"+
		"\3\2\3\2\2\2\3\2\2\2\2\5\2\4\3\2\2\2\4\5\3\2\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}