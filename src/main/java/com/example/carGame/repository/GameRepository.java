package com.example.carGame.repository;

import com.example.carGame.dto.GameDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GameRepository extends ReactiveMongoRepository <GameDTO, String>{

}
