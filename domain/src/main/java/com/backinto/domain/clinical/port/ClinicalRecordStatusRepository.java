package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.ClinicalRecordStatus;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClinicalRecordStatusRepository {
    ClinicalRecordStatus save(ClinicalRecordStatus entity);
    Optional<ClinicalRecordStatus> findById(UUID id);
    List<ClinicalRecordStatus> findAll();
    void deleteById(UUID id);
}
