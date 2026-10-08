package com.backinto.infraestructure.catalogs.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "relationship_types", schema = "librarydb_schema")
public class RelationshipTypeJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "description")
    private String description;

    public RelationshipTypeJpaEntity() {
    }

    public RelationshipTypeJpaEntity(UUID UUID, String description) {
        this.UUID = UUID;
        this.description = description;
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
}
