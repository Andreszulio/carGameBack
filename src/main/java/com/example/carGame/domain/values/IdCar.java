package com.example.carGame.domain.values;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdCar {

    private final String idCar;

    public static IdCar of(String idCar){
        return new IdCar(idCar);
    }

    public String getValue(){
        return this.idCar;
    }

}
