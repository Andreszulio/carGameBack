package com.example.carGame.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Player")
public class PlayerDTO {

    @Id
    private String idPlayer;

    private String idCar;
    private String name;
    private Integer first;
    private Integer second;
    private Integer third;


}
