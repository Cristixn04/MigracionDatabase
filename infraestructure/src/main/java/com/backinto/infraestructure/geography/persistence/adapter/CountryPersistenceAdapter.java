package com.backinto.infraestructure.geography.persistence.adapter;

import com.backinto.domain.geography.model.Country;
import com.backinto.domain.geography.model.CountryId;
import com.backinto.domain.geography.port.CountryRepository;
import com.backinto.infraestructure.geography.persistence.entity.CountryJpaEntity;
import com.backinto.infraestructure.geography.persistence.mapper.CountryPersistenceMapper;
import com.backinto.infraestructure.geography.persistence.repository.CountryJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CountryPersistenceAdapter implements CountryRepository {

    private final CountryJpaRepository countryJpaRepository;
    private final CountryPersistenceMapper countryPersistenceMapper;

    public CountryPersistenceAdapter(CountryJpaRepository countryJpaRepository,
                                     CountryPersistenceMapper countryPersistenceMapper) {
        this.countryJpaRepository = countryJpaRepository;
        this.countryPersistenceMapper = countryPersistenceMapper;
    }

    @Override
    public Country save(Country country) {
        CountryJpaEntity entity = countryPersistenceMapper.toEntity(country);
        CountryJpaEntity saved = countryJpaRepository.save(entity);
        return countryPersistenceMapper.toDomain(saved);
    }

    @Override
    public Optional<Country> findById(CountryId id) {
        return countryJpaRepository.findById(id.value())
                .map(countryPersistenceMapper::toDomain);
    }

    @Override
    public Optional<Country> findByCode(String code) {
        return countryJpaRepository.findByCodeCountry(code)
                .map(countryPersistenceMapper::toDomain);
    }

    @Override
    public List<Country> findAll() {
        return countryJpaRepository.findAll().stream()
                .map(countryPersistenceMapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(CountryId id) {
        countryJpaRepository.deleteById(id.value());
    }
}
