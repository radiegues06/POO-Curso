package test;

import main.model.EmbaralhadorParImpar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteEmbaralhadorParImpar {

    EmbaralhadorParImpar scrambler = new EmbaralhadorParImpar();

    @Test
    public void testeResultadoDoEmbaralhamentoParImpar() {
        assertEquals("rBsali", scrambler.getScrambleWord("Brasil"));
        assertEquals("rBsalia", scrambler.getScrambleWord("Brasila"));
        assertEquals("aRafle", scrambler.getScrambleWord("Rafael"));
        assertEquals("aRafLe", scrambler.getScrambleWord("RafaeL"));
    }

    @Test
    public void testeModoEmbaralhamentoParImpar() {
        assertEquals("Troca letras em posições pares por letras em posições ímpares e vice-versa.",scrambler.getScrambleMode());
    }
}
