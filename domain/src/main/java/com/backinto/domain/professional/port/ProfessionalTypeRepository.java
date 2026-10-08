package com.backinto.domain.professional.port;

import com.backinto.domain.professional.model.ProfessionalType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfessionalTypeRepository {
    ProfessionalType save(ProfessionalType entity);
    Optional<ProfessionalType> findById(UUID id);
    List<ProfessionalType> findAll();
    void deleteById(UUID id);
}
