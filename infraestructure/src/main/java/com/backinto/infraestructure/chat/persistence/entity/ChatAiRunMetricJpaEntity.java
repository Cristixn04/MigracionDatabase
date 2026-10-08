package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_ai_run_metrics", schema = "librarydb_schema")
public class ChatAiRunMetricJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "ai_run_id")
    private UUID aiRunId;

    @Column(name = "prompt_tokens")
    private int promptTokens;

    @Column(name = "completion_tokens")
    private int completionTokens;

    @Column(name = "total_tokens")
    private int totalTokens;

    @Column(name = "cost")
    private BigDecimal cost;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public ChatAiRunMetricJpaEntity() {
    }

    public ChatAiRunMetricJpaEntity(UUID UUID, UUID aiRunId, int promptTokens, int completionTokens, int totalTokens, BigDecimal cost, LocalDateTime createdAt) {
        this.UUID = UUID;
        this.aiRunId = aiRunId;
        this.promptTokens = promptTokens;
        this.completionTokens = completionTokens;
        this.totalTokens = totalTokens;
        this.cost = cost;
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

    public int getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(int promptTokens) {
        this.promptTokens = promptTokens;
    }

    public int getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(int completionTokens) {
        this.completionTokens = completionTokens;
    }

    public int getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(int totalTokens) {
        this.totalTokens = totalTokens;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
