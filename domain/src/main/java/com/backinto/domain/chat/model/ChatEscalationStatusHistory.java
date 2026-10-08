package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ChatEscalationStatusHistory {
    private UUID UUID;
    private UUID escalationId;
    private UUID escalationStatusId;
    private LocalDateTime createdAt;
    private LocalDateTime changedAt;

    public ChatEscalationStatusHistory() {
    }

    public ChatEscalationStatusHistory(UUID UUID, UUID escalationId, UUID escalationStatusId, LocalDateTime createdAt, LocalDateTime changedAt) {
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
