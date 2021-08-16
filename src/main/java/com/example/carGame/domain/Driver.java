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
@Document(collection = "Driver")
public class Driver {

    @Id
    private String idDriver;
    private Integer positionCurrent;
    private String idPlayer;
    private String idLane;
    private String idCar;

}
