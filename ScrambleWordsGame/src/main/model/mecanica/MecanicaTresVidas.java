package main.model.mecanica;

public class MecanicaTresVidas  implements MecanicaDoJogo {

    @Override
    public int calculateBonus() {
        //TODO considerar talvez um bonus de acordo com o tamanho da palavra?
        return 0;
    }

    @Override
    public void updateScore() {

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
