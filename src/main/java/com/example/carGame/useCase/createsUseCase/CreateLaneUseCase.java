package com.example.carGame.useCase.createsUseCase;

import com.example.carGame.dto.LaneDTO;
import com.example.carGame.dto.PlayerDTO;
import com.example.carGame.mapper.LaneMapper;
import com.example.carGame.mapper.PlayerMapper;
import com.example.carGame.repository.LaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreateLaneUseCase {

    private final LaneRepository laneRepository;
    private final LaneMapper laneMapper;

    @Autowired
    public CreateLaneUseCase(LaneRepository laneRepository, LaneMapper laneMapper){
        this.laneRepository = laneRepository;
        this.laneMapper = laneMapper;
    }

    public Mono<LaneDTO> apply(LaneDTO laneDTO){
        return laneRepository
                .save(laneMapper.mapperToLane()
                        .apply(laneDTO))
                .thenReturn(laneDTO);
    }

}
