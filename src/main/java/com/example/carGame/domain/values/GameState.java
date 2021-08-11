package com.example.carGame.domain.values;

public class GameState {

    private final String gameState;

    public GameState(String gameState){
        this.gameState = gameState;
    }

    public String getValue(){
        return this.gameState;
    }

}
