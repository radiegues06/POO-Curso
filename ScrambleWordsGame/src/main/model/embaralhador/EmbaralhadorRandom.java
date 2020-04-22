package main.model.embaralhador;


import main.model.embaralhador.Embaralhador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EmbaralhadorRandom implements Embaralhador {

    private Random random = new Random();
    private String originalWord = new String();


    @Override
    public String getScrambleWord(String word) {

        if (word==null || word.isEmpty())
            return "";

        this.originalWord = word;

        return scrambleWord();
    }

    private String scrambleWord() {

        String shuffledString = new String();

        for (Integer i:  generateShuffleIndexes(originalWord.length())) {
            shuffledString += originalWord.charAt(i);
        }

        return shuffledString;
    }

    @Override
    public String getScrambleMode() {
        return "Troca letras aleatoriamente.";
    }

    private List<Integer> generateShuffleIndexes(int length) {

        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            indexes.add(i);
        }

        Collections.shuffle(indexes);

        return indexes;
    }
}
