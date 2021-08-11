package com.example.carGame.repository;

import com.example.carGame.domain.Lane;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface LaneDTORepository extends ReactiveMongoRepository<Lane, String> {

}
