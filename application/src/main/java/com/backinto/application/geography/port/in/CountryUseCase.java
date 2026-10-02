package com.backinto.application.geography.port.in;

import com.backinto.application.geography.dto.CountryResponse;
import com.backinto.application.geography.dto.CreateCountryCommand;

import java.util.List;
import java.util.UUID;

public interface CountryUseCase {
    CountryResponse createCountry(CreateCountryCommand command);
    CountryResponse getCountryById(UUID id);
    List<CountryResponse> getAllCountries();
    void deleteCountry(UUID id);
}
