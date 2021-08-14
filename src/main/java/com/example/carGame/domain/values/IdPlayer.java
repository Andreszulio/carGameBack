package com.example.carGame.domain.values;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdPlayer {

    private final String idPlayer;

    public static IdPlayer of(String idPlayer){
        return new IdPlayer(idPlayer);
    }

    public String getValue(){
        return this.idPlayer;
    }

}
