package com.backinto.domain.patient.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Patient {
    private final PatientId id;
    private UUID documentTypeId;
    private String documentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;
    private LocalDate birthDate;
    private UUID biologicalSexId;
    private UUID genderIdentity;
    private String email;
    private String phone;
    private String address;
    private boolean active;
    private final LocalDateTime createdAt;
    private UUID createdBy;
    private LocalDateTime updatedAt;
    private UUID updatedBy;
    private UUID cityId;

    public Patient(PatientId id, UUID documentTypeId, String documentNumber, String firstName,
                   String middleName, String lastName, String secondLastName, LocalDate birthDate,
                   UUID biologicalSexId, UUID genderIdentity, String email, String phone,
                   String address, boolean active, LocalDateTime createdAt, UUID createdBy,
                   LocalDateTime updatedAt, UUID updatedBy, UUID cityId) {
        this.id = Objects.requireNonNull(id, "Patient ID cannot be null");
        this.documentTypeId = Objects.requireNonNull(documentTypeId, "Document type ID cannot be null");
        this.documentNumber = Objects.requireNonNull(documentNumber, "Document number cannot be null");
        this.firstName = Objects.requireNonNull(firstName, "First name cannot be null");
        this.middleName = middleName;
        this.lastName = Objects.requireNonNull(lastName, "Last name cannot be null");
        this.secondLastName = secondLastName;
        this.birthDate = Objects.requireNonNull(birthDate, "Birth date cannot be null");
        this.biologicalSexId = Objects.requireNonNull(biologicalSexId, "Biological sex ID cannot be null");
        this.genderIdentity = Objects.requireNonNull(genderIdentity, "Gender identity cannot be null");
        this.email = Objects.requireNonNull(email, "Email cannot be null");
        this.phone = Objects.requireNonNull(phone, "Phone cannot be null");
        this.address = Objects.requireNonNull(address, "Address cannot be null");
        this.active = active;
        this.createdAt = createdAt != null ? createdAt : LocalDateTime.now();
        this.createdBy = createdBy;
        this.updatedAt = updatedAt != null ? updatedAt : LocalDateTime.now();
        this.updatedBy = updatedBy;
        this.cityId = Objects.requireNonNull(cityId, "City ID cannot be null");
    }

    public static Patient create(UUID documentTypeId, String documentNumber, String firstName,
                                 String middleName, String lastName, String secondLastName, LocalDate birthDate,
                                 UUID biologicalSexId, UUID genderIdentity, String email, String phone,
                                 String address, UUID createdBy, UUID cityId) {
        LocalDateTime now = LocalDateTime.now();
        return new Patient(
                PatientId.generate(),
                documentTypeId,
                documentNumber,
                firstName,
                middleName,
                lastName,
                secondLastName,
                birthDate,
                biologicalSexId,
                genderIdentity,
                email,
                phone,
                address,
                true,
                now,
                createdBy,
                now,
                null,
                cityId
        );
    }

    public PatientId getId() {
        return id;
    }

    public UUID getDocumentTypeId() {
        return documentTypeId;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public UUID getBiologicalSexId() {
        return biologicalSexId;
    }

    public UUID getGenderIdentity() {
        return genderIdentity;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public boolean isActive() {
        return active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public UUID getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public UUID getUpdatedBy() {
        return updatedBy;
    }

    public UUID getCityId() {
        return cityId;
    }
}
