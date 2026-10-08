package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_escalations", schema = "librarydb_schema")
public class ChatEscalationJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "conversation_id")
    private UUID conversationId;

    @Column(name = "status_id")
    private UUID statusId;

    @Column(name = "from_ai")
    private boolean fromAi;

    @Column(name = "reason")
    private String reason;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public ChatEscalationJpaEntity() {
    }

    public ChatEscalationJpaEntity(UUID UUID, UUID conversationId, UUID statusId, boolean fromAi, String reason, LocalDateTime createdAt) {
        this.UUID = UUID;
        this.conversationId = conversationId;
        this.statusId = statusId;
        this.fromAi = fromAi;
        this.reason = reason;
        this.createdAt = createdAt;
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

    public UUID getStatusId() {
        return statusId;
    }

    public void setStatusId(UUID statusId) {
        this.statusId = statusId;
    }

    public boolean isFromAi() {
        return fromAi;
    }

    public void setFromAi(boolean fromAi) {
        this.fromAi = fromAi;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
