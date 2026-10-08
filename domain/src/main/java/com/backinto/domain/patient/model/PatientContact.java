package com.backinto.domain.patient.model;

import java.util.UUID;

public class PatientContact {
    private UUID UUID;
    private UUID contactId;
    private UUID patientId;
    private boolean isPrimaryContact;
    private boolean isEmergencyContact;
    private UUID relationshipTypeId;

    public PatientContact() {
    }

    public PatientContact(UUID UUID, UUID contactId, UUID patientId, boolean isPrimaryContact, boolean isEmergencyContact, UUID relationshipTypeId) {
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
