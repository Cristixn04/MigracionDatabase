package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_conversation_ai_settings", schema = "librarydb_schema")
public class ChatConversationAiSettingJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "conversation_id")
    private UUID conversationId;

    @Column(name = "ai_enabled")
    private boolean aiEnabled;

    @Column(name = "default_model_id")
    private UUID defaultModelId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public ChatConversationAiSettingJpaEntity() {
    }

    public ChatConversationAiSettingJpaEntity(UUID UUID, UUID conversationId, boolean aiEnabled, UUID defaultModelId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.conversationId = conversationId;
        this.aiEnabled = aiEnabled;
        this.defaultModelId = defaultModelId;
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

    public boolean isAiEnabled() {
        return aiEnabled;
    }

    public void setAiEnabled(boolean aiEnabled) {
        this.aiEnabled = aiEnabled;
    }

    public UUID getDefaultModelId() {
        return defaultModelId;
    }

    public void setDefaultModelId(UUID defaultModelId) {
        this.defaultModelId = defaultModelId;
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
