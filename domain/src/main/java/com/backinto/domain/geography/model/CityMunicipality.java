package com.backinto.domain.geography.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class CityMunicipality {
    private UUID UUID;
    private String nameCity;
    private String codeCiti;
    private String description;
    private boolean isActive;
    private UUID regionId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CityMunicipality() {
    }

    public CityMunicipality(UUID UUID, String nameCity, String codeCiti, String description, boolean isActive, UUID regionId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.nameCity = nameCity;
        this.codeCiti = codeCiti;
        this.description = description;
        this.isActive = isActive;
        this.regionId = regionId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public String getCodeCiti() {
        return codeCiti;
    }

    public void setCodeCiti(String codeCiti) {
        this.codeCiti = codeCiti;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public UUID getRegionId() {
        return regionId;
    }

    public void setRegionId(UUID regionId) {
        this.regionId = regionId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
