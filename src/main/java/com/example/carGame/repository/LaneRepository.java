package com.example.carGame.repository;

import com.example.carGame.dto.LaneDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface LaneRepository extends ReactiveMongoRepository<LaneDTO, String> {

}
