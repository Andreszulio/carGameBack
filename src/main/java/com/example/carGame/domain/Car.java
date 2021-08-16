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
@Document(collection = "Car")
public class Car {

    @Id
    private String idCar;
    private String idPlayer;
    private String idLane;
    private Boolean confirmationArrivalGoal;
    private String idDriver;
    private String idGame;

}
