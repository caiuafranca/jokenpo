package app;

import java.util.Vector;

public class Jogador {

    public String nome;
    public Vector<String> jogadas = new Vector<String>();
    public boolean vencedor;

    public Jogador( String nome ){
        this.nome = nome;
        this.vencedor = false;
    }

    public void jogar(String opcao){
        jogadas.add(opcao);
    }

}