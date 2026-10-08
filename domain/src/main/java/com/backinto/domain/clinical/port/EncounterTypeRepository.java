package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.EncounterType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EncounterTypeRepository {
    EncounterType save(EncounterType entity);
    Optional<EncounterType> findById(UUID id);
    List<EncounterType> findAll();
    void deleteById(UUID id);
}
