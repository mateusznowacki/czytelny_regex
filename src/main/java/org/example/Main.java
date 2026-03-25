package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.grammar.JasnyRegexLexer;
import org.example.grammar.JasnyRegexParser;
import org.example.translator.JasnyRegexTranslator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Punkt wejścia aplikacji JasnyRegex.
 *
 * Tryby uruchomienia:
 *   1) Bez argumentów      → tryb interaktywny (REPL)
 *   2) Z argumentem plik   → odczytuje wyrażenia z pliku i tłumaczy
 */
public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            // Tryb plikowy
            runFromFile(args[0]);
        } else {
            // Tryb interaktywny
            runInteractive();
        }
    }

    // ═══════════════════════════════════════════════════════════════════
    // TRYB PLIKOWY – odczyt z pliku (np. przyklady.txt)
    // ═══════════════════════════════════════════════════════════════════

    private static void runFromFile(String filePath) {
        Path path = Path.of(filePath);
        if (!Files.exists(path)) {
            System.err.println("Plik nie istnieje: " + filePath);
            System.exit(1);
        }

        List<String> lines;
        try {
            lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku: " + e.getMessage());
            System.exit(1);
            return;
        }

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   JasnyRegex – Tłumaczenie z pliku      ║");
        System.out.println("║   Plik: " + padRight(filePath, 32) + "║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();

        int translated = 0;
        int errors = 0;

        for (String line : lines) {
            String trimmed = line.trim();

            // Pomiń komentarze i puste linie
            if (trimmed.isEmpty() || trimmed.startsWith("#")) {
                if (trimmed.startsWith("#")) {
                    System.out.println("  " + trimmed);
                }
                continue;
            }

            try {
                String regex = translate(trimmed);
                System.out.println("  JasnyRegex │ " + trimmed);
                System.out.println("  Regex      │ " + regex);
                System.out.println("  ───────────┼" + "─".repeat(50));
                translated++;
            } catch (Exception e) {
                System.out.println("  JasnyRegex │ " + trimmed);
                System.out.println("  ❌ BŁĄD    │ " + e.getMessage());
                System.out.println("  ───────────┼" + "─".repeat(50));
                errors++;
            }
        }

        System.out.println();
        System.out.println("  Podsumowanie: " + translated + " przetłumaczonych, " + errors + " błędów");
    }

    private static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    // ═══════════════════════════════════════════════════════════════════
    // TRYB INTERAKTYWNY (REPL)
    // ═══════════════════════════════════════════════════════════════════

    private static void runInteractive() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   JasnyRegex → Regex Translator v2.0    ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║  Wpisz wyrażenie JasnyRegex             ║");
        System.out.println("║  Komendy: test, tree, help, exit        ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();

        while (true) {
            System.out.print("JasnyRegex> ");
            if (!scanner.hasNextLine()) break;
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
                System.out.println("Do widzenia!");
                break;
            }

            if (input.isEmpty()) continue;

            if (input.equalsIgnoreCase("help")) {
                printHelp();
                continue;
            }

            if (input.toLowerCase().startsWith("test ")) {
                handleTest(input.substring(5).trim(), scanner);
                continue;
            }

            if (input.toLowerCase().startsWith("tree ")) {
                handleTree(input.substring(5).trim());
                continue;
            }

            try {
                String regex = translate(input);
                System.out.println("Regex    → " + regex);
                System.out.println();
            } catch (Exception e) {
                System.err.println("Błąd: " + e.getMessage());
                System.out.println();
            }
        }

        scanner.close();
    }

    // ─── Tryb TEST ──────────────────────────────────────────────────────

    private static void handleTest(String jasnyExpr, Scanner scanner) {
        try {
            String regex = translate(jasnyExpr);
            System.out.println("Regex    → " + regex);
            System.out.println();

            Pattern pattern = Pattern.compile(regex);

            System.out.println("  Wpisz tekst do przetestowania (pusta linia = koniec):");
            while (true) {
                System.out.print("  Test> ");
                if (!scanner.hasNextLine()) break;
                String testInput = scanner.nextLine();
                if (testInput.isEmpty()) break;

                Matcher matcher = pattern.matcher(testInput);
                if (matcher.find()) {
                    System.out.println("  ✅ DOPASOWANO: \"" + matcher.group() + "\"");
                    int count = 1;
                    while (matcher.find()) {
                        count++;
                        System.out.println("     Dopasowanie #" + count + ": \"" + matcher.group() + "\"");
                    }
                } else {
                    System.out.println("  ❌ BRAK DOPASOWANIA");
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.err.println("Błąd: " + e.getMessage());
            System.out.println();
        }
    }

    // ─── Tryb TREE ──────────────────────────────────────────────────────

    private static void handleTree(String jasnyExpr) {
        try {
            CharStream charStream = CharStreams.fromString(jasnyExpr);
            JasnyRegexLexer lexer = new JasnyRegexLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JasnyRegexParser parser = new JasnyRegexParser(tokens);
            ParseTree tree = parser.program();

            System.out.println("  Drzewo AST:");
            System.out.println("  " + "─".repeat(40));
            printTree(tree, parser, "", true);
            System.out.println();
        } catch (Exception e) {
            System.err.println("Błąd: " + e.getMessage());
            System.out.println();
        }
    }

    private static void printTree(ParseTree node, Parser parser, String indent, boolean last) {
        String connector = last ? "└── " : "├── ";
        String label;

        if (node instanceof RuleContext) {
            int ruleIndex = ((RuleContext) node).getRuleIndex();
            label = "📦 " + parser.getRuleNames()[ruleIndex];
        } else {
            label = "🔤 " + Trees.getNodeText(node, parser);
        }

        System.out.println("  " + indent + connector + label);

        String childIndent = indent + (last ? "    " : "│   ");
        for (int i = 0; i < node.getChildCount(); i++) {
            printTree(node.getChild(i), parser, childIndent, i == node.getChildCount() - 1);
        }
    }

    // ─── Tłumaczenie ────────────────────────────────────────────────────

    public static String translate(String jasnyRegexInput) {
        if (jasnyRegexInput == null || jasnyRegexInput.isBlank()) {
            throw new RuntimeException("Wyrażenie nie może być puste.");
        }

        CharStream charStream = CharStreams.fromString(jasnyRegexInput);
        JasnyRegexLexer lexer = new JasnyRegexLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ThrowingErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JasnyRegexParser parser = new JasnyRegexParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());

        ParseTree tree = parser.program();

        JasnyRegexTranslator translator = new JasnyRegexTranslator();
        return translator.visit(tree);
    }

    // ─── Pomoc ──────────────────────────────────────────────────────────

    private static void printHelp() {
        System.out.println();
        System.out.println("  ┌────────────────────────────────────────────────────────────────┐");
        System.out.println("  │ KOMENDY:                                                      │");
        System.out.println("  │   <wyrażenie>      → tłumaczy na regex                        │");
        System.out.println("  │   test <wyrażenie>  → tłumaczy i testuje na tekście            │");
        System.out.println("  │   tree <wyrażenie>  → pokazuje drzewo AST                      │");
        System.out.println("  │   help              → ta pomoc                                 │");
        System.out.println("  │   exit              → zakończ program                          │");
        System.out.println("  ├────────────────────────────────────────────────────────────────┤");
        System.out.println("  │ KOTWICE:           ZACZNIJ_OD  ZAKOŃCZ_NA  GRANICA_SŁOWA       │");
        System.out.println("  ├────────────────────────────────────────────────────────────────┤");
        System.out.println("  │ KLASY ZNAKÓW:                                                 │");
        System.out.println("  │   CYFRA  NIE_CYFRA  LITERA  WIELKA_LITERA  MAŁA_LITERA        │");
        System.out.println("  │   SŁOWO  NIE_SŁOWO  ZNAK_BIAŁY  NIE_ZNAK_BIAŁY                │");
        System.out.println("  │   DOWOLNY_ZNAK  TAB  NOWA_LINIA  TEKST \"...\"  ZNAK \"x\"        │");
        System.out.println("  ├────────────────────────────────────────────────────────────────┤");
        System.out.println("  │ KWANTYFIKATORY:                                                │");
        System.out.println("  │   OPCJONALNIE  JEDEN_LUB_WIĘCEJ  ZERO_LUB_WIĘCEJ              │");
        System.out.println("  │   DOKŁADNIE n  OD n DO m  MINIMUM n                           │");
        System.out.println("  │   + LENIWIE (np. JEDEN_LUB_WIĘCEJ LENIWIE → +?)               │");
        System.out.println("  ├────────────────────────────────────────────────────────────────┤");
        System.out.println("  │ GRUPOWANIE:                                                    │");
        System.out.println("  │   GRUPA ( ... )                                                │");
        System.out.println("  │   GRUPA_NAZWANA \"nazwa\" ( ... )                                │");
        System.out.println("  │   LUB                                                          │");
        System.out.println("  ├────────────────────────────────────────────────────────────────┤");
        System.out.println("  │ WARUNKI (Lookahead/Lookbehind):                                │");
        System.out.println("  │   JEŚLI_POTEM ( ... )      → (?=...)  pozytywny lookahead      │");
        System.out.println("  │   JEŚLI_NIE_POTEM ( ... )  → (?!...)  negatywny lookahead      │");
        System.out.println("  │   JEŚLI_PRZED ( ... )      → (?<=...) pozytywny lookbehind     │");
        System.out.println("  │   JEŚLI_NIE_PRZED ( ... )  → (?<!...) negatywny lookbehind     │");
        System.out.println("  ├────────────────────────────────────────────────────────────────┤");
        System.out.println("  │ ZBIORY ZNAKÓW:                                                 │");
        System.out.println("  │   DOWOLNY_Z ( \"abc\" ZAKRES \"a\" \"z\" )  → [abca-z]               │");
        System.out.println("  │   ŻADEN_Z ( \"xyz\" )                   → [^xyz]                 │");
        System.out.println("  ├────────────────────────────────────────────────────────────────┤");
        System.out.println("  │ PREDEFINIOWANE:                                                │");
        System.out.println("  │   EMAIL  TELEFON  KOD_POCZTOWY  ADRES_IP                      │");
        System.out.println("  │   URL  DATA  GODZINA  HEX                                     │");
        System.out.println("  ├────────────────────────────────────────────────────────────────┤");
        System.out.println("  │ TRYB PLIKOWY:                                                  │");
        System.out.println("  │   mvn exec:java -Dexec.args=\"przyklady.txt\"                    │");
        System.out.println("  └────────────────────────────────────────────────────────────────┘");
        System.out.println();
    }

    // ─── Error Listener ─────────────────────────────────────────────────

    private static class ThrowingErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line,
                                int charPositionInLine,
                                String msg,
                                RecognitionException e) {
            throw new RuntimeException(
                    "Błąd składni w linii " + line + ":" + charPositionInLine + " – " + msg
            );
        }
    }
}
