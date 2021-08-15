package com.example.carGame.repository;

import com.example.carGame.domain.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CarRepository extends ReactiveMongoRepository<Car, String> {
    Flux<Car> findByDriverId(String driverId);
}
