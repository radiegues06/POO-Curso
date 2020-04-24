package main.model.mecanica;

public class MecanicaMorteSubita implements MecanicaDoJogo {

    private String word = new String();
    private boolean continueGame = true;

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
        this.word = bancoDePalavras.getWord();

        return embaralhador.getScrambleWord(this.word);
    }

    @Override
    public String validateWord(String userWord) {
        if (this.word.equals(userWord)) {
            usuario.increaseRightWords();
            this.continueGame =  true;
            return "Correto!";
        } else {
            usuario.increaseWrongWords();
            this.continueGame =  false;
            return "Incorreto! A palavra correta é " + this.word + ".";
        }
    }

    @Override
    public int getScore() {
        return usuario.getScore();
    }

    @Override
    public String getStatus() {
        String status = new String();
        status += "A pontuação atual é de " + usuario.getScore() + " pontos\n" +
                "O número de palavras certas é " + usuario.getRightWords() + "\n";
        return status;
    }

    @Override
    public String getGameStart() {

        String mecanidaDoJogo = "Você está jogando no modo Morte Súbita:\n" +
                "   - Se errar alguma palavra o jogo termina;\n" +
                "   - A pontuação é calculada de acordo com o número de palavras acertadas\n" +
                lineSeparator;
                //TODO considerar talvez um bonus de acordo com o tamanho da palavra?

        return welcomeText + mecanidaDoJogo;

    }

    @Override
    public boolean getContinueGame() {
        return continueGame;
    }
}