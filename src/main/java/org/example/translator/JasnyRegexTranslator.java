package org.example.translator;

import org.example.grammar.JasnyRegexParser;
import org.example.grammar.JasnyRegexParserBaseVisitor;

import java.util.Set;

/**
 * Visitor tłumaczący drzewo AST języka JasnyRegex na standardowy regex.
 *
 * Obsługiwane konstrukcje:
 * - Kotwice: ZACZNIJ_OD, ZAKOŃCZ_NA, GRANICA_SŁOWA
 * - Klasy znaków: CYFRA, LITERA, SŁOWO, DOWOLNY_ZNAK, TAB, NOWA_LINIA itp.
 * - Negacje: NIE_CYFRA, NIE_SŁOWO, NIE_ZNAK_BIAŁY
 * - Kwantyfikatory: OPCJONALNIE, JEDEN_LUB_WIĘCEJ, ZERO_LUB_WIĘCEJ, DOKŁADNIE, OD..DO, MINIMUM
 * - Tryb leniwy: LENIWIE (dodaje ? po kwantyfikatorze)
 * - Grupowanie: GRUPA, GRUPA_NAZWANA, LUB
 * - Warunki: JEŚLI_POTEM, JEŚLI_NIE_POTEM, JEŚLI_PRZED, JEŚLI_NIE_PRZED
 * - Zbiory znaków: DOWOLNY_Z, ŻADEN_Z (z ZAKRES)
 * - Teksty: TEKST, ZNAK (z automatycznym escapingiem)
 * - Predefiniowane wzorce: EMAIL, TELEFON, KOD_POCZTOWY, ADRES_IP, URL, DATA, GODZINA, HEX
 */
public class JasnyRegexTranslator extends JasnyRegexParserBaseVisitor<String> {

    /** Znaki specjalne regexa, które wymagają escape'owania w blokach TEKST. */
    private static final Set<Character> REGEX_SPECIAL_CHARS = Set.of(
            '.', '*', '+', '?', '(', ')', '[', ']', '{', '}',
            '\\', '^', '$', '|'
    );

    // ─── Program ─────────────────────────────────────────────────────────

    /**
     * Punkt startowy – łączy wyniki tłumaczenia wszystkich wyrażeń w programie.
     */
    @Override
    public String visitProgram(JasnyRegexParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        return sb.toString();
    }

    // ─── Wyrażenia ───────────────────────────────────────────────────────

    /**
     * Wyrażenie atomowe – atom z opcjonalnym kwantyfikatorem.
     * Przykład: CYFRA DOKŁADNIE 3; → \d{3}
     */
    @Override
    public String visitAtomExpr(JasnyRegexParser.AtomExprContext ctx) {
        String result = visit(ctx.atom());
        if (ctx.quantifier() != null) {
            result += visit(ctx.quantifier());
        }
        return result;
    }

    /**
     * Grupa – zamyka wyrażenia w nawiasy okrągłe z opcjonalnym kwantyfikatorem.
     * Przykład: GRUPA ( CYFRA; TEKST "-"; ) DOKŁADNIE 2; → (\d\-){2}
     */
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

    /**
     * Grupa nazwana – tworzy przechwytującą grupę z identyfikatorem.
     * Przykład: GRUPA_NAZWANA "kod" ( CYFRA; ) → (?<kod>\d)
     */
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

