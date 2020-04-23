package main.model.mecanica;

public class MecanicaTresVidas  implements MecanicaDoJogo {
    @Override
    public int calculateBonus() {
        return 0;
    }

    @Override
    public int calculateScore() {
        return 0;
    }

    @Override
    public String nextGameLine() {
        return null;
    }

    @Override
    public boolean validateWord(String word) {
        return false;
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public String getGameStart() {
        return welcomeString;
    }
}
