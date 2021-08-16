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
@Document(collection = "Player")
public class Player {

    @Id
    private String idPlayer;
    private String name;
    private String idGame;
    private String idCar;
    private Integer first;
    private Integer second;
    private Integer third;

}
