package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_escalation_status_history", schema = "librarydb_schema")
public class ChatEscalationStatusHistoryJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "escalation_id")
    private UUID escalationId;

    @Column(name = "escalation_status_id")
    private UUID escalationStatusId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "changed_at")
    private LocalDateTime changedAt;

    public ChatEscalationStatusHistoryJpaEntity() {
    }

    public ChatEscalationStatusHistoryJpaEntity(UUID UUID, UUID escalationId, UUID escalationStatusId, LocalDateTime createdAt, LocalDateTime changedAt) {
        this.UUID = UUID;
        this.escalationId = escalationId;
        this.escalationStatusId = escalationStatusId;
        this.createdAt = createdAt;
        this.changedAt = changedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getEscalationId() {
        return escalationId;
    }

    public void setEscalationId(UUID escalationId) {
        this.escalationId = escalationId;
    }

    public UUID getEscalationStatusId() {
        return escalationStatusId;
    }

    public void setEscalationStatusId(UUID escalationStatusId) {
        this.escalationStatusId = escalationStatusId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(LocalDateTime changedAt) {
        this.changedAt = changedAt;
    }
}
