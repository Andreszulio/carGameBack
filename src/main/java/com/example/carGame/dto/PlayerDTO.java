package com.example.carGame.dto;

import com.example.carGame.domain.values.*;
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
public class PlayerDTO {

    @Id
    private String idPlayer;

    private String name;
    private String idGame;
    private String idCar;
    private Integer first;
    private Integer second;
    private Integer third;
}
