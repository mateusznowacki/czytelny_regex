# JasnyRegex – Czytelny Regex

Translator czytelnych wyrażeń regularnych napisanych w języku **JasnyRegex** na standardowy format **Regex**.  
Zbudowany z użyciem **ANTLR 4** i **Java 21**.

---

## Specyfikacja języka JasnyRegex

### 1. Kotwice (Pozycjonowanie)

Mówią silnikowi, gdzie dokładnie ma szukać dopasowania.

| JasnyRegex      | Regex | Opis                                                            |
|-----------------|-------|-----------------------------------------------------------------|
| `ZACZNIJ_OD;`   | `^`   | Wymusza, aby dopasowanie było od samego początku linii.         |
| `ZAKOŃCZ_NA;`   | `$`   | Wymusza, aby dopasowanie kończyło się równo z końcem linii.     |

### 2. Klasy znaków (Czego szukamy)

To podstawowe bloki budulcowe.

| JasnyRegex        | Regex       | Opis                                                          |
|-------------------|-------------|---------------------------------------------------------------|
| `CYFRA`           | `\d`        | Jakakolwiek cyfra (0-9).                                      |
| `NIE_CYFRA`       | `\D`        | Cokolwiek, co nie jest cyfrą.                                  |
| `LITERA`          | `[a-zA-Z]`  | Standardowa litera alfabetu.                                   |
| `ZNAK_BIAŁY`      | `\s`        | Spacja, tabulator, nowa linia.                                 |
| `DOWOLNY_ZNAK`    | `.`         | Pasuje do absolutnie wszystkiego (oprócz nowej linii).         |
| `SŁOWO`           | `\w`        | Znak alfanumeryczny (litery, cyfry, podkreślnik).              |
| `TEKST "abc"`     | `abc`       | Dokładny, dosłowny ciąg znaków (z escape'owaniem zn. specj.). |

### 3. Kwantyfikatory (Ile razy to występuje)

Kwantyfikator zawsze dotyczy elementu, który stoi bezpośrednio przed nim.

| JasnyRegex          | Regex    | Opis                                                |
|---------------------|----------|-----------------------------------------------------|
| `OPCJONALNIE`       | `?`      | Występuje zero lub jeden raz.                       |
| `JEDEN_LUB_WIĘCEJ`  | `+`      | Musi wystąpić minimum raz, ale może więcej.         |
| `ZERO_LUB_WIĘCEJ`   | `*`      | Może go nie być wcale, albo może być go dużo.       |
| `DOKŁADNIE n`       | `{n}`    | Gdzie n to liczba (np. `DOKŁADNIE 5`).              |
| `OD n DO m`         | `{n,m}`  | Przedział wystąpień (np. `OD 2 DO 4`).              |
| `MINIMUM n`         | `{n,}`   | Dolna granica wystąpień.                             |

### 4. Logika i Grupowanie

| JasnyRegex              | Regex     | Opis                                                        |
|-------------------------|-----------|-------------------------------------------------------------|
| `GRUPA ( ... )`         | `( ... )` | Zamyka kilka wyrażeń w jedną całość.                        |
| `LUB`                   | `\|`      | Alternatywa – jedno lub drugie.                             |

### Escaping w TEKST

Jeśli w JasnyRegex ktoś napisze `TEKST "Koszty to 5$."`, tłumacz automatycznie escape'uje znaki specjalne regexa wewnątrz tekstu, generując: `Koszty to 5\$\.`

### Przykład

```
GRUPA ( CYFRA DOKŁADNIE 2; TEKST "-"; ) OPCJONALNIE;
```

Wynik: `(\d{2}\-)?`

---

## Budowanie i uruchamianie

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="org.example.Main"
```

## Struktura projektu

```
src/main/java/org/example/
├── Main.java                           – punkt wejścia (REPL)
├── grammar/
│   ├── JasnyRegexLexer.g4              – gramatyka leksera
│   └── JasnyRegexParser.g4            – gramatyka parsera
└── translator/
    └── JasnyRegexTranslator.java       – Visitor tłumaczący AST na regex
```