package com.backinto.domain.chat.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class AiModel {
    private UUID UUID;
    private UUID providerModelId;
    private String nameModel;
    private String modelKey;
    private BigDecimal inputTokenPrice;
    private BigDecimal outputTokenPrice;
    private Integer maxTokens;
    private Integer contextWindow;
    private boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public AiModel() {
    }

    public AiModel(UUID UUID, UUID providerModelId, String nameModel, String modelKey, BigDecimal inputTokenPrice, BigDecimal outputTokenPrice, Integer maxTokens, Integer contextWindow, boolean isActive, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
