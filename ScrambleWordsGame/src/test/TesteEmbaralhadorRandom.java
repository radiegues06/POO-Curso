package test;

import main.model.embaralhador.EmbaralhadorRandom;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TesteEmbaralhadorRandom {

    EmbaralhadorRandom scrambler = new EmbaralhadorRandom();

    @Test
    public void TestePalavraEmbaralhada() {

        List<String> words =  Arrays.asList("Dinossauro", "Palavra", "Sol", "aa", "Márcio", null);

        for (String word : words) {
            assertNotEquals(word, scrambler.getScrambleWord(word));
        }

    }

    public void TesteMensagemDeModo() {
        assertEquals("Troca letras aleatoriamente.", scrambler.getScrambleMode());
    }

}
