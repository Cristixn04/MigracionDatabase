package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ChatConversationAiSetting {
    private UUID UUID;
    private UUID conversationId;
    private boolean aiEnabled;
    private UUID defaultModelId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ChatConversationAiSetting() {
    }

    public ChatConversationAiSetting(UUID UUID, UUID conversationId, boolean aiEnabled, UUID defaultModelId, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
