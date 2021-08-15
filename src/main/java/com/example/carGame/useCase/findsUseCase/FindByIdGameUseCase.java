package com.example.carGame.useCase.findsUseCase;

import com.example.carGame.dto.GameDTO;
import com.example.carGame.mapper.GameMapper;
import com.example.carGame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdGameUseCase {

    private final GameRepository gameRepository;
    private final GameMapper gameMapper;

    @Autowired
    public FindByIdGameUseCase(GameRepository gameRepository, GameMapper gameMapper) {
        this.gameRepository = gameRepository;
        this.gameMapper = gameMapper;
    }


    public Mono<GameDTO> findById(String id) {
        return gameRepository.findById(id)
                .flatMap(
                        game -> Mono.just(gameMapper.mapperToGameDTO().apply(game))
                );
    }

}
