package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.grammar.JasnyRegexLexer;
import org.example.grammar.JasnyRegexParser;
import org.example.translator.JasnyRegexTranslator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Główna klasa aplikacji JasnyRegex.
 *
 * Uruchamia serwer Spring Boot na porcie 8080 i udostępnia:
 * - interfejs webowy (static/index.html)
 * - REST API do tłumaczenia wyrażeń (POST /api/translate)
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    public static String translate(String jasnyRegexInput) {
        if (jasnyRegexInput == null || jasnyRegexInput.isBlank()) {
            throw new RuntimeException("Wyrażenie nie może być puste.");
        }

        // 1. Tokenizacja – podział tekstu na tokeny (CYFRA, DOKŁADNIE, NUMBER, ...)
        CharStream charStream = CharStreams.fromString(jasnyRegexInput);
        JasnyRegexLexer lexer = new JasnyRegexLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ThrowingErrorListener());

        // 2. Parsowanie – budowa drzewa składniowego (AST)
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JasnyRegexParser parser = new JasnyRegexParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());

        ParseTree tree = parser.program();

        // 3. Tłumaczenie – przejście drzewa AST i generowanie regexa
        JasnyRegexTranslator translator = new JasnyRegexTranslator();
        return translator.visit(tree);
    }

    /**
     * Listener błędów ANTLR, który zamienia błędy składniowe na wyjątki RuntimeException.
     * Domyślny listener ANTLR wypisuje błędy na stderr – ten listener zamiast tego
     * rzuca wyjątek z czytelnym komunikatem, który jest zwracany użytkownikowi.
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
