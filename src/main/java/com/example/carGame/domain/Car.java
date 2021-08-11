package com.example.carGame.domain;

import com.example.carGame.domain.values.ConfirmationArrivalGoal;
import com.example.carGame.domain.values.IdCar;
import com.example.carGame.domain.values.IdLane;
import com.example.carGame.domain.values.IdPlayer;

public class Car {

    private final IdCar idCar;
    private final IdPlayer idPlayer;
    private final IdLane idLane;
    private final ConfirmationArrivalGoal confirmationArrivalGoal;

    public Car(IdCar idCar, IdPlayer idPlayer, IdLane idLane, ConfirmationArrivalGoal confirmationArrivalGoal) {
        this.idCar = idCar;
        this.idPlayer = idPlayer;
        this.idLane = idLane;
        this.confirmationArrivalGoal = confirmationArrivalGoal;
    }

    public IdCar getIdCar() {
        return idCar;
    }

    public IdPlayer getIdPlayer() {
        return idPlayer;
    }

    public IdLane getIdLane() {
        return idLane;
    }

    public ConfirmationArrivalGoal getConfirmationArrivalGoal() {
        return confirmationArrivalGoal;
    }
}
