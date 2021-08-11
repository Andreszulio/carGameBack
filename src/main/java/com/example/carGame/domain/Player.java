package com.example.carGame.domain;

import com.example.carGame.domain.values.IdCar;
import com.example.carGame.domain.values.IdPlayer;
import com.example.carGame.domain.values.Name;
import com.example.carGame.domain.values.QuantityWin;

public class Player {

    private final IdPlayer idPlayer;
    private final IdCar idCar;
    private final Name name;
    private final QuantityWin first;
    private final QuantityWin second;
    private final QuantityWin third;

    public Player(IdPlayer idPlayer, IdCar idCar, Name name, QuantityWin first, QuantityWin second, QuantityWin third) {
        this.idPlayer = idPlayer;
        this.idCar = idCar;
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public IdPlayer getIdPlayer() {
        return idPlayer;
    }

    public IdCar getIdCar() {
        return idCar;
    }

    public Name getName() {
        return name;
    }

    public QuantityWin getFirst() {
        return first;
    }

    public QuantityWin getSecond() {
        return second;
    }

    public QuantityWin getThird() {
        return third;
    }
}
