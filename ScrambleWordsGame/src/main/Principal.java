package main;

public class Principal {

    public static void main(String[] args) {

        BancoDePalavras banco = new BancoDePalavras();


        for (int i=0;i<100;i++) {
            System.out.println(banco.getWord());
        }

    }
}
