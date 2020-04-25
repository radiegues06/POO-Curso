package main.model.banco;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {

    private final String FILE_PATH = "C:\\Users\\rdiegues.EMBAD\\IdeaProjects\\POO-Curso\\ScrambleWordsGame\\resource\\palavras.txt";
    private final List<String> words = new ArrayList<>();

    public BancoDePalavras() {
        readFile();
    }

    public String getWord() {
        return words.get(getRandomIndex());
    }

    public String getWord(int index) {
        return words.get(index);
    }

    private void readFile() {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // process the line
                words.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Can not find specified file!");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Can not read from file!");
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) try {
                bufferedReader.close();
            } catch (IOException e) { /* ensure close */ }
            if (fileReader != null) try {
                fileReader.close();
            } catch (IOException e) { /* ensure close */ }
        }
    }

    private int getRandomIndex() {
        Random random = new Random();
        return random.nextInt(words.size());
    }

    public int getMaximumWordLength() {
        int maxLength = 0;
        String longestString = null;
        for (String s : words) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return maxLength;
    }
}
