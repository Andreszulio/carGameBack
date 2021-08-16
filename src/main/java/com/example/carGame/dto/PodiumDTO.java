package com.example.carGame.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Podium")
public class PodiumDTO {

    @Id
    private String idPodium;
    private String idPlayer;
    private Integer first;
    private Integer second;
    private Integer third;

}
