package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.ClinicalRecord;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClinicalRecordRepository {
    ClinicalRecord save(ClinicalRecord entity);
    Optional<ClinicalRecord> findById(UUID id);
    List<ClinicalRecord> findAll();
    void deleteById(UUID id);
}
