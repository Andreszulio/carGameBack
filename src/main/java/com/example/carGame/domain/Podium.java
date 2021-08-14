package com.example.carGame.domain;

import com.example.carGame.domain.values.IdPlayer;
import com.example.carGame.domain.values.IdPodium;
import com.example.carGame.domain.values.QuantityWin;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
//@RequiredArgsConstructor
@Document(collection = "Podium")
public class Podium {

    @Id
    private final IdPodium idPodium;

    private final IdPlayer idPlayer;
    private final QuantityWin first;
    private final QuantityWin second;
    private final QuantityWin third;


}
