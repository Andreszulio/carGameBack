package com.example.carGame.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Lane")
public class LaneDTO {

    @Id
    private String idLane;

    private String idCar;
    private String idGame;
    private String idTrack;
    private String positionCurrent;


}
