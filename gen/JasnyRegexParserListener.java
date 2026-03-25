// Generated from /home/mateusz-nowacki/IdeaProjects/czytelny_regex/src/main/antlr4/org/example/grammar/JasnyRegexParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JasnyRegexParser}.
 */
public interface JasnyRegexParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JasnyRegexParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JasnyRegexParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JasnyRegexParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JasnyRegexParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(JasnyRegexParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(JasnyRegexParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGroupExpr(JasnyRegexParser.GroupExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGroupExpr(JasnyRegexParser.GroupExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedGroupExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNamedGroupExpr(JasnyRegexParser.NamedGroupExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedGroupExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNamedGroupExpr(JasnyRegexParser.NamedGroupExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(JasnyRegexParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(JasnyRegexParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookaheadExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLookaheadExpr(JasnyRegexParser.LookaheadExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookaheadExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLookaheadExpr(JasnyRegexParser.LookaheadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negLookaheadExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegLookaheadExpr(JasnyRegexParser.NegLookaheadExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negLookaheadExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegLookaheadExpr(JasnyRegexParser.NegLookaheadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookbehindExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLookbehindExpr(JasnyRegexParser.LookbehindExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookbehindExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLookbehindExpr(JasnyRegexParser.LookbehindExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negLookbehindExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegLookbehindExpr(JasnyRegexParser.NegLookbehindExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negLookbehindExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegLookbehindExpr(JasnyRegexParser.NegLookbehindExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charSetExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharSetExpr(JasnyRegexParser.CharSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charSetExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharSetExpr(JasnyRegexParser.CharSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negCharSetExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegCharSetExpr(JasnyRegexParser.NegCharSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negCharSetExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegCharSetExpr(JasnyRegexParser.NegCharSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charSetLiteral}
	 * labeled alternative in {@link JasnyRegexParser#charSetItem}.
	 * @param ctx the parse tree
	 */
	void enterCharSetLiteral(JasnyRegexParser.CharSetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charSetLiteral}
	 * labeled alternative in {@link JasnyRegexParser#charSetItem}.
	 * @param ctx the parse tree
	 */
	void exitCharSetLiteral(JasnyRegexParser.CharSetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charSetRange}
	 * labeled alternative in {@link JasnyRegexParser#charSetItem}.
	 * @param ctx the parse tree
	 */
	void enterCharSetRange(JasnyRegexParser.CharSetRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charSetRange}
	 * labeled alternative in {@link JasnyRegexParser#charSetItem}.
	 * @param ctx the parse tree
	 */
	void exitCharSetRange(JasnyRegexParser.CharSetRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anchorStart}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAnchorStart(JasnyRegexParser.AnchorStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anchorStart}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAnchorStart(JasnyRegexParser.AnchorStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anchorEnd}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAnchorEnd(JasnyRegexParser.AnchorEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anchorEnd}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAnchorEnd(JasnyRegexParser.AnchorEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wordBoundary}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterWordBoundary(JasnyRegexParser.WordBoundaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wordBoundary}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitWordBoundary(JasnyRegexParser.WordBoundaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digit}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDigit(JasnyRegexParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digit}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDigit(JasnyRegexParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonDigit}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNonDigit(JasnyRegexParser.NonDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonDigit}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNonDigit(JasnyRegexParser.NonDigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letter}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterLetter(JasnyRegexParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letter}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitLetter(JasnyRegexParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code upperLetter}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterUpperLetter(JasnyRegexParser.UpperLetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code upperLetter}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitUpperLetter(JasnyRegexParser.UpperLetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lowerLetter}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterLowerLetter(JasnyRegexParser.LowerLetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lowerLetter}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitLowerLetter(JasnyRegexParser.LowerLetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whitespace}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterWhitespace(JasnyRegexParser.WhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whitespace}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitWhitespace(JasnyRegexParser.WhitespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonWhitespace}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNonWhitespace(JasnyRegexParser.NonWhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonWhitespace}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNonWhitespace(JasnyRegexParser.NonWhitespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyChar}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAnyChar(JasnyRegexParser.AnyCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyChar}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAnyChar(JasnyRegexParser.AnyCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code word}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterWord(JasnyRegexParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code word}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitWord(JasnyRegexParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonWord}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNonWord(JasnyRegexParser.NonWordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonWord}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNonWord(JasnyRegexParser.NonWordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterText(JasnyRegexParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitText(JasnyRegexParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tab}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTab(JasnyRegexParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tab}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTab(JasnyRegexParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newline}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNewline(JasnyRegexParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newline}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNewline(JasnyRegexParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleChar}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterSingleChar(JasnyRegexParser.SingleCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleChar}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitSingleChar(JasnyRegexParser.SingleCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code email}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEmail(JasnyRegexParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code email}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEmail(JasnyRegexParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code phone}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterPhone(JasnyRegexParser.PhoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code phone}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitPhone(JasnyRegexParser.PhoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postalCode}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterPostalCode(JasnyRegexParser.PostalCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postalCode}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitPostalCode(JasnyRegexParser.PostalCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ipAddress}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIpAddress(JasnyRegexParser.IpAddressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ipAddress}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIpAddress(JasnyRegexParser.IpAddressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code url}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterUrl(JasnyRegexParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code url}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitUrl(JasnyRegexParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code date}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDate(JasnyRegexParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code date}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDate(JasnyRegexParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code time}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTime(JasnyRegexParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code time}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTime(JasnyRegexParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterHex(JasnyRegexParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitHex(JasnyRegexParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optional}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterOptional(JasnyRegexParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optional}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitOptional(JasnyRegexParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oneOrMore}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterOneOrMore(JasnyRegexParser.OneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oneOrMore}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitOneOrMore(JasnyRegexParser.OneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zeroOrMore}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterZeroOrMore(JasnyRegexParser.ZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zeroOrMore}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitZeroOrMore(JasnyRegexParser.ZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exactly}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterExactly(JasnyRegexParser.ExactlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exactly}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitExactly(JasnyRegexParser.ExactlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code range}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterRange(JasnyRegexParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code range}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitRange(JasnyRegexParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minimum}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterMinimum(JasnyRegexParser.MinimumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minimum}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitMinimum(JasnyRegexParser.MinimumContext ctx);
}