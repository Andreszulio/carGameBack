package com.example.carGame.domain.values;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdGame {

    private final String idGame;

    public static IdGame of(String idGame){
        return new IdGame(idGame);
    }

    public String getValue(){
        return this.idGame;
    }

}
