lexer grammar JasnyRegexLexer;

// Kotwice
ZACZNIJ_OD    : 'ZACZNIJ_OD';
ZAKONCZ_NA    : 'ZAKOŃCZ_NA';
GRANICA_SLOWA : 'GRANICA_SŁOWA';

// Klasy znaków
CYFRA         : 'CYFRA';
NIE_CYFRA     : 'NIE_CYFRA';
LITERA        : 'LITERA';
WIELKA_LITERA : 'WIELKA_LITERA';
MALA_LITERA   : 'MAŁA_LITERA';
ZNAK_BIALY    : 'ZNAK_BIAŁY';
NIE_ZNAK_BIALY: 'NIE_ZNAK_BIAŁY';
DOWOLNY_ZNAK  : 'DOWOLNY_ZNAK';
SLOWO         : 'SŁOWO';
NIE_SLOWO     : 'NIE_SŁOWO';
TEKST         : 'TEKST';
TAB           : 'TAB';
NOWA_LINIA    : 'NOWA_LINIA';
ZAKRES        : 'ZAKRES';
ZNAK          : 'ZNAK';

// Predefiniowane wzorce
EMAIL         : 'EMAIL';
TELEFON       : 'TELEFON';
KOD_POCZTOWY  : 'KOD_POCZTOWY';
ADRES_IP      : 'ADRES_IP';
URL           : 'URL';
DATA          : 'DATA';
GODZINA       : 'GODZINA';
HEX           : 'HEX';

// Kwantyfikatory
OPCJONALNIE       : 'OPCJONALNIE';
JEDEN_LUB_WIECEJ  : 'JEDEN_LUB_WIĘCEJ';
ZERO_LUB_WIECEJ   : 'ZERO_LUB_WIĘCEJ';
DOKLADNIE         : 'DOKŁADNIE';
OD                : 'OD';
DO                : 'DO';
MINIMUM           : 'MINIMUM';
LENIWIE           : 'LENIWIE';

// Grupowanie i logika
GRUPA             : 'GRUPA';
GRUPA_NAZWANA     : 'GRUPA_NAZWANA';
LUB               : 'LUB';

// Lookahead / Lookbehind (warunki)
JESLI_POTEM       : 'JEŚLI_POTEM';
JESLI_NIE_POTEM   : 'JEŚLI_NIE_POTEM';
JESLI_PRZED       : 'JEŚLI_PRZED';
JESLI_NIE_PRZED   : 'JEŚLI_NIE_PRZED';

// Negacja zbioru
DOWOLNY_Z         : 'DOWOLNY_Z';
ZADEN_Z           : 'ŻADEN_Z';

// Symbole
LPAREN        : '(';
RPAREN        : ')';
SEMICOLON     : ';';

// Literały
NUMBER        : [0-9]+;
STRING        : '"' (~["])* '"';

// Białe znaki – pomijane
WS            : [ \t\r\n]+ -> skip;
