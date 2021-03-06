package com.example.carGame.useCase.findsUseCase;

import com.example.carGame.dto.DriverDTO;
import com.example.carGame.mapper.DriverMapper;
import com.example.carGame.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdDriverUseCase {

    private final DriverRepository driverRepository;
    private final DriverMapper driverMapper;

    @Autowired
    public FindByIdDriverUseCase(DriverRepository driverRepository, DriverMapper driverMapper) {
        this.driverRepository = driverRepository;
        this.driverMapper = driverMapper;
    }

    public Mono<DriverDTO> findById(String id) {
        return driverRepository.findById(id)
                .flatMap(
                        driver -> Mono.just(driverMapper.mapperToDriverDTO().apply(driver))
                );
    }

}
