package com.backinto.infraestructure.geography.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "city_municipalities", schema = "librarydb_schema")
public class CityMunicipalityJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "name_city")
    private String nameCity;

    @Column(name = "code_citi")
    private String codeCiti;

    @Column(name = "description")
    private String description;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "region_id")
    private UUID regionId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public CityMunicipalityJpaEntity() {
    }

    public CityMunicipalityJpaEntity(UUID UUID, String nameCity, String codeCiti, String description, boolean isActive, UUID regionId, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
