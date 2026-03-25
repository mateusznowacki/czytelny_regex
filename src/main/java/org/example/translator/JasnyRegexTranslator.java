package org.example.translator;

import org.example.grammar.JasnyRegexParser;
import org.example.grammar.JasnyRegexParserBaseVisitor;

import java.util.Set;

/**
 * Visitor tłumaczący drzewo AST języka JasnyRegex na standardowy regex.
 * Obsługuje pełny zestaw konstrukcji: kotwice, klasy znaków, kwantyfikatory,
 * grupy, warunki (lookahead/lookbehind), zbiory znaków i predefiniowane wzorce.
 */
public class JasnyRegexTranslator extends JasnyRegexParserBaseVisitor<String> {

    private static final Set<Character> REGEX_SPECIAL_CHARS = Set.of(
            '.', '*', '+', '?', '(', ')', '[', ']', '{', '}',
            '\\', '^', '$', '|'
    );

    // ═══════════════════════════════════════════════════════════════════
    // PROGRAM
    // ═══════════════════════════════════════════════════════════════════

    @Override
    public String visitProgram(JasnyRegexParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        return sb.toString();
    }

    // ═══════════════════════════════════════════════════════════════════
    // WYRAŻENIA
    // ═══════════════════════════════════════════════════════════════════

    @Override
    public String visitAtomExpr(JasnyRegexParser.AtomExprContext ctx) {
        String result = visit(ctx.atom());
        if (ctx.quantifier() != null) {
            result += visit(ctx.quantifier());
        }
        return result;
    }

