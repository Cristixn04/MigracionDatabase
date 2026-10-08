package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ChatAiRun {
    private UUID UUID;
    private UUID conversationId;
    private UUID messageId;
    private UUID modelId;
    private UUID aiRunStatusId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ChatAiRun() {
    }

    public ChatAiRun(UUID UUID, UUID conversationId, UUID messageId, UUID modelId, UUID aiRunStatusId, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
