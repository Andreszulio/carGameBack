package com.example.carGame.router.findsRouter;

import com.example.carGame.dto.PodiumDTO;
import com.example.carGame.useCase.findsUseCase.FindByIdPodiumUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindByIdPodiumRouter {

    @Bean
    public RouterFunction<ServerResponse> findByIdPodium(FindByIdPodiumUseCase findByIdPodiumUseCase){
        return route(GET("/podium/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(findByIdPodiumUseCase.findById(request.pathVariable("id")), PodiumDTO.class)
        );
    }

}
