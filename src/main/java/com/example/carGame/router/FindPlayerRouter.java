package com.example.carGame.router;

import com.example.carGame.dto.PlayerDTO;
import com.example.carGame.useCase.FindPlayerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindPlayerRouter {

    @Bean
    public RouterFunction<ServerResponse> findAll(FindPlayerUseCase findPlayerUseCase){
        return route(
                GET("/findAll").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findPlayerUseCase.findAll(), PlayerDTO.class))
        );
    }

}
