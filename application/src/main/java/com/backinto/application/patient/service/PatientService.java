package com.backinto.application.patient.service;

import com.backinto.application.patient.dto.CreatePatientCommand;
import com.backinto.application.patient.dto.PatientResponse;
import com.backinto.application.patient.port.in.PatientUseCase;
import com.backinto.domain.patient.model.Patient;
import com.backinto.domain.patient.model.PatientId;
import com.backinto.domain.patient.port.PatientRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public class PatientService implements PatientUseCase {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public PatientResponse createPatient(CreatePatientCommand command) {
        Patient patient = Patient.create(
                command.documentTypeId(),
                command.documentNumber(),
                command.firstName(),
                command.middleName(),
                command.lastName(),
                command.secondLastName(),
                command.birthDate(),
                command.biologicalSexId(),
                command.genderIdentity(),
                command.email(),
                command.phone(),
                command.address(),
                command.createdBy(),
                command.cityId()
        );
        Patient saved = patientRepository.save(patient);
        return PatientResponse.fromDomain(saved);
    }

    @Override
    public PatientResponse getPatientById(UUID id) {
        return patientRepository.findById(PatientId.of(id))
                .map(PatientResponse::fromDomain)
                .orElseThrow(() -> new NoSuchElementException("Patient not found with ID: " + id));
    }

    @Override
    public List<PatientResponse> getAllPatients() {
        return patientRepository.findAll().stream()
                .map(PatientResponse::fromDomain)
                .toList();
    }

    @Override
    public void deletePatient(UUID id) {
        patientRepository.deleteById(PatientId.of(id));
    }
}
