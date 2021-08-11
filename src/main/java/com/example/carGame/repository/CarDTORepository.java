package com.example.carGame.repository;

import com.example.carGame.domain.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CarDTORepository extends ReactiveMongoRepository<Car, String> {

}
