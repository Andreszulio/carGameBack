package com.example.carGame.router.createsRouter;

import com.example.carGame.dto.GameDTO;
import com.example.carGame.useCase.createsUseCase.CreateGameUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.http.MediaType;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateGameRouter {

    @Bean
    public RouterFunction<ServerResponse> createGame(CreateGameUseCase createGameUseCase){
        return  route(POST("/game/create").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(GameDTO.class)
                        .flatMap(gameDTO -> createGameUseCase.apply(gameDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
            );
    }

}
