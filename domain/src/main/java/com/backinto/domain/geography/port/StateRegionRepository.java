package com.backinto.domain.geography.port;

import com.backinto.domain.geography.model.StateRegion;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StateRegionRepository {
    StateRegion save(StateRegion entity);
    Optional<StateRegion> findById(UUID id);
    List<StateRegion> findAll();
    void deleteById(UUID id);
}
