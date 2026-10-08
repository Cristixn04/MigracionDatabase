package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "escalations_statuses", schema = "librarydb_schema")
public class EscalationStatusJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "name_status")
    private String nameStatus;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public EscalationStatusJpaEntity() {
    }

    public EscalationStatusJpaEntity(UUID UUID, String nameStatus, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.nameStatus = nameStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
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
