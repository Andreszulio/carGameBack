package com.example.carGame.domain;

import com.example.carGame.domain.values.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Car")
public class Car {

    @Id
    private final String idCar;

    private final String idPlayer;
    private final String idLane;
    private final Boolean confirmationArrivalGoal;
    private final String idDriver;
    private final String idGame;

}
