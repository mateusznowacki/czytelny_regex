package org.example.translator;

import org.example.grammar.JasnyRegexParser;
import org.example.grammar.JasnyRegexParserBaseVisitor;

import java.util.Set;

/**
 * Visitor tłumaczący drzewo AST języka JasnyRegex na standardowy regex.
 *
 * Każda metoda visit* odpowiada regule gramatycznej i zwraca
 * odpowiadający jej fragment wyrażenia regularnego.
 */
public class JasnyRegexTranslator extends JasnyRegexParserBaseVisitor<String> {

    /**
     * Znaki specjalne regexa, które muszą być escape'owane w TEKST "...".
     */
    private static final Set<Character> REGEX_SPECIAL_CHARS = Set.of(
            '.', '*', '+', '?', '(', ')', '[', ']', '{', '}',
            '\\', '^', '$', '|'
    );

    // ─── Program ────────────────────────────────────────────────────────

    @Override
    public String visitProgram(JasnyRegexParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        return sb.toString();
    }

    // ─── Wyrażenia ──────────────────────────────────────────────────────

    @Override
    public String visitAtomExpr(JasnyRegexParser.AtomExprContext ctx) {
        String atomResult = visit(ctx.atom());
        if (ctx.quantifier() != null) {
            atomResult += visit(ctx.quantifier());
        }
        return atomResult;
    }

    @Override
    public String visitGroupExpr(JasnyRegexParser.GroupExprContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        sb.append(")");
        if (ctx.quantifier() != null) {
            sb.append(visit(ctx.quantifier()));
        }
        return sb.toString();
    }

    @Override
    public String visitOrExpr(JasnyRegexParser.OrExprContext ctx) {
        String left = visit(ctx.atom(0));
        String right = visit(ctx.atom(1));
        return left + "|" + right;
    }

    // ─── Atomy (klasy znaków i kotwice) ─────────────────────────────────

    @Override
    public String visitAnchorStart(JasnyRegexParser.AnchorStartContext ctx) {
        return "^";
    }

    @Override
    public String visitAnchorEnd(JasnyRegexParser.AnchorEndContext ctx) {
        return "$";
    }

    @Override
    public String visitDigit(JasnyRegexParser.DigitContext ctx) {
        return "\\d";
    }

    @Override
    public String visitNonDigit(JasnyRegexParser.NonDigitContext ctx) {
        return "\\D";
    }

    @Override
    public String visitLetter(JasnyRegexParser.LetterContext ctx) {
        return "[a-zA-Z]";
    }

    @Override
    public String visitWhitespace(JasnyRegexParser.WhitespaceContext ctx) {
        return "\\s";
    }

    @Override
    public String visitAnyChar(JasnyRegexParser.AnyCharContext ctx) {
        return ".";
    }

    @Override
    public String visitWord(JasnyRegexParser.WordContext ctx) {
        return "\\w";
    }

    @Override
    public String visitText(JasnyRegexParser.TextContext ctx) {
        // Pobierz tekst z cudzysłowów i escape'uj znaki specjalne regexa
        String raw = ctx.STRING().getText();
        // Usuwamy cudzysłowy otaczające tekst
        String content = raw.substring(1, raw.length() - 1);
        return escapeRegex(content);
    }

    // ─── Kwantyfikatory ─────────────────────────────────────────────────

    @Override
    public String visitOptional(JasnyRegexParser.OptionalContext ctx) {
        return "?";
    }

    @Override
    public String visitOneOrMore(JasnyRegexParser.OneOrMoreContext ctx) {
        return "+";
    }

    @Override
    public String visitZeroOrMore(JasnyRegexParser.ZeroOrMoreContext ctx) {
        return "*";
    }

    @Override
    public String visitExactly(JasnyRegexParser.ExactlyContext ctx) {
        return "{" + ctx.NUMBER().getText() + "}";
    }

    @Override
    public String visitRange(JasnyRegexParser.RangeContext ctx) {
        return "{" + ctx.NUMBER(0).getText() + "," + ctx.NUMBER(1).getText() + "}";
    }

    @Override
    public String visitMinimum(JasnyRegexParser.MinimumContext ctx) {
        return "{" + ctx.NUMBER().getText() + ",}";
    }

    // ─── Pomocnicze ─────────────────────────────────────────────────────

    /**
     * Escape'uje znaki specjalne regexa w podanym tekście.
     * Np. "5$." → "5\\$\\."
     */
    private String escapeRegex(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (REGEX_SPECIAL_CHARS.contains(c)) {
                sb.append('\\');
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
