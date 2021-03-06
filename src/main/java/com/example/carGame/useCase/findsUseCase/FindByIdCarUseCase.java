package com.example.carGame.useCase.findsUseCase;

import com.example.carGame.dto.CarDTO;
import com.example.carGame.mapper.CarMapper;
import com.example.carGame.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdCarUseCase {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Autowired
    public FindByIdCarUseCase(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }


    public Mono<CarDTO> findById(String id) {
        return carRepository.findById(id)
                .flatMap( car ->
                        Mono.just(carMapper.mapperToCarDTO().apply(car))
                );
    }

}
