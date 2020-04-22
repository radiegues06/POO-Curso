package main.model;

public class EmbaralhadorParImpar implements Embaralhador {

    @Override
    public String getScrambleWord(String word) {

        if (word==null || word.isEmpty())
            return "";

        String scrambledWord = new String();

        int wordLength = word.length();

        for (int i = 0; i < wordLength-2; i+=2) {
            scrambledWord += word.charAt(i+1);
            scrambledWord += word.charAt(i);
        }

        scrambledWord += word.charAt(wordLength-1);

        if (wordLength % 2 == 0)
            scrambledWord += word.charAt(wordLength-2);

        return scrambledWord;
    }

    @Override
    public String getScrambleMode() {
        return "Troca letras em posições pares por letras em posições ímpares e vice-versa.";
    }
}
