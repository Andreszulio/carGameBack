package com.example.carGame.domain.values;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdLane {

    private final String idLane;

    public static IdLane of(String idLane){
        return new IdLane(idLane);
    }

    public String getValue(){
        return this.idLane;
    }

}
