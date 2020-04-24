package main;

import main.model.mecanica.FabricaDeMecanicaDoJogo;
import main.model.mecanica.MecanicaDoJogo;

import java.util.Scanner;

public class Principal {

    private static MecanicaDoJogo jogo = FabricaDeMecanicaDoJogo.getMecanica();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        printInicio();

        while (jogo.getContinueGame()) {

            printNewWord();
            printStatus();
            //Todo print update comments, with score, if word is right or wrong, what the right word was

        }

    }

    private static void printNewWord() {
        System.out.println("A palavra embaralhada é: " + jogo.getNextWord());
        System.out.print("A palavra original é: ");
    }

    private static void printStatus() {
        System.out.println(getValidation() + "\n");
        System.out.println(jogo.getStatus());
        System.out.println(jogo.lineSeparator);
    }

    private static String getValidation() {
        return jogo.validateWord(in.nextLine());
    }


    private static void printInicio() {
        System.out.println(jogo.getGameStart());
    }
}
