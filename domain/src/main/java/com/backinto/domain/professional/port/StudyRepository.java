package com.backinto.domain.professional.port;

import com.backinto.domain.professional.model.Study;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudyRepository {
    Study save(Study entity);
    Optional<Study> findById(UUID id);
    List<Study> findAll();
    void deleteById(UUID id);
}
