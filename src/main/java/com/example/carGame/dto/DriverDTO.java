package com.example.carGame.dto;

import com.example.carGame.domain.values.*;
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
@Document(collection = "Driver")
public class DriverDTO {

    @Id
    private String idDriver;
    private Integer positionCurrent;
    private String idPlayer;
    private String idLane;
    private String idCar;

}
