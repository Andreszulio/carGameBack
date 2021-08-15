package com.example.carGame.dto;

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
public class TrackDTO {

    @Id
    private String idTrack;

    private String idLane;
    private String idCar;
    private String idGame;
    private Integer positionCurrent;
    private String finalDisplacement;

}