    /**
     * Alternatywa – łączy atomy operatorem |.
     * Przykład: CYFRA LUB LITERA; → \d|[a-zA-Z]
     */
    @Override
    public String visitOrExpr(JasnyRegexParser.OrExprContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.atom().size(); i++) {
            if (i > 0) {
                sb.append("|");
            }
            sb.append(visit(ctx.atom(i)));
        }
        return sb.toString();
    }

    // ─── Warunki (Lookahead / Lookbehind) ────────────────────────────────

    /**
     * Pozytywny lookahead – (?=...).
     * Sprawdza, czy po bieżącej pozycji występuje dany wzorzec.
     */
    @Override
    public String visitLookaheadExpr(JasnyRegexParser.LookaheadExprContext ctx) {
        StringBuilder sb = new StringBuilder("(?=");
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        sb.append(")");
        return sb.toString();
    }

    /**
     * Negatywny lookahead – (?!...).
     * Sprawdza, czy po bieżącej pozycji NIE występuje dany wzorzec.
     */
    @Override
    public String visitNegLookaheadExpr(JasnyRegexParser.NegLookaheadExprContext ctx) {
        StringBuilder sb = new StringBuilder("(?!");
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        sb.append(")");
        return sb.toString();
    }

    /**
     * Pozytywny lookbehind – (?<=...).
     * Sprawdza, czy przed bieżącą pozycją występuje dany wzorzec.
     */
    @Override
    public String visitLookbehindExpr(JasnyRegexParser.LookbehindExprContext ctx) {
        StringBuilder sb = new StringBuilder("(?<=");
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        sb.append(")");
        return sb.toString();
    }

    /**
     * Negatywny lookbehind – (?<!...).
     * Sprawdza, czy przed bieżącą pozycją NIE występuje dany wzorzec.
     */
    @Override
    public String visitNegLookbehindExpr(JasnyRegexParser.NegLookbehindExprContext ctx) {
        StringBuilder sb = new StringBuilder("(?<!");
        for (JasnyRegexParser.ExpressionContext expr : ctx.expression()) {
            sb.append(visit(expr));
        }
        sb.append(")");
        return sb.toString();
    }

    // ─── Zbiory znaków ──────────────────────────────────────────────────

    /**
     * Pozytywny zbiór znaków – [...].
     * Przykład: DOWOLNY_Z ( "aeiou" ) → [aeiou]
     */
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

    /**
     * Negatywny zbiór znaków – [^...].
     * Przykład: ŻADEN_Z ( ZAKRES "0" "9" ) → [^0-9]
     */
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

    /** Literał w zbiorze znaków – dosłowne znaki z cudzysłowu. */
    @Override
    public String visitCharSetLiteral(JasnyRegexParser.CharSetLiteralContext ctx) {
        return stripQuotes(ctx.STRING().getText());
    }

    /** Zakres w zbiorze znaków – np. ZAKRES "a" "z" → a-z. */
    @Override
    public String visitCharSetRange(JasnyRegexParser.CharSetRangeContext ctx) {
        String from = stripQuotes(ctx.STRING(0).getText());
        String to = stripQuotes(ctx.STRING(1).getText());
        return from + "-" + to;
    }

    // ─── Kotwice ─────────────────────────────────────────────────────────

    /** ZACZNIJ_OD → ^ */
    @Override
    public String visitAnchorStart(JasnyRegexParser.AnchorStartContext ctx) {
        return "^";
    }

    /** ZAKOŃCZ_NA → $ */
    @Override
    public String visitAnchorEnd(JasnyRegexParser.AnchorEndContext ctx) {
        return "$";
    }

    /** GRANICA_SŁOWA → \b */
    @Override
    public String visitWordBoundary(JasnyRegexParser.WordBoundaryContext ctx) {
        return "\\b";
    }

    // ─── Klasy znaków ───────────────────────────────────────────────────

    /** CYFRA → \d */
    @Override
    public String visitDigit(JasnyRegexParser.DigitContext ctx) {
        return "\\d";
    }

    /** NIE_CYFRA → \D */
    @Override
    public String visitNonDigit(JasnyRegexParser.NonDigitContext ctx) {
        return "\\D";
    }

    /** LITERA → [a-zA-Z] */
    @Override
    public String visitLetter(JasnyRegexParser.LetterContext ctx) {
        return "[a-zA-Z]";
    }

    /** WIELKA_LITERA → [A-Z] */
    @Override
    public String visitUpperLetter(JasnyRegexParser.UpperLetterContext ctx) {
        return "[A-Z]";
    }

    /** MAŁA_LITERA → [a-z] */
    @Override
    public String visitLowerLetter(JasnyRegexParser.LowerLetterContext ctx) {
        return "[a-z]";
    }

    /** ZNAK_BIAŁY → \s */
    @Override
    public String visitWhitespace(JasnyRegexParser.WhitespaceContext ctx) {
        return "\\s";
    }

    /** NIE_ZNAK_BIAŁY → \S */
    @Override
    public String visitNonWhitespace(JasnyRegexParser.NonWhitespaceContext ctx) {
        return "\\S";
    }

    /** DOWOLNY_ZNAK → . (dowolny znak oprócz nowej linii) */
    @Override
    public String visitAnyChar(JasnyRegexParser.AnyCharContext ctx) {
        return ".";
    }

    /** SŁOWO → \w (litera, cyfra lub podkreślnik) */
    @Override
    public String visitWord(JasnyRegexParser.WordContext ctx) {
        return "\\w";
    }

    /** NIE_SŁOWO → \W */
    @Override
    public String visitNonWord(JasnyRegexParser.NonWordContext ctx) {
        return "\\W";
    }

    /** TAB → \t */
    @Override
    public String visitTab(JasnyRegexParser.TabContext ctx) {
        return "\\t";
    }

    /** NOWA_LINIA → \n */
    @Override
    public String visitNewline(JasnyRegexParser.NewlineContext ctx) {
        return "\\n";
    }

    /**
     * TEKST "..." → dosłowny ciąg znaków z escape'owaniem znaków specjalnych regexa.
     * Np. TEKST "5$." → 5\$\.
     */
    @Override
    public String visitText(JasnyRegexParser.TextContext ctx) {
        String content = stripQuotes(ctx.STRING().getText());
        return escapeRegex(content);
    }

    /**
     * ZNAK "x" → pojedynczy znak z escape'owaniem.
     */
    @Override
    public String visitSingleChar(JasnyRegexParser.SingleCharContext ctx) {
        String content = stripQuotes(ctx.STRING().getText());
        return escapeRegex(content);
    }

    // ─── Predefiniowane wzorce ───────────────────────────────────────────

    /** EMAIL → regex walidujący adres e-mail. */
    @Override
    public String visitEmail(JasnyRegexParser.EmailContext ctx) {
        return "[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9.\\-]+\\.[a-zA-Z]{2,}";
    }

    /** TELEFON → regex walidujący numer telefonu (format polski/międzynarodowy). */
    @Override
    public String visitPhone(JasnyRegexParser.PhoneContext ctx) {
        return "(\\+?\\d{1,3}[\\s\\-]?)?\\d{3}[\\s\\-]?\\d{3}[\\s\\-]?\\d{3}";
    }

    /** KOD_POCZTOWY → regex walidujący kod pocztowy (format XX-XXX). */
    @Override
    public String visitPostalCode(JasnyRegexParser.PostalCodeContext ctx) {
        return "\\d{2}\\-\\d{3}";
    }

    /** ADRES_IP → regex walidujący adres IPv4 (0.0.0.0 – 255.255.255.255). */
    @Override
    public String visitIpAddress(JasnyRegexParser.IpAddressContext ctx) {
        String octet = "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)";
        return octet + "\\." + octet + "\\." + octet + "\\." + octet;
    }

    /** URL → regex dopasowujący adres URL (http/https). */
    @Override
    public String visitUrl(JasnyRegexParser.UrlContext ctx) {
        return "https?://[\\w\\-]+(\\.[\\w\\-]+)+(/[\\w\\-._~:/?#\\[\\]@!$&'()*+,;=%]*)?";
    }

    /** DATA → regex walidujący datę w formacie DD-MM-YYYY, DD/MM/YYYY lub DD.MM.YYYY. */
    @Override
    public String visitDate(JasnyRegexParser.DateContext ctx) {
        return "\\d{2}[\\-/.]\\d{2}[\\-/.]\\d{4}";
    }

    /** GODZINA → regex walidujący godzinę w formacie HH:MM lub HH:MM:SS. */
    @Override
    public String visitTime(JasnyRegexParser.TimeContext ctx) {
        return "([01]\\d|2[0-3]):[0-5]\\d(:[0-5]\\d)?";
    }

    /** HEX → regex walidujący kolor HEX w formacie #FFF lub #FFFFFF. */
    @Override
    public String visitHex(JasnyRegexParser.HexContext ctx) {
        return "#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})";
    }

    // ─── Kwantyfikatory ──────────────────────────────────────────────────

    /** OPCJONALNIE → ? (lub ?? w trybie leniwym) */
    @Override
    public String visitOptional(JasnyRegexParser.OptionalContext ctx) {
        return ctx.LENIWIE() != null ? "??" : "?";
    }

    /** JEDEN_LUB_WIĘCEJ → + (lub +? w trybie leniwym) */
    @Override
    public String visitOneOrMore(JasnyRegexParser.OneOrMoreContext ctx) {
        return ctx.LENIWIE() != null ? "+?" : "+";
    }

    /** ZERO_LUB_WIĘCEJ → * (lub *? w trybie leniwym) */
    @Override
    public String visitZeroOrMore(JasnyRegexParser.ZeroOrMoreContext ctx) {
        return ctx.LENIWIE() != null ? "*?" : "*";
    }

    /** DOKŁADNIE n → {n} */
    @Override
    public String visitExactly(JasnyRegexParser.ExactlyContext ctx) {
        return "{" + ctx.NUMBER().getText() + "}";
    }

    /** OD n DO m → {n,m} (lub {n,m}? w trybie leniwym) */
    @Override
    public String visitRange(JasnyRegexParser.RangeContext ctx) {
        String result = "{" + ctx.NUMBER(0).getText() + "," + ctx.NUMBER(1).getText() + "}";
        return ctx.LENIWIE() != null ? result + "?" : result;
    }

    /** MINIMUM n → {n,} (lub {n,}? w trybie leniwym) */
    @Override
    public String visitMinimum(JasnyRegexParser.MinimumContext ctx) {
        String result = "{" + ctx.NUMBER().getText() + ",}";
        return ctx.LENIWIE() != null ? result + "?" : result;
    }

    // ─── Metody pomocnicze ───────────────────────────────────────────────

    /**
     * Escape'uje znaki specjalne regexa w tekście dosłownym.
     * Każdy znak z zestawu . * + ? ( ) [ ] { } \ ^ $ | jest poprzedzany backslashem.
     *
     * @param text oryginalny tekst
     * @return tekst z escape'owanymi znakami specjalnymi
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

    /**
     * Usuwa cudzysłowy otaczające literał tekstowy z gramatyki.
     * Np. "hello" → hello
     *
     * @param quoted tekst otoczony cudzysłowami
     * @return tekst bez otaczających cudzysłowów
     */
    private String stripQuotes(String quoted) {
        return quoted.substring(1, quoted.length() - 1);
    }
}
