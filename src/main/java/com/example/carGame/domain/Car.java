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
    private final IdCar idCar;

    private final IdPlayer idPlayer;
    private final IdLane idLane;
    private final ConfirmationArrivalGoal confirmationArrivalGoal;
    private final IdDriver idDriver;
    private final IdGame idGame;

}
