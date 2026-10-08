package com.backinto.domain.geography.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class StateRegion {
    private UUID UUID;
    private String nameRegion;
    private String codeRegion;
    private String description;
    private boolean isActive;
    private UUID countryId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public StateRegion() {
    }

    public StateRegion(UUID UUID, String nameRegion, String codeRegion, String description, boolean isActive, UUID countryId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.nameRegion = nameRegion;
        this.codeRegion = codeRegion;
        this.description = description;
        this.isActive = isActive;
        this.countryId = countryId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
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

    public UUID getCountryId() {
        return countryId;
    }

    public void setCountryId(UUID countryId) {
        this.countryId = countryId;
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
