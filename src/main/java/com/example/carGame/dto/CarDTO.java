package com.example.carGame.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Car")
public class CarDTO {

    @Id
    private String idCar;

    private String idPlayer;
    private String idLane;
    private Boolean confirmationArrivalGoal;
    private String idDriver;
    private String idGame;

}
