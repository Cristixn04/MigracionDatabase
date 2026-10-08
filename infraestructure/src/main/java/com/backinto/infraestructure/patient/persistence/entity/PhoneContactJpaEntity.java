package com.backinto.infraestructure.patient.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "phone_contacts", schema = "librarydb_schema")
public class PhoneContactJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "contact_id")
    private UUID contactId;

    @Column(name = "phone")
    private String phone;

    @Column(name = "notes")
    private String notes;

    public PhoneContactJpaEntity() {
    }

    public PhoneContactJpaEntity(UUID UUID, UUID contactId, String phone, String notes) {
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
