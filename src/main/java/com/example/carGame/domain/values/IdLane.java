package com.example.carGame.domain.values;

public class IdLane {

    private final String idLane;

    public IdLane(String idLane){
        this.idLane = idLane;
    }

    public static IdLane of(String idLane){
        return new IdLane(idLane);
    }

    public String getValue(){
        return this.idLane;
    }

}
