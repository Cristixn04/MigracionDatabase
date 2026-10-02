package com.backinto.application.patient.port.in;

import com.backinto.application.patient.dto.CreatePatientCommand;
import com.backinto.application.patient.dto.PatientResponse;

import java.util.List;
import java.util.UUID;

public interface PatientUseCase {
    PatientResponse createPatient(CreatePatientCommand command);
    PatientResponse getPatientById(UUID id);
    List<PatientResponse> getAllPatients();
    void deletePatient(UUID id);
}
