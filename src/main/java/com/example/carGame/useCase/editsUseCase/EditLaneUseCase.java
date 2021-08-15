package com.example.carGame.useCase.editsUseCase;

import com.example.carGame.dto.LaneDTO;
import com.example.carGame.dto.PlayerDTO;
import com.example.carGame.mapper.LaneMapper;
import com.example.carGame.mapper.PlayerMapper;
import com.example.carGame.repository.LaneRepository;
import com.example.carGame.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class EditLaneUseCase {

    private final LaneRepository laneRepository;
    private final LaneMapper laneMapper;

    @Autowired
    public EditLaneUseCase(LaneRepository laneRepository, LaneMapper laneMapper) {
        this.laneRepository = laneRepository;
        this.laneMapper = laneMapper;
    }

    public Mono<LaneDTO> modifyLane(LaneDTO laneDTO){
        return  laneRepository
                .save(laneMapper.mapperToLane(laneDTO.getIdLane())
                        .apply(laneDTO))
                .map(laneMapper.mapperToLaneDTO());
    }

}
