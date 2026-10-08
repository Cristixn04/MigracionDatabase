package com.backinto.domain.professional.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ProfessionalType {
    private UUID UUID;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProfessionalType() {
    }

    public ProfessionalType(UUID UUID, String name, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
