package com.example.carGame.mapper;

import com.example.carGame.domain.Lane;
import com.example.carGame.domain.Player;
import com.example.carGame.domain.values.*;
import com.example.carGame.dto.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PlayerMapper {

    public Function<PlayerDTO, Player> mapperToPlayer(String idPlayer){
        return createPlayer -> {
            Player player = new Player();
            player.setIdPlayer(createPlayer.getIdPlayer());
            player.setName(createPlayer.getName());
            player.setIdGame(createPlayer.getIdGame());
            player.setIdCar(createPlayer.getIdCar());
            player.setFirst(createPlayer.getFirst());
            player.setSecond(createPlayer.getSecond());
            player.setThird(createPlayer.getThird());
            return player;
        };
    }

    public Function<Player, PlayerDTO> mapperToPlayerDTO( ){
        return player -> new PlayerDTO(
                    player.getIdPlayer(),
                    player.getName(),
                    player.getIdGame(),
                    player.getIdCar(),
                    player.getFirst(),
                    player.getSecond(),
                    player.getThird()
            );
    }
}
