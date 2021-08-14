package com.example.carGame.domain.values;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdTrack {

    private final String idTrack;

    public static IdTrack of(String idTrack){
        return new IdTrack(idTrack);
    }

    public String getValue(){
        return this.idTrack;
    }

}
