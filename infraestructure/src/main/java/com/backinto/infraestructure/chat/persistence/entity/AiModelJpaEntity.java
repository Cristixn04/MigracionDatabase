package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ai_models", schema = "librarydb_schema")
public class AiModelJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "provider_model_id")
    private UUID providerModelId;

    @Column(name = "name_model")
    private String nameModel;

    @Column(name = "model_key")
    private String modelKey;

    @Column(name = "input_token_price")
    private BigDecimal inputTokenPrice;

    @Column(name = "output_token_price")
    private BigDecimal outputTokenPrice;

    @Column(name = "max_tokens")
    private Integer maxTokens;

    @Column(name = "context_window")
    private Integer contextWindow;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public AiModelJpaEntity() {
    }

    public AiModelJpaEntity(UUID UUID, UUID providerModelId, String nameModel, String modelKey, BigDecimal inputTokenPrice, BigDecimal outputTokenPrice, Integer maxTokens, Integer contextWindow, boolean isActive, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.providerModelId = providerModelId;
        this.nameModel = nameModel;
        this.modelKey = modelKey;
        this.inputTokenPrice = inputTokenPrice;
        this.outputTokenPrice = outputTokenPrice;
        this.maxTokens = maxTokens;
        this.contextWindow = contextWindow;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getProviderModelId() {
        return providerModelId;
    }

    public void setProviderModelId(UUID providerModelId) {
        this.providerModelId = providerModelId;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getModelKey() {
        return modelKey;
    }

    public void setModelKey(String modelKey) {
        this.modelKey = modelKey;
    }

    public BigDecimal getInputTokenPrice() {
        return inputTokenPrice;
    }

    public void setInputTokenPrice(BigDecimal inputTokenPrice) {
        this.inputTokenPrice = inputTokenPrice;
    }

    public BigDecimal getOutputTokenPrice() {
        return outputTokenPrice;
    }

    public void setOutputTokenPrice(BigDecimal outputTokenPrice) {
        this.outputTokenPrice = outputTokenPrice;
    }

    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Integer getContextWindow() {
        return contextWindow;
    }

    public void setContextWindow(Integer contextWindow) {
        this.contextWindow = contextWindow;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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
