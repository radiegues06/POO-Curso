package main.model.mecanica;

import main.model.embaralhador.Embaralhador;
import main.model.embaralhador.FabricaDeEmbaralhadores;

public class MecanicaMorteSubita implements MecanicaDoJogo {

    private String word = new String();
    private boolean continueGame = true;
    private long startTime = 0;
    private final int MILISECONDS_TIME_BONUS_LIMIT = 60 * 1000;

    @Override
    public double calculateBonus() {
        int elapsedTime = (int) (System.currentTimeMillis() - startTime);
        return elapsedTime < MILISECONDS_TIME_BONUS_LIMIT ?
                POINTS_PER_RIGHT_WORD * (MILISECONDS_TIME_BONUS_LIMIT - elapsedTime) / MILISECONDS_TIME_BONUS_LIMIT : 0;
    }

    @Override
    public void updateScore() {
        usuario.addPointsToScore(POINTS_PER_RIGHT_WORD + calculateBonus());
    }

    @Override
    public String getNextWord() {

        Embaralhador embaralhador = new FabricaDeEmbaralhadores().getEmbaralhador();

        this.word = bancoDePalavras.getWord();

        this.startTime = System.currentTimeMillis();

        return embaralhador.getScrambleWord(this.word);
    }

    @Override
    public String validateWord(String userWord) {
        if (this.word.equals(userWord)) {
            usuario.increaseRightWords();
            updateScore();
            this.continueGame =  true;
            return "Correto!";
        } else {
            usuario.increaseWrongWords();
            this.continueGame =  false;
            return "Incorreto! A palavra correta é " + this.word + ".";
        }
    }

    @Override
    public String getStatus() {
        return "A pontuação atual é de " + usuario.getScore() + " pontos\n" +
                "O número de palavras certas é " + usuario.getRightWords();
    }

    @Override
    public String getGameStart() {

        String mecanidaDoJogo = "Você está jogando no modo Morte Súbita:\n" +
                "   - Se errar alguma palavra o jogo termina;\n" +
                "   - A pontuação é calculada de acordo com o número de palavras acertadas\n" +
                "   - O bônus é calculado de acordo com o tempo para responder. Quanto mais rápido, maior!\n" +
                lineSeparator;

        return welcomeText + mecanidaDoJogo;

    }

    @Override
    public boolean getContinueGame() {
        return continueGame;
    }

    @Override
    public String getMensagemDeEncerramento() {
        return "O jogo terminou!\n" +
        "Você acertou " + usuario.getRightWords() + " palavras e fez um total de " +
                String.format("%.2f",usuario.getScore()) + " pontos.";
    }
}