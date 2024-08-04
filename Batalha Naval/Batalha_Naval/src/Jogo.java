public class Jogo {
    private Campo campo;
    private Jogador jogador;
    private int acertos;
    private int erros;

    public Jogo() {
        campo = new Campo();
        jogador = new Jogador();
        acertos = 0;
        erros = 50;
    }

    public void iniciar() {
        campo.colocarBarco(new Barco(2), 'H');
        campo.colocarBarco(new Barco(3), 'V');
        campo.colocarBarco(new Barco(4), 'H');
        campo.colocarBarco(new Barco(5), 'V');

        campo.mostrar();

        while (acertos < 14 && erros > 0) {
            int[] jogada = jogador.jogar();
            if (jogada != null) {
                if (campo.atacar(jogada[0], jogada[1])) {
                    System.out.println("Barco tocado!");
                    acertos++;
                } else {
                    System.out.println("Água!");
                    erros--;
                }
            }
            System.out.println();
            campo.mostrar();
        }

        if (acertos == 14) {
            System.out.println("Você ganhou!");
        } else if (erros == 0) {
            System.out.println("GAME OVER!");
        }
    }
}