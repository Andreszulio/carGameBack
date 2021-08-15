package com.example.carGame.repository;

import com.example.carGame.domain.Driver;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DriverRepository extends ReactiveMongoRepository<Driver, String> {

}
