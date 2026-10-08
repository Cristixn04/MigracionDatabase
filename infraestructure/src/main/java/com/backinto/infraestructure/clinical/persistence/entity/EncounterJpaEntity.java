package com.backinto.infraestructure.clinical.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "encounters", schema = "librarydb_schema")
public class EncounterJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "clinical_record_id")
    private UUID clinicalRecordId;

    @Column(name = "professional_id")
    private UUID professionalId;

    @Column(name = "encounter_type_id")
    private UUID encounterTypeId;

    @Column(name = "started_at")
    private LocalDateTime startedAt;

    @Column(name = "ended_at")
    private LocalDateTime endedAt;

    @Column(name = "reason_for_visit")
    private String reasonForVisit;

    @Column(name = "current_condition")
    private String currentCondition;

    @Column(name = "modality_id")
    private UUID modalityId;

    @Column(name = "status_id")
    private UUID statusId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private UUID createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private UUID updatedBy;

    public EncounterJpaEntity() {
    }

    public EncounterJpaEntity(UUID UUID, UUID clinicalRecordId, UUID professionalId, UUID encounterTypeId, LocalDateTime startedAt, LocalDateTime endedAt, String reasonForVisit, String currentCondition, UUID modalityId, UUID statusId, LocalDateTime createdAt, UUID createdBy, LocalDateTime updatedAt, UUID updatedBy) {
        this.UUID = UUID;
        this.clinicalRecordId = clinicalRecordId;
        this.professionalId = professionalId;
        this.encounterTypeId = encounterTypeId;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.reasonForVisit = reasonForVisit;
        this.currentCondition = currentCondition;
        this.modalityId = modalityId;
        this.statusId = statusId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getClinicalRecordId() {
        return clinicalRecordId;
    }

    public void setClinicalRecordId(UUID clinicalRecordId) {
        this.clinicalRecordId = clinicalRecordId;
    }

    public UUID getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(UUID professionalId) {
        this.professionalId = professionalId;
    }

    public UUID getEncounterTypeId() {
        return encounterTypeId;
    }

    public void setEncounterTypeId(UUID encounterTypeId) {
        this.encounterTypeId = encounterTypeId;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public LocalDateTime getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(LocalDateTime endedAt) {
        this.endedAt = endedAt;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }

    public UUID getModalityId() {
        return modalityId;
    }

    public void setModalityId(UUID modalityId) {
        this.modalityId = modalityId;
    }

    public UUID getStatusId() {
        return statusId;
    }

    public void setStatusId(UUID statusId) {
        this.statusId = statusId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UUID getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UUID getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UUID updatedBy) {
        this.updatedBy = updatedBy;
    }
}
