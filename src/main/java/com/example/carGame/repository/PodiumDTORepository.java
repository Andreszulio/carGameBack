package com.example.carGame.repository;

import com.example.carGame.domain.Podium;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PodiumDTORepository extends ReactiveMongoRepository<Podium, String> {

}
