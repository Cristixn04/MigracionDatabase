package com.backinto.domain.treatment.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class TreatmentGoal {
    private UUID UUID;
    private UUID treatmentPlanId;
    private String description;
    private LocalDate targetDate;
    private LocalDateTime completedAt;
    private String notes;
    private UUID treatmentGoalId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TreatmentGoal() {
    }

    public TreatmentGoal(UUID UUID, UUID treatmentPlanId, String description, LocalDate targetDate, LocalDateTime completedAt, String notes, UUID treatmentGoalId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.treatmentPlanId = treatmentPlanId;
        this.description = description;
        this.targetDate = targetDate;
        this.completedAt = completedAt;
        this.notes = notes;
        this.treatmentGoalId = treatmentGoalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getTreatmentPlanId() {
        return treatmentPlanId;
    }

    public void setTreatmentPlanId(UUID treatmentPlanId) {
        this.treatmentPlanId = treatmentPlanId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public UUID getTreatmentGoalId() {
        return treatmentGoalId;
    }

    public void setTreatmentGoalId(UUID treatmentGoalId) {
        this.treatmentGoalId = treatmentGoalId;
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
