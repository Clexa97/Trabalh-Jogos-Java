import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Escolha pedra, papel ou tesoura: ");
        String escolhaJogador = scanner.nextLine();


        Regras jogo = new Regras(escolhaJogador);
        String maquina = jogo.getmaquina();
        String resultado = jogo.determinarVencedor();


        System.out.println("O computador escolheu: " + maquina);
        System.out.println(resultado);

        scanner.close();
    }
}