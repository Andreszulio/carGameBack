package com.example.carGame.repository;

import com.example.carGame.dto.DriverDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DriverRepository extends ReactiveMongoRepository<DriverDTO, String> {

}
