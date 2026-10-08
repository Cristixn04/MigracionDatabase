package com.backinto.domain.treatment.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class TreatmentPlan {
    private UUID UUID;
    private UUID encounterId;
    private UUID professionalId;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private UUID treatmentStatusId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TreatmentPlan() {
    }

    public TreatmentPlan(UUID UUID, UUID encounterId, UUID professionalId, String title, String description, LocalDate startDate, LocalDate endDate, UUID treatmentStatusId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.encounterId = encounterId;
        this.professionalId = professionalId;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.treatmentStatusId = treatmentStatusId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(UUID encounterId) {
        this.encounterId = encounterId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public UUID getTreatmentStatusId() {
        return treatmentStatusId;
    }

    public void setTreatmentStatusId(UUID treatmentStatusId) {
        this.treatmentStatusId = treatmentStatusId;
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
