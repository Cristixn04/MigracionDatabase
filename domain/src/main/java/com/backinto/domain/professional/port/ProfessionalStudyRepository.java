package com.backinto.domain.professional.port;

import com.backinto.domain.professional.model.ProfessionalStudy;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfessionalStudyRepository {
    ProfessionalStudy save(ProfessionalStudy entity);
    Optional<ProfessionalStudy> findById(UUID id);
    List<ProfessionalStudy> findAll();
    void deleteById(UUID id);
}
