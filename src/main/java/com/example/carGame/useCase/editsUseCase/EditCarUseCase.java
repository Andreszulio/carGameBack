package com.example.carGame.useCase.editsUseCase;

import com.example.carGame.dto.CarDTO;
import com.example.carGame.mapper.CarMapper;
import com.example.carGame.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class EditCarUseCase {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Autowired
    public EditCarUseCase(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public Mono<CarDTO> modifyCar(CarDTO carDTO){
        return carRepository
                .save(carMapper.mapperToCar(carDTO.getIdCar())
                        .apply(carDTO))
                .map(carMapper.mapperToCarDTO());
    }

}
