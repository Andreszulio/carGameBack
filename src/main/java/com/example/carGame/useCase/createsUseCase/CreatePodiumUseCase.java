package com.example.carGame.useCase.createsUseCase;

import com.example.carGame.dto.DriverDTO;
import com.example.carGame.dto.PodiumDTO;
import com.example.carGame.mapper.DriverMapper;
import com.example.carGame.mapper.PodiumMapper;
import com.example.carGame.repository.DriverRepository;
import com.example.carGame.repository.PodiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreatePodiumUseCase {

    private final PodiumRepository podiumRepository;
    private final PodiumMapper podiumMapper;

    @Autowired
    public CreatePodiumUseCase(PodiumRepository podiumRepository, PodiumMapper podiumMapper) {
        this.podiumRepository = podiumRepository;
        this.podiumMapper = podiumMapper;
    }

    public Mono<PodiumDTO> apply(PodiumDTO podiumDTO) {
        return podiumRepository.save(podiumMapper.mapperToPodium()
                        .apply(podiumDTO))
                .map(podiumMapper.mapperToPodiumDTO());
    }

}
