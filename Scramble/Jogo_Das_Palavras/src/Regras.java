import java.util.Scanner;

public class Regras {
    private String[] palavras = {"carro", "apartamento", "bota", "computador", "pepino"};
    private Embaralhador embaralhador;

    public Regras(Embaralhador embaralhador) {
        this.embaralhador = embaralhador;
    }

    public void iniciar() {
        String palavra = selecionarPalavra();
        String palavraEmbaralhada = embaralhador.embaralhar(palavra);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogo de Adivinhação de Letras!");
        System.out.println("Aqui está a palavra embaralhada: " + palavraEmbaralhada);
        System.out.println("Tente adivinhar a palavra correta:");

        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase(palavra)) {
            System.out.println("Parabéns! Você conseguiu!");
        } else {
            System.out.println("Que pena! A resposta correta era: " + palavra);
        }

        scanner.close();
    }

    private String selecionarPalavra() {
        return palavras[(int) (Math.random() * palavras.length)];
    }
}
