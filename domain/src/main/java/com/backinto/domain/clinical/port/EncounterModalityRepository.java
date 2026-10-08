package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.EncounterModality;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EncounterModalityRepository {
    EncounterModality save(EncounterModality entity);
    Optional<EncounterModality> findById(UUID id);
    List<EncounterModality> findAll();
    void deleteById(UUID id);
}
