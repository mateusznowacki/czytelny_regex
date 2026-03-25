parser grammar JasnyRegexParser;

options { tokenVocab = JasnyRegexLexer; }

@header {
package org.example.grammar;
}

// Punkt startowy – program to sekwencja wyrażeń
program
    : expression+ EOF
    ;

// Pojedyncze wyrażenie – element z opcjonalnym kwantyfikatorem, zakończony średnikiem
expression
    : atom quantifier? SEMICOLON          # atomExpr
    | GRUPA LPAREN expression+ RPAREN quantifier? SEMICOLON   # groupExpr
    | atom LUB atom SEMICOLON             # orExpr
    ;

// Atom – podstawowa jednostka
atom
    : ZACZNIJ_OD        # anchorStart
    | ZAKONCZ_NA        # anchorEnd
    | CYFRA             # digit
    | NIE_CYFRA         # nonDigit
    | LITERA            # letter
    | ZNAK_BIALY        # whitespace
    | DOWOLNY_ZNAK      # anyChar
    | SLOWO             # word
    | TEKST STRING      # text
    ;

// Kwantyfikator – modyfikator ilości
quantifier
    : OPCJONALNIE                   # optional
    | JEDEN_LUB_WIECEJ              # oneOrMore
    | ZERO_LUB_WIECEJ               # zeroOrMore
    | DOKLADNIE NUMBER              # exactly
    | OD NUMBER DO NUMBER           # range
    | MINIMUM NUMBER                # minimum
    ;
