package com.example.carGame.domain.values;

public class IdPlayer {

    private final String idPlayer;

    public IdPlayer(String idPlayer){
        this.idPlayer = idPlayer;
    }

    public static IdPlayer of(String idPlayer){
        return new IdPlayer(idPlayer);
    }

    public String getValue(){
        return this.idPlayer;
    }

}
