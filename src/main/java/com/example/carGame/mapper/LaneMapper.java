package com.example.carGame.mapper;

import com.example.carGame.domain.Lane;
import com.example.carGame.domain.values.*;
import com.example.carGame.dto.LaneDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class LaneMapper {

    public Function<LaneDTO, Lane> mapperToLane(){
        return laneDTO ->
            new Lane(
                    IdLane.of(laneDTO.getIdLane()),
                    IdCar.of(laneDTO.getIdCar()),
                    IdGame.of(laneDTO.getIdGame()),
                    IdTrack.of(laneDTO.getIdTrack()),
                    new PositionCurrent(laneDTO.getPositionCurrent())
            );
    }

    public Function<Lane, LaneDTO> mapperToLaneDTO( ){
        return lane ->
            new LaneDTO(
                    lane.getIdLane().getValue(),
                    lane.getIdCar().getValue(),
                    lane.getIdGame().getValue(),
                    lane.getIdTrack().getValue(),
                    lane.getPositionCurrent().getValue()
            );
    }

}
