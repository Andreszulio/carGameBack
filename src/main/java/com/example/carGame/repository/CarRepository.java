package com.example.carGame.repository;

import com.example.carGame.dto.CarDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CarRepository extends ReactiveMongoRepository<CarDTO, String> {

}
