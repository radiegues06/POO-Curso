package main.model.mecanica;

import main.model.embaralhador.Embaralhador;
import main.model.embaralhador.FabricaDeEmbaralhadores;

public class MecanicaTresVidas  implements MecanicaDoJogo {

    private String word = new String();
    private boolean continueGame = true;
    private int vidasInicial = 3;

    @Override
    public double calculateBonus() {
        return this.word.length() / bancoDePalavras.getMaximumWordLength() * POINTS_PER_RIGHT_WORD;
    }

    @Override
    public void updateScore() {
        usuario.addPointsToScore(POINTS_PER_RIGHT_WORD + calculateBonus());
    }

    @Override
    public String getNextWord() {

        Embaralhador embaralhador = new FabricaDeEmbaralhadores().getEmbaralhador();
        this.word = bancoDePalavras.getWord();
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

            if (usuario.getWrongWords() > vidasInicial)
                this.continueGame =  false;
            return "Incorreto! A palavra correta é " + this.word + ".";
        }
    }

    @Override
    public String getStatus() {
        return "A pontuação atual é de " + usuario.getScore() + " pontos\n" +
                "O número de palavras certas é " + usuario.getRightWords() + "\n" +
                "Ainda há " + (vidasInicial - usuario.getWrongWords()) + " vidas.";
    }

    @Override
    public String getGameStart() {
        String mecanidaDoJogo = "Você está jogando no modo Três Vidas:\n" +
                "   - O jogo termina após errar 3 palavras;\n" +
                "   - A pontuação é calculada de acordo com o número de palavras acertadas\n" +
                "   - O bônus é calculado de acordo com o tamanho da palavra. Quanto maior, melhor!\n" +
                lineSeparator;

        return welcomeText + mecanidaDoJogo;
    }

    @Override
    public boolean getContinueGame() {
        return continueGame;
    }
}
