package com.bala.devTo;

public class Game {

    public static final int MAX_TURNS = 10;

    public static void main(String [] args){

    Player player1 = new Player("ping");
    Player player2 = new Player("pong");

    player1.setNextPlayer(player2);
    player2.setNextPlayer(player1);
    player1.play();
    

    }


}