package com.example.carGame.mapper;

import com.example.carGame.domain.Game;
import com.example.carGame.domain.Lane;
import com.example.carGame.domain.values.*;
import com.example.carGame.dto.LaneDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class LaneMapper {

    public Function<LaneDTO, Lane> mapperToLane(){
        return createLane -> {
            Lane lane = new Lane();
            lane.setIdLane(createLane.getIdLane());
            lane.setIdCar(createLane.getIdCar());
            lane.setIdGame(createLane.getIdGame());
            lane.setIdTrack(createLane.getIdTrack());
            lane.setIdDriver(createLane.getIdDriver());
            return lane;
        };
    }

    public Function<Lane, LaneDTO> mapperToLaneDTO( ){
        return lane -> new LaneDTO(
                    lane.getIdLane(),
                    lane.getIdCar(),
                    lane.getIdGame(),
                    lane.getIdTrack(),
                    lane.getIdDriver()
            );
    }

}
