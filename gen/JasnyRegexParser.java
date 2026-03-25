// Generated from /home/mateusz-nowacki/IdeaProjects/czytelny_regex/src/main/antlr4/org/example/grammar/JasnyRegexParser.g4 by ANTLR 4.13.2
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
		ZACZNIJ_OD=1, ZAKONCZ_NA=2, GRANICA_SLOWA=3, CYFRA=4, NIE_CYFRA=5, LITERA=6, 
		WIELKA_LITERA=7, MALA_LITERA=8, ZNAK_BIALY=9, NIE_ZNAK_BIALY=10, DOWOLNY_ZNAK=11, 
		SLOWO=12, NIE_SLOWO=13, TEKST=14, TAB=15, NOWA_LINIA=16, ZAKRES=17, ZNAK=18, 
		EMAIL=19, TELEFON=20, KOD_POCZTOWY=21, ADRES_IP=22, URL=23, DATA=24, GODZINA=25, 
		HEX=26, OPCJONALNIE=27, JEDEN_LUB_WIECEJ=28, ZERO_LUB_WIECEJ=29, DOKLADNIE=30, 
		OD=31, DO=32, MINIMUM=33, LENIWIE=34, GRUPA=35, GRUPA_NAZWANA=36, LUB=37, 
		JESLI_POTEM=38, JESLI_NIE_POTEM=39, JESLI_PRZED=40, JESLI_NIE_PRZED=41, 
		DOWOLNY_Z=42, ZADEN_Z=43, LPAREN=44, RPAREN=45, SEMICOLON=46, NUMBER=47, 
		STRING=48, WS=49;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_charSetItem = 2, RULE_atom = 3, 
		RULE_quantifier = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "charSetItem", "atom", "quantifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ZACZNIJ_OD'", "'ZAKO\\u0143CZ_NA'", "'GRANICA_S\\u0141OWA'", 
			"'CYFRA'", "'NIE_CYFRA'", "'LITERA'", "'WIELKA_LITERA'", "'MA\\u0141A_LITERA'", 
			"'ZNAK_BIA\\u0141Y'", "'NIE_ZNAK_BIA\\u0141Y'", "'DOWOLNY_ZNAK'", "'S\\u0141OWO'", 
			"'NIE_S\\u0141OWO'", "'TEKST'", "'TAB'", "'NOWA_LINIA'", "'ZAKRES'", 
			"'ZNAK'", "'EMAIL'", "'TELEFON'", "'KOD_POCZTOWY'", "'ADRES_IP'", "'URL'", 
			"'DATA'", "'GODZINA'", "'HEX'", "'OPCJONALNIE'", "'JEDEN_LUB_WI\\u0118CEJ'", 
			"'ZERO_LUB_WI\\u0118CEJ'", "'DOK\\u0141ADNIE'", "'OD'", "'DO'", "'MINIMUM'", 
			"'LENIWIE'", "'GRUPA'", "'GRUPA_NAZWANA'", "'LUB'", "'JE\\u015ALI_POTEM'", 
			"'JE\\u015ALI_NIE_POTEM'", "'JE\\u015ALI_PRZED'", "'JE\\u015ALI_NIE_PRZED'", 
			"'DOWOLNY_Z'", "'\\u017BADEN_Z'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZACZNIJ_OD", "ZAKONCZ_NA", "GRANICA_SLOWA", "CYFRA", "NIE_CYFRA", 
			"LITERA", "WIELKA_LITERA", "MALA_LITERA", "ZNAK_BIALY", "NIE_ZNAK_BIALY", 
			"DOWOLNY_ZNAK", "SLOWO", "NIE_SLOWO", "TEKST", "TAB", "NOWA_LINIA", "ZAKRES", 
			"ZNAK", "EMAIL", "TELEFON", "KOD_POCZTOWY", "ADRES_IP", "URL", "DATA", 
			"GODZINA", "HEX", "OPCJONALNIE", "JEDEN_LUB_WIECEJ", "ZERO_LUB_WIECEJ", 
			"DOKLADNIE", "OD", "DO", "MINIMUM", "LENIWIE", "GRUPA", "GRUPA_NAZWANA", 
			"LUB", "JESLI_POTEM", "JESLI_NIE_POTEM", "JESLI_PRZED", "JESLI_NIE_PRZED", 
			"DOWOLNY_Z", "ZADEN_Z", "LPAREN", "RPAREN", "SEMICOLON", "NUMBER", "STRING", 
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
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				expression();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
			setState(15);
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
	public static class LookbehindExprContext extends ExpressionContext {
		public TerminalNode JESLI_PRZED() { return getToken(JasnyRegexParser.JESLI_PRZED, 0); }
		public TerminalNode LPAREN() { return getToken(JasnyRegexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasnyRegexParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LookbehindExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterLookbehindExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitLookbehindExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitLookbehindExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LookaheadExprContext extends ExpressionContext {
		public TerminalNode JESLI_POTEM() { return getToken(JasnyRegexParser.JESLI_POTEM, 0); }
		public TerminalNode LPAREN() { return getToken(JasnyRegexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasnyRegexParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LookaheadExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterLookaheadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitLookaheadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitLookaheadExpr(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class NamedGroupExprContext extends ExpressionContext {
		public TerminalNode GRUPA_NAZWANA() { return getToken(JasnyRegexParser.GRUPA_NAZWANA, 0); }
		public TerminalNode STRING() { return getToken(JasnyRegexParser.STRING, 0); }
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
		public NamedGroupExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterNamedGroupExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitNamedGroupExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitNamedGroupExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharSetExprContext extends ExpressionContext {
		public TerminalNode DOWOLNY_Z() { return getToken(JasnyRegexParser.DOWOLNY_Z, 0); }
		public TerminalNode LPAREN() { return getToken(JasnyRegexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasnyRegexParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public List<CharSetItemContext> charSetItem() {
			return getRuleContexts(CharSetItemContext.class);
		}
		public CharSetItemContext charSetItem(int i) {
			return getRuleContext(CharSetItemContext.class,i);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public CharSetExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterCharSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitCharSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitCharSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegLookbehindExprContext extends ExpressionContext {
		public TerminalNode JESLI_NIE_PRZED() { return getToken(JasnyRegexParser.JESLI_NIE_PRZED, 0); }
		public TerminalNode LPAREN() { return getToken(JasnyRegexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasnyRegexParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NegLookbehindExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterNegLookbehindExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitNegLookbehindExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitNegLookbehindExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegCharSetExprContext extends ExpressionContext {
		public TerminalNode ZADEN_Z() { return getToken(JasnyRegexParser.ZADEN_Z, 0); }
		public TerminalNode LPAREN() { return getToken(JasnyRegexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasnyRegexParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public List<CharSetItemContext> charSetItem() {
			return getRuleContexts(CharSetItemContext.class);
		}
		public CharSetItemContext charSetItem(int i) {
			return getRuleContext(CharSetItemContext.class,i);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public NegCharSetExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterNegCharSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitNegCharSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitNegCharSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegLookaheadExprContext extends ExpressionContext {
		public TerminalNode JESLI_NIE_POTEM() { return getToken(JasnyRegexParser.JESLI_NIE_POTEM, 0); }
		public TerminalNode LPAREN() { return getToken(JasnyRegexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasnyRegexParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NegLookaheadExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterNegLookaheadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitNegLookaheadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitNegLookaheadExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AtomExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				atom();
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12750684160L) != 0)) {
					{
					setState(18);
					quantifier();
					}
				}

				setState(21);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new GroupExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(GRUPA);
				setState(24);
				match(LPAREN);
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(25);
					expression();
					}
					}
					setState(28); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(30);
				match(RPAREN);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12750684160L) != 0)) {
					{
					setState(31);
					quantifier();
					}
				}

				setState(34);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new NamedGroupExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(GRUPA_NAZWANA);
				setState(37);
				match(STRING);
				setState(38);
				match(LPAREN);
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39);
					expression();
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(44);
				match(RPAREN);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12750684160L) != 0)) {
					{
					setState(45);
					quantifier();
					}
				}

				setState(48);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new OrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				atom();
				setState(51);
				match(LUB);
				setState(52);
				atom();
				setState(53);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new LookaheadExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(JESLI_POTEM);
				setState(56);
				match(LPAREN);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					expression();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(62);
				match(RPAREN);
				setState(63);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new NegLookaheadExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(JESLI_NIE_POTEM);
				setState(66);
				match(LPAREN);
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					expression();
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(72);
				match(RPAREN);
				setState(73);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new LookbehindExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				match(JESLI_PRZED);
				setState(76);
				match(LPAREN);
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					expression();
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(82);
				match(RPAREN);
				setState(83);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new NegLookbehindExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				match(JESLI_NIE_PRZED);
				setState(86);
				match(LPAREN);
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(87);
					expression();
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(92);
				match(RPAREN);
				setState(93);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new CharSetExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				match(DOWOLNY_Z);
				setState(96);
				match(LPAREN);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					charSetItem();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ZAKRES || _la==STRING );
				setState(102);
				match(RPAREN);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12750684160L) != 0)) {
					{
					setState(103);
					quantifier();
					}
				}

				setState(106);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new NegCharSetExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				match(ZADEN_Z);
				setState(109);
				match(LPAREN);
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					charSetItem();
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ZAKRES || _la==STRING );
				setState(115);
				match(RPAREN);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12750684160L) != 0)) {
					{
					setState(116);
					quantifier();
					}
				}

				setState(119);
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
	public static class CharSetItemContext extends ParserRuleContext {
		public CharSetItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charSetItem; }
	 
		public CharSetItemContext() { }
		public void copyFrom(CharSetItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharSetRangeContext extends CharSetItemContext {
		public TerminalNode ZAKRES() { return getToken(JasnyRegexParser.ZAKRES, 0); }
		public List<TerminalNode> STRING() { return getTokens(JasnyRegexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JasnyRegexParser.STRING, i);
		}
		public CharSetRangeContext(CharSetItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterCharSetRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitCharSetRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitCharSetRange(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharSetLiteralContext extends CharSetItemContext {
		public TerminalNode STRING() { return getToken(JasnyRegexParser.STRING, 0); }
		public CharSetLiteralContext(CharSetItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterCharSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitCharSetLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitCharSetLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharSetItemContext charSetItem() throws RecognitionException {
		CharSetItemContext _localctx = new CharSetItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_charSetItem);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new CharSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(STRING);
				}
				break;
			case ZAKRES:
				_localctx = new CharSetRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(ZAKRES);
				setState(125);
				match(STRING);
				setState(126);
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
	public static class DateContext extends AtomContext {
		public TerminalNode DATA() { return getToken(JasnyRegexParser.DATA, 0); }
		public DateContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonWhitespaceContext extends AtomContext {
		public TerminalNode NIE_ZNAK_BIALY() { return getToken(JasnyRegexParser.NIE_ZNAK_BIALY, 0); }
		public NonWhitespaceContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterNonWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitNonWhitespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitNonWhitespace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpperLetterContext extends AtomContext {
		public TerminalNode WIELKA_LITERA() { return getToken(JasnyRegexParser.WIELKA_LITERA, 0); }
		public UpperLetterContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterUpperLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitUpperLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitUpperLetter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostalCodeContext extends AtomContext {
		public TerminalNode KOD_POCZTOWY() { return getToken(JasnyRegexParser.KOD_POCZTOWY, 0); }
		public PostalCodeContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterPostalCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitPostalCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitPostalCode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewlineContext extends AtomContext {
		public TerminalNode NOWA_LINIA() { return getToken(JasnyRegexParser.NOWA_LINIA, 0); }
		public NewlineContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleCharContext extends AtomContext {
		public TerminalNode ZNAK() { return getToken(JasnyRegexParser.ZNAK, 0); }
		public TerminalNode STRING() { return getToken(JasnyRegexParser.STRING, 0); }
		public SingleCharContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterSingleChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitSingleChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitSingleChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TabContext extends AtomContext {
		public TerminalNode TAB() { return getToken(JasnyRegexParser.TAB, 0); }
		public TabContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitTab(this);
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
	public static class HexContext extends AtomContext {
		public TerminalNode HEX() { return getToken(JasnyRegexParser.HEX, 0); }
		public HexContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitHex(this);
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
	public static class EmailContext extends AtomContext {
		public TerminalNode EMAIL() { return getToken(JasnyRegexParser.EMAIL, 0); }
		public EmailContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitEmail(this);
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
	public static class WordBoundaryContext extends AtomContext {
		public TerminalNode GRANICA_SLOWA() { return getToken(JasnyRegexParser.GRANICA_SLOWA, 0); }
		public WordBoundaryContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterWordBoundary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitWordBoundary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitWordBoundary(this);
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
	public static class IpAddressContext extends AtomContext {
		public TerminalNode ADRES_IP() { return getToken(JasnyRegexParser.ADRES_IP, 0); }
		public IpAddressContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterIpAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitIpAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitIpAddress(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlContext extends AtomContext {
		public TerminalNode URL() { return getToken(JasnyRegexParser.URL, 0); }
		public UrlContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LowerLetterContext extends AtomContext {
		public TerminalNode MALA_LITERA() { return getToken(JasnyRegexParser.MALA_LITERA, 0); }
		public LowerLetterContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterLowerLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitLowerLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitLowerLetter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PhoneContext extends AtomContext {
		public TerminalNode TELEFON() { return getToken(JasnyRegexParser.TELEFON, 0); }
		public PhoneContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterPhone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitPhone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitPhone(this);
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
	public static class NonWordContext extends AtomContext {
		public TerminalNode NIE_SLOWO() { return getToken(JasnyRegexParser.NIE_SLOWO, 0); }
		public NonWordContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterNonWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitNonWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitNonWord(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimeContext extends AtomContext {
		public TerminalNode GODZINA() { return getToken(JasnyRegexParser.GODZINA, 0); }
		public TimeContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasnyRegexParserListener ) ((JasnyRegexParserListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitTime(this);
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

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZACZNIJ_OD:
				_localctx = new AnchorStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(ZACZNIJ_OD);
				}
				break;
			case ZAKONCZ_NA:
				_localctx = new AnchorEndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(ZAKONCZ_NA);
				}
				break;
			case GRANICA_SLOWA:
				_localctx = new WordBoundaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(GRANICA_SLOWA);
				}
				break;
			case CYFRA:
				_localctx = new DigitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(CYFRA);
				}
				break;
			case NIE_CYFRA:
				_localctx = new NonDigitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				match(NIE_CYFRA);
				}
				break;
			case LITERA:
				_localctx = new LetterContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				match(LITERA);
				}
				break;
			case WIELKA_LITERA:
				_localctx = new UpperLetterContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				match(WIELKA_LITERA);
				}
				break;
			case MALA_LITERA:
				_localctx = new LowerLetterContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				match(MALA_LITERA);
				}
				break;
			case ZNAK_BIALY:
				_localctx = new WhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(137);
				match(ZNAK_BIALY);
				}
				break;
			case NIE_ZNAK_BIALY:
				_localctx = new NonWhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
				match(NIE_ZNAK_BIALY);
				}
				break;
			case DOWOLNY_ZNAK:
				_localctx = new AnyCharContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(139);
				match(DOWOLNY_ZNAK);
				}
				break;
			case SLOWO:
				_localctx = new WordContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(140);
				match(SLOWO);
				}
				break;
			case NIE_SLOWO:
				_localctx = new NonWordContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(141);
				match(NIE_SLOWO);
				}
				break;
			case TEKST:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(142);
				match(TEKST);
				setState(143);
				match(STRING);
				}
				break;
			case TAB:
				_localctx = new TabContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(144);
				match(TAB);
				}
				break;
			case NOWA_LINIA:
				_localctx = new NewlineContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(145);
				match(NOWA_LINIA);
				}
				break;
			case ZNAK:
				_localctx = new SingleCharContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(146);
				match(ZNAK);
				setState(147);
				match(STRING);
				}
				break;
			case EMAIL:
				_localctx = new EmailContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(148);
				match(EMAIL);
				}
				break;
			case TELEFON:
				_localctx = new PhoneContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(149);
				match(TELEFON);
				}
				break;
			case KOD_POCZTOWY:
				_localctx = new PostalCodeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(150);
				match(KOD_POCZTOWY);
				}
				break;
			case ADRES_IP:
				_localctx = new IpAddressContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(151);
				match(ADRES_IP);
				}
				break;
			case URL:
				_localctx = new UrlContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(152);
				match(URL);
				}
				break;
			case DATA:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(153);
				match(DATA);
				}
				break;
			case GODZINA:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(154);
				match(GODZINA);
				}
				break;
			case HEX:
				_localctx = new HexContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(155);
				match(HEX);
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
		public TerminalNode LENIWIE() { return getToken(JasnyRegexParser.LENIWIE, 0); }
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
		public TerminalNode LENIWIE() { return getToken(JasnyRegexParser.LENIWIE, 0); }
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
		public TerminalNode LENIWIE() { return getToken(JasnyRegexParser.LENIWIE, 0); }
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
		public TerminalNode LENIWIE() { return getToken(JasnyRegexParser.LENIWIE, 0); }
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
		public TerminalNode LENIWIE() { return getToken(JasnyRegexParser.LENIWIE, 0); }
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
		enterRule(_localctx, 8, RULE_quantifier);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPCJONALNIE:
				_localctx = new OptionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(OPCJONALNIE);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LENIWIE) {
					{
					setState(159);
					match(LENIWIE);
					}
				}

				}
				break;
			case JEDEN_LUB_WIECEJ:
				_localctx = new OneOrMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(JEDEN_LUB_WIECEJ);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LENIWIE) {
					{
					setState(163);
					match(LENIWIE);
					}
				}

				}
				break;
			case ZERO_LUB_WIECEJ:
				_localctx = new ZeroOrMoreContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(ZERO_LUB_WIECEJ);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LENIWIE) {
					{
					setState(167);
					match(LENIWIE);
					}
				}

				}
				break;
			case DOKLADNIE:
				_localctx = new ExactlyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(DOKLADNIE);
				setState(171);
				match(NUMBER);
				}
				break;
			case OD:
				_localctx = new RangeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(OD);
				setState(173);
				match(NUMBER);
				setState(174);
				match(DO);
				setState(175);
				match(NUMBER);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LENIWIE) {
					{
					setState(176);
					match(LENIWIE);
					}
				}

				}
				break;
			case MINIMUM:
				_localctx = new MinimumContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(MINIMUM);
				setState(180);
				match(NUMBER);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LENIWIE) {
					{
					setState(181);
					match(LENIWIE);
					}
				}

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
		"\u0004\u00011\u00bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001b\b\u0001\u000b\u0001"+
		"\f\u0001\u001c\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		")\b\u0001\u000b\u0001\f\u0001*\u0001\u0001\u0001\u0001\u0003\u0001/\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001;\b"+
		"\u0001\u000b\u0001\f\u0001<\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001E\b\u0001\u000b\u0001\f\u0001"+
		"F\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001O\b\u0001\u000b\u0001\f\u0001P\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001Y\b\u0001\u000b"+
		"\u0001\f\u0001Z\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001c\b\u0001\u000b\u0001\f\u0001d\u0001\u0001"+
		"\u0001\u0001\u0003\u0001i\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001p\b\u0001\u000b\u0001\f\u0001q\u0001"+
		"\u0001\u0001\u0001\u0003\u0001v\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001z\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0080\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009d"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00a1\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00a5\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00a9\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00b2\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00b7\b\u0004\u0003\u0004\u00b9\b\u0004\u0001"+
		"\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000\u00ef\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0002y\u0001\u0000\u0000\u0000\u0004\u007f"+
		"\u0001\u0000\u0000\u0000\u0006\u009c\u0001\u0000\u0000\u0000\b\u00b8\u0001"+
		"\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0013"+
		"\u0003\u0006\u0003\u0000\u0012\u0014\u0003\b\u0004\u0000\u0013\u0012\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005.\u0000\u0000\u0016z\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0005#\u0000\u0000\u0018\u001a\u0005,\u0000\u0000\u0019"+
		"\u001b\u0003\u0002\u0001\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		" \u0005-\u0000\u0000\u001f!\u0003\b\u0004\u0000 \u001f\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005."+
		"\u0000\u0000#z\u0001\u0000\u0000\u0000$%\u0005$\u0000\u0000%&\u00050\u0000"+
		"\u0000&(\u0005,\u0000\u0000\')\u0003\u0002\u0001\u0000(\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0005-\u0000\u0000-/\u0003"+
		"\b\u0004\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0005.\u0000\u00001z\u0001\u0000\u0000\u000023\u0003"+
		"\u0006\u0003\u000034\u0005%\u0000\u000045\u0003\u0006\u0003\u000056\u0005"+
		".\u0000\u00006z\u0001\u0000\u0000\u000078\u0005&\u0000\u00008:\u0005,"+
		"\u0000\u00009;\u0003\u0002\u0001\u0000:9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0005-\u0000\u0000?@\u0005.\u0000\u0000@"+
		"z\u0001\u0000\u0000\u0000AB\u0005\'\u0000\u0000BD\u0005,\u0000\u0000C"+
		"E\u0003\u0002\u0001\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HI\u0005-\u0000\u0000IJ\u0005.\u0000\u0000Jz\u0001\u0000\u0000"+
		"\u0000KL\u0005(\u0000\u0000LN\u0005,\u0000\u0000MO\u0003\u0002\u0001\u0000"+
		"NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005-\u0000"+
		"\u0000ST\u0005.\u0000\u0000Tz\u0001\u0000\u0000\u0000UV\u0005)\u0000\u0000"+
		"VX\u0005,\u0000\u0000WY\u0003\u0002\u0001\u0000XW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005-\u0000\u0000]^\u0005.\u0000"+
		"\u0000^z\u0001\u0000\u0000\u0000_`\u0005*\u0000\u0000`b\u0005,\u0000\u0000"+
		"ac\u0003\u0004\u0002\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fh\u0005-\u0000\u0000gi\u0003\b\u0004\u0000hg\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005"+
		".\u0000\u0000kz\u0001\u0000\u0000\u0000lm\u0005+\u0000\u0000mo\u0005,"+
		"\u0000\u0000np\u0003\u0004\u0002\u0000on\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000su\u0005-\u0000\u0000tv\u0003\b\u0004\u0000"+
		"ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wx\u0005.\u0000\u0000xz\u0001\u0000\u0000\u0000y\u0011\u0001\u0000"+
		"\u0000\u0000y\u0017\u0001\u0000\u0000\u0000y$\u0001\u0000\u0000\u0000"+
		"y2\u0001\u0000\u0000\u0000y7\u0001\u0000\u0000\u0000yA\u0001\u0000\u0000"+
		"\u0000yK\u0001\u0000\u0000\u0000yU\u0001\u0000\u0000\u0000y_\u0001\u0000"+
		"\u0000\u0000yl\u0001\u0000\u0000\u0000z\u0003\u0001\u0000\u0000\u0000"+
		"{\u0080\u00050\u0000\u0000|}\u0005\u0011\u0000\u0000}~\u00050\u0000\u0000"+
		"~\u0080\u00050\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u007f|\u0001"+
		"\u0000\u0000\u0000\u0080\u0005\u0001\u0000\u0000\u0000\u0081\u009d\u0005"+
		"\u0001\u0000\u0000\u0082\u009d\u0005\u0002\u0000\u0000\u0083\u009d\u0005"+
		"\u0003\u0000\u0000\u0084\u009d\u0005\u0004\u0000\u0000\u0085\u009d\u0005"+
		"\u0005\u0000\u0000\u0086\u009d\u0005\u0006\u0000\u0000\u0087\u009d\u0005"+
		"\u0007\u0000\u0000\u0088\u009d\u0005\b\u0000\u0000\u0089\u009d\u0005\t"+
		"\u0000\u0000\u008a\u009d\u0005\n\u0000\u0000\u008b\u009d\u0005\u000b\u0000"+
		"\u0000\u008c\u009d\u0005\f\u0000\u0000\u008d\u009d\u0005\r\u0000\u0000"+
		"\u008e\u008f\u0005\u000e\u0000\u0000\u008f\u009d\u00050\u0000\u0000\u0090"+
		"\u009d\u0005\u000f\u0000\u0000\u0091\u009d\u0005\u0010\u0000\u0000\u0092"+
		"\u0093\u0005\u0012\u0000\u0000\u0093\u009d\u00050\u0000\u0000\u0094\u009d"+
		"\u0005\u0013\u0000\u0000\u0095\u009d\u0005\u0014\u0000\u0000\u0096\u009d"+
		"\u0005\u0015\u0000\u0000\u0097\u009d\u0005\u0016\u0000\u0000\u0098\u009d"+
		"\u0005\u0017\u0000\u0000\u0099\u009d\u0005\u0018\u0000\u0000\u009a\u009d"+
		"\u0005\u0019\u0000\u0000\u009b\u009d\u0005\u001a\u0000\u0000\u009c\u0081"+
		"\u0001\u0000\u0000\u0000\u009c\u0082\u0001\u0000\u0000\u0000\u009c\u0083"+
		"\u0001\u0000\u0000\u0000\u009c\u0084\u0001\u0000\u0000\u0000\u009c\u0085"+
		"\u0001\u0000\u0000\u0000\u009c\u0086\u0001\u0000\u0000\u0000\u009c\u0087"+
		"\u0001\u0000\u0000\u0000\u009c\u0088\u0001\u0000\u0000\u0000\u009c\u0089"+
		"\u0001\u0000\u0000\u0000\u009c\u008a\u0001\u0000\u0000\u0000\u009c\u008b"+
		"\u0001\u0000\u0000\u0000\u009c\u008c\u0001\u0000\u0000\u0000\u009c\u008d"+
		"\u0001\u0000\u0000\u0000\u009c\u008e\u0001\u0000\u0000\u0000\u009c\u0090"+
		"\u0001\u0000\u0000\u0000\u009c\u0091\u0001\u0000\u0000\u0000\u009c\u0092"+
		"\u0001\u0000\u0000\u0000\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u0095"+
		"\u0001\u0000\u0000\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c\u0097"+
		"\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u0099"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u0007\u0001\u0000\u0000\u0000\u009e\u00a0"+
		"\u0005\u001b\u0000\u0000\u009f\u00a1\u0005\"\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00b9\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0005\u001c\u0000\u0000\u00a3\u00a5\u0005"+
		"\"\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00b9\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u001d"+
		"\u0000\u0000\u00a7\u00a9\u0005\"\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00b9\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005\u001e\u0000\u0000\u00ab\u00b9\u0005/\u0000\u0000"+
		"\u00ac\u00ad\u0005\u001f\u0000\u0000\u00ad\u00ae\u0005/\u0000\u0000\u00ae"+
		"\u00af\u0005 \u0000\u0000\u00af\u00b1\u0005/\u0000\u0000\u00b0\u00b2\u0005"+
		"\"\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b9\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005!\u0000"+
		"\u0000\u00b4\u00b6\u0005/\u0000\u0000\u00b5\u00b7\u0005\"\u0000\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u009e\u0001\u0000\u0000\u0000"+
		"\u00b8\u00a2\u0001\u0000\u0000\u0000\u00b8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00aa\u0001\u0000\u0000\u0000\u00b8\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b3\u0001\u0000\u0000\u0000\u00b9\t\u0001\u0000\u0000\u0000\u0017"+
		"\r\u0013\u001c *.<FPZdhquy\u007f\u009c\u00a0\u00a4\u00a8\u00b1\u00b6\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}