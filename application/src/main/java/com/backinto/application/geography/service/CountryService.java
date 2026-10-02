package com.backinto.application.geography.service;

import com.backinto.application.geography.dto.CountryResponse;
import com.backinto.application.geography.dto.CreateCountryCommand;
import com.backinto.application.geography.port.in.CountryUseCase;
import com.backinto.domain.geography.model.Country;
import com.backinto.domain.geography.model.CountryId;
import com.backinto.domain.geography.port.CountryRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public class CountryService implements CountryUseCase {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public CountryResponse createCountry(CreateCountryCommand command) {
        Country country = Country.create(
                command.nameCountry(),
                command.codeCountry(),
                command.description(),
                command.telephonePrefix()
        );
        Country saved = countryRepository.save(country);
        return CountryResponse.fromDomain(saved);
    }

    @Override
    public CountryResponse getCountryById(UUID id) {
        return countryRepository.findById(CountryId.of(id))
                .map(CountryResponse::fromDomain)
                .orElseThrow(() -> new NoSuchElementException("Country not found with ID: " + id));
    }

    @Override
    public List<CountryResponse> getAllCountries() {
        return countryRepository.findAll().stream()
                .map(CountryResponse::fromDomain)
                .toList();
    }

    @Override
    public void deleteCountry(UUID id) {
        countryRepository.deleteById(CountryId.of(id));
    }
}
