package com.backinto.domain.clinical.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class DiagnosticSystem {
    private UUID UUID;
    private String code;
    private String name;
    private boolean active;
    private String version;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public DiagnosticSystem() {
    }

    public DiagnosticSystem(UUID UUID, String code, String name, boolean active, String version, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.code = code;
        this.name = name;
        this.active = active;
        this.version = version;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
