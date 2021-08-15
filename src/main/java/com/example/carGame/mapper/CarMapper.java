package com.example.carGame.mapper;

import com.example.carGame.domain.Car;
import com.example.carGame.dto.CarDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarMapper {

    public Function<CarDTO, Car> mapperToCar(String idCar){
        return createCar -> {
            Car car = new Car();
            car.setIdCar(createCar.getIdCar());
            car.setIdDriver(createCar.getIdDriver());
            car.setConfirmationArrivalGoal(createCar.getConfirmationArrivalGoal());
            car.setIdDriver(createCar.getIdDriver());
            car.setIdGame(createCar.getIdGame());
            return car;
        };
    }

    public Function<Car, CarDTO> mapperToCarDTO(){
        return car -> new CarDTO(
                    car.getIdCar(),
                    car.getIdPlayer(),
                    car.getIdLane(),
                    car.getConfirmationArrivalGoal(),
                    car.getIdDriver(),
                    car.getIdGame()
            );
    }
}
