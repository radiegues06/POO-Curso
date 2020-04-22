package test;

import main.model.embaralhador.EmbaralhadorParImpar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteEmbaralhadorParImpar {

    EmbaralhadorParImpar scrambler = new EmbaralhadorParImpar();

    @Test
    public void testeResultadoDoEmbaralhamentoParImpar() {
        assertEquals("", scrambler.getScrambleWord(null));
        assertEquals("", scrambler.getScrambleWord(""));
        assertEquals("a", scrambler.getScrambleWord("a"));
        assertEquals("rBsali", scrambler.getScrambleWord("Brasil"));
        assertEquals("rBsalia", scrambler.getScrambleWord("Brasila"));
        assertEquals("aRafle", scrambler.getScrambleWord("Rafael"));
        assertEquals("aRafLe", scrambler.getScrambleWord("RafaeL"));
        assertEquals("ugraadc-uhav", scrambler.getScrambleWord("guarda-chuva"));
    }

    @Test
    public void testeModoEmbaralhamentoParImpar() {
        assertEquals("Troca letras em posições pares por letras em posições ímpares e vice-versa.",scrambler.getScrambleMode());
    }
}
