package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.MedicationRoute;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MedicationRouteRepository {
    MedicationRoute save(MedicationRoute entity);
    Optional<MedicationRoute> findById(UUID id);
    List<MedicationRoute> findAll();
    void deleteById(UUID id);
}
