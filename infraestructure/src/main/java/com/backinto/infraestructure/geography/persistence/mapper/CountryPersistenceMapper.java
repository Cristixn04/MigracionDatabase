package com.backinto.infraestructure.geography.persistence.mapper;

import com.backinto.domain.geography.model.Country;
import com.backinto.domain.geography.model.CountryId;
import com.backinto.infraestructure.geography.persistence.entity.CountryJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class CountryPersistenceMapper {

    public Country toDomain(CountryJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Country(
                CountryId.of(entity.getId()),
                entity.getNameCountry(),
                entity.getCodeCountry(),
                entity.getDescription(),
                entity.isActive(),
                entity.getTelephonePrefix(),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
        );
    }

    public CountryJpaEntity toEntity(Country domain) {
        if (domain == null) {
            return null;
        }
        return new CountryJpaEntity(
                domain.getId().value(),
                domain.getNameCountry(),
                domain.getCodeCountry(),
                domain.getDescription(),
                domain.isActive(),
                domain.getTelephonePrefix(),
                domain.getCreatedAt(),
                domain.getUpdatedAt()
        );
    }
}
