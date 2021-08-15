package com.example.carGame.router.findsRouter;

import com.example.carGame.dto.PlayerDTO;
import com.example.carGame.useCase.findsUseCase.FindPlayersByIdGameUseCase;
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
public class FindPlayersByIdGameRouter {

    @Bean
    public RouterFunction<ServerResponse> findPlayersByGameId(FindPlayersByIdGameUseCase findPlayersByIdGameUseCase){
        return route(GET("/players/game/{idGame}").and(accept(MediaType.TEXT_PLAIN)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findPlayersByIdGameUseCase.findPlayersByGameId(request.pathVariable("idGame")), PlayerDTO.class))
        );
    }

}
