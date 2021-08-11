package com.example.carGame.mapper;

import com.example.carGame.domain.Podium;
import com.example.carGame.domain.values.IdPlayer;
import com.example.carGame.domain.values.IdPodium;
import com.example.carGame.domain.values.QuantityWin;
import com.example.carGame.dto.PodiumDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PodiumMapper {

    public Function<PodiumDTO, Podium> mapperToPodium(){
        return podiumDTO ->
                new Podium(
                        IdPodium.of(podiumDTO.getIdPodium()),
                        IdPlayer.of(podiumDTO.getIdPlayer()),
                        new QuantityWin(podiumDTO.getFirst()),
                        new QuantityWin(podiumDTO.getSecond()),
                        new QuantityWin(podiumDTO.getThirst())
                );
    }

    public Function<Podium, PodiumDTO> mapperToPodiumDTO( ){
        return podium ->
                new PodiumDTO(
                        podium.getIdPodium().getValue(),
                        podium.getIdPlayer().getValue(),
                        podium.getFirst().getValue(),
                        podium.getSecond().getValue(),
                        podium.getFirst().getValue()
                );
    }

}
