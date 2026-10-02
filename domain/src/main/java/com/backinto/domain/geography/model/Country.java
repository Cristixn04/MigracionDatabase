package com.backinto.domain.geography.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Country {
    private final CountryId id;
    private String nameCountry;
    private String codeCountry;
    private String description;
    private boolean isActive;
    private String telephonePrefix;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Country(CountryId id, String nameCountry, String codeCountry, String description,
                   boolean isActive, String telephonePrefix, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = Objects.requireNonNull(id, "Country id cannot be null");
        this.nameCountry = Objects.requireNonNull(nameCountry, "Country name cannot be null");
        this.codeCountry = Objects.requireNonNull(codeCountry, "Country code cannot be null");
        this.description = description;
        this.isActive = isActive;
        this.telephonePrefix = Objects.requireNonNull(telephonePrefix, "Telephone prefix cannot be null");
        this.createdAt = createdAt != null ? createdAt : LocalDateTime.now();
        this.updatedAt = updatedAt != null ? updatedAt : LocalDateTime.now();
    }

    public static Country create(String nameCountry, String codeCountry, String description, String telephonePrefix) {
        LocalDateTime now = LocalDateTime.now();
        return new Country(
                CountryId.generate(),
                nameCountry,
                codeCountry,
                description,
                true,
                telephonePrefix,
                now,
                now
        );
    }

    public void update(String nameCountry, String codeCountry, String description, String telephonePrefix, boolean isActive) {
        this.nameCountry = Objects.requireNonNull(nameCountry, "Country name cannot be null");
        this.codeCountry = Objects.requireNonNull(codeCountry, "Country code cannot be null");
        this.description = description;
        this.telephonePrefix = Objects.requireNonNull(telephonePrefix, "Telephone prefix cannot be null");
        this.isActive = isActive;
        this.updatedAt = LocalDateTime.now();
    }

    public CountryId getId() {
        return id;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getTelephonePrefix() {
        return telephonePrefix;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
