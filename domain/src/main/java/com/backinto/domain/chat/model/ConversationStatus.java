package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ConversationStatus {
    private UUID UUID;
    private String nameStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ConversationStatus() {
    }

    public ConversationStatus(UUID UUID, String nameStatus, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.nameStatus = nameStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
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
