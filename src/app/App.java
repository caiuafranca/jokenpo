package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.Jogador;

public class App {

    public List<String> jogadas = new ArrayList<>();

    public boolean jogadorVenceu;
    public int qtdJogada = 0;
    public Jogador player01, player02;

    public static void main(String[] args) throws Exception {
        boolean jogadorVenceu = false;

        Jogador player01 = new Jogador("Player 01");
        Jogador player02 = new Jogador("Player 02");
        Jogador playert = new Jogador("Player T");
        Scanner entrada = new Scanner(System.in);

        while (jogadorVenceu == false) {

            System.out.print("Jogada do Player 01: ");
            player01.jogar(entrada.nextLine());
            System.out.print("Jogada do Player 02: ");
            player02.jogar(entrada.nextLine());
            playert = testarJogada(player01, player02);

            jogadorVenceu = playert.vencedor;

            if(jogadorVenceu){
                System.out.println("FIM DE JOGO - O jogador "+ playert.nome + " Venceu!!!!");
            }           
        }
    }

    public static Jogador testarJogada(Jogador pl01, Jogador pl02) {

        if (pl01.jogadas.lastElement().equals("Pedra") && pl02.jogadas.lastElement().equals("Tesoura")) {
            System.out.println("Ultima Jogada do Player 01 foi: " + pl01.jogadas.lastElement());
            System.out.println("Ultima Jogada do Player 02 foi: " + pl02.jogadas.lastElement());
            pl01.vencedor = true;
            return pl01;
        } else if (pl01.jogadas.lastElement().equals("Pedra") && pl02.jogadas.lastElement().equals("Papel")) {
            System.out.println("Ultima Jogada do Player 01 foi: " + pl01.jogadas.lastElement());
            System.out.println("Ultima Jogada do Player 02 foi: " + pl02.jogadas.lastElement());
            pl02.vencedor = true;
            return pl02;
        } 
        else if (pl01.jogadas.lastElement().equals("Papel") && pl02.jogadas.lastElement().equals("Pedra")) {
            System.out.println("Ultima Jogada do Player 01 foi: " + pl01.jogadas.lastElement());
            System.out.println("Ultima Jogada do Player 02 foi: " + pl02.jogadas.lastElement());
            pl01.vencedor = true;
            return pl01;
        }
        else if (pl01.jogadas.lastElement().equals("Papel") && pl02.jogadas.lastElement().equals("Tesoura")) {
            System.out.println("Ultima Jogada do Player 01 foi: " + pl01.jogadas.lastElement());
            System.out.println("Ultima Jogada do Player 02 foi: " + pl02.jogadas.lastElement());
            pl02.vencedor = true;
            return pl02;
        }
        else if (pl01.jogadas.lastElement().equals("Tesoura") && pl02.jogadas.lastElement().equals("Papel")) {
            System.out.println("Ultima Jogada do Player 01 foi: " + pl01.jogadas.lastElement());
            System.out.println("Ultima Jogada do Player 02 foi: " + pl02.jogadas.lastElement());
            pl01.vencedor = true;
            return pl01;
        }
        else if (pl01.jogadas.lastElement().equals("Tesoura") && pl02.jogadas.lastElement().equals("Pedra")) {
            System.out.println("Ultima Jogada do Player 01 foi: " + pl01.jogadas.lastElement());
            System.out.println("Ultima Jogada do Player 02 foi: " + pl02.jogadas.lastElement());
            pl02.vencedor = true;
            return pl02;
        }else {
            System.out.println("Ultima Jogada do Player 01 foi: " + pl01.jogadas.lastElement());
            System.out.println("Ultima Jogada do Player 02 foi: " + pl02.jogadas.lastElement());
            System.out.println("SEGUE O Jogo Ainda está Empatado!!!.");
            pl01.vencedor = false;
            pl02.vencedor = false;
            return pl01;
        }

    }
}