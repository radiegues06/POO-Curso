package main.model.embaralhador;

import java.util.Random;

public class FabricaDeEmbaralhadores {

    private static Random random = new Random();

    public static Embaralhador getEmbaralhador() {

        int aleatorio = random.nextInt(2);

        if (aleatorio == 0)
            return new EmbaralhadorParImpar();
        else if (aleatorio == 1)
            return new EmbaralhadorRandom();
        else
            return null;

    }

}
