package com.example.carGame.domain;

import com.example.carGame.domain.values.*;

public class Track {

    private final IdTrack idTrack;
    private final IdLane idLane;
    private final IdCar idCar;
    private final IdGame idGame;
    private final PositionCurrent positionCurrent;
    private final FinalDisplacement finalDisplacement;

    public Track(IdTrack idTrack, IdLane idLane, IdCar idCar, IdGame idGame, PositionCurrent positionCurrent, FinalDisplacement finalDisplacement) {
        this.idTrack = idTrack;
        this.idLane = idLane;
        this.idCar = idCar;
        this.idGame = idGame;
        this.positionCurrent = positionCurrent;
        this.finalDisplacement = finalDisplacement;
    }

    public IdTrack getIdTrack() {
        return idTrack;
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

    public PositionCurrent getPositionCurrent() {
        return positionCurrent;
    }

    public FinalDisplacement getFinalDisplacement() {
        return finalDisplacement;
    }
}
