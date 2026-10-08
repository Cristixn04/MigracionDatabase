package com.backinto.domain.professional.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Professional {
    private UUID UUID;
    private UUID documentTypeId;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private UUID professionalType;
    private String licenseNumber;
    private boolean active;
    private UUID cityId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Professional() {
    }

    public Professional(UUID UUID, UUID documentTypeId, String documentNumber, String firstName, String lastName, UUID professionalType, String licenseNumber, boolean active, UUID cityId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.documentTypeId = documentTypeId;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.professionalType = professionalType;
        this.licenseNumber = licenseNumber;
        this.active = active;
        this.cityId = cityId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(UUID documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UUID getProfessionalType() {
        return professionalType;
    }

    public void setProfessionalType(UUID professionalType) {
        this.professionalType = professionalType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UUID getCityId() {
        return cityId;
    }

    public void setCityId(UUID cityId) {
        this.cityId = cityId;
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
