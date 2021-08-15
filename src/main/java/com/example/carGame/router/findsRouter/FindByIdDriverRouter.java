package com.example.carGame.router.findsRouter;

import com.example.carGame.dto.DriverDTO;
import com.example.carGame.useCase.findsUseCase.FindByIdDriverUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindByIdDriverRouter {
    @Bean
    public RouterFunction<ServerResponse> findByIdDriver(FindByIdDriverUseCase findByIdDriverUseCase){
        return route(GET("/driver/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findByIdDriverUseCase.findById(request.pathVariable("id")), DriverDTO.class))
        );
    }

}
