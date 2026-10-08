package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.AssessmentType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AssessmentTypeRepository {
    AssessmentType save(AssessmentType entity);
    Optional<AssessmentType> findById(UUID id);
    List<AssessmentType> findAll();
    void deleteById(UUID id);
}
