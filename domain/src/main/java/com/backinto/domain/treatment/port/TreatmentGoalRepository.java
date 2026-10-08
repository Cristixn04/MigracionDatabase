package com.backinto.domain.treatment.port;

import com.backinto.domain.treatment.model.TreatmentGoal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TreatmentGoalRepository {
    TreatmentGoal save(TreatmentGoal entity);
    Optional<TreatmentGoal> findById(UUID id);
    List<TreatmentGoal> findAll();
    void deleteById(UUID id);
}
