package com.example.carGame.router.findsRouter;

import com.example.carGame.dto.PlayerDTO;
import com.example.carGame.useCase.findsUseCase.FindByIdPlayerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindByIdPlayerRouter {

    @Bean
    public RouterFunction<ServerResponse> findByIdPlayer(FindByIdPlayerUseCase findByIdPlayerUseCase){
        return route(GET("/player/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findByIdPlayerUseCase.findById(request.pathVariable("id")), PlayerDTO.class))
        );
    }

}
