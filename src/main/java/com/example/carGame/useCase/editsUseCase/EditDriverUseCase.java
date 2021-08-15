package com.example.carGame.useCase.editsUseCase;

import com.example.carGame.dto.DriverDTO;
import com.example.carGame.mapper.DriverMapper;
import com.example.carGame.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class EditDriverUseCase {

    private final DriverRepository driverRepository;
    private final DriverMapper driverMapper;

    @Autowired
    public EditDriverUseCase(DriverRepository driverRepository, DriverMapper driverMapper) {
        this.driverRepository = driverRepository;
        this.driverMapper = driverMapper;
    }

    public Mono<DriverDTO> modifyDriver(DriverDTO driverDTO){
        return driverRepository.save(driverMapper.mapperToDriver(driverDTO.getIdDriver())
                        .apply(driverDTO))
                .map(driverMapper.mapperToDriverDTO());
    }

}
