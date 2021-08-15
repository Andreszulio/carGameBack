package com.example.carGame.useCase.findsUseCase;

import com.example.carGame.dto.LaneDTO;
import com.example.carGame.mapper.LaneMapper;
import com.example.carGame.repository.LaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

public class FindByIdLaneUseCase {

    private final LaneRepository laneRepository;
    private final LaneMapper laneMapper;

    @Autowired
    public FindByIdLaneUseCase(LaneRepository repositoryRail, LaneMapper laneMapper) {
        this.laneRepository = repositoryRail;
        this.laneMapper = laneMapper;
    }

    public Mono<LaneDTO> findById(String id){
        return laneRepository.findById(id)
                .flatMap(
                        lane -> Mono.just(laneMapper.mapperToLaneDTO().apply(lane))
                );
    }

}