    @Override
    public String visitGroupExpr(JasnyRegexParser.GroupExprContext ctx) {
        StringBuilder sb = new StringBuilder("(");
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
    public String visitNamedGroupExpr(JasnyRegexParser.NamedGroupExprContext ctx) {
        String name = stripQuotes(ctx.STRING().getText());
        StringBuilder sb = new StringBuilder("(?<" + name + ">");
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
        return visit(ctx.atom(0)) + "|" + visit(ctx.atom(1));
    }

    // ─── Lookahead / Lookbehind ─────────────────────────────────────────

    @Override
    public String visitLookaheadExpr(JasnyRegexParser.LookaheadExprContext ctx) {
        StringBuilder sb = new StringBuilder("(?=");
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitNegLookaheadExpr(JasnyRegexParser.NegLookaheadExprContext ctx) {
        StringBuilder sb = new StringBuilder("(?!");
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitLookbehindExpr(JasnyRegexParser.LookbehindExprContext ctx) {
        StringBuilder sb = new StringBuilder("(?<=");
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitNegLookbehindExpr(JasnyRegexParser.NegLookbehindExprContext ctx) {
        StringBuilder sb = new StringBuilder("(?<!");
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        sb.append(")");
        return sb.toString();
    }

    // ─── Zbiory znaków (DOWOLNY_Z / ŻADEN_Z) ───────────────────────────

    @Override
    public String visitCharSetExpr(JasnyRegexParser.CharSetExprContext ctx) {
        StringBuilder sb = new StringBuilder("[");
        for (JasnyRegexParser.CharSetItemContext item : ctx.charSetItem()) {
            sb.append(visit(item));
        }
        sb.append("]");
        if (ctx.quantifier() != null) {
            sb.append(visit(ctx.quantifier()));
        }
        return sb.toString();
    }

    @Override
    public String visitNegCharSetExpr(JasnyRegexParser.NegCharSetExprContext ctx) {
        StringBuilder sb = new StringBuilder("[^");
        for (JasnyRegexParser.CharSetItemContext item : ctx.charSetItem()) {
            sb.append(visit(item));
        }
        sb.append("]");
        if (ctx.quantifier() != null) {
            sb.append(visit(ctx.quantifier()));
        }
        return sb.toString();
    }

    @Override
    public String visitCharSetLiteral(JasnyRegexParser.CharSetLiteralContext ctx) {
        return stripQuotes(ctx.STRING().getText());
    }

    @Override
    public String visitCharSetRange(JasnyRegexParser.CharSetRangeContext ctx) {
        String from = stripQuotes(ctx.STRING(0).getText());
        String to = stripQuotes(ctx.STRING(1).getText());
        return from + "-" + to;
    }

    // ═══════════════════════════════════════════════════════════════════
    // ATOMY – kotwice i granice
    // ═══════════════════════════════════════════════════════════════════

    @Override
    public String visitAnchorStart(JasnyRegexParser.AnchorStartContext ctx) {
        return "^";
    }

    @Override
    public String visitAnchorEnd(JasnyRegexParser.AnchorEndContext ctx) {
        return "$";
    }

    @Override
    public String visitWordBoundary(JasnyRegexParser.WordBoundaryContext ctx) {
        return "\\b";
    }

    // ═══════════════════════════════════════════════════════════════════
    // ATOMY – klasy znaków
    // ═══════════════════════════════════════════════════════════════════

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
    public String visitUpperLetter(JasnyRegexParser.UpperLetterContext ctx) {
        return "[A-Z]";
    }

    @Override
    public String visitLowerLetter(JasnyRegexParser.LowerLetterContext ctx) {
        return "[a-z]";
    }

    @Override
    public String visitWhitespace(JasnyRegexParser.WhitespaceContext ctx) {
        return "\\s";
    }

    @Override
    public String visitNonWhitespace(JasnyRegexParser.NonWhitespaceContext ctx) {
        return "\\S";
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
    public String visitNonWord(JasnyRegexParser.NonWordContext ctx) {
        return "\\W";
    }

    @Override
    public String visitTab(JasnyRegexParser.TabContext ctx) {
        return "\\t";
    }

    @Override
    public String visitNewline(JasnyRegexParser.NewlineContext ctx) {
        return "\\n";
    }

    @Override
    public String visitText(JasnyRegexParser.TextContext ctx) {
        String content = stripQuotes(ctx.STRING().getText());
        return escapeRegex(content);
    }

    @Override
    public String visitSingleChar(JasnyRegexParser.SingleCharContext ctx) {
        String content = stripQuotes(ctx.STRING().getText());
        return escapeRegex(content);
    }

    // ═══════════════════════════════════════════════════════════════════
    // ATOMY – predefiniowane wzorce
    // ═══════════════════════════════════════════════════════════════════

    @Override
    public String visitEmail(JasnyRegexParser.EmailContext ctx) {
        return "[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9.\\-]+\\.[a-zA-Z]{2,}";
    }

    @Override
    public String visitPhone(JasnyRegexParser.PhoneContext ctx) {
        return "(\\+?\\d{1,3}[\\s\\-]?)?\\d{3}[\\s\\-]?\\d{3}[\\s\\-]?\\d{3}";
    }

    @Override
    public String visitPostalCode(JasnyRegexParser.PostalCodeContext ctx) {
        return "\\d{2}\\-\\d{3}";
    }

    @Override
    public String visitIpAddress(JasnyRegexParser.IpAddressContext ctx) {
        // IPv4: 0-255.0-255.0-255.0-255
        String octet = "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)";
        return octet + "\\." + octet + "\\." + octet + "\\." + octet;
    }

    @Override
    public String visitUrl(JasnyRegexParser.UrlContext ctx) {
        return "https?://[\\w\\-]+(\\.[\\w\\-]+)+(/[\\w\\-._~:/?#\\[\\]@!$&'()*+,;=%]*)?";
    }

    @Override
    public String visitDate(JasnyRegexParser.DateContext ctx) {
        // Format DD-MM-YYYY lub DD/MM/YYYY lub DD.MM.YYYY
        return "\\d{2}[\\-/.]\\d{2}[\\-/.]\\d{4}";
    }

    @Override
    public String visitTime(JasnyRegexParser.TimeContext ctx) {
        // Format HH:MM lub HH:MM:SS
        return "([01]\\d|2[0-3]):[0-5]\\d(:[0-5]\\d)?";
    }

    @Override
    public String visitHex(JasnyRegexParser.HexContext ctx) {
        // Kolor HEX: #FFF lub #FFFFFF
        return "#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})";
    }

    // ═══════════════════════════════════════════════════════════════════
    // KWANTYFIKATORY
    // ═══════════════════════════════════════════════════════════════════

    @Override
    public String visitOptional(JasnyRegexParser.OptionalContext ctx) {
        return ctx.LENIWIE() != null ? "??" : "?";
    }

    @Override
    public String visitOneOrMore(JasnyRegexParser.OneOrMoreContext ctx) {
        return ctx.LENIWIE() != null ? "+?" : "+";
    }

    @Override
    public String visitZeroOrMore(JasnyRegexParser.ZeroOrMoreContext ctx) {
        return ctx.LENIWIE() != null ? "*?" : "*";
    }

    @Override
    public String visitExactly(JasnyRegexParser.ExactlyContext ctx) {
        return "{" + ctx.NUMBER().getText() + "}";
    }

    @Override
    public String visitRange(JasnyRegexParser.RangeContext ctx) {
        String result = "{" + ctx.NUMBER(0).getText() + "," + ctx.NUMBER(1).getText() + "}";
        return ctx.LENIWIE() != null ? result + "?" : result;
    }

    @Override
    public String visitMinimum(JasnyRegexParser.MinimumContext ctx) {
        String result = "{" + ctx.NUMBER().getText() + ",}";
        return ctx.LENIWIE() != null ? result + "?" : result;
    }

    // ═══════════════════════════════════════════════════════════════════
    // POMOCNICZE
    // ═══════════════════════════════════════════════════════════════════

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

    private String stripQuotes(String quoted) {
        return quoted.substring(1, quoted.length() - 1);
    }
}
