package com.backinto.domain.patient.port;

import com.backinto.domain.patient.model.PatientAllergy;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PatientAllergyRepository {
    PatientAllergy save(PatientAllergy entity);
    Optional<PatientAllergy> findById(UUID id);
    List<PatientAllergy> findAll();
    void deleteById(UUID id);
}
