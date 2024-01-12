package jogo.objetos;

public class Tabuleiro {
    private static Tabuleiro tabuleiro;

    private Tabuleiro() {
    }

    public static Tabuleiro getInstancia() {
        if (tabuleiro == null) {
            tabuleiro = new Tabuleiro();
        }
        return tabuleiro;
    }
}
