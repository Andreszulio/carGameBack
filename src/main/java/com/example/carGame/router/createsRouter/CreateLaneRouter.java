package com.example.carGame.router.createsRouter;

import com.example.carGame.dto.LaneDTO;
import com.example.carGame.useCase.createsUseCase.CreateLaneUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateLaneRouter {

    @Bean
    public RouterFunction<ServerResponse> createRail(CreateLaneUseCase createLaneUseCase) {
        return route(POST("/rail/create").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(LaneDTO.class)
                        .flatMap(laneDTO -> createLaneUseCase.apply(laneDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }

}
