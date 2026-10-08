package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ProviderModelAi {
    private UUID UUID;
    private String nameProviderAi;
    private String razonSocial;
    private String sitioWeb;
    private boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProviderModelAi() {
    }

    public ProviderModelAi(UUID UUID, String nameProviderAi, String razonSocial, String sitioWeb, boolean isActive, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.nameProviderAi = nameProviderAi;
        this.razonSocial = razonSocial;
        this.sitioWeb = sitioWeb;
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

    public String getNameProviderAi() {
        return nameProviderAi;
    }

    public void setNameProviderAi(String nameProviderAi) {
        this.nameProviderAi = nameProviderAi;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
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
