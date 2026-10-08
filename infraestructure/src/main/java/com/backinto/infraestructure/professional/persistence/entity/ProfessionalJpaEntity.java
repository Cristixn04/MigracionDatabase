package com.backinto.infraestructure.professional.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "professionals", schema = "librarydb_schema")
public class ProfessionalJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "document_type_id")
    private UUID documentTypeId;

    @Column(name = "document_number")
    private String documentNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "professional_type")
    private UUID professionalType;

    @Column(name = "license_number")
    private String licenseNumber;

    @Column(name = "active")
    private boolean active;

    @Column(name = "city_id")
    private UUID cityId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public ProfessionalJpaEntity() {
    }

    public ProfessionalJpaEntity(UUID UUID, UUID documentTypeId, String documentNumber, String firstName, String lastName, UUID professionalType, String licenseNumber, boolean active, UUID cityId, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
