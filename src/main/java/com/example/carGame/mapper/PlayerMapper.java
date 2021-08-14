package com.example.carGame.mapper;

import com.example.carGame.domain.Player;
import com.example.carGame.domain.values.IdCar;
import com.example.carGame.domain.values.IdPlayer;
import com.example.carGame.domain.values.Name;
import com.example.carGame.domain.values.QuantityWin;
import com.example.carGame.dto.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PlayerMapper {

    public Function<PlayerDTO, Player> mapperToPlayer(String idPlayer){
        return  playerDTO->
            new Player(
                    IdPlayer.of(playerDTO.getIdPlayer()),
                    IdCar.of(playerDTO.getIdCar()),
                    new Name(playerDTO.getName()),
                    new QuantityWin(playerDTO.getFirst()),
                    new QuantityWin(playerDTO.getSecond()),
                    new QuantityWin(playerDTO.getThird())
            );
    }

    public Function<Player, PlayerDTO> mapperToPlayerDTO( ){
        return player ->
            new PlayerDTO(
                    player.getIdPlayer().getValue(),
                    player.getIdCar().getValue(),
                    player.getName().getValue(),
                    player.getFirst().getValue(),
                    player.getSecond().getValue(),
                    player.getThird().getValue()
            );
    }
}
