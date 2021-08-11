package com.example.carGame.domain;

import com.example.carGame.domain.values.*;

public class Lane {

    private final IdLane idLane;
    private final IdCar idCar;
    private final IdGame idGame;
    private final IdTrack idTrack;
    private final PositionCurrent positionCurrent;

    public Lane(IdLane idLane, IdCar idCar, IdGame idGame, IdTrack idTrack, PositionCurrent positionCurrent) {
        this.idLane = idLane;
        this.idCar = idCar;
        this.idGame = idGame;
        this.idTrack = idTrack;
        this.positionCurrent = positionCurrent;
    }

    public IdLane getIdLane() {
        return idLane;
    }

    public IdCar getIdCar() {
        return idCar;
    }

    public IdGame getIdGame() {
        return idGame;
    }

    public IdTrack getIdTrack() {
        return idTrack;
    }

    public PositionCurrent getPositionCurrent() {
        return positionCurrent;
    }
}
