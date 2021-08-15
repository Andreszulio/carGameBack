package com.example.carGame.mapper;

import com.example.carGame.domain.Player;
import com.example.carGame.domain.values.*;
import com.example.carGame.dto.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PlayerMapper {

    public Function<PlayerDTO, Player> mapperToPlayer(String idPlayer){
        return  playerDTO->
            new Player(
                    IdPlayer.of(playerDTO.getIdPlayer()),
                    new Name(playerDTO.getName()),
                    IdGame.of(playerDTO.getIdGame()),
                    IdCar.of(playerDTO.getIdCar()),
                    new QuantityWin(playerDTO.getFirst()),
                    new QuantityWin(playerDTO.getSecond()),
                    new QuantityWin(playerDTO.getThird())
            );
    }

    public Function<Player, PlayerDTO> mapperToPlayerDTO( ){
        return player ->
            new PlayerDTO(
                    player.getIdPlayer().getValue(),
                    player.getName().getValue(),
                    player.getIdGame().getValue(),
                    player.getIdCar().getValue(),
                    player.getFirst().getValue(),
                    player.getSecond().getValue(),
                    player.getThird().getValue()
            );
    }
}
