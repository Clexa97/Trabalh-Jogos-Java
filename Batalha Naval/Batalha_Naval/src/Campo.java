import java.util.Random;

public class Campo {
    private int[][] campo;
    private static final int TAMANHO = 10;

    public Campo() {
        campo = new int[TAMANHO][TAMANHO];
        iniciarCampo();
    }

    private void iniciarCampo() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                campo[i][j] = -1;
            }
        }
    }

    public boolean colocarBarco(Barco barco, char orientacao) {
        Random r = new Random();
        int X;
        int Y;
        boolean livre;

        do {
            X = r.nextInt(TAMANHO);
            Y = r.nextInt(TAMANHO);
            livre = estaLivre(X, Y, barco.getTamanho(), orientacao == 'H' ? 1 : 0);
        } while (!livre);

        if (orientacao == 'H') {
            for (int i = Y; i < Y + barco.getTamanho(); ++i) {
                campo[X][i] = 2;
            }
        } else if (orientacao == 'V') {
            for (int i = X; i < X + barco.getTamanho(); ++i) {
                campo[i][Y] = 2;
            }
        }
        return true;
    }

    private boolean estaLivre(int fila, int coluna, int tamanho, int direcao) {
        if (direcao == 0) { // Vertical
            if (fila + tamanho > TAMANHO) return false;
            for (int i = fila; i < fila + tamanho; i++) {
                if (campo[i][coluna] != -1) return false;
            }
        } else { // Horizontal
            if (coluna + tamanho > TAMANHO) return false;
            for (int i = coluna; i < coluna + tamanho; i++) {
                if (campo[fila][i] != -1) return false;
            }
        }
        return true;
    }

    public void mostrar() {
        System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println();
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < TAMANHO; j++) {
                if (campo[i][j] == 0) {
                    System.out.print("*\t");
                } else if (campo[i][j] == 1) {
                    System.out.print("X\t");
                } else {
                    System.out.print("~\t");
                }
            }
            System.out.println();
        }
    }

    public boolean atacar(int linha, int coluna) {
        if (campo[linha][coluna] == 2) {
            campo[linha][coluna] = 1;
            return true;
        } else if (campo[linha][coluna] == -1) {
            campo[linha][coluna] = 0;
            return false;
        } else {
            return false;
        }
    }
}
