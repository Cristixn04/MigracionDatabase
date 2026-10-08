package com.backinto.domain.clinical.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ClinicalRecord {
    private UUID UUID;
    private UUID patientId;
    private LocalDateTime creationDate;
    private String recordNumber;
    private LocalDateTime openedAt;
    private LocalDateTime closedAt;
    private UUID statusId;
    private LocalDateTime createdAt;
    private UUID createdBy;

    public ClinicalRecord() {
    }

    public ClinicalRecord(UUID UUID, UUID patientId, LocalDateTime creationDate, String recordNumber, LocalDateTime openedAt, LocalDateTime closedAt, UUID statusId, LocalDateTime createdAt, UUID createdBy) {
        this.UUID = UUID;
        this.patientId = patientId;
        this.creationDate = creationDate;
        this.recordNumber = recordNumber;
        this.openedAt = openedAt;
        this.closedAt = closedAt;
        this.statusId = statusId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public LocalDateTime getOpenedAt() {
        return openedAt;
    }

    public void setOpenedAt(LocalDateTime openedAt) {
        this.openedAt = openedAt;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(LocalDateTime closedAt) {
        this.closedAt = closedAt;
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
}
