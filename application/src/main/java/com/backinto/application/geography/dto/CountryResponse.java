package com.backinto.application.geography.dto;

import com.backinto.domain.geography.model.Country;

import java.time.LocalDateTime;
import java.util.UUID;

public record CountryResponse(
        UUID id,
        String nameCountry,
        String codeCountry,
        String description,
        boolean isActive,
        String telephonePrefix,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
    public static CountryResponse fromDomain(Country country) {
        return new CountryResponse(
                country.getId().value(),
                country.getNameCountry(),
                country.getCodeCountry(),
                country.getDescription(),
                country.isActive(),
                country.getTelephonePrefix(),
                country.getCreatedAt(),
                country.getUpdatedAt()
        );
    }
}
