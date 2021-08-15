package com.example.carGame.useCase.findsUseCase;

import com.example.carGame.dto.LaneDTO;
import com.example.carGame.mapper.LaneMapper;
import com.example.carGame.repository.LaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class FindLaneByIdTrackUseCase {

    private final LaneRepository laneRepository;
    private final LaneMapper laneMapper;

    @Autowired
    public FindLaneByIdTrackUseCase(LaneRepository laneRepository, LaneMapper laneMapper) {
        this.laneRepository = laneRepository;
        this.laneMapper = laneMapper;
    }

    public Flux<LaneDTO> getRailByTrackId(String id){
        return laneRepository.findByTrackId(id)
                .flatMap(
                        rail -> Flux.just(laneMapper.mapperToLaneDTO().apply(rail))
                );
    }

}
