package com.example.carGame.router.editsRouter;

import com.example.carGame.dto.CarDTO;
import com.example.carGame.useCase.editsUseCase.EditCarUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class EditCarRouter {

    @Bean
    public RouterFunction<ServerResponse> modifyCar(EditCarUseCase editCarUseCasee){
        return route(PUT("/car/edit").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(CarDTO.class)
                        .flatMap(carDTO -> editCarUseCasee.modifyCar(carDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .bodyValue(result))
                        )
        );
    }

}
