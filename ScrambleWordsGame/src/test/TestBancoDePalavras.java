package test;

import main.model.BancoDePalavras;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBancoDePalavras {

    @Test
    public void testGetWordFromFile() {
        BancoDePalavras banco = new BancoDePalavras();
        assertEquals("abar", banco.getWord(100));
        assertEquals("facanito", banco.getWord(1000));
    }

}
