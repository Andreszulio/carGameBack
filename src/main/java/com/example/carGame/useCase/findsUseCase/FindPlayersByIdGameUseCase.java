package com.example.carGame.useCase.findsUseCase;

import com.example.carGame.dto.PlayerDTO;
import com.example.carGame.mapper.PlayerMapper;
import com.example.carGame.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class FindPlayersByIdGameUseCase {

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    @Autowired
    public FindPlayersByIdGameUseCase(PlayerRepository playerDTORepository, PlayerMapper playerMapper) {
        this.playerRepository = playerDTORepository;
        this.playerMapper = playerMapper;
    }

    public Flux<PlayerDTO> getPlayersByGameId(String id){
        return playerRepository.findByGameId(id)
                .flatMap(
                        player -> Flux.just(playerMapper.mapperToPlayerDTO().apply(player))
                );
    }

}
