package com.example.carGame.domain;

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
public class Podium {

    @Id
    private String idPodium;
    private String idPlayer;
    private Integer first;
    private Integer second;
    private Integer third;


}
