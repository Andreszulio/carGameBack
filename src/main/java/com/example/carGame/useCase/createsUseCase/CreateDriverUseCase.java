package com.example.carGame.useCase.createsUseCase;

import com.example.carGame.dto.DriverDTO;
import com.example.carGame.mapper.DriverMapper;
import com.example.carGame.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreateDriverUseCase {

    private final DriverRepository driverRepository;
    private final DriverMapper driverMapper;

    @Autowired
    public CreateDriverUseCase(DriverRepository driverRepository, DriverMapper driverMapper) {
        this.driverRepository = driverRepository;
        this.driverMapper = driverMapper;
    }

    public Mono<DriverDTO> apply(DriverDTO driverDTO) {
        return driverRepository.save(driverMapper.mapperToDriver()
                        .apply(driverDTO))
                .map(driverMapper.mapperToDriverDTO());
    }

}
