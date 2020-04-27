package test;

import main.model.banco.BancoDePalavras;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBancoDePalavras {

    @Test
    public void testGetWordFromFile() {
        BancoDePalavras banco = new BancoDePalavras();
        assertEquals("irmão", banco.getWord(100));
        assertEquals("noite", banco.getWord(249));
        assertEquals("sorriso", banco.getWord(776));
    }

}
