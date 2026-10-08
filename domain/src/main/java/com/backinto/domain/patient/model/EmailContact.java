package com.backinto.domain.patient.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class EmailContact {
    private UUID UUID;
    private UUID contactId;
    private String email;
    private String notes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public EmailContact() {
    }

    public EmailContact(UUID UUID, UUID contactId, String email, String notes, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.contactId = contactId;
        this.email = email;
        this.notes = notes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getContactId() {
        return contactId;
    }

    public void setContactId(UUID contactId) {
        this.contactId = contactId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
