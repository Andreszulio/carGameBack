package com.example.carGame.mapper;

import com.example.carGame.domain.Car;
import com.example.carGame.domain.Driver;
import com.example.carGame.domain.values.*;
import com.example.carGame.dto.CarDTO;
import com.example.carGame.dto.DriverDTO;
import io.netty.handler.timeout.IdleState;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class DriverMapper {

    public Function<DriverDTO, Driver> mapperToDriver(){
        return createDriver -> {
            Driver driver = new Driver();
            driver.setIdDriver(createDriver.getIdDriver());
            driver.setPositionCurrent(createDriver.getPositionCurrent());
            driver.setIdPlayer(createDriver.getIdPlayer());
            driver.setIdCar(createDriver.getIdCar());
            return driver;
        };
    }

    public Function<Driver, DriverDTO> mapperToDriverDTO( ){
        return driver -> new DriverDTO(
            driver.getIdDriver(),
            driver.getPositionCurrent(),
            driver.getIdPlayer(),
            driver.getIdLane(),
            driver.getIdCar()
        );
    }

}
