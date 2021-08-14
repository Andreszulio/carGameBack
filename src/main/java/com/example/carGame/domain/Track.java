package com.example.carGame.domain;

import com.example.carGame.domain.values.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
//@RequiredArgsConstructor
@Document(collection = "Track")
public class Track {

    @Id
    private final IdTrack idTrack;

    private final IdLane idLane;
    private final IdCar idCar;
    private final IdGame idGame;
    private final PositionCurrent positionCurrent;
    private final FinalDisplacement finalDisplacement;

}
