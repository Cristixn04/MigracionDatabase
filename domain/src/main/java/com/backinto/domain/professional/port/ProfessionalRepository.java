package com.backinto.domain.professional.port;

import com.backinto.domain.professional.model.Professional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfessionalRepository {
    Professional save(Professional entity);
    Optional<Professional> findById(UUID id);
    List<Professional> findAll();
    void deleteById(UUID id);
}
