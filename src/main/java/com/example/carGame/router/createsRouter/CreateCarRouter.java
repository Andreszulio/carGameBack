package com.example.carGame.router.createsRouter;

import com.example.carGame.dto.CarDTO;
import com.example.carGame.useCase.createsUseCase.CreateCarUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateCarRouter {

    @Bean
    public RouterFunction<ServerResponse> CreateCarRouter(CreateCarUseCase createCarUseCase){
        return  route(POST("/car/create").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(CarDTO.class)
                        .flatMap(carDTO -> createCarUseCase.CreateCar(carDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }

}
