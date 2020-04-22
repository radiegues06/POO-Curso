package main;

public class Usuario {

    private int score = 0;
    private int wrongWords = 0;
    private int rightWords = 0;
    private int totalWords = 0;
    private int attempts = 0;

    public void increaseRightWords() {
        this.rightWords += 1;
        increaseTotalWords();
    }

    public void increaseWrongWords() {
        this.wrongWords += 1;
        increaseTotalWords();
    }

    private void increaseTotalWords() {
        this.totalWords += 1;
    }

    public void addPointsToScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return score;
    }

    public int getWrongWords() {
        return wrongWords;
    }

    public int getRightWords() {
        return rightWords;
    }

    public int getTotalWords() {
        return totalWords;
    }

    public int getAttempts() {
        return attempts;
    }

}
