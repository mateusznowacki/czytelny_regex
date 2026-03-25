package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.grammar.JasnyRegexLexer;
import org.example.grammar.JasnyRegexParser;
import org.example.translator.JasnyRegexTranslator;

import java.util.Scanner;

/**
 * Punkt wejścia aplikacji JasnyRegex.
 * Wczytuje wyrażenie w języku JasnyRegex, parsuje je za pomocą ANTLR
 * i tłumaczy na standardowe wyrażenie regularne (regex).
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== JasnyRegex → Regex Translator ===");
        System.out.println("Wpisz wyrażenie w języku JasnyRegex (lub 'exit' aby zakończyć):");
        System.out.println();

        while (true) {
            System.out.print("JasnyRegex> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
                System.out.println("Do widzenia!");
                break;
            }

            if (input.isEmpty()) {
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

    /**
     * Tłumaczy wyrażenie JasnyRegex na standardowy regex.
     *
     * @param jasnyRegexInput wyrażenie w języku JasnyRegex
     * @return standardowe wyrażenie regularne
     */
    public static String translate(String jasnyRegexInput) {
        // 1. Lexer – tokenizacja wejścia
        CharStream charStream = CharStreams.fromString(jasnyRegexInput);
        JasnyRegexLexer lexer = new JasnyRegexLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ThrowingErrorListener());

        // 2. Parser – budowanie drzewa AST
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JasnyRegexParser parser = new JasnyRegexParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());

        ParseTree tree = parser.program();

        // 3. Visitor – przechodzenie po drzewie i generowanie regexa
        JasnyRegexTranslator translator = new JasnyRegexTranslator();
        return translator.visit(tree);
    }

    /**
     * Listener błędów, który rzuca wyjątek zamiast wypisywać na stderr.
     */
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
