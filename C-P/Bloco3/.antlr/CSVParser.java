// Generated from /home/aoki/UA/ano3/sem2/C/C-P/Bloco3/CSV.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CSVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STRING=2, NUMBER=3, NEWLINE=4, WS=5;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_line = 2, RULE_field = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "line", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STRING", "NUMBER", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "CSV.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSVParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSVParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CSVParser.NEWLINE, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==NUMBER) {
				{
				setState(16);
				line();
				}
			}

			setState(19);
			match(NEWLINE);
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
	public static class LineContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			field();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(22);
				match(T__0);
				setState(23);
				field();
				}
				}
				setState(28);
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CSVParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(CSVParser.NUMBER, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
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
		"\u0004\u0001\u0005 \u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003"+
		"\u0001\u0012\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u0019\b\u0002\n\u0002\f\u0002\u001c\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0001\u0001\u0000\u0002\u0003\u001e\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0002\u0011\u0001\u0000\u0000\u0000\u0004\u0015\u0001\u0000\u0000\u0000"+
		"\u0006\u001d\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001"+
		"\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0000\u0000\u0001\u000f"+
		"\u0001\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0004\u0002\u0000\u0011"+
		"\u0010\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0004\u0000\u0000\u0014"+
		"\u0003\u0001\u0000\u0000\u0000\u0015\u001a\u0003\u0006\u0003\u0000\u0016"+
		"\u0017\u0005\u0001\u0000\u0000\u0017\u0019\u0003\u0006\u0003\u0000\u0018"+
		"\u0016\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u0005\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0007\u0000\u0000\u0000\u001e\u0007\u0001\u0000\u0000\u0000\u0003"+
		"\u000b\u0011\u001a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}