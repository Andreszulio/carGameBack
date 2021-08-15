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
@Document(collection = "Player")
public class Player {

    @Id
    private final IdPlayer idPlayer;

    private final Name name;
    private final IdGame idGame;
    private final IdCar idCar;
    private final QuantityWin first;
    private final QuantityWin second;
    private final QuantityWin third;

}
