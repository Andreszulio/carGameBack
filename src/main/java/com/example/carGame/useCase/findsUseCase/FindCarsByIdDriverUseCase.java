package com.example.carGame.useCase.findsUseCase;

import com.example.carGame.dto.CarDTO;
import com.example.carGame.mapper.CarMapper;
import com.example.carGame.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class FindCarsByIdDriverUseCase {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Autowired
    public FindCarsByIdDriverUseCase(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public Flux<CarDTO> findCarsByDriverId(String id){
        return carRepository.findByDriverId(id)
                .flatMap(
                        car -> Flux.just(carMapper.mapperToCarDTO().apply(car))
                );
    }

}
