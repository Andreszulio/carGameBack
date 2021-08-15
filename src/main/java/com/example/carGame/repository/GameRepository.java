package com.example.carGame.repository;

import com.example.carGame.domain.Game;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GameRepository extends ReactiveMongoRepository <Game, String>{

}
