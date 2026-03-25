// Generated from /home/mateusz-nowacki/IdeaProjects/czytelny_regex/src/main/java/org/example/antlr/JasnyRegexParser.g4 by ANTLR 4.13.2
package org.example.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JasnyRegexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZACZNIJ_OD=1, ZAKONCZ_NA=2, CYFRA=3, NIE_CYFRA=4, LITERA=5, ZNAK_BIALY=6, 
		DOWOLNY_ZNAK=7, SLOWO=8, TEKST=9, OPCJONALNIE=10, JEDEN_LUB_WIECEJ=11, 
		ZERO_LUB_WIECEJ=12, DOKLADNIE=13, OD=14, DO=15, MINIMUM=16, GRUPA=17, 
		LUB=18, LPAREN=19, RPAREN=20, SEMICOLON=21, NUMBER=22, STRING=23, WS=24;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_atom = 2, RULE_quantifier = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "atom", "quantifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ZACZNIJ_OD'", "'ZAKO\\u0143CZ_NA'", "'CYFRA'", "'NIE_CYFRA'", 
			"'LITERA'", "'ZNAK_BIA\\u0141Y'", "'DOWOLNY_ZNAK'", "'S\\u0141OWO'", 
			"'TEKST'", "'OPCJONALNIE'", "'JEDEN_LUB_WI\\u0118CEJ'", "'ZERO_LUB_WI\\u0118CEJ'", 
			"'DOK\\u0141ADNIE'", "'OD'", "'DO'", "'MINIMUM'", "'GRUPA'", "'LUB'", 
			"'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZACZNIJ_OD", "ZAKONCZ_NA", "CYFRA", "NIE_CYFRA", "LITERA", "ZNAK_BIALY", 
			"DOWOLNY_ZNAK", "SLOWO", "TEKST", "OPCJONALNIE", "JEDEN_LUB_WIECEJ", 
			"ZERO_LUB_WIECEJ", "DOKLADNIE", "OD", "DO", "MINIMUM", "GRUPA", "LUB", 
			"LPAREN", "RPAREN", "SEMICOLON", "NUMBER", "STRING", "WS"
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
	public String getGrammarFileName() { return "JasnyRegexParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JasnyRegexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JasnyRegexParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				expression();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 132094L) != 0) );
			setState(13);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupExprContext extends ExpressionContext {
		public TerminalNode GRUPA() { return getToken(JasnyRegexParser.GRUPA, 0); }
		public TerminalNode LPAREN() { return getToken(JasnyRegexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasnyRegexParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public GroupExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterGroupExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitGroupExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitGroupExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public AtomExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpressionContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode LUB() { return getToken(JasnyRegexParser.LUB, 0); }
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AtomExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				atom();
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 97280L) != 0)) {
					{
					setState(16);
					quantifier();
					}
				}

				setState(19);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new GroupExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(GRUPA);
				setState(22);
				match(LPAREN);
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(23);
					expression();
					}
					}
					setState(26); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 132094L) != 0) );
				setState(28);
				match(RPAREN);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 97280L) != 0)) {
					{
					setState(29);
					quantifier();
					}
				}

				setState(32);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new OrExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				atom();
				setState(35);
				match(LUB);
				setState(36);
				atom();
				setState(37);
				match(SEMICOLON);
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
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnchorStartContext extends AtomContext {
		public TerminalNode ZACZNIJ_OD() { return getToken(JasnyRegexParser.ZACZNIJ_OD, 0); }
		public AnchorStartContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterAnchorStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitAnchorStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitAnchorStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnchorEndContext extends AtomContext {
		public TerminalNode ZAKONCZ_NA() { return getToken(JasnyRegexParser.ZAKONCZ_NA, 0); }
		public AnchorEndContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterAnchorEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitAnchorEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitAnchorEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetterContext extends AtomContext {
		public TerminalNode LITERA() { return getToken(JasnyRegexParser.LITERA, 0); }
		public LetterContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyCharContext extends AtomContext {
		public TerminalNode DOWOLNY_ZNAK() { return getToken(JasnyRegexParser.DOWOLNY_ZNAK, 0); }
		public AnyCharContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterAnyChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitAnyChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitAnyChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonDigitContext extends AtomContext {
		public TerminalNode NIE_CYFRA() { return getToken(JasnyRegexParser.NIE_CYFRA, 0); }
		public NonDigitContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterNonDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitNonDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitNonDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends AtomContext {
		public TerminalNode TEKST() { return getToken(JasnyRegexParser.TEKST, 0); }
		public TerminalNode STRING() { return getToken(JasnyRegexParser.STRING, 0); }
		public TextContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhitespaceContext extends AtomContext {
		public TerminalNode ZNAK_BIALY() { return getToken(JasnyRegexParser.ZNAK_BIALY, 0); }
		public WhitespaceContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitWhitespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitWhitespace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WordContext extends AtomContext {
		public TerminalNode SLOWO() { return getToken(JasnyRegexParser.SLOWO, 0); }
		public WordContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DigitContext extends AtomContext {
		public TerminalNode CYFRA() { return getToken(JasnyRegexParser.CYFRA, 0); }
		public DigitContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZACZNIJ_OD:
				_localctx = new AnchorStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ZACZNIJ_OD);
				}
				break;
			case ZAKONCZ_NA:
				_localctx = new AnchorEndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(ZAKONCZ_NA);
				}
				break;
			case CYFRA:
				_localctx = new DigitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(CYFRA);
				}
				break;
			case NIE_CYFRA:
				_localctx = new NonDigitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(NIE_CYFRA);
				}
				break;
			case LITERA:
				_localctx = new LetterContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(LITERA);
				}
				break;
			case ZNAK_BIALY:
				_localctx = new WhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				match(ZNAK_BIALY);
				}
				break;
			case DOWOLNY_ZNAK:
				_localctx = new AnyCharContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				match(DOWOLNY_ZNAK);
				}
				break;
			case SLOWO:
				_localctx = new WordContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				match(SLOWO);
				}
				break;
			case TEKST:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(49);
				match(TEKST);
				setState(50);
				match(STRING);
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
	public static class QuantifierContext extends ParserRuleContext {
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	 
		public QuantifierContext() { }
		public void copyFrom(QuantifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OneOrMoreContext extends QuantifierContext {
		public TerminalNode JEDEN_LUB_WIECEJ() { return getToken(JasnyRegexParser.JEDEN_LUB_WIECEJ, 0); }
		public OneOrMoreContext(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterOneOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitOneOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ZeroOrMoreContext extends QuantifierContext {
		public TerminalNode ZERO_LUB_WIECEJ() { return getToken(JasnyRegexParser.ZERO_LUB_WIECEJ, 0); }
		public ZeroOrMoreContext(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterZeroOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitZeroOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends QuantifierContext {
		public TerminalNode OD() { return getToken(JasnyRegexParser.OD, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(JasnyRegexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JasnyRegexParser.NUMBER, i);
		}
		public TerminalNode DO() { return getToken(JasnyRegexParser.DO, 0); }
		public RangeContext(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionalContext extends QuantifierContext {
		public TerminalNode OPCJONALNIE() { return getToken(JasnyRegexParser.OPCJONALNIE, 0); }
		public OptionalContext(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitOptional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExactlyContext extends QuantifierContext {
		public TerminalNode DOKLADNIE() { return getToken(JasnyRegexParser.DOKLADNIE, 0); }
		public TerminalNode NUMBER() { return getToken(JasnyRegexParser.NUMBER, 0); }
		public ExactlyContext(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterExactly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitExactly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitExactly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinimumContext extends QuantifierContext {
		public TerminalNode MINIMUM() { return getToken(JasnyRegexParser.MINIMUM, 0); }
		public TerminalNode NUMBER() { return getToken(JasnyRegexParser.NUMBER, 0); }
		public MinimumContext(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterMinimum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitMinimum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitMinimum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_quantifier);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPCJONALNIE:
				_localctx = new OptionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(OPCJONALNIE);
				}
				break;
			case JEDEN_LUB_WIECEJ:
				_localctx = new OneOrMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(JEDEN_LUB_WIECEJ);
				}
				break;
			case ZERO_LUB_WIECEJ:
				_localctx = new ZeroOrMoreContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(ZERO_LUB_WIECEJ);
				}
				break;
			case DOKLADNIE:
				_localctx = new ExactlyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(DOKLADNIE);
				setState(57);
				match(NUMBER);
				}
				break;
			case OD:
				_localctx = new RangeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(OD);
				setState(59);
				match(NUMBER);
				setState(60);
				match(DO);
				setState(61);
				match(NUMBER);
				}
				break;
			case MINIMUM:
				_localctx = new MinimumContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				match(MINIMUM);
				setState(63);
				match(NUMBER);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018C\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0012\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001\u0019\b\u0001\u000b\u0001\f\u0001\u001a"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"(\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"4\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003A\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004"+
		"\u0006\u0000\u0000Q\u0000\t\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000"+
		"\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000"+
		"\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001"+
		"\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000"+
		"\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000e\u0005\u0000\u0000\u0001"+
		"\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0011\u0003\u0004\u0002\u0000"+
		"\u0010\u0012\u0003\u0006\u0003\u0000\u0011\u0010\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0005\u0015\u0000\u0000\u0014(\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0005\u0011\u0000\u0000\u0016\u0018\u0005\u0013\u0000\u0000\u0017"+
		"\u0019\u0003\u0002\u0001\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u001e\u0005\u0014\u0000\u0000\u001d\u001f\u0003\u0006\u0003\u0000\u001e"+
		"\u001d\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 !\u0005\u0015\u0000\u0000!(\u0001\u0000\u0000"+
		"\u0000\"#\u0003\u0004\u0002\u0000#$\u0005\u0012\u0000\u0000$%\u0003\u0004"+
		"\u0002\u0000%&\u0005\u0015\u0000\u0000&(\u0001\u0000\u0000\u0000\'\u000f"+
		"\u0001\u0000\u0000\u0000\'\u0015\u0001\u0000\u0000\u0000\'\"\u0001\u0000"+
		"\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)4\u0005\u0001\u0000\u0000"+
		"*4\u0005\u0002\u0000\u0000+4\u0005\u0003\u0000\u0000,4\u0005\u0004\u0000"+
		"\u0000-4\u0005\u0005\u0000\u0000.4\u0005\u0006\u0000\u0000/4\u0005\u0007"+
		"\u0000\u000004\u0005\b\u0000\u000012\u0005\t\u0000\u000024\u0005\u0017"+
		"\u0000\u00003)\u0001\u0000\u0000\u00003*\u0001\u0000\u0000\u00003+\u0001"+
		"\u0000\u0000\u00003,\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u0000"+
		"3.\u0001\u0000\u0000\u00003/\u0001\u0000\u0000\u000030\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u00004\u0005\u0001\u0000\u0000\u00005A\u0005"+
		"\n\u0000\u00006A\u0005\u000b\u0000\u00007A\u0005\f\u0000\u000089\u0005"+
		"\r\u0000\u00009A\u0005\u0016\u0000\u0000:;\u0005\u000e\u0000\u0000;<\u0005"+
		"\u0016\u0000\u0000<=\u0005\u000f\u0000\u0000=A\u0005\u0016\u0000\u0000"+
		">?\u0005\u0010\u0000\u0000?A\u0005\u0016\u0000\u0000@5\u0001\u0000\u0000"+
		"\u0000@6\u0001\u0000\u0000\u0000@7\u0001\u0000\u0000\u0000@8\u0001\u0000"+
		"\u0000\u0000@:\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000A\u0007"+
		"\u0001\u0000\u0000\u0000\u0007\u000b\u0011\u001a\u001e\'3@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}