package com.backinto.domain.patient.port;

import com.backinto.domain.patient.model.PatientContact;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PatientContactRepository {
    PatientContact save(PatientContact entity);
    Optional<PatientContact> findById(UUID id);
    List<PatientContact> findAll();
    void deleteById(UUID id);
}
