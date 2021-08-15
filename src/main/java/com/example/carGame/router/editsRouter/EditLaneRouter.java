package com.example.carGame.router.editsRouter;

import com.example.carGame.dto.LaneDTO;
import com.example.carGame.useCase.editsUseCase.EditLaneUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

public class EditLaneRouter {

    @Bean
    public RouterFunction<ServerResponse> editRail(EditLaneUseCase editLaneUseCase) {
        return route(PUT("/rail/edit").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(LaneDTO.class)
                        .flatMap(railDTO -> editLaneUseCase.modifyLane(railDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .bodyValue(result))
                        )
        );
    }

}
