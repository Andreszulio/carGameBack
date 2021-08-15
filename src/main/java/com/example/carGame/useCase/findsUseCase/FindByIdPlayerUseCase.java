package com.example.carGame.useCase.findsUseCase;

import com.example.carGame.dto.PlayerDTO;
import com.example.carGame.mapper.PlayerMapper;
import com.example.carGame.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdPlayerUseCase {

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    @Autowired
    public FindByIdPlayerUseCase(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }


    public Mono<PlayerDTO> findById(String id) {
        return playerRepository.findById(id)
                .flatMap(player ->
                        Mono.just(playerMapper.mapperToPlayerDTO().apply(player)));
    }

}
