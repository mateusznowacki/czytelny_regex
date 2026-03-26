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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Punkt wejścia aplikacji webowej JasnyRegex.
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    // ─── Współdzielona logika Tłumaczenia ────────────────────────────────

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
