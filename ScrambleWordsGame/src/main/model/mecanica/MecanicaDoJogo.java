package main.model.mecanica;

import main.model.Usuario;
import main.model.banco.BancoDePalavras;
import main.model.embaralhador.Embaralhador;
import main.model.embaralhador.FabricaDeEmbaralhadores;

public interface MecanicaDoJogo {

    public final int POINTS_PER_RIGHT_WORD = 10;
    
    String lineSeparator = "\n#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-\n";
    String welcomeText = "\n" +
            "Bem-vindo ao Jogo das Palavras Embaralhadas!\n" +
            "Projeto Final do curso de Programação Orientada a Objetos em Java\n" +
            "Desenvolvido por Rafael Amancio Diegues\n\n" +
            "Objetivo: escrever a palavra original a partir da palavra com as letras embaralhadas,.\n\n";

    Usuario usuario = new Usuario();
    BancoDePalavras bancoDePalavras = new BancoDePalavras();

    public int calculateBonus();

    public void updateScore();

    public String getNextWord();

    public String validateWord(String word);

    public int getScore();

    public String getStatus();

    public String getGameStart();

    public boolean getContinueGame();

}
