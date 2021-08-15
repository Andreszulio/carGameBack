package com.example.carGame.mapper;

import com.example.carGame.domain.Game;
import com.example.carGame.domain.Player;
import com.example.carGame.domain.Track;
import com.example.carGame.domain.values.*;
import com.example.carGame.dto.GameDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.function.Function;

@Component
public class GameMapper {

    public Function<GameDTO, Game> mapperToGame(){
        return gameDTO ->
                new Game(
                        IdGame.of(gameDTO.getIdGame()),
                        IdTrack.of(gameDTO.getIdTrack())
                );
    }

    public Function<Game, GameDTO> mapperToGameDTO(){
        return game->
                new GameDTO(
                        game.getIdGame().getValue(),
                        game.getIdTrack().getValue()
                );
    }

}
