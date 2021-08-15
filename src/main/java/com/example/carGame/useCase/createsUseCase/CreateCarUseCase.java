package com.example.carGame.useCase.createsUseCase;

import com.example.carGame.dto.CarDTO;
import com.example.carGame.mapper.CarMapper;
import com.example.carGame.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreateCarUseCase {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Autowired
    public CreateCarUseCase(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public Mono<CarDTO> createCar(CarDTO carDTO) {
        return carRepository
                .save(carMapper.mapperToCar()
                        .apply(carDTO))
                .map(carMapper.mapperToCarDTO());
    }

}
