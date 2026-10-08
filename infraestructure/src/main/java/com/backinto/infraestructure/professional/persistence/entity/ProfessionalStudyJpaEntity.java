package com.backinto.infraestructure.professional.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "professional_studies", schema = "librarydb_schema")
public class ProfessionalStudyJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "study_id")
    private UUID studyId;

    @Column(name = "professional_id")
    private UUID professionalId;

    @Column(name = "title")
    private String title;

    @Column(name = "university")
    private String university;

    @Column(name = "is_valid")
    private boolean isValid;

    @Column(name = "resolution_number")
    private String resolutionNumber;

    @Column(name = "country_id")
    private UUID countryId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public ProfessionalStudyJpaEntity() {
    }

    public ProfessionalStudyJpaEntity(UUID UUID, UUID studyId, UUID professionalId, String title, String university, boolean isValid, String resolutionNumber, UUID countryId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.studyId = studyId;
        this.professionalId = professionalId;
        this.title = title;
        this.university = university;
        this.isValid = isValid;
        this.resolutionNumber = resolutionNumber;
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

    public UUID getStudyId() {
        return studyId;
    }

    public void setStudyId(UUID studyId) {
        this.studyId = studyId;
    }

    public UUID getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(UUID professionalId) {
        this.professionalId = professionalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String getResolutionNumber() {
        return resolutionNumber;
    }

    public void setResolutionNumber(String resolutionNumber) {
        this.resolutionNumber = resolutionNumber;
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
