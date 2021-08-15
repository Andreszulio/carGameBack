package com.example.carGame.useCase.createsUseCase;

import com.example.carGame.dto.DriverDTO;
import com.example.carGame.dto.GameDTO;
import com.example.carGame.mapper.DriverMapper;
import com.example.carGame.mapper.GameMapper;
import com.example.carGame.repository.DriverRepository;
import com.example.carGame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreateGameUseCase {

    private final GameRepository gameRepository;
    private final GameMapper gameMapper;

    @Autowired
    public CreateGameUseCase(GameRepository gameRepository, GameMapper gameMapper) {
        this.gameRepository = gameRepository;
        this.gameMapper = gameMapper;
    }

    public Mono<GameDTO> apply(GameDTO gameDTO) {
        return gameRepository.save(gameMapper.mapperToGame()
                        .apply(gameDTO))
                .map(gameMapper.mapperToGameDTO());
    }

}
