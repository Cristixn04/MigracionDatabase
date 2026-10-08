package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ChatEscalationAssignment {
    private UUID UUID;
    private UUID escalationId;
    private UUID professionalId;
    private LocalDateTime assignedAt;

    public ChatEscalationAssignment() {
    }

    public ChatEscalationAssignment(UUID UUID, UUID escalationId, UUID professionalId, LocalDateTime assignedAt) {
        this.UUID = UUID;
        this.escalationId = escalationId;
        this.professionalId = professionalId;
        this.assignedAt = assignedAt;
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

    public UUID getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(UUID professionalId) {
        this.professionalId = professionalId;
    }

    public LocalDateTime getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(LocalDateTime assignedAt) {
        this.assignedAt = assignedAt;
    }
}
