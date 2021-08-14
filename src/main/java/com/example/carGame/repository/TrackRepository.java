package com.example.carGame.repository;

import com.example.carGame.domain.Track;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TrackRepository extends ReactiveMongoRepository<Track, String> {

}
