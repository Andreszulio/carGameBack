package com.example.carGame.mapper;

import com.example.carGame.domain.Car;
import com.example.carGame.domain.values.*;
import com.example.carGame.dto.CarDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarMapper {

    public Function<CarDTO, Car> mapperToCar(){
        return carDTO ->
            new Car(
                    IdCar.of(carDTO.getIdCar()),
                    IdPlayer.of(carDTO.getIdPlayer()),
                    IdLane.of(carDTO.getIdLane()),
                    new ConfirmationArrivalGoal(carDTO.getConfirmationArrivalGoal()),
                    IdDriver.of(carDTO.getIdDriver()),
                    IdGame.of(carDTO.getIdGame())
            );
    }

    public Function<Car, CarDTO> mapperToCarDTO( ){
        return car ->
            new CarDTO(
                    car.getIdCar().getValue(),
                    car.getIdPlayer().getValue(),
                    car.getIdLane().getValue(),
                    car.getConfirmationArrivalGoal().getValue(),
                    car.getIdDriver().getValue(),
                    car.getIdGame().getValue()
            );
    }
}
