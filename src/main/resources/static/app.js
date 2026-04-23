/**
 * JasnyRegex Translator – logika frontendowa.
 */
document.addEventListener('DOMContentLoaded', () => {
    const inputArea = document.getElementById('jasny-input');
    const resultBox = document.getElementById('result-box');
    const errorBox = document.getElementById('error-box');
    const copyBtn = document.getElementById('copy-btn');
    const chips = document.querySelectorAll('.chip');

    let debounceTimer;

    // ─── Mapa słów kluczowych ASCII → polskie znaki ─────────────────

    /** Słowa kluczowe ASCII do zamiany na polskie (dla wygody i czytelności) */
    const ASCII_MAP = {
        'ZAKONCZ_NA':       'ZAKOŃCZ_NA',
        'GRANICA_SLOWA':    'GRANICA_SŁOWA',
        'MALA_LITERA':      'MAŁA_LITERA',
        'ZNAK_BIALY':       'ZNAK_BIAŁY',
        'NIE_ZNAK_BIALY':   'NIE_ZNAK_BIAŁY',
        'SLOWO':            'SŁOWO',
        'NIE_SLOWO':        'NIE_SŁOWO',
        'JEDEN_LUB_WIECEJ': 'JEDEN_LUB_WIĘCEJ',
        'ZERO_LUB_WIECEJ':  'ZERO_LUB_WIĘCEJ',
        'DOKLADNIE':        'DOKŁADNIE',
        'JESLI_POTEM':      'JEŚLI_POTEM',
        'JESLI_NIE_POTEM':  'JEŚLI_NIE_POTEM',
        'JESLI_PRZED':      'JEŚLI_PRZED',
        'JESLI_NIE_PRZED':  'JEŚLI_NIE_PRZED',
        'ZADEN_Z':          'ŻADEN_Z'
    };

    /**
     * Zamienia słowa kluczowe ASCII na wersje z polskimi znakami.
     * @param {string} text - tekst wejściowy
     * @returns {string} przetworzony tekst
     */
    function normalizeKeywords(text) {
        if (!text) return '';
        const parts = text.split(/("(?:[^"\\]|\\.)*")/g);

        for (let i = 0; i < parts.length; i++) {
            if (i % 2 === 1) continue;

            let segment = parts[i];
            const words = segment.split(/(\b\w+\b)/g);
            for (let j = 0; j < words.length; j++) {
                const upperWord = words[j].toUpperCase();
                if (ASCII_MAP[upperWord]) {
                    words[j] = ASCII_MAP[upperWord];
                }
            }
            parts[i] = words.join('');
        }
        return parts.join('');
    }

    // ─── Tłumaczenie ─────────────────────────────────────────────────

    const translateRegex = async (expression) => {
        if (!expression.trim()) {
            resultBox.innerHTML = '<span class="placeholder">Tutaj pojawi się wynik...</span>';
            resultBox.style.display = 'flex';
            errorBox.style.display = 'none';
            copyBtn.disabled = true;
            return;
        }

        try {
            const response = await fetch('/api/translate', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ expression: expression })
            });
            const data = await response.json();

            if (response.ok) {
                resultBox.textContent = data.regex;
                resultBox.style.display = 'flex';
                errorBox.style.display = 'none';
                copyBtn.disabled = false;
            } else {
                errorBox.textContent = data.error || 'Wystąpił błąd.';
                errorBox.style.display = 'flex';
                resultBox.style.display = 'none';
                copyBtn.disabled = true;
            }
        } catch (error) {
            errorBox.textContent = 'Błąd połączenia.';
            errorBox.style.display = 'flex';
            resultBox.style.display = 'none';
            copyBtn.disabled = true;
        }
    };

    // ─── Eventy ─────────────────────────────────────────────────────

    inputArea.addEventListener('input', () => {
        clearTimeout(debounceTimer);
        errorBox.style.display = 'none';

        debounceTimer = setTimeout(() => {
            const val = inputArea.value;
            const fixed = normalizeKeywords(val);
            if (val !== fixed) {
                const start = inputArea.selectionStart;
                inputArea.value = fixed;
                inputArea.setSelectionRange(start, start);
            }
            translateRegex(inputArea.value);
        }, 1000);
    });

    // Kopiowanie
    copyBtn.addEventListener('click', async () => {
        const text = resultBox.textContent;
        if (text && !copyBtn.disabled) {
            await navigator.clipboard.writeText(text);
            const original = copyBtn.textContent;
            copyBtn.textContent = 'Skopiowano!';
            setTimeout(() => copyBtn.textContent = original, 2000);
        }
    });

    // Chipy
    chips.forEach(chip => {
        chip.addEventListener('click', () => {
            const insert = chip.getAttribute('data-insert') + ';';
            const pos = inputArea.selectionStart;
            const val = inputArea.value;
            inputArea.value = val.substring(0, pos) + insert + val.substring(inputArea.selectionEnd);
            inputArea.focus();
            const newPos = pos + insert.length;
            inputArea.setSelectionRange(newPos, newPos);
            translateRegex(inputArea.value);
        });
    });
});
