package com.example.carGame.repository;

import com.example.carGame.domain.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CarRepository extends ReactiveMongoRepository<Car, String> {

}
