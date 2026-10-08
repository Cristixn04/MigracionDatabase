package com.backinto.domain.patient.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class PatientAllergy {
    private UUID UUID;
    private UUID patientId;
    private String substance;
    private String reaction;
    private String severity;
    private boolean active;
    private LocalDateTime recordedAt;
    private UUID recordedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public PatientAllergy() {
    }

    public PatientAllergy(UUID UUID, UUID patientId, String substance, String reaction, String severity, boolean active, LocalDateTime recordedAt, UUID recordedBy, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.patientId = patientId;
        this.substance = substance;
        this.reaction = reaction;
        this.severity = severity;
        this.active = active;
        this.recordedAt = recordedAt;
        this.recordedBy = recordedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(LocalDateTime recordedAt) {
        this.recordedAt = recordedAt;
    }

    public UUID getRecordedBy() {
        return recordedBy;
    }

    public void setRecordedBy(UUID recordedBy) {
        this.recordedBy = recordedBy;
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
