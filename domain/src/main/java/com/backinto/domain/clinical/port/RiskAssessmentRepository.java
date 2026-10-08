package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.RiskAssessment;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RiskAssessmentRepository {
    RiskAssessment save(RiskAssessment entity);
    Optional<RiskAssessment> findById(UUID id);
    List<RiskAssessment> findAll();
    void deleteById(UUID id);
}
