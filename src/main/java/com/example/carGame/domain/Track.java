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
    private final String idTrack;

    private final String idLane;
    private final String idCar;
    private final String idGame;
    private final Integer positionCurrent;
    private final String finalDisplacement;

}
