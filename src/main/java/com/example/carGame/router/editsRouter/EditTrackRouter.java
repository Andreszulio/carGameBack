package com.example.carGame.router.editsRouter;

import com.example.carGame.dto.TrackDTO;
import com.example.carGame.useCase.editsUseCase.EditTrackUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class EditTrackRouter {

    @Bean
    public RouterFunction<ServerResponse> editTrack(EditTrackUseCase editTrackUseCase){
        return route(PUT("/track/edit").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(TrackDTO.class)
                        .flatMap(trackDTO -> editTrackUseCase.apply(trackDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .bodyValue(result))

                        )
        );
    }

}
