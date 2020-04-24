package main;

import main.model.mecanica.FabricaDeMecanicaDoJogo;
import main.model.mecanica.MecanicaDoJogo;

public class Principal {

    public static void main(String[] args) {

        MecanicaDoJogo jogo = FabricaDeMecanicaDoJogo.getMecanica();

    }
}
