// Generated from /Users/henryheese/Desktop/CS4450/PoPL-Parser-Project/PythonGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NEWLINE=10, INT=11, FLOAT=12, STRING=13, DOUBLE=14, BOOL=15, LITERAL=16, 
		VARNAME=17, ASSIGNMENT=18, ASSSIGNMENTOPERATOR=19, SIGNS=20, IFELSE=21, 
		LIST=22, LISTITEM=23, TRUE=24, FALSE=25, WS=26, TAB=27, CONOPERATORS=28, 
		CONSTATEMENTS=29;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_printRule = 2, RULE_ifstatement = 3, 
		RULE_elifstatement = 4, RULE_elsestatement = 5, RULE_thenstatement = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "printRule", "ifstatement", "elifstatement", "elsestatement", 
			"thenstatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'print('", "'if'", "'and'", "'or'", "':'", "'\nelif'", 
			"'\nelse:'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'True'", "'False'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"INT", "FLOAT", "STRING", "DOUBLE", "BOOL", "LITERAL", "VARNAME", "ASSIGNMENT", 
			"ASSSIGNMENTOPERATOR", "SIGNS", "IFELSE", "LIST", "LISTITEM", "TRUE", 
			"FALSE", "WS", "TAB", "CONOPERATORS", "CONSTATEMENTS"
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
	public String getGrammarFileName() { return "PythonGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonGrammarParser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << ASSIGNMENT))) != 0)) {
				{
				{
				setState(14);
				expr();
				setState(15);
				match(NEWLINE);
				}
				}
				setState(21);
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

	public static class ExprContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintRuleContext printRule() {
			return getRuleContext(PrintRuleContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PythonGrammarParser.ASSIGNMENT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				ifstatement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(T__0);
				setState(24);
				expr();
				setState(25);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				printRule();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				match(ASSIGNMENT);
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

	public static class PrintRuleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printRule; }
	}

	public final PrintRuleContext printRule() throws RecognitionException {
		PrintRuleContext _localctx = new PrintRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__2);
			setState(32);
			expr();
			setState(33);
			match(T__1);
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

	public static class IfstatementContext extends ParserRuleContext {
		public ThenstatementContext thenstatement() {
			return getRuleContext(ThenstatementContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(PythonGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PythonGrammarParser.WS, i);
		}
		public List<TerminalNode> CONSTATEMENTS() { return getTokens(PythonGrammarParser.CONSTATEMENTS); }
		public TerminalNode CONSTATEMENTS(int i) {
			return getToken(PythonGrammarParser.CONSTATEMENTS, i);
		}
		public List<ElifstatementContext> elifstatement() {
			return getRuleContexts(ElifstatementContext.class);
		}
		public ElifstatementContext elifstatement(int i) {
			return getRuleContext(ElifstatementContext.class,i);
		}
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifstatement);
		int _la;
		try {
			int _alt;
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(T__3);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(36);
					match(WS);
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42);
				match(T__0);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(43);
					match(WS);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(49);
					match(CONSTATEMENTS);
					setState(53);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(50);
							match(WS);
							}
							} 
						}
						setState(55);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(57); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(56);
							match(WS);
							}
							}
							setState(59); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(61);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(63); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(62);
								match(WS);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(65); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONSTATEMENTS );
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(73);
					match(WS);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(T__1);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(80);
					match(WS);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__6);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(87);
					match(WS);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				thenstatement();
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						elifstatement();
						}
						} 
					}
					setState(99);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(100);
					elsestatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__3);
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(104);
						match(WS);
						}
						} 
					}
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(130); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(110);
							match(WS);
							}
							}
							setState(115);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(116);
						match(CONSTATEMENTS);
						setState(128);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(118); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(117);
								match(WS);
								}
								}
								setState(120); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS );
							setState(122);
							_la = _input.LA(1);
							if ( !(_la==T__4 || _la==T__5) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(124); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(123);
									match(WS);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(126); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(132); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(134);
					match(WS);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__6);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(141);
					match(WS);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				thenstatement();
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(148);
						elifstatement();
						}
						} 
					}
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(154);
					elsestatement();
					}
					break;
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

	public static class ElifstatementContext extends ParserRuleContext {
		public ThenstatementContext thenstatement() {
			return getRuleContext(ThenstatementContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(PythonGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PythonGrammarParser.WS, i);
		}
		public List<TerminalNode> CONSTATEMENTS() { return getTokens(PythonGrammarParser.CONSTATEMENTS); }
		public TerminalNode CONSTATEMENTS(int i) {
			return getToken(PythonGrammarParser.CONSTATEMENTS, i);
		}
		public ElifstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstatement; }
	}

	public final ElifstatementContext elifstatement() throws RecognitionException {
		ElifstatementContext _localctx = new ElifstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elifstatement);
		int _la;
		try {
			int _alt;
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T__7);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(160);
					match(WS);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__0);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(167);
					match(WS);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(173);
					match(CONSTATEMENTS);
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(174);
							match(WS);
							}
							} 
						}
						setState(179);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(181); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(180);
							match(WS);
							}
							}
							setState(183); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(185);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(186);
								match(WS);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(189); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONSTATEMENTS );
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(197);
					match(WS);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(T__1);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(204);
					match(WS);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(T__6);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(211);
					match(WS);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				thenstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(T__7);
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(219);
						match(WS);
						}
						} 
					}
					setState(224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(245); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(225);
							match(WS);
							}
							}
							setState(230);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(231);
						match(CONSTATEMENTS);
						setState(243);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(233); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(232);
								match(WS);
								}
								}
								setState(235); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS );
							setState(237);
							_la = _input.LA(1);
							if ( !(_la==T__4 || _la==T__5) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(239); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(238);
									match(WS);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(241); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(249);
					match(WS);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(T__6);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(256);
					match(WS);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				thenstatement();
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

	public static class ElsestatementContext extends ParserRuleContext {
		public ThenstatementContext thenstatement() {
			return getRuleContext(ThenstatementContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(PythonGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(PythonGrammarParser.WS, i);
		}
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__8);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(266);
				match(WS);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			thenstatement();
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

	public static class ThenstatementContext extends ParserRuleContext {
		public List<TerminalNode> TAB() { return getTokens(PythonGrammarParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(PythonGrammarParser.TAB, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonGrammarParser.NEWLINE, i);
		}
		public ThenstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenstatement; }
	}

	public final ThenstatementContext thenstatement() throws RecognitionException {
		ThenstatementContext _localctx = new ThenstatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_thenstatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(274);
						match(NEWLINE);
						}
						}
						setState(277); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(279);
					match(TAB);
					setState(280);
					expr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(283); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0120\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\7\5(\n\5\f\5\16\5+\13\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3"+
		"\5\3\5\7\5\66\n\5\f\5\16\59\13\5\3\5\6\5<\n\5\r\5\16\5=\3\5\3\5\6\5B\n"+
		"\5\r\5\16\5C\5\5F\n\5\6\5H\n\5\r\5\16\5I\3\5\7\5M\n\5\f\5\16\5P\13\5\3"+
		"\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5"+
		"\7\5b\n\5\f\5\16\5e\13\5\3\5\5\5h\n\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5"+
		"\3\5\7\5r\n\5\f\5\16\5u\13\5\3\5\3\5\6\5y\n\5\r\5\16\5z\3\5\3\5\6\5\177"+
		"\n\5\r\5\16\5\u0080\5\5\u0083\n\5\6\5\u0085\n\5\r\5\16\5\u0086\3\5\7\5"+
		"\u008a\n\5\f\5\16\5\u008d\13\5\3\5\3\5\7\5\u0091\n\5\f\5\16\5\u0094\13"+
		"\5\3\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\3\5\5\5\u009e\n\5\5\5\u00a0"+
		"\n\5\3\6\3\6\7\6\u00a4\n\6\f\6\16\6\u00a7\13\6\3\6\3\6\7\6\u00ab\n\6\f"+
		"\6\16\6\u00ae\13\6\3\6\3\6\7\6\u00b2\n\6\f\6\16\6\u00b5\13\6\3\6\6\6\u00b8"+
		"\n\6\r\6\16\6\u00b9\3\6\3\6\6\6\u00be\n\6\r\6\16\6\u00bf\5\6\u00c2\n\6"+
		"\6\6\u00c4\n\6\r\6\16\6\u00c5\3\6\7\6\u00c9\n\6\f\6\16\6\u00cc\13\6\3"+
		"\6\3\6\7\6\u00d0\n\6\f\6\16\6\u00d3\13\6\3\6\3\6\7\6\u00d7\n\6\f\6\16"+
		"\6\u00da\13\6\3\6\3\6\3\6\7\6\u00df\n\6\f\6\16\6\u00e2\13\6\3\6\7\6\u00e5"+
		"\n\6\f\6\16\6\u00e8\13\6\3\6\3\6\6\6\u00ec\n\6\r\6\16\6\u00ed\3\6\3\6"+
		"\6\6\u00f2\n\6\r\6\16\6\u00f3\5\6\u00f6\n\6\6\6\u00f8\n\6\r\6\16\6\u00f9"+
		"\3\6\7\6\u00fd\n\6\f\6\16\6\u0100\13\6\3\6\3\6\7\6\u0104\n\6\f\6\16\6"+
		"\u0107\13\6\3\6\5\6\u010a\n\6\3\7\3\7\7\7\u010e\n\7\f\7\16\7\u0111\13"+
		"\7\3\7\3\7\3\b\6\b\u0116\n\b\r\b\16\b\u0117\3\b\3\b\6\b\u011c\n\b\r\b"+
		"\16\b\u011d\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\7\b\2\u0149\2\25\3\2\2\2"+
		"\4\37\3\2\2\2\6!\3\2\2\2\b\u009f\3\2\2\2\n\u0109\3\2\2\2\f\u010b\3\2\2"+
		"\2\16\u011b\3\2\2\2\20\21\5\4\3\2\21\22\7\f\2\2\22\24\3\2\2\2\23\20\3"+
		"\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\25\3"+
		"\2\2\2\30 \5\b\5\2\31\32\7\3\2\2\32\33\5\4\3\2\33\34\7\4\2\2\34 \3\2\2"+
		"\2\35 \5\6\4\2\36 \7\24\2\2\37\30\3\2\2\2\37\31\3\2\2\2\37\35\3\2\2\2"+
		"\37\36\3\2\2\2 \5\3\2\2\2!\"\7\5\2\2\"#\5\4\3\2#$\7\4\2\2$\7\3\2\2\2%"+
		")\7\6\2\2&(\7\34\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2"+
		"\2+)\3\2\2\2,\60\7\3\2\2-/\7\34\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61G\3\2\2\2\62\60\3\2\2\2\63\67\7\37\2\2\64\66\7\34\2\2"+
		"\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28E\3\2\2\29\67\3\2"+
		"\2\2:<\7\34\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\t"+
		"\2\2\2@B\7\34\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E;"+
		"\3\2\2\2EF\3\2\2\2FH\3\2\2\2G\63\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"JN\3\2\2\2KM\7\34\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2"+
		"\2PN\3\2\2\2QU\7\4\2\2RT\7\34\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2VX\3\2\2\2WU\3\2\2\2X\\\7\t\2\2Y[\7\34\2\2ZY\3\2\2\2[^\3\2\2\2\\Z"+
		"\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_c\5\16\b\2`b\5\n\6\2a`\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fh\5\f\7\2gf\3\2\2"+
		"\2gh\3\2\2\2h\u00a0\3\2\2\2im\7\6\2\2jl\7\34\2\2kj\3\2\2\2lo\3\2\2\2m"+
		"k\3\2\2\2mn\3\2\2\2n\u0084\3\2\2\2om\3\2\2\2pr\7\34\2\2qp\3\2\2\2ru\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2v\u0082\7\37\2\2wy\7\34"+
		"\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\t\2\2\2}\177"+
		"\7\34\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0083\3\2\2\2\u0082x\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084s\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u008b\3\2\2\2\u0088\u008a\7\34\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0092\7\t\2\2\u008f\u0091\7\34"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0099\5\16"+
		"\b\2\u0096\u0098\5\n\6\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009e\5\f\7\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f%\3\2\2\2\u009fi\3\2\2\2\u00a0\t\3\2\2\2\u00a1\u00a5"+
		"\7\n\2\2\u00a2\u00a4\7\34\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00ac\7\3\2\2\u00a9\u00ab\7\34\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00c3"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b3\7\37\2\2\u00b0\u00b2\7\34\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00c1\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\7\34\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00be\7\34\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00af\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9\7\34\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\7\4\2\2\u00ce"+
		"\u00d0\7\34\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d8\7\t\2\2\u00d5\u00d7\7\34\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u010a\5\16\b\2\u00dc\u00e0\7\n\2\2\u00dd\u00df\7"+
		"\34\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00f7\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\7\34"+
		"\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00f5\7\37"+
		"\2\2\u00ea\u00ec\7\34\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\t\2"+
		"\2\2\u00f0\u00f2\7\34\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00eb\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00e6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe\3\2"+
		"\2\2\u00fb\u00fd\7\34\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0105\7\t\2\2\u0102\u0104\7\34\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u010a\5\16\b\2\u0109\u00a1\3\2\2\2\u0109"+
		"\u00dc\3\2\2\2\u010a\13\3\2\2\2\u010b\u010f\7\13\2\2\u010c\u010e\7\34"+
		"\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\5\16"+
		"\b\2\u0113\r\3\2\2\2\u0114\u0116\7\f\2\2\u0115\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\7\35\2\2\u011a\u011c\5\4\3\2\u011b\u0115\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\17\3\2\2\2\61\25"+
		"\37)\60\67=CEINU\\cgmsz\u0080\u0082\u0086\u008b\u0092\u0099\u009d\u009f"+
		"\u00a5\u00ac\u00b3\u00b9\u00bf\u00c1\u00c5\u00ca\u00d1\u00d8\u00e0\u00e6"+
		"\u00ed\u00f3\u00f5\u00f9\u00fe\u0105\u0109\u010f\u0117\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}