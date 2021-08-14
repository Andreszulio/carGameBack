package com.example.carGame.dto;

import com.example.carGame.domain.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Game")
public class GameDTO {

    @Id
    private String idGame;
    private String idTrack;

}
