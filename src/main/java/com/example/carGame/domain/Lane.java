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
@Document(collection = "Lane")
public class Lane {

    @Id
    private final IdLane idLane;

    private final IdCar idCar;
    private final IdGame idGame;
    private final IdTrack idTrack;
    private final IdDriver idDriver;


}
