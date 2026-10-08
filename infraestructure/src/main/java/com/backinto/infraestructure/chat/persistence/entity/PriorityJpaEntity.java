package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "priorities", schema = "librarydb_schema")
public class PriorityJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "name_priority")
    private String namePriority;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public PriorityJpaEntity() {
    }

    public PriorityJpaEntity(UUID UUID, String namePriority, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
