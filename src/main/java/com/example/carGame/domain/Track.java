package com.example.carGame.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Track")
public class Track {

    @Id
    private String idTrack;
    private String idLane;
    private String idCar;
    private String idGame;
    private Integer positionCurrent;
    private String finalDisplacement;

}
