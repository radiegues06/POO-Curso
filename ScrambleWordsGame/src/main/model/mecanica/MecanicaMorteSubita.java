package main.model.mecanica;

public class MecanicaMorteSubita implements MecanicaDoJogo {

    String word = new String();

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
        word = bancoDePalavras.getWord();
        System.out.println("A palavra é: " + word);

        return embaralhador.getScrambleWord(word);
    }

    @Override
    public boolean validateWord(String word) {
        if (this.word.equals(word)) {
            usuario.increaseRightWords();
            return true;
        } else {
            usuario.increaseWrongWords();
            return false;
        }
    }

    @Override
    public int getScore() {
        return usuario.getScore();
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
}