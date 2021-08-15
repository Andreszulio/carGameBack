package com.example.carGame.mapper;

import com.example.carGame.domain.Driver;
import com.example.carGame.dto.DriverDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class DriverMapper {

    public Function<DriverDTO, Driver> mapperToDriver(String idDriver){
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
