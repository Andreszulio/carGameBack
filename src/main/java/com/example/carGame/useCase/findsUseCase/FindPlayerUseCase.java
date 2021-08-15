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
public class FindPlayerUseCase  {

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    @Autowired
    public FindPlayerUseCase(PlayerRepository playerRepository, PlayerMapper playerMapper){
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    public Flux<PlayerDTO> findAll(){
        return playerRepository
                .findAll().map(playerMapper.mapperToPlayerDTO());
    }

}
