package com.example.carGame.router.findsRouter;

import com.example.carGame.dto.TrackDTO;
import com.example.carGame.useCase.findsUseCase.FindByIdTrackUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindByIdTrackRouter {

    @Bean
    public RouterFunction<ServerResponse> findByIdTrack(FindByIdTrackUseCase findByIdTrackUseCase){
        return route(GET("/track/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(findByIdTrackUseCase.findById(request.pathVariable("id")), TrackDTO.class)
        );
    }

}
