package com.backinto.application.patient.dto;

import java.time.LocalDate;
import java.util.UUID;

public record CreatePatientCommand(
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
        UUID createdBy,
        UUID cityId
) {}
