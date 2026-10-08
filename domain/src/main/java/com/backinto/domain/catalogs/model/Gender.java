package com.backinto.domain.catalogs.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Gender {
    private UUID UUID;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Gender() {
    }

    public Gender(UUID UUID, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
