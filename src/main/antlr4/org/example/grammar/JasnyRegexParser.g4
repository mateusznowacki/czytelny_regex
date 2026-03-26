parser grammar JasnyRegexParser;

options { tokenVocab = JasnyRegexLexer; }

// Punkt startowy – program to sekwencja wyrażeń
program
    : expression+ EOF
    ;

// Pojedyncze wyrażenie
expression
    : atom quantifier? SEMICOLON                                              # atomExpr
    | GRUPA LPAREN expression+ RPAREN quantifier? SEMICOLON                   # groupExpr
    | GRUPA_NAZWANA STRING LPAREN expression+ RPAREN quantifier? SEMICOLON    # namedGroupExpr
    | atom (LUB atom)+ SEMICOLON                                              # orExpr
    | JESLI_POTEM LPAREN expression+ RPAREN SEMICOLON                         # lookaheadExpr
    | JESLI_NIE_POTEM LPAREN expression+ RPAREN SEMICOLON                     # negLookaheadExpr
    | JESLI_PRZED LPAREN expression+ RPAREN SEMICOLON                         # lookbehindExpr
    | JESLI_NIE_PRZED LPAREN expression+ RPAREN SEMICOLON                     # negLookbehindExpr
    | DOWOLNY_Z LPAREN charSetItem+ RPAREN quantifier? SEMICOLON              # charSetExpr
    | ZADEN_Z LPAREN charSetItem+ RPAREN quantifier? SEMICOLON                # negCharSetExpr
    ;

// Elementy zbioru znaków (do DOWOLNY_Z / ŻADEN_Z)
charSetItem
    : STRING                        # charSetLiteral
    | ZAKRES STRING STRING          # charSetRange
    ;

// Atom – podstawowa jednostka
atom
    : ZACZNIJ_OD        # anchorStart
    | ZAKONCZ_NA        # anchorEnd
    | GRANICA_SLOWA     # wordBoundary
    | CYFRA             # digit
    | NIE_CYFRA         # nonDigit
    | LITERA            # letter
    | WIELKA_LITERA     # upperLetter
    | MALA_LITERA       # lowerLetter
    | ZNAK_BIALY        # whitespace
    | NIE_ZNAK_BIALY    # nonWhitespace
    | DOWOLNY_ZNAK      # anyChar
    | SLOWO             # word
    | NIE_SLOWO         # nonWord
    | TEKST STRING      # text
    | TAB               # tab
    | NOWA_LINIA        # newline
    | ZNAK STRING       # singleChar
    | EMAIL             # email
    | TELEFON           # phone
    | KOD_POCZTOWY      # postalCode
    | ADRES_IP          # ipAddress
    | URL               # url
    | DATA              # date
    | GODZINA           # time
    | HEX               # hex
    ;

// Kwantyfikator – modyfikator ilości (z opcjonalnym LENIWIE)
quantifier
    : OPCJONALNIE LENIWIE?              # optional
    | JEDEN_LUB_WIECEJ LENIWIE?         # oneOrMore
    | ZERO_LUB_WIECEJ LENIWIE?          # zeroOrMore
    | DOKLADNIE NUMBER                  # exactly
    | OD NUMBER DO NUMBER LENIWIE?      # range
    | MINIMUM NUMBER LENIWIE?           # minimum
    ;
