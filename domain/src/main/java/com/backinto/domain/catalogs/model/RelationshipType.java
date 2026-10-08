package com.backinto.domain.catalogs.model;

import java.util.UUID;

public class RelationshipType {
    private UUID UUID;
    private String description;

    public RelationshipType() {
    }

    public RelationshipType(UUID UUID, String description) {
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
