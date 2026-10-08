package com.backinto.infraestructure.patient.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "patient_contacts", schema = "librarydb_schema")
public class PatientContactJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "contact_id")
    private UUID contactId;

    @Column(name = "patient_id")
    private UUID patientId;

    @Column(name = "is_primary_contact")
    private boolean isPrimaryContact;

    @Column(name = "is_emergency_contact")
    private boolean isEmergencyContact;

    @Column(name = "relationship_type_id")
    private UUID relationshipTypeId;

    public PatientContactJpaEntity() {
    }

    public PatientContactJpaEntity(UUID UUID, UUID contactId, UUID patientId, boolean isPrimaryContact, boolean isEmergencyContact, UUID relationshipTypeId) {
        this.UUID = UUID;
        this.contactId = contactId;
        this.patientId = patientId;
        this.isPrimaryContact = isPrimaryContact;
        this.isEmergencyContact = isEmergencyContact;
        this.relationshipTypeId = relationshipTypeId;
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

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public boolean isIsPrimaryContact() {
        return isPrimaryContact;
    }

    public void setIsPrimaryContact(boolean isPrimaryContact) {
        this.isPrimaryContact = isPrimaryContact;
    }

    public boolean isIsEmergencyContact() {
        return isEmergencyContact;
    }

    public void setIsEmergencyContact(boolean isEmergencyContact) {
        this.isEmergencyContact = isEmergencyContact;
    }

    public UUID getRelationshipTypeId() {
        return relationshipTypeId;
    }

    public void setRelationshipTypeId(UUID relationshipTypeId) {
        this.relationshipTypeId = relationshipTypeId;
    }
}
