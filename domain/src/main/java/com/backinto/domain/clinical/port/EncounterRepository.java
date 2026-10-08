package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.Encounter;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EncounterRepository {
    Encounter save(Encounter entity);
    Optional<Encounter> findById(UUID id);
    List<Encounter> findAll();
    void deleteById(UUID id);
}
