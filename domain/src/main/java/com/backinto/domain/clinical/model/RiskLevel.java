package com.backinto.domain.clinical.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class RiskLevel {
    private UUID UUID;
    private String code;
    private String name;
    private boolean active;
    private int severity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public RiskLevel() {
    }

    public RiskLevel(UUID UUID, String code, String name, boolean active, int severity, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.code = code;
        this.name = name;
        this.active = active;
        this.severity = severity;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
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
