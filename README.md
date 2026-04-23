# JasnyRegex – Czytelny Regex

Translator czytelnych wyrażeń regularnych napisanych w języku **JasnyRegex** na standardowy format **Regex**.  
Zbudowany z użyciem **ANTLR 4**, **Java 21**, **Spring Boot** oraz **HTML/JS/CSS**.

---

## Spis treści

1. [Główne funkcjonalności](#główne-funkkcjonalności)
2. [Wymagania systemowe](#wymagania-systemowe)
3. [Budowanie projektu](#budowanie-projektu)
4. [Uruchamianie](#uruchamianie)
5. [Instrukcja obsługi](#instrukcja-obsługi)
6. [Specyfikacja języka JasnyRegex](#specyfikacja-języka-jasnyregex)
7. [Przykłady](#przykłady)
8. [REST API](#rest-api)
9. [Struktura projektu](#struktura-projektu)

---

## Główne funkcjonalności

- **Tłumaczenie języka naturalnego na Regex** – zamiana czytelnych, polskich poleceń na skomplikowane wzorce regularne.
- **Interfejs Webowy typu Live-Preview** – wynikowy regex generuje się automatycznie podczas pisania (z opóźnieniem debounce 1s).
- **Wsparcie dla ASCII i Case-Insensitivity** – akceptuje komendy pisane małymi literami oraz bez polskich znaków (np. `slowo` zamiast `SŁOWO`).
- **Szybkie wstawianie wzorców (Chips)** – gotowe przyciski dla najpopularniejszych wzorców (Email, IP, Telefon, URL itp.).
- **Szczegółowe raportowanie błędów** – wskazywanie dokładnej linii i kolumny błędu składniowego w języku polskim.
- **REST API** – możliwość integracji translatora z zewnętrznymi systemami poprzez endpointy JSON.
- **Bogata specyfikacja** – obsługa grup (również nazwanych), lookaroundów, kwantyfikatorów leniwych, zbiorów i zakresów znaków.

---

## Wymagania systemowe

| Narzędzie | Minimalna wersja |
|-----------|------------------|
| Java JDK  | 21               |
| Maven     | 3.8+             |

## Budowanie projektu i generowanie kodu

Projekt wykorzystuje **ANTLR 4** do analizy składniowej. Kod źródłowy parsera i leksera jest generowany automatycznie z plików gramatyki (`.g4`) podczas kompilacji.

```bash
# Wygenerowanie kodu ANTLR i kompilacja całego projektu
mvn clean compile
```

### Uwagi dotyczące ANTLR:
- **Automatyzacja**: Dzięki wtyczce `antlr4-maven-plugin`, każdorazowe uruchomienie `mvn compile` sprawdza zmiany w plikach `.g4` i w razie potrzeby regeneruje klasy Java.
- **Lokalizacja wygenerowanego kodu**: Pliki Java wygenerowane przez ANTLR trafiają do katalogu `target/generated-sources/antlr4/`. Nie należy ich edytować ręcznie.
- **Odświeżanie w IDE**: Jeśli używasz IntelliJ/Eclipse i po zmianie gramatyki widzisz błędy, wykonaj `mvn clean compile`, a następnie zaznacz folder `target/generated-sources/antlr4` jako *Generated Sources Root*.

## Uruchamianie

```bash
# Uruchomienie aplikacji webowej
mvn exec:java -Dexec.mainClass="org.example.Main"
```

Po uruchomieniu aplikacja wystartuje jako serwer HTTP na porcie **8080**.  
Otwórz przeglądarkę i przejdź pod adres:

```
http://localhost:8080
```

---

## Instrukcja obsługi

### Interfejs webowy

Aplikacja udostępnia interfejs webowy składający się z trzech sekcji:

1. **Panel boczny (Składnia JasnyRegex)** – po lewej stronie ekranu znajduje się ściągawka z pełną listą dostępnych
   komend i ich odpowiednikami w regexie. Pomaga w szybkim pisaniu wyrażeń.

2. **Panel wejściowy (Wpisz wyrażenie)** – pole tekstowe, w które wpisujesz wyrażenie JasnyRegex. Tłumaczenie odbywa się
   **automatycznie** po 1,2 sekundy od zakończenia pisania – nie musisz klikać żadnego przycisku.

3. **Panel wynikowy (Gotowy Regex)** – tutaj pojawia się przetłumaczone wyrażenie regularne. Pod spodem dostępny jest
   przycisk **„Skopiuj do schowka"**, który kopiuje wynik do schowka systemowego.

### Szybkie wstawianie wzorców

Pod polem wejściowym znajdują się **przyciski szybkiego wstawiania** dla predefiniowanych wzorców (EMAIL, URL, ADRES_IP,
DATA, GODZINA, TELEFON, KOD_POCZTOWY, HEX). Kliknięcie dowolnego z nich wstawia odpowiednie polecenie w miejsce kursora.

### Obsługa błędów

Jeśli wpisane wyrażenie zawiera błąd składniowy, w panelu wynikowym pojawi się czerwony komunikat z opisem problemu, w
tym numerem linii i pozycją znaku, w której wykryto błąd.

### Zasady składni

- Każde wyrażenie kończy się **średnikiem `;`**
- Kwantyfikator (np. `DOKŁADNIE 3`) pisze się **po elemencie**, którego dotyczy
- Wyrażenia grupowe zamykamy w `GRUPA ( ... )`
- Tekst dosłowny umieszczamy w cudzysłowach: `TEKST "treść"`
- Słowa kluczowe piszemy **WIELKIMI LITERAMI**

---

## Specyfikacja języka JasnyRegex

### 1. Kotwice (pozycjonowanie)

Mówią silnikowi, gdzie dokładnie ma szukać dopasowania.

| JasnyRegex       | Regex | Opis                                        |
|------------------|-------|---------------------------------------------|
| `ZACZNIJ_OD;`    | `^`   | Dopasowanie od początku linii.              |
| `ZAKOŃCZ_NA;`    | `$`   | Dopasowanie na końcu linii.                 |
| `GRANICA_SŁOWA;` | `\b`  | Granica słowa (np. początek/koniec wyrazu). |

### 2. Klasy znaków (czego szukamy)

Podstawowe bloki budulcowe wyrażeń.

| JasnyRegex       | Regex      | Opis                                                |
|------------------|------------|-----------------------------------------------------|
| `CYFRA`          | `\d`       | Dowolna cyfra (0–9).                                |
| `NIE_CYFRA`      | `\D`       | Cokolwiek, co nie jest cyfrą.                       |
| `LITERA`         | `[a-zA-Z]` | Litera łacińska (mała lub wielka).                  |
| `WIELKA_LITERA`  | `[A-Z]`    | Tylko wielka litera.                                |
| `MAŁA_LITERA`    | `[a-z]`    | Tylko mała litera.                                  |
| `ZNAK_BIAŁY`     | `\s`       | Spacja, tabulator, nowa linia.                      |
| `NIE_ZNAK_BIAŁY` | `\S`       | Cokolwiek, co nie jest znakiem białym.              |
| `DOWOLNY_ZNAK`   | `.`        | Dowolny znak (oprócz nowej linii).                  |
| `SŁOWO`          | `\w`       | Alfanumeryczny + podkreślnik.                       |
| `NIE_SŁOWO`      | `\W`       | Cokolwiek spoza klasy `\w`.                         |
| `TAB`            | `\t`       | Tabulator.                                          |
| `NOWA_LINIA`     | `\n`       | Nowa linia.                                         |
| `TEKST "abc"`    | `abc`      | Dosłowny tekst (ze-escape'owanymi zn. specjalnymi). |
| `ZNAK "x"`       | `x`        | Pojedynczy znak.                                    |

### 3. Kwantyfikatory (ile razy to występuje)

Kwantyfikator zawsze dotyczy elementu stojącego bezpośrednio przed nim.

| JasnyRegex         | Regex   | Opis                                     |
|--------------------|---------|------------------------------------------|
| `OPCJONALNIE`      | `?`     | Zero lub jeden raz.                      |
| `JEDEN_LUB_WIĘCEJ` | `+`     | Minimum raz, ale może więcej.            |
| `ZERO_LUB_WIĘCEJ`  | `*`     | Może nie być wcale, albo być dużo.       |
| `DOKŁADNIE n`      | `{n}`   | Dokładnie n razy (np. `DOKŁADNIE 5`).    |
| `OD n DO m`        | `{n,m}` | Przedział wystąpień (np. `OD 2 DO 4`).   |
| `MINIMUM n`        | `{n,}`  | Co najmniej n razy.                      |
| `LENIWIE`          | `?`     | Dodany po kwantyfikatorze – tryb leniwy. |

> **Tryb leniwy** (`LENIWIE`) oznacza, że dopasowane zostanie jak najmniej znaków zamiast jak najwięcej (zachłannie).

### 4. Grupowanie i logika

| JasnyRegex                      | Regex             | Opis                              |
|---------------------------------|-------------------|-----------------------------------|
| `GRUPA ( ... )`                 | `( ... )`         | Grupuje wyrażenia w jedną całość. |
| `GRUPA_NAZWANA "nazwa" ( ... )` | `(?<nazwa> ... )` | Grupa z nazwą do przechwytywania. |
| `LUB`                           | `\|`              | Alternatywa – jedno lub drugie.   |

### 5. Warunki (Lookahead / Lookbehind)

Sprawdzają kontekst bez konsumowania znaków.

| JasnyRegex                | Regex      | Opis                                        |
|---------------------------|------------|---------------------------------------------|
| `JEŚLI_POTEM ( ... )`     | `(?=...)`  | Pozytywny lookahead – sprawdza co dalej.    |
| `JEŚLI_NIE_POTEM ( ... )` | `(?!...)`  | Negatywny lookahead – sprawdza, że nie ma.  |
| `JEŚLI_PRZED ( ... )`     | `(?<=...)` | Pozytywny lookbehind – sprawdza co przed.   |
| `JEŚLI_NIE_PRZED ( ... )` | `(?<!...)` | Negatywny lookbehind – sprawdza, że nie ma. |

### 6. Zbiory znaków

| JasnyRegex                     | Regex    | Opis                       |
|--------------------------------|----------|----------------------------|
| `DOWOLNY_Z ( "abc" )`          | `[abc]`  | Dowolny z podanych znaków. |
| `ŻADEN_Z ( "abc" )`            | `[^abc]` | Żaden z podanych znaków.   |
| `DOWOLNY_Z ( ZAKRES "a" "z" )` | `[a-z]`  | Zakres znaków.             |

### 7. Predefiniowane wzorce

Gotowe wzorce do użycia jednym słowem kluczowym.

| JasnyRegex     | Opis                                           |
|----------------|------------------------------------------------|
| `EMAIL`        | Adres e-mail.                                  |
| `TELEFON`      | Numer telefonu (format polski/międzynarodowy). |
| `KOD_POCZTOWY` | Kod pocztowy (format XX-XXX).                  |
| `ADRES_IP`     | Adres IPv4.                                    |
| `URL`          | Adres URL (http/https).                        |
| `DATA`         | Data (DD-MM-YYYY, DD/MM/YYYY, DD.MM.YYYY).     |
| `GODZINA`      | Godzina (HH:MM lub HH:MM:SS).                  |
| `HEX`          | Kolor HEX (#FFF lub #FFFFFF).                  |

### Escaping w TEKST

Jeśli w JasnyRegex napiszemy `TEKST "Koszty to 5$."`, translator automatycznie escape'uje znaki specjalne regexa,
generując: `Koszty to 5\$\.`

---

## Przykłady

Poniżej wybrane przykłady. Pełna lista dostępna jest w pliku [`przyklady.txt`](przyklady.txt).

### Podstawowe

```
CYFRA DOKŁADNIE 3;                          → \d{3}
LITERA JEDEN_LUB_WIĘCEJ;                    → [a-zA-Z]+
TEKST "hello";                              → hello
```

### Grupowanie

```
GRUPA ( CYFRA DOKŁADNIE 3; TEKST "-"; ) DOKŁADNIE 2; CYFRA DOKŁADNIE 4;
→ (\d{3}\-){2}\d{4}

GRUPA_NAZWANA "kod" ( TEKST "+"; CYFRA OD 1 DO 3; );
→ (?<kod>\+\d{1,3})
```

### Warunki

```
SŁOWO JEDEN_LUB_WIĘCEJ; JEŚLI_POTEM ( TEKST "@"; );
→ \w+(?=@)

JEŚLI_PRZED ( TEKST "$"; ); CYFRA JEDEN_LUB_WIĘCEJ;
→ (?<=\$)\d+
```

### Leniwe kwantyfikatory

```
DOWOLNY_ZNAK JEDEN_LUB_WIĘCEJ LENIWIE;      → .+?
DOWOLNY_ZNAK ZERO_LUB_WIĘCEJ LENIWIE;       → .*?
```

### Zbiory znaków

```
DOWOLNY_Z ( "aeiou" ) JEDEN_LUB_WIĘCEJ;     → [aeiou]+
ŻADEN_Z ( ZAKRES "0" "9" ) JEDEN_LUB_WIĘCEJ;→ [^0-9]+
```

### Predefiniowane wzorce

```
EMAIL;        → [a-zA-Z0-9._%+\-]+@[a-zA-Z0-9.\-]+\.[a-zA-Z]{2,}
TELEFON;      → (\+?\d{1,3}[\s\-]?)?\d{3}[\s\-]?\d{3}[\s\-]?\d{3}
KOD_POCZTOWY; → \d{2}\-\d{3}
```

### Złożone wyrażenie – walidacja numeru telefonu

```
ZACZNIJ_OD; GRUPA ( TEKST "+48"; ) OPCJONALNIE; ZNAK_BIAŁY OPCJONALNIE;
CYFRA DOKŁADNIE 3; TEKST "-"; CYFRA DOKŁADNIE 3; TEKST "-";
CYFRA DOKŁADNIE 3; ZAKOŃCZ_NA;

→ ^(\+48)?\s?\d{3}\-\d{3}\-\d{3}$
```

---

## REST API

Aplikacja udostępnia endpoint do tłumaczenia wyrażeń:

### `POST /api/translate`

**Nagłówki:**

```
Content-Type: application/json
```

**Ciało żądania:**

```json
{
  "expression": "CYFRA DOKŁADNIE 3;"
}
```

**Odpowiedź (200 OK):**

```json
{
  "regex": "\\d{3}"
}
```

**Odpowiedź (400 Bad Request):**

```json
{
  "error": "Błąd składni w linii 1:15 – ..."
}
```

**Przykład z curl:**

```bash
curl -X POST http://localhost:8080/api/translate \
  -H "Content-Type: application/json" \
  -d '{"expression": "ZACZNIJ_OD; EMAIL; ZAKOŃCZ_NA;"}'
```

---

## Struktura projektu

```
czytelny_regex/
├── pom.xml                                     – konfiguracja Maven
├── przyklady.txt                               – plik z przykładami wyrażeń
├── README.md                                   – ten plik
├── src/
│   ├── main/
│   │   ├── antlr4/org/example/grammar/
│   │   │   ├── JasnyRegexLexer.g4              – gramatyka leksera ANTLR
│   │   │   └── JasnyRegexParser.g4             – gramatyka parsera ANTLR
│   │   ├── java/org/example/
│   │   │   ├── Main.java                       – punkt wejścia (Spring Boot)
│   │   │   ├── controller/
│   │   │   │   └── TranslatorController.java   – endpoint REST API
│   │   │   └── translator/
│   │   │       └── JasnyRegexTranslator.java   – visitor tłumaczący AST → regex
│   │   └── resources/static/
│   │       ├── index.html                      – interfejs webowy
│   │       ├── style.css                       – style CSS
│   │       └── app.js                          – logika frontendowa (JS)
│   └── test/                                   – testy (do rozbudowy)
└── gen/                                        – wygenerowany kod ANTLR (IDE)
```

### Architektura

```
                        ┌─────────────────┐
  Przeglądarka ──────▶  │  Spring Boot    │
  (index.html, JS)      │  (port 8080)    │
         │              └────────┬────────┘
         │ POST /api/translate   │
         ▼                       ▼
  ┌──────────────┐    ┌──────────────────────┐
  │ Controller   │───▶│ Main.translate()     │
  │ (REST API)   │    │                      │
  └──────────────┘    │ 1. Lexer (ANTLR)     │
                      │ 2. Parser (ANTLR)    │
                      │ 3. Visitor (AST→Regex)│
                      └──────────────────────┘
```

---

## Technologie

| Technologia | Wersja | Rola                                      |
|-------------|--------|-------------------------------------------|
| Java        | 21     | Język programowania backendu              |
| Spring Boot | 3.2.4  | Framework webowy (serwer HTTP + REST API) |
| ANTLR 4     | 4.13.2 | Generator lexera i parsera z gramatyki    |
| HTML/CSS/JS | –      | Interfejs użytkownika (frontend)          |
| Maven       | 3.8+   | System budowania projektu                 |

---

## Autorzy

- Mateusz Nowacki
- Filip Sołtysiak