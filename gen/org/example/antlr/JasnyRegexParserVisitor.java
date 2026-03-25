// Generated from /home/mateusz-nowacki/IdeaProjects/czytelny_regex/src/main/java/org/example/antlr/JasnyRegexParser.g4 by ANTLR 4.13.2
package org.example.antlr;
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
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JasnyRegexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(JasnyRegexParser.OrExprContext ctx);
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
	 * Visit a parse tree produced by the {@code whitespace}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespace(JasnyRegexParser.WhitespaceContext ctx);
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
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link JasnyRegexParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(JasnyRegexParser.TextContext ctx);
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