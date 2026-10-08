package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Priority {
    private UUID UUID;
    private String namePriority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Priority() {
    }

    public Priority(UUID UUID, String namePriority, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.namePriority = namePriority;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public String getNamePriority() {
        return namePriority;
    }

    public void setNamePriority(String namePriority) {
        this.namePriority = namePriority;
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
