package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_ai_runs", schema = "librarydb_schema")
public class ChatAiRunJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "conversation_id")
    private UUID conversationId;

    @Column(name = "message_id")
    private UUID messageId;

    @Column(name = "model_id")
    private UUID modelId;

    @Column(name = "ai_run_status_id")
    private UUID aiRunStatusId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public ChatAiRunJpaEntity() {
    }

    public ChatAiRunJpaEntity(UUID UUID, UUID conversationId, UUID messageId, UUID modelId, UUID aiRunStatusId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.conversationId = conversationId;
        this.messageId = messageId;
        this.modelId = modelId;
        this.aiRunStatusId = aiRunStatusId;
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

    public UUID getMessageId() {
        return messageId;
    }

    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }

    public UUID getModelId() {
        return modelId;
    }

    public void setModelId(UUID modelId) {
        this.modelId = modelId;
    }

    public UUID getAiRunStatusId() {
        return aiRunStatusId;
    }

    public void setAiRunStatusId(UUID aiRunStatusId) {
        this.aiRunStatusId = aiRunStatusId;
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
