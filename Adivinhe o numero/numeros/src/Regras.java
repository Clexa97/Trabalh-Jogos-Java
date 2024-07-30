import java.util.Random;
import java.util.Scanner;

public class Regras {

    private int numeroSecreto;
    private int tentativas;
    private int pontos;
    private Random random;
    private Scanner entrada;

    public Regras() {
        this.random = new Random();
        this.numeroSecreto = random.nextInt(100) + 1;
        this.tentativas = 0;
        this.pontos = 1000;
        this.entrada = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        while (true) {
            System.out.print("Digite seu chute: ");
            int chute = entrada.nextInt();
            tentativas++;

            if (chute < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else if (chute > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.printf("Parabéns! Você acertou o número secreto em %d tentativas!\n", tentativas);
                System.out.printf("Sua pontuação final é: %d\n", pontos - (tentativas * 20));
                break;
            }

            pontos -= 20;
        }

        entrada.close();
        System.out.println("Fim do jogo!");
    }


    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public void setNumeroSecreto(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
}
