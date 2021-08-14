package com.example.carGame.domain;

import com.example.carGame.domain.values.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Driver {

    @Id
    private IdDriver idDriver;

    private PositionCurrent positionCurrent;
    private IdPlayer idPlayer;
    private IdLane idLane;
    private IdCar idCar;

}
