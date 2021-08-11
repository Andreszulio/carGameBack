package com.example.carGame.dto;

import com.example.carGame.domain.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Map;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Game")
public class GameDTO {

    private final String idGame;
    private ArrayList<Track> tracks = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private final String gameState;

}
