package main.model.mecanica;

import java.util.Random;

public class FabricaDeMecanicaDoJogo {

    private static Random random = new Random();

    public static MecanicaDoJogo getMecanica() {
        int aleatorio = random.nextInt(2);

        if (aleatorio == 0)
            return new MecanicaMorteSubita();
        else if (aleatorio == 1)
            return new MecanicaTresVidas();
        else
            return null;

    }

}
