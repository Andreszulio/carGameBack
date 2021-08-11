package com.example.carGame.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Podium")
public class PodiumDTO {

    @Id
    private String idPodium;

    private String idPlayer;
    private Integer first;
    private Integer second;
    private Integer thirst;

}
