package com.example.carGame.useCase;

import com.example.carGame.domain.Car;
import com.example.carGame.dto.CarDTO;
import com.example.carGame.repository.CarRepository;
import com.example.carGame.useCase.createsUseCase.CreateCarUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static reactor.core.publisher.Mono.when;

@SpringBootTest
public class CreateCarUseCaseTest {

    @SpyBean
    CreateCarUseCase createCarUseCase;

    @MockBean
    CarRepository carRepository;

    @Test
    void createCar(){
        var carDTO = new CarDTO("8","1","5", true, "5", "9");
        var car = new Car();
        car.setIdCar("8");
        car.setIdPlayer("1");
        car.setIdLane("5");
        car.setConfirmationArrivalGoal(true);
        car.setIdDriver("5");
        car.setIdGame("9");

        when(carRepository.save(Mockito.any(Car.class))).thenReturn(Mono.just(car));

        Mono<CarDTO> response = createCarUseCase.CreateCar(carDTO);

        Assertions.assertEquals(response.block(), carDTO);

    }

}
