package com.example.carGame.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DriverRepository extends ReactiveMongoRepository<DriverDTO, String> {

}
