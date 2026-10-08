package com.backinto.domain.treatment.port;

import com.backinto.domain.treatment.model.TreatmentStatus;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TreatmentStatusRepository {
    TreatmentStatus save(TreatmentStatus entity);
    Optional<TreatmentStatus> findById(UUID id);
    List<TreatmentStatus> findAll();
    void deleteById(UUID id);
}
