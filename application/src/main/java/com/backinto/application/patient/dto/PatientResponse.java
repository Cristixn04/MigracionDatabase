package com.backinto.application.patient.dto;

import com.backinto.domain.patient.model.Patient;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record PatientResponse(
        UUID id,
        UUID documentTypeId,
        String documentNumber,
        String firstName,
        String middleName,
        String lastName,
        String secondLastName,
        LocalDate birthDate,
        UUID biologicalSexId,
        UUID genderIdentity,
        String email,
        String phone,
        String address,
        boolean active,
        LocalDateTime createdAt,
        UUID createdBy,
        LocalDateTime updatedAt,
        UUID updatedBy,
        UUID cityId
) {
    public static PatientResponse fromDomain(Patient patient) {
        return new PatientResponse(
                patient.getId().value(),
                patient.getDocumentTypeId(),
                patient.getDocumentNumber(),
                patient.getFirstName(),
                patient.getMiddleName(),
                patient.getLastName(),
                patient.getSecondLastName(),
                patient.getBirthDate(),
                patient.getBiologicalSexId(),
                patient.getGenderIdentity(),
                patient.getEmail(),
                patient.getPhone(),
                patient.getAddress(),
                patient.isActive(),
                patient.getCreatedAt(),
                patient.getCreatedBy(),
                patient.getUpdatedAt(),
                patient.getUpdatedBy(),
                patient.getCityId()
        );
    }
}
