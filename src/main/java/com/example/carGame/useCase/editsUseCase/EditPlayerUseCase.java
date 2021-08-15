package com.example.carGame.useCase.editsUseCase;

import com.example.carGame.dto.PlayerDTO;
import com.example.carGame.mapper.PlayerMapper;
import com.example.carGame.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class EditPlayerUseCase {

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    @Autowired
    public EditPlayerUseCase(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    public Mono<PlayerDTO> modifyPlayer(PlayerDTO playerDTO){
        return  playerRepository
                .save(playerMapper.mapperToPlayer(playerDTO.getIdPlayer())
                        .apply(playerDTO))
                .map(playerMapper.mapperToPlayerDTO());
    }

}
