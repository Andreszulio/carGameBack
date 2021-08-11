package com.example.carGame.domain;

import com.example.carGame.domain.values.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Game {

    @Id
    private final IdGame idGame;
    private ArrayList<Track> tracks = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private final GameState gameState;


}