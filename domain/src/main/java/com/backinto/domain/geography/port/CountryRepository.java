package com.backinto.domain.geography.port;

import com.backinto.domain.geography.model.Country;
import com.backinto.domain.geography.model.CountryId;

import java.util.List;
import java.util.Optional;

public interface CountryRepository {
    Country save(Country country);
    Optional<Country> findById(CountryId id);
    Optional<Country> findByCode(String code);
    List<Country> findAll();
    void deleteById(CountryId id);
}
