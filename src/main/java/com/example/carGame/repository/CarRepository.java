package com.example.carGame.repository;

import com.example.carGame.domain.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CarRepository extends ReactiveMongoRepository<Car, String> {
    Flux<Car> findByIdDriver(String idDriver);
}
