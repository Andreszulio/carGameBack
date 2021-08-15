package com.example.carGame.mapper;

import com.example.carGame.domain.Podium;
import com.example.carGame.domain.Track;
import com.example.carGame.domain.values.*;
import com.example.carGame.dto.TrackDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class TrackMapper {

    public Function<TrackDTO, Track> mapperToTrack(){
        return createTrack -> {
            Track track = new Track();
            track.setIdTrack(createTrack.getIdTrack());
            track.setIdLane(createTrack.getIdLane());
            track.setIdCar(createTrack.getIdCar());
            track.setIdGame(createTrack.getIdGame());
            track.setPositionCurrent(createTrack.getPositionCurrent());
            track.setFinalDisplacement(createTrack.getFinalDisplacement());
            return track;
        };
    }

    public Function<Track, TrackDTO> mapperToTrackDTO( ){
        return track->
                new TrackDTO(
                        track.getIdTrack(),
                        track.getIdLane(),
                        track.getIdCar(),
                        track.getIdGame(),
                        track.getPositionCurrent(),
                        track.getFinalDisplacement()
                );
    }

}
