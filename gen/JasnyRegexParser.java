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
		public TerminalNode SEMICOLON() { return getToken(JasnyRegexParser.SEMICOLON, 0); }
		public List<TerminalNode> LUB() { return getTokens(JasnyRegexParser.LUB); }
		public TerminalNode LUB(int i) {
			return getToken(JasnyRegexParser.LUB, i);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
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
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					match(LUB);
					setState(52);
					atom();
					}
					}
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LUB );
				setState(57);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new LookaheadExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				match(JESLI_POTEM);
				setState(60);
				match(LPAREN);
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					expression();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(66);
				match(RPAREN);
				setState(67);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new NegLookaheadExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				match(JESLI_NIE_POTEM);
				setState(70);
				match(LPAREN);
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(71);
					expression();
					}
					}
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(76);
				match(RPAREN);
				setState(77);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new LookbehindExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(JESLI_PRZED);
				setState(80);
				match(LPAREN);
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					expression();
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(86);
				match(RPAREN);
				setState(87);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new NegLookbehindExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				match(JESLI_NIE_PRZED);
				setState(90);
				match(LPAREN);
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					expression();
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17420521439230L) != 0) );
				setState(96);
				match(RPAREN);
				setState(97);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new CharSetExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				match(DOWOLNY_Z);
				setState(100);
				match(LPAREN);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					charSetItem();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ZAKRES || _la==STRING );
				setState(106);
				match(RPAREN);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12750684160L) != 0)) {
					{
					setState(107);
					quantifier();
					}
				}

				setState(110);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new NegCharSetExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(112);
				match(ZADEN_Z);
				setState(113);
				match(LPAREN);
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(114);
					charSetItem();
					}
					}
					setState(117); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ZAKRES || _la==STRING );
				setState(119);
				match(RPAREN);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12750684160L) != 0)) {
					{
					setState(120);
					quantifier();
					}
				}

				setState(123);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitCharSetLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharSetItemContext charSetItem() throws RecognitionException {
		CharSetItemContext _localctx = new CharSetItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_charSetItem);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new CharSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(STRING);
				}
				break;
			case ZAKRES:
				_localctx = new CharSetRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ZAKRES);
				setState(129);
				match(STRING);
				setState(130);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasnyRegexParserVisitor ) return ((JasnyRegexParserVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZACZNIJ_OD:
				_localctx = new AnchorStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(ZACZNIJ_OD);
				}
				break;
			case ZAKONCZ_NA:
				_localctx = new AnchorEndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(ZAKONCZ_NA);
				}
				break;
			case GRANICA_SLOWA:
				_localctx = new WordBoundaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(GRANICA_SLOWA);
				}
				break;
			case CYFRA:
				_localctx = new DigitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(CYFRA);
				}
				break;
			case NIE_CYFRA:
				_localctx = new NonDigitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(NIE_CYFRA);
				}
				break;
			case LITERA:
				_localctx = new LetterContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(LITERA);
				}
				break;
			case WIELKA_LITERA:
				_localctx = new UpperLetterContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				match(WIELKA_LITERA);
				}
				break;
			case MALA_LITERA:
				_localctx = new LowerLetterContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				match(MALA_LITERA);
				}
				break;
			case ZNAK_BIALY:
				_localctx = new WhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				match(ZNAK_BIALY);
				}
				break;
			case NIE_ZNAK_BIALY:
				_localctx = new NonWhitespaceContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				match(NIE_ZNAK_BIALY);
				}
				break;
			case DOWOLNY_ZNAK:
				_localctx = new AnyCharContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(143);
				match(DOWOLNY_ZNAK);
				}
				break;
			case SLOWO:
				_localctx = new WordContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				match(SLOWO);
				}
				break;
			case NIE_SLOWO:
				_localctx = new NonWordContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(145);
				match(NIE_SLOWO);
				}
				break;
			case TEKST:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(146);
				match(TEKST);
				setState(147);
				match(STRING);
				}
				break;
			case TAB:
				_localctx = new TabContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(148);
				match(TAB);
				}
				break;
			case NOWA_LINIA:
				_localctx = new NewlineContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(149);
				match(NOWA_LINIA);
				}
				break;
			case ZNAK:
				_localctx = new SingleCharContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(150);
				match(ZNAK);
				setState(151);
				match(STRING);
				}
				break;
			case EMAIL:
				_localctx = new EmailContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(152);
				match(EMAIL);
				}
				break;
			case TELEFON:
				_localctx = new PhoneContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(153);
				match(TELEFON);
				}
				break;
			case KOD_POCZTOWY:
				_localctx = new PostalCodeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(154);
				match(KOD_POCZTOWY);
				}
				break;
			case ADRES_IP:
				_localctx = new IpAddressContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(155);
				match(ADRES_IP);
				}
				break;
			case URL:
				_localctx = new UrlContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(156);
				match(URL);
				}
				break;
			case DATA:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(157);
				match(DATA);
				}
				break;
			case GODZINA:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(158);
				match(GODZINA);
				}
				break;
			case HEX:
				_localctx = new HexContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(159);
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
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPCJONALNIE:
				_localctx = new OptionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(OPCJONALNIE);
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
			case JEDEN_LUB_WIECEJ:
				_localctx = new OneOrMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(JEDEN_LUB_WIECEJ);
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
			case ZERO_LUB_WIECEJ:
				_localctx = new ZeroOrMoreContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(ZERO_LUB_WIECEJ);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LENIWIE) {
					{
					setState(171);
					match(LENIWIE);
					}
				}

				}
				break;
			case DOKLADNIE:
				_localctx = new ExactlyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(DOKLADNIE);
				setState(175);
				match(NUMBER);
				}
				break;
			case OD:
				_localctx = new RangeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				match(OD);
				setState(177);
				match(NUMBER);
				setState(178);
				match(DO);
				setState(179);
				match(NUMBER);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LENIWIE) {
					{
					setState(180);
					match(LENIWIE);
					}
				}

				}
				break;
			case MINIMUM:
				_localctx = new MinimumContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(MINIMUM);
				setState(184);
				match(NUMBER);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LENIWIE) {
					{
					setState(185);
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
		"\u0004\u00011\u00bf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001b\b\u0001\u000b\u0001"+
		"\f\u0001\u001c\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		")\b\u0001\u000b\u0001\f\u0001*\u0001\u0001\u0001\u0001\u0003\u0001/\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u00016\b\u0001\u000b\u0001\f\u00017\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001?\b\u0001\u000b\u0001\f\u0001@\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001I\b\u0001\u000b\u0001\f\u0001J\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001S\b\u0001\u000b\u0001"+
		"\f\u0001T\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001]\b\u0001\u000b\u0001\f\u0001^\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001g\b"+
		"\u0001\u000b\u0001\f\u0001h\u0001\u0001\u0001\u0001\u0003\u0001m\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"t\b\u0001\u000b\u0001\f\u0001u\u0001\u0001\u0001\u0001\u0003\u0001z\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001~\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0084\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00a1\b\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00a5\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a9\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00ad\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b6\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00bb\b"+
		"\u0004\u0003\u0004\u00bd\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0000\u00f4\u0000\u000b\u0001\u0000\u0000\u0000\u0002"+
		"}\u0001\u0000\u0000\u0000\u0004\u0083\u0001\u0000\u0000\u0000\u0006\u00a0"+
		"\u0001\u0000\u0000\u0000\b\u00bc\u0001\u0000\u0000\u0000\n\f\u0003\u0002"+
		"\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0000\u0000\u0001\u0010"+
		"\u0001\u0001\u0000\u0000\u0000\u0011\u0013\u0003\u0006\u0003\u0000\u0012"+
		"\u0014\u0003\b\u0004\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0005.\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0017\u0018\u0005#"+
		"\u0000\u0000\u0018\u001a\u0005,\u0000\u0000\u0019\u001b\u0003\u0002\u0001"+
		"\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0005-\u0000\u0000\u001f"+
		"!\u0003\b\u0004\u0000 \u001f\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005.\u0000\u0000#~\u0001\u0000"+
		"\u0000\u0000$%\u0005$\u0000\u0000%&\u00050\u0000\u0000&(\u0005,\u0000"+
		"\u0000\')\u0003\u0002\u0001\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,.\u0005-\u0000\u0000-/\u0003\b\u0004\u0000.-\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0005.\u0000\u00001~\u0001\u0000\u0000\u000025\u0003\u0006\u0003\u0000"+
		"34\u0005%\u0000\u000046\u0003\u0006\u0003\u000053\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009:\u0005.\u0000\u0000:~\u0001\u0000\u0000"+
		"\u0000;<\u0005&\u0000\u0000<>\u0005,\u0000\u0000=?\u0003\u0002\u0001\u0000"+
		">=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0005-\u0000"+
		"\u0000CD\u0005.\u0000\u0000D~\u0001\u0000\u0000\u0000EF\u0005\'\u0000"+
		"\u0000FH\u0005,\u0000\u0000GI\u0003\u0002\u0001\u0000HG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005-\u0000\u0000MN\u0005.\u0000"+
		"\u0000N~\u0001\u0000\u0000\u0000OP\u0005(\u0000\u0000PR\u0005,\u0000\u0000"+
		"QS\u0003\u0002\u0001\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0005-\u0000\u0000WX\u0005.\u0000\u0000X~\u0001\u0000\u0000"+
		"\u0000YZ\u0005)\u0000\u0000Z\\\u0005,\u0000\u0000[]\u0003\u0002\u0001"+
		"\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005"+
		"-\u0000\u0000ab\u0005.\u0000\u0000b~\u0001\u0000\u0000\u0000cd\u0005*"+
		"\u0000\u0000df\u0005,\u0000\u0000eg\u0003\u0004\u0002\u0000fe\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0005-\u0000\u0000km\u0003"+
		"\b\u0004\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000no\u0005.\u0000\u0000o~\u0001\u0000\u0000\u0000pq\u0005"+
		"+\u0000\u0000qs\u0005,\u0000\u0000rt\u0003\u0004\u0002\u0000sr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0005-\u0000\u0000xz\u0003"+
		"\b\u0004\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0005.\u0000\u0000|~\u0001\u0000\u0000\u0000}\u0011"+
		"\u0001\u0000\u0000\u0000}\u0017\u0001\u0000\u0000\u0000}$\u0001\u0000"+
		"\u0000\u0000}2\u0001\u0000\u0000\u0000};\u0001\u0000\u0000\u0000}E\u0001"+
		"\u0000\u0000\u0000}O\u0001\u0000\u0000\u0000}Y\u0001\u0000\u0000\u0000"+
		"}c\u0001\u0000\u0000\u0000}p\u0001\u0000\u0000\u0000~\u0003\u0001\u0000"+
		"\u0000\u0000\u007f\u0084\u00050\u0000\u0000\u0080\u0081\u0005\u0011\u0000"+
		"\u0000\u0081\u0082\u00050\u0000\u0000\u0082\u0084\u00050\u0000\u0000\u0083"+
		"\u007f\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0084"+
		"\u0005\u0001\u0000\u0000\u0000\u0085\u00a1\u0005\u0001\u0000\u0000\u0086"+
		"\u00a1\u0005\u0002\u0000\u0000\u0087\u00a1\u0005\u0003\u0000\u0000\u0088"+
		"\u00a1\u0005\u0004\u0000\u0000\u0089\u00a1\u0005\u0005\u0000\u0000\u008a"+
		"\u00a1\u0005\u0006\u0000\u0000\u008b\u00a1\u0005\u0007\u0000\u0000\u008c"+
		"\u00a1\u0005\b\u0000\u0000\u008d\u00a1\u0005\t\u0000\u0000\u008e\u00a1"+
		"\u0005\n\u0000\u0000\u008f\u00a1\u0005\u000b\u0000\u0000\u0090\u00a1\u0005"+
		"\f\u0000\u0000\u0091\u00a1\u0005\r\u0000\u0000\u0092\u0093\u0005\u000e"+
		"\u0000\u0000\u0093\u00a1\u00050\u0000\u0000\u0094\u00a1\u0005\u000f\u0000"+
		"\u0000\u0095\u00a1\u0005\u0010\u0000\u0000\u0096\u0097\u0005\u0012\u0000"+
		"\u0000\u0097\u00a1\u00050\u0000\u0000\u0098\u00a1\u0005\u0013\u0000\u0000"+
		"\u0099\u00a1\u0005\u0014\u0000\u0000\u009a\u00a1\u0005\u0015\u0000\u0000"+
		"\u009b\u00a1\u0005\u0016\u0000\u0000\u009c\u00a1\u0005\u0017\u0000\u0000"+
		"\u009d\u00a1\u0005\u0018\u0000\u0000\u009e\u00a1\u0005\u0019\u0000\u0000"+
		"\u009f\u00a1\u0005\u001a\u0000\u0000\u00a0\u0085\u0001\u0000\u0000\u0000"+
		"\u00a0\u0086\u0001\u0000\u0000\u0000\u00a0\u0087\u0001\u0000\u0000\u0000"+
		"\u00a0\u0088\u0001\u0000\u0000\u0000\u00a0\u0089\u0001\u0000\u0000\u0000"+
		"\u00a0\u008a\u0001\u0000\u0000\u0000\u00a0\u008b\u0001\u0000\u0000\u0000"+
		"\u00a0\u008c\u0001\u0000\u0000\u0000\u00a0\u008d\u0001\u0000\u0000\u0000"+
		"\u00a0\u008e\u0001\u0000\u0000\u0000\u00a0\u008f\u0001\u0000\u0000\u0000"+
		"\u00a0\u0090\u0001\u0000\u0000\u0000\u00a0\u0091\u0001\u0000\u0000\u0000"+
		"\u00a0\u0092\u0001\u0000\u0000\u0000\u00a0\u0094\u0001\u0000\u0000\u0000"+
		"\u00a0\u0095\u0001\u0000\u0000\u0000\u00a0\u0096\u0001\u0000\u0000\u0000"+
		"\u00a0\u0098\u0001\u0000\u0000\u0000\u00a0\u0099\u0001\u0000\u0000\u0000"+
		"\u00a0\u009a\u0001\u0000\u0000\u0000\u00a0\u009b\u0001\u0000\u0000\u0000"+
		"\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u0007\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\u001b\u0000\u0000"+
		"\u00a3\u00a5\u0005\"\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00bd\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0005\u001c\u0000\u0000\u00a7\u00a9\u0005\"\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00bd"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\u001d\u0000\u0000\u00ab\u00ad"+
		"\u0005\"\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00bd\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"\u001e\u0000\u0000\u00af\u00bd\u0005/\u0000\u0000\u00b0\u00b1\u0005\u001f"+
		"\u0000\u0000\u00b1\u00b2\u0005/\u0000\u0000\u00b2\u00b3\u0005 \u0000\u0000"+
		"\u00b3\u00b5\u0005/\u0000\u0000\u00b4\u00b6\u0005\"\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00bd\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005!\u0000\u0000\u00b8\u00ba"+
		"\u0005/\u0000\u0000\u00b9\u00bb\u0005\"\u0000\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bc\u00a2\u0001\u0000\u0000\u0000\u00bc\u00a6\u0001"+
		"\u0000\u0000\u0000\u00bc\u00aa\u0001\u0000\u0000\u0000\u00bc\u00ae\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b0\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001"+
		"\u0000\u0000\u0000\u00bd\t\u0001\u0000\u0000\u0000\u0018\r\u0013\u001c"+
		" *.7@JT^hluy}\u0083\u00a0\u00a4\u00a8\u00ac\u00b5\u00ba\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}