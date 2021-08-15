package com.example.carGame.router.findsRouter;

import com.example.carGame.dto.CarDTO;
import com.example.carGame.useCase.findsUseCase.FindCarsByIdDriverUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindCarsByIdDriverRouter {

    @Bean
    public RouterFunction<ServerResponse> findCarByDriverId(FindCarsByIdDriverUseCase findCarsByIdDriverUseCase){
        return route(GET("/car/driver/{idDriver}").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findCarsByIdDriverUseCase.findCarsByDriverId(request.pathVariable("idDriver")), CarDTO.class))
        );
    }

}
