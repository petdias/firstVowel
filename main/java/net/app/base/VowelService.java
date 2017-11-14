package net.app.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VowelService {

    public String getFirstVowel(String text) {
        ValidStream stream = new ValidStream(text);
        String vowel = "";
        // Recupero a quantidade de cada vogal no texto
        Map<String, Integer> vowelAmount = getUniqueVowel(stream);

        while (stream.hasNext()) {
            // Recupera o caracter que será analisado
            String value = Character.toString(stream.getNext());
            // Verifico se o caracter é uma vogal
            if (vowelAmount.containsKey(value)) {
                // Verifico que a vogal só é exibida uma vez
                if (vowelAmount.get(value).equals(1)) {
                    // Verifica se o caracter anterior é uma consoante
                    if (!vowelAmount.containsKey(stream.getTextValue().get(stream.getIndex() - 2))) {
                        // Verifica se o caracter anterior a consoante é uma vogal
                        if (vowelAmount.containsKey(stream.getTextValue().get(stream.getIndex() - 3))) {
                            // caso tenha atendido a todos os criterios. retorno o caracter selecionado e saio do laço.
                            vowel = value;
                            break;
                        }
                    }
                }
            }

        }

        return vowel;
    }

    private Map<String, Integer> getUniqueVowel(ValidStream stream) {
        Map<String, Integer> vowelAmount = new HashMap<>();

        vowelAmount.put("A", Collections.frequency(stream.getTextValue(), "A"));
        vowelAmount.put("E", Collections.frequency(stream.getTextValue(), "E"));
        vowelAmount.put("I", Collections.frequency(stream.getTextValue(), "I"));
        vowelAmount.put("O", Collections.frequency(stream.getTextValue(), "O"));
        vowelAmount.put("U", Collections.frequency(stream.getTextValue(), "U"));

        return vowelAmount;
    }
}
