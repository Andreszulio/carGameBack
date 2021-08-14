package com.example.carGame.domain.values;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdPodium {

    private final String idPodium;

    public static IdPodium of(String idPodium){
        return new IdPodium(idPodium);
    }

    public String getValue(){
        return this.idPodium;
    }

}
