public class Main {
    public static void main(String[] args) {
        var palavra = new Palavra();
        var jogador = new Jogador("Oswaldo");
        var jogo = new Jogo(palavra, jogador);

        jogo.iniciarJogo();
    }
}