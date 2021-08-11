package com.example.carGame.domain.values;

public class IdTrack {

    private final String idTrack;

    public IdTrack(String idTrack){
        this.idTrack = idTrack;
    }

    public static IdTrack of(String idTrack){
        return new IdTrack(idTrack);
    }

    public String getValue(){
        return this.idTrack;
    }

}
