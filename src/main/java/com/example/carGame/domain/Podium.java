package com.example.carGame.domain;

import com.example.carGame.domain.values.IdPlayer;
import com.example.carGame.domain.values.IdPodium;
import com.example.carGame.domain.values.QuantityWin;

public class Podium {

    private final IdPodium idPodium;
    private final IdPlayer idPlayer;
    private final QuantityWin first;
    private final QuantityWin second;
    private final QuantityWin third;

    public Podium(IdPodium idPodium, IdPlayer idPlayer, QuantityWin first, QuantityWin second, QuantityWin third) {
        this.idPodium = idPodium;
        this.idPlayer = idPlayer;
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public IdPodium getIdPodium() {
        return idPodium;
    }

    public IdPlayer getIdPlayer() {
        return idPlayer;
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
