import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Jogador {
    private BufferedReader in;

    public Jogador() {
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    public int[] jogar() {
        try {
            System.out.print("Linha: ");
            int linha = Integer.parseInt(in.readLine());
            System.out.print("Coluna: ");
            int coluna = Integer.parseInt(in.readLine());

            if (linha < 0 || linha >= 10 || coluna < 0 || coluna >= 10) {
                System.out.println("Coordenadas inválidas! Tente novamente.");
                return null;
            }
            return new int[]{linha, coluna};
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
