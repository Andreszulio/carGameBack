package com.example.carGame.router.findsRouter;

import com.example.carGame.dto.GameDTO;
import com.example.carGame.useCase.findsUseCase.FindByIdGameUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindByIdGameRouter {

    @Bean
    public RouterFunction<ServerResponse> findByIdGame(FindByIdGameUseCase findByIdGameUseCase){
        return route(GET("/game/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findByIdGameUseCase.findById(request.pathVariable("id")), GameDTO.class))
        );
    }

}
