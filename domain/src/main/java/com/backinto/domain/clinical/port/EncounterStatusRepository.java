package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.EncounterStatus;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EncounterStatusRepository {
    EncounterStatus save(EncounterStatus entity);
    Optional<EncounterStatus> findById(UUID id);
    List<EncounterStatus> findAll();
    void deleteById(UUID id);
}
