package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "provider_models_ai", schema = "librarydb_schema")
public class ProviderModelAiJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "name_provider_ai")
    private String nameProviderAi;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "sitio_web")
    private String sitioWeb;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public ProviderModelAiJpaEntity() {
    }

    public ProviderModelAiJpaEntity(UUID UUID, String nameProviderAi, String razonSocial, String sitioWeb, boolean isActive, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
