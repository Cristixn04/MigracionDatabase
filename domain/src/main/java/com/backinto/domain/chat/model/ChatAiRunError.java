package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ChatAiRunError {
    private UUID UUID;
    private UUID aiRunId;
    private String errorMessage;
    private String errorCode;
    private String providerErrorId;
    private LocalDateTime createdAt;

    public ChatAiRunError() {
    }

    public ChatAiRunError(UUID UUID, UUID aiRunId, String errorMessage, String errorCode, String providerErrorId, LocalDateTime createdAt) {
        this.UUID = UUID;
        this.aiRunId = aiRunId;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.providerErrorId = providerErrorId;
        this.createdAt = createdAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getAiRunId() {
        return aiRunId;
    }

    public void setAiRunId(UUID aiRunId) {
        this.aiRunId = aiRunId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getProviderErrorId() {
        return providerErrorId;
    }

    public void setProviderErrorId(String providerErrorId) {
        this.providerErrorId = providerErrorId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
