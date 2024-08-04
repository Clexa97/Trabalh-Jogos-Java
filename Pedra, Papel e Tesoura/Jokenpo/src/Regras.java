public class Regras {
    private String jogador;
    private String maquina;

    public Regras(String jogador) {
        this.jogador = jogador.toLowerCase();
        this.maquina = gerarmaquina();
    }

    private String gerarmaquina() {
        String[] escolhas = {"pedra", "papel", "tesoura"};
        int indice = (int) (Math.random() * 3);
        return escolhas[indice];
    }

    public String getmaquina() {
        return maquina;
    }

    public String determinarVencedor() {
        switch (jogador) {
            case "pedra":
                return pedra();
            case "papel":
                return papel();
            case "tesoura":
                return tesoura();
            default:
                return "Escolha inválida! Por favor, escolha entre pedra, papel ou tesoura.";
        }
    }

    private String pedra() {
        switch (maquina) {
            case "pedra":
                return "Empate!";
            case "papel":
                return "O computador venceu!";
            case "tesoura":
                return "Você venceu!";
            default:
                return "Erro na escolha do computador.";
        }
    }

    private String papel() {
        switch (maquina) {
            case "pedra":
                return "Você venceu!";
            case "papel":
                return "Empate!";
            case "tesoura":
                return "O computador venceu!";
            default:
                return "Erro na escolha do computador.";
        }
    }

    private String tesoura() {
        switch (maquina) {
            case "pedra":
                return "O computador venceu!";
            case "papel":
                return "Você venceu!";
            case "tesoura":
                return "Empate!";
            default:
                return "Erro na escolha do computador.";
        }
    }
}
