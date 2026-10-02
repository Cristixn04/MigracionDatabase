package com.backinto.domain.patient.port;

import com.backinto.domain.patient.model.Patient;
import com.backinto.domain.patient.model.PatientId;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {
    Patient save(Patient patient);
    Optional<Patient> findById(PatientId id);
    Optional<Patient> findByEmail(String email);
    Optional<Patient> findByDocumentNumber(String documentNumber);
    List<Patient> findAll();
    void deleteById(PatientId id);
}
