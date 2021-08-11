package com.example.carGame.repository;

import com.example.carGame.domain.Player;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlayerDTORepository extends ReactiveMongoRepository<Player, String> {

}
