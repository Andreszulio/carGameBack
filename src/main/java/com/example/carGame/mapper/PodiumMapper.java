package com.example.carGame.mapper;

import com.example.carGame.domain.Podium;
import com.example.carGame.dto.PodiumDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PodiumMapper {

    public Function<PodiumDTO, Podium> mapperToPodium(String idPodium){
        return createPodium -> {
            Podium podium = new Podium();
            podium.setIdPodium(createPodium.getIdPodium());
            podium.setIdPlayer(createPodium.getIdPlayer());
            podium.setFirst(createPodium.getFirst());
            podium.setSecond(createPodium.getSecond());
            podium.setThird(createPodium.getThird());
            return podium;
        };
    }

    public Function<Podium, PodiumDTO> mapperToPodiumDTO( ){
        return podium ->
                new PodiumDTO(
                        podium.getIdPodium(),
                        podium.getIdPlayer(),
                        podium.getFirst(),
                        podium.getSecond(),
                        podium.getFirst()
                );
    }

}
