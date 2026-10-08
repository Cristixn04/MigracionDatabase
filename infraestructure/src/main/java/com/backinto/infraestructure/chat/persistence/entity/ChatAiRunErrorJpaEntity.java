package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_ai_run_errors", schema = "librarydb_schema")
public class ChatAiRunErrorJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "ai_run_id")
    private UUID aiRunId;

    @Column(name = "error_message")
    private String errorMessage;

    @Column(name = "error_code")
    private String errorCode;

    @Column(name = "provider_error_id")
    private String providerErrorId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public ChatAiRunErrorJpaEntity() {
    }

    public ChatAiRunErrorJpaEntity(UUID UUID, UUID aiRunId, String errorMessage, String errorCode, String providerErrorId, LocalDateTime createdAt) {
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
