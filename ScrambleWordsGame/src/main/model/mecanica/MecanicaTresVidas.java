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
    public String getNextWord() {
        return null;
    }

    @Override
    public String validateWord(String word) {
        return null;
    }


    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public String getGameStart() {
        return null;
    }

    @Override
    public boolean getContinueGame() {
        return false;
    }
}
