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
        return driverDTO ->
                new Driver(
                        IdDriver.of(driverDTO.getIdDriver()),
                        new PositionCurrent(driverDTO.getPositionCurrent()),
                        IdPlayer.of(driverDTO.getIdPlayer()),
                        IdLane.of(driverDTO.getIdLane()),
                        IdCar.of(driverDTO.getIdCar())


                );
    }

    public Function<Driver, DriverDTO> mapperToDriverDTO( ){
        return driver ->
                new DriverDTO(
                        driver.getIdDriver().getValue(),
                        driver.getPositionCurrent().getValue(),
                        driver.getIdPlayer().getValue(),
                        driver.getIdLane().getValue(),
                        driver.getIdCar().getValue()

                );
    }

}
