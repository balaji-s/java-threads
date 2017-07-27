package com.bala.devTo;

public class Player{

    private final String text;

    private  int turns;

    public Player(String text){
        this.text=text;

    }


    public void play(){
        if(!gameFinished()){
            System.out.println(text);
            turns--;
            nextPlayer.play();

        }

    }

    private boolean gameFinished(){
        return turns==0;
    }

    private Player nextPlayer;

    public void setNextPlayer(Player nextPlayer){
        this.nextPlayer=nextPlayer;
    }
}