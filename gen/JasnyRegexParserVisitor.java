// Generated from /home/mateusz-nowacki/IdeaProjects/czytelny_regex/src/main/antlr4/org/example/grammar/JasnyRegexParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JasnyRegexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JasnyRegexParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JasnyRegexParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JasnyRegexParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(JasnyRegexParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupExpr(JasnyRegexParser.GroupExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedGroupExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedGroupExpr(JasnyRegexParser.NamedGroupExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(JasnyRegexParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lookaheadExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookaheadExpr(JasnyRegexParser.LookaheadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negLookaheadExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegLookaheadExpr(JasnyRegexParser.NegLookaheadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lookbehindExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookbehindExpr(JasnyRegexParser.LookbehindExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negLookbehindExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegLookbehindExpr(JasnyRegexParser.NegLookbehindExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charSetExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharSetExpr(JasnyRegexParser.CharSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negCharSetExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegCharSetExpr(JasnyRegexParser.NegCharSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charSetLiteral}
	 * labeled alternative in {@link JasnyRegexParser#charSetItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharSetLiteral(JasnyRegexParser.CharSetLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charSetRange}
	 * labeled alternative in {@link JasnyRegexParser#charSetItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharSetRange(JasnyRegexParser.CharSetRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anchorStart}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchorStart(JasnyRegexParser.AnchorStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anchorEnd}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchorEnd(JasnyRegexParser.AnchorEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wordBoundary}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordBoundary(JasnyRegexParser.WordBoundaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digit}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(JasnyRegexParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonDigit}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDigit(JasnyRegexParser.NonDigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letter}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(JasnyRegexParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code upperLetter}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpperLetter(JasnyRegexParser.UpperLetterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lowerLetter}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerLetter(JasnyRegexParser.LowerLetterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whitespace}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespace(JasnyRegexParser.WhitespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonWhitespace}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWhitespace(JasnyRegexParser.NonWhitespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyChar}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyChar(JasnyRegexParser.AnyCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code word}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(JasnyRegexParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonWord}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWord(JasnyRegexParser.NonWordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(JasnyRegexParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tab}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTab(JasnyRegexParser.TabContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newline}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(JasnyRegexParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleChar}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChar(JasnyRegexParser.SingleCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code email}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(JasnyRegexParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code phone}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhone(JasnyRegexParser.PhoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postalCode}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostalCode(JasnyRegexParser.PostalCodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ipAddress}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpAddress(JasnyRegexParser.IpAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code url}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(JasnyRegexParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code date}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(JasnyRegexParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code time}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(JasnyRegexParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(JasnyRegexParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optional}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(JasnyRegexParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oneOrMore}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOrMore(JasnyRegexParser.OneOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zeroOrMore}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroOrMore(JasnyRegexParser.ZeroOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exactly}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExactly(JasnyRegexParser.ExactlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code range}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(JasnyRegexParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minimum}
	 * labeled alternative in {@link JasnyRegexParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinimum(JasnyRegexParser.MinimumContext ctx);
}