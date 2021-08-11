package com.example.carGame.domain.values;

public class IdGame {

    private final String idGame;

    public IdGame(String idGame){
        this.idGame = idGame;
    }

    public static IdGame of(String idGame){
        return new IdGame(idGame);
    }

    public String getValue(){
        return this.idGame;
    }

}
