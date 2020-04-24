package main;

import main.model.mecanica.FabricaDeMecanicaDoJogo;
import main.model.mecanica.MecanicaDoJogo;

import java.util.Scanner;

public class Principal {

    private static MecanicaDoJogo jogo = FabricaDeMecanicaDoJogo.getMecanica();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        printInicio();

        System.out.println(jogo.getNextWord());

        while (jogo.getGameContinuation(in.nextLine())) {
            System.out.println("Entrou!");
        }

    }

    private static void printInicio() {
        System.out.println(jogo.getGameStart());
    }
}
