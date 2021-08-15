package com.example.carGame.useCase.createsUseCase;

import com.example.carGame.dto.TrackDTO;
import com.example.carGame.mapper.TrackMapper;
import com.example.carGame.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreateTrackUseCase {

    private final TrackRepository trackRepository;
    private final TrackMapper trackMapper;

    @Autowired
    public CreateTrackUseCase(TrackRepository trackRepository, TrackMapper trackMapper) {
        this.trackRepository = trackRepository;
        this.trackMapper = trackMapper;
    }

    public Mono<TrackDTO> apply(TrackDTO trackDTO){
        return trackRepository.save(trackMapper.mapperToTrack()
                        .apply(trackDTO))
                .map(trackMapper.mapperToTrackDTO());
    }

}
