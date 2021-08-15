package com.example.carGame.router.createsRouter;

import com.example.carGame.dto.TrackDTO;
import com.example.carGame.useCase.createsUseCase.CreateTrackUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateTrackRouter {

    @Bean
    public RouterFunction<ServerResponse> createTrack(CreateTrackUseCase createTrackUseCase) {
        return route(POST("/track/create").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(TrackDTO.class)
                        .flatMap(trackDTO -> createTrackUseCase.apply(trackDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))

                        )
        );
    }

}
