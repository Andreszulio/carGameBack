package com.example.carGame.domain.values;

public class IdPodium {

    private final String idPodium;

    public IdPodium(String idPodium){
        this.idPodium = idPodium;
    }

    public static IdPodium of(String idPodium){
        return new IdPodium(idPodium);
    }

    public String getValue(){
        return this.idPodium;
    }

}
