package org.example.controller;

import org.example.Main;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Kontroler REST API do tłumaczenia wyrażeń JasnyRegex na standardowy regex.
 *
 * Endpoint: POST /api/translate
 * - Przyjmuje JSON z polem "expression" (wyrażenie JasnyRegex)
 * - Zwraca JSON z polem "regex" (przetłumaczony regex) lub "error" (komunikat błędu)
 */
@RestController
@RequestMapping("/api")
public class TranslatorController {

    /**
     * Tłumaczy wyrażenie JasnyRegex na regex.
     *
     * @param request obiekt z polem expression (wyrażenie JasnyRegex)
     * @return 200 OK z przetłumaczonym regexem lub 400 Bad Request z opisem błędu
     */
    @PostMapping("/translate")
    public ResponseEntity<?> translate(@RequestBody TranslateRequest request) {
        try {
            String regex = Main.translate(request.getExpression());
            return ResponseEntity.ok(Map.of("regex", regex));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    /**
     * DTO (Data Transfer Object) dla żądania tłumaczenia.
     */
    public static class TranslateRequest {
        private String expression;

        public String getExpression() {
            return expression;
        }

        public void setExpression(String expression) {
            this.expression = expression;
        }
    }
}
