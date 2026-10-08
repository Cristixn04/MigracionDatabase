package com.backinto.infraestructure.treatment.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "treatment_goals", schema = "librarydb_schema")
public class TreatmentGoalJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "treatment_plan_id")
    private UUID treatmentPlanId;

    @Column(name = "description")
    private String description;

    @Column(name = "target_date")
    private LocalDate targetDate;

    @Column(name = "completed_at")
    private LocalDateTime completedAt;

    @Column(name = "notes")
    private String notes;

    @Column(name = "treatment_goal_id")
    private UUID treatmentGoalId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public TreatmentGoalJpaEntity() {
    }

    public TreatmentGoalJpaEntity(UUID UUID, UUID treatmentPlanId, String description, LocalDate targetDate, LocalDateTime completedAt, String notes, UUID treatmentGoalId, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
