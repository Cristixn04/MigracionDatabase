package com.backinto.domain.treatment.port;

import com.backinto.domain.treatment.model.TreatmentGoalStatus;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TreatmentGoalStatusRepository {
    TreatmentGoalStatus save(TreatmentGoalStatus entity);
    Optional<TreatmentGoalStatus> findById(UUID id);
    List<TreatmentGoalStatus> findAll();
    void deleteById(UUID id);
}
