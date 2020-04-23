package main.model.mecanica;

import main.model.Usuario;
import main.model.banco.BancoDePalavras;
import main.model.embaralhador.Embaralhador;
import main.model.embaralhador.FabricaDeEmbaralhadores;

public interface MecanicaDoJogo {

    String lineSeparator = "#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-\n";
    String welcomeString = "Bem-vindo ao Jogo das Palavras Embaralhadas!\n" +
            "Projeto Final do curso de Programação Orientada a Objetos em Java\n" +
            "Desenvolvido por Rafael Amancio Diegues\n" + lineSeparator;

    boolean continueGame = true;
    Embaralhador embaralhador = new FabricaDeEmbaralhadores().getEmbaralhador();
    Usuario usuario = new Usuario();
    BancoDePalavras bancoDePalavras = new BancoDePalavras();

    public int calculateBonus();

    public int calculateScore();

    public String nextGameLine();

    public boolean validateWord(String word);

    public int getScore();

    public String getGameStart();

}
