package com.example.carGame.repository;

import com.example.carGame.domain.Lane;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface LaneRepository extends ReactiveMongoRepository<Lane, String> {
    Flux<Lane> findByIdTrack(String id);
}
