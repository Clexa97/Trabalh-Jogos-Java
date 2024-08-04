public class Main {
    public static void main(String[] args) {
        Regras jogo = new Regras(new Embaralhador());
        jogo.iniciar();
    }
}