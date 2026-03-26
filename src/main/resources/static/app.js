document.addEventListener('DOMContentLoaded', () => {
    const inputArea = document.getElementById('jasny-input');
    const resultBox = document.getElementById('result-box');
    const errorBox = document.getElementById('error-box');
    const copyBtn = document.getElementById('copy-btn');
    const chips = document.querySelectorAll('.chip');

    let debounceTimer;

    // Translation logic
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
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ expression: expression })
            });

            const data = await response.json();

            if (response.ok) {
                resultBox.textContent = data.regex;
                resultBox.style.display = 'flex';
                errorBox.style.display = 'none';
                copyBtn.disabled = false;
            } else {
                errorBox.textContent = data.error || 'Wystąpił nieznany błąd.';
                errorBox.style.display = 'flex';
                resultBox.style.display = 'none';
                copyBtn.disabled = true;
            }
        } catch (error) {
            errorBox.textContent = 'Błąd połączenia z serwerem.';
            errorBox.style.display = 'flex';
            resultBox.style.display = 'none';
            copyBtn.disabled = true;
        }
    };

    inputArea.addEventListener('input', (e) => {
        clearTimeout(debounceTimer);
        
        // Ukrywamy błędy podczas pisania, żeby nie straszyły
        errorBox.style.display = 'none';

        if (e.target.value.trim() !== '') {
            resultBox.innerHTML = '<span class="placeholder">Oczekiwanie na dokończenie pisania...</span>';
            resultBox.style.display = 'flex';
            copyBtn.disabled = true;
        }

        debounceTimer = setTimeout(() => {
            translateRegex(e.target.value);
        }, 1200); // 1.2s opóźnienia, czekamy na "koniec" inputu
    });

    // Copy to clipboard
    copyBtn.addEventListener('click', async () => {
        const regexText = resultBox.textContent;
        if (regexText && !copyBtn.disabled) {
            try {
                await navigator.clipboard.writeText(regexText);
                const originalText = copyBtn.textContent;
                copyBtn.textContent = 'Skopiowano!';
                setTimeout(() => {
                    copyBtn.textContent = originalText;
                }, 2000);
            } catch (err) {
                console.error('Failed to copy text: ', err);
            }
        }
    });



    // Quick Insert Chips Logic
    chips.forEach(chip => {
        chip.addEventListener('click', () => {
            const textToInsert = chip.getAttribute('data-insert') + ';';
            const cursorPos = inputArea.selectionStart;
            const textBefore = inputArea.value.substring(0, cursorPos);
            const textAfter = inputArea.value.substring(inputArea.selectionEnd, inputArea.value.length);
            
            // Add spaces if necessary around the inserted text for clean syntax
            const spaceBefore = textBefore.length > 0 && !textBefore.endsWith(' ') ? ' ' : '';
            const spaceAfter = textAfter.length > 0 && !textAfter.startsWith(' ') ? ' ' : '';
            
            inputArea.value = textBefore + spaceBefore + textToInsert + spaceAfter + textAfter;
            
            // Re-focus and update cursor position
            const newCursorPos = cursorPos + spaceBefore.length + textToInsert.length + spaceAfter.length;
            inputArea.focus();
            inputArea.setSelectionRange(newCursorPos, newCursorPos);

            // Trigger translation
            clearTimeout(debounceTimer);
            translateRegex(inputArea.value);
        });
    });
});
