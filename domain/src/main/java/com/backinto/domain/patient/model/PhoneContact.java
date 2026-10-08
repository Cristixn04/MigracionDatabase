package com.backinto.domain.patient.model;

import java.util.UUID;

public class PhoneContact {
    private UUID UUID;
    private UUID contactId;
    private String phone;
    private String notes;

    public PhoneContact() {
    }

    public PhoneContact(UUID UUID, UUID contactId, String phone, String notes) {
        this.UUID = UUID;
        this.contactId = contactId;
        this.phone = phone;
        this.notes = notes;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
