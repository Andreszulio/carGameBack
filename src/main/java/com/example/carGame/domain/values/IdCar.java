package com.example.carGame.domain.values;

public class IdCar {

    private final String idCar;

    public IdCar(String idCar){
        this.idCar = idCar;
    }

    public static IdCar of(String idCar){
        return new IdCar(idCar);
    }

    public String getValue(){
        return this.idCar;
    }

}
