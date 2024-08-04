import java.util.ArrayList;
import java.util.Collections;

public class Embaralhador {
    public String embaralhar(String palavra) {
        ArrayList<Character> letras = new ArrayList<>();
        for (char c : palavra.toCharArray()) {
            letras.add(c);
        }

        Collections.shuffle(letras);

        StringBuilder palavraEmbaralhada = new StringBuilder();
        for (char c : letras) {
            palavraEmbaralhada.append(c);
        }

        return palavraEmbaralhada.toString();
    }
}
