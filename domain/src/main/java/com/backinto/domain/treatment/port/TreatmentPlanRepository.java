package com.backinto.domain.treatment.port;

import com.backinto.domain.treatment.model.TreatmentPlan;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TreatmentPlanRepository {
    TreatmentPlan save(TreatmentPlan entity);
    Optional<TreatmentPlan> findById(UUID id);
    List<TreatmentPlan> findAll();
    void deleteById(UUID id);
}
