package com.example.carGame.mapper;

import com.example.carGame.domain.Track;
import com.example.carGame.domain.values.*;
import com.example.carGame.dto.TrackDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class TrackMapper {

    public Function<TrackDTO, Track> mapperToTrack(){
        return trackDTO ->
                new Track(
                        IdTrack.of(trackDTO.getIdTrack()),
                        IdLane.of(trackDTO.getIdLane()),
                        IdCar.of(trackDTO.getIdCar()),
                        IdGame.of(trackDTO.getIdGame()),
                        new PositionCurrent(trackDTO.getPositionCurrent()),
                        new FinalDisplacement(trackDTO.getFinalDisplacement())

                );
    }

    public Function<Track, TrackDTO> mapperToTrackDTO( ){
        return track->
                new TrackDTO(
                        track.getIdTrack().getValue(),
                        track.getIdLane().getValue(),
                        track.getIdCar().getValue(),
                        track.getIdGame().getValue(),
                        track.getPositionCurrent().getValue(),
                        track.getFinalDisplacement().getValue()
                );
    }

}
