package com.backinto.infraestructure.geography.config;

import com.backinto.application.geography.port.in.CountryUseCase;
import com.backinto.application.geography.service.CountryService;
import com.backinto.domain.geography.port.CountryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountryConfig {

    @Bean
    public CountryUseCase countryUseCase(CountryRepository countryRepository) {
        return new CountryService(countryRepository);
    }
}
