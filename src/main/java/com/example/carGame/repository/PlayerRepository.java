package com.example.carGame.repository;

import com.example.carGame.domain.Player;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PlayerRepository extends ReactiveMongoRepository<Player, String> {
    Flux<Player> findByIdGame(String gameId);
}
