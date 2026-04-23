/**
 * Lekser języka JasnyRegex.
 *
 * Definiuje tokeny (słowa kluczowe, symbole, literały) rozpoznawane
 * przez parser. Każdy token odpowiada jednej konstrukcji języka.
 *
 * Tokeny zawierające polskie znaki diakrytyczne akceptują również:
 * 1. Warianty bez znaków polski (ASCII) - np. SLOWO
 * 2. Warianty pisane małymi literami - np. słowo, slowo
 */
lexer grammar JasnyRegexLexer;

// ─── Kotwice (pozycjonowanie dopasowania) ────────────────────────────
ZACZNIJ_OD    : 'ZACZNIJ_OD' | 'zacznij_od';
ZAKONCZ_NA    : 'ZAKOŃCZ_NA' | 'ZAKONCZ_NA' | 'zakończ_na' | 'zakoncz_na';
GRANICA_SLOWA : 'GRANICA_SŁOWA' | 'GRANICA_SLOWA' | 'granica_słowa' | 'granica_slowa';

// ─── Klasy znaków (typy dopasowywanych znaków) ──────────────────────
CYFRA         : 'CYFRA' | 'cyfra';
NIE_CYFRA     : 'NIE_CYFRA' | 'nie_cyfra';
LITERA        : 'LITERA' | 'litera';
WIELKA_LITERA : 'WIELKA_LITERA' | 'wielka_litera';
MALA_LITERA   : 'MAŁA_LITERA' | 'MALA_LITERA' | 'mała_litera' | 'mala_litera';
ZNAK_BIALY    : 'ZNAK_BIAŁY' | 'ZNAK_BIALY' | 'znak_biały' | 'znak_bialy';
NIE_ZNAK_BIALY: 'NIE_ZNAK_BIAŁY' | 'NIE_ZNAK_BIALY' | 'nie_znak_biały' | 'nie_znak_bialy';
DOWOLNY_ZNAK  : 'DOWOLNY_ZNAK' | 'dowolny_znak';
SLOWO         : 'SŁOWO' | 'SLOWO' | 'słowo' | 'slowo';
NIE_SLOWO     : 'NIE_SŁOWO' | 'NIE_SLOWO' | 'nie_słowo' | 'nie_slowo';
TEKST         : 'TEKST' | 'tekst';
TAB           : 'TAB' | 'tab';
NOWA_LINIA    : 'NOWA_LINIA' | 'nowa_linia';
ZAKRES        : 'ZAKRES' | 'zakres';
ZNAK          : 'ZNAK' | 'znak';

// ─── Predefiniowane wzorce (gotowe do użycia) ───────────────────────
EMAIL         : 'EMAIL' | 'email';
TELEFON       : 'TELEFON' | 'telefon';
KOD_POCZTOWY  : 'KOD_POCZTOWY' | 'kod_pocztowy';
ADRES_IP      : 'ADRES_IP' | 'adres_ip';
URL           : 'URL' | 'url';
DATA          : 'DATA' | 'data';
GODZINA       : 'GODZINA' | 'godzina';
HEX           : 'HEX' | 'hex';

// ─── Kwantyfikatory (ile razy element ma wystąpić) ──────────────────
OPCJONALNIE       : 'OPCJONALNIE' | 'opcjonalnie';
JEDEN_LUB_WIECEJ  : 'JEDEN_LUB_WIĘCEJ' | 'JEDEN_LUB_WIECEJ' | 'jeden_lub_więcej' | 'jeden_lub_wiecej';
ZERO_LUB_WIECEJ   : 'ZERO_LUB_WIĘCEJ' | 'ZERO_LUB_WIECEJ' | 'zero_lub_więcej' | 'zero_lub_wiecej';
DOKLADNIE         : 'DOKŁADNIE' | 'DOKLADNIE' | 'dokładnie' | 'dokladnie';
OD                : 'OD' | 'od';
DO                : 'DO' | 'do';
MINIMUM           : 'MINIMUM' | 'minimum';
LENIWIE           : 'LENIWIE' | 'leniwie';

// ─── Grupowanie i logika ─────────────────────────────────────────────
GRUPA             : 'GRUPA' | 'grupa';
GRUPA_NAZWANA     : 'GRUPA_NAZWANA' | 'grupa_nazwana';
LUB               : 'LUB' | 'lub';

// ─── Warunki (Lookahead / Lookbehind – sprawdzają kontekst) ─────────
JESLI_POTEM       : 'JEŚLI_POTEM' | 'JESLI_POTEM' | 'jeśli_potem' | 'jesli_potem';
JESLI_NIE_POTEM   : 'JEŚLI_NIE_POTEM' | 'JESLI_NIE_POTEM' | 'jeśli_nie_potem' | 'jesli_nie_potem';
JESLI_PRZED       : 'JEŚLI_PRZED' | 'JESLI_PRZED' | 'jeśli_przed' | 'jesli_przed';
JESLI_NIE_PRZED   : 'JEŚLI_NIE_PRZED' | 'JESLI_NIE_PRZED' | 'jeśli_nie_przed' | 'jesli_nie_przed';

// ─── Negacja zbioru znaków ──────────────────────────────────────────
DOWOLNY_Z         : 'DOWOLNY_Z' | 'dowolny_z';
ZADEN_Z           : 'ŻADEN_Z' | 'ZADEN_Z' | 'żaden_z' | 'zaden_z';

// ─── Symbole ────────────────────────────────────────────────────────
LPAREN        : '(';
RPAREN        : ')';
SEMICOLON     : ';';

// ─── Literały ───────────────────────────────────────────────────────
NUMBER        : [0-9]+;
STRING        : '"' (~["])* '"';

// ─── Białe znaki – pomijane przez parser ────────────────────────────
WS            : [ \t\r\n]+ -> skip;
