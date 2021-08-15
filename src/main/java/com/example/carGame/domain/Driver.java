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
    private String idDriver;

    private Integer positionCurrent;
    private String idPlayer;
    private String idLane;
    private String idCar;

}
