package com.example.carGame.domain.values;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdDriver {

    private final String idDriver;

    public static IdDriver of(String idDriver){
        return new IdDriver(idDriver);
    }

    public String getValue(){
        return this.idDriver;
    }

}
