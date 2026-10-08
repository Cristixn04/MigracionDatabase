package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_escalation_assignments", schema = "librarydb_schema")
public class ChatEscalationAssignmentJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "escalation_id")
    private UUID escalationId;

    @Column(name = "professional_id")
    private UUID professionalId;

    @Column(name = "assigned_at")
    private LocalDateTime assignedAt;

    public ChatEscalationAssignmentJpaEntity() {
    }

    public ChatEscalationAssignmentJpaEntity(UUID UUID, UUID escalationId, UUID professionalId, LocalDateTime assignedAt) {
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
