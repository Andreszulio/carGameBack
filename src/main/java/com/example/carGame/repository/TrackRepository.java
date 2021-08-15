package com.example.carGame.repository;

import com.example.carGame.dto.TrackDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TrackRepository extends ReactiveMongoRepository<TrackDTO, String> {

}
