package com.example.carGame.repository;

import com.example.carGame.dto.PlayerDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlayerRepository extends ReactiveMongoRepository<PlayerDTO, String> {

}
