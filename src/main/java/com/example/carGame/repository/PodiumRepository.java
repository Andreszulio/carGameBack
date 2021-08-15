package com.example.carGame.repository;

import com.example.carGame.dto.PodiumDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PodiumRepository extends ReactiveMongoRepository<PodiumDTO, String> {

}
