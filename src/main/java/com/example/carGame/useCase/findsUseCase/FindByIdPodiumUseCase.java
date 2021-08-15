package com.example.carGame.useCase.findsUseCase;

import com.example.carGame.dto.PodiumDTO;
import com.example.carGame.mapper.PodiumMapper;
import com.example.carGame.repository.PodiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdPodiumUseCase {

    private final PodiumRepository podiumRepository;
    private final PodiumMapper podiumMapper;

    @Autowired
    public FindByIdPodiumUseCase(PodiumRepository podiumRepository, PodiumMapper podiumMapper){
        this.podiumRepository = podiumRepository ;
        this.podiumMapper = podiumMapper;
    }

    public Mono<PodiumDTO> findById(String id){
        return podiumRepository.findById(id)
                .flatMap(
                        podium -> Mono.just(podiumMapper.mapperToPodiumDTO().apply(podium))
                );
    }

}
