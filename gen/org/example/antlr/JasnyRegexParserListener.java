// Generated from /home/mateusz-nowacki/IdeaProjects/czytelny_regex/src/main/java/org/example/antlr/JasnyRegexParser.g4 by ANTLR 4.13.2
package org.example.antlr;
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