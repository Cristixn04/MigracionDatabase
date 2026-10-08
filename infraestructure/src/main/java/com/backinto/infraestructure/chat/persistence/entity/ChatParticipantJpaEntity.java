package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_participants", schema = "librarydb_schema")
public class ChatParticipantJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "conversation_id")
    private UUID conversationId;

    @Column(name = "participant_type_id")
    private UUID participantTypeId;

    @Column(name = "patient_id")
    private UUID patientId;

    @Column(name = "professional_id")
    private UUID professionalId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public ChatParticipantJpaEntity() {
    }

    public ChatParticipantJpaEntity(UUID UUID, UUID conversationId, UUID participantTypeId, UUID patientId, UUID professionalId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.conversationId = conversationId;
        this.participantTypeId = participantTypeId;
        this.patientId = patientId;
        this.professionalId = professionalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public UUID getParticipantTypeId() {
        return participantTypeId;
    }

    public void setParticipantTypeId(UUID participantTypeId) {
        this.participantTypeId = participantTypeId;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public UUID getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(UUID professionalId) {
        this.professionalId = professionalId;
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
