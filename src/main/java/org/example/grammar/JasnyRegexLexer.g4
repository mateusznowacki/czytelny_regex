lexer grammar JasnyRegexLexer;

@header {
package org.example.grammar;
}

// Kotwice
ZACZNIJ_OD    : 'ZACZNIJ_OD';
ZAKONCZ_NA    : 'ZAKOŃCZ_NA';

// Klasy znaków
CYFRA         : 'CYFRA';
NIE_CYFRA     : 'NIE_CYFRA';
LITERA        : 'LITERA';
ZNAK_BIALY    : 'ZNAK_BIAŁY';
DOWOLNY_ZNAK  : 'DOWOLNY_ZNAK';
SLOWO         : 'SŁOWO';
TEKST         : 'TEKST';

// Kwantyfikatory
OPCJONALNIE       : 'OPCJONALNIE';
JEDEN_LUB_WIECEJ  : 'JEDEN_LUB_WIĘCEJ';
ZERO_LUB_WIECEJ   : 'ZERO_LUB_WIĘCEJ';
DOKLADNIE         : 'DOKŁADNIE';
OD                : 'OD';
DO                : 'DO';
MINIMUM           : 'MINIMUM';

// Grupowanie i logika
GRUPA         : 'GRUPA';
LUB           : 'LUB';

// Symbole
LPAREN        : '(';
RPAREN        : ')';
SEMICOLON     : ';';

// Literały
NUMBER        : [0-9]+;
STRING        : '"' (~["])* '"';

// Białe znaki – pomijane
WS            : [ \t\r\n]+ -> skip;
