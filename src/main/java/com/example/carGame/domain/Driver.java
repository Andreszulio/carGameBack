package com.example.carGame.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
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
