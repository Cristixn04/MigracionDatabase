package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.ConsentType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ConsentTypeRepository {
    ConsentType save(ConsentType entity);
    Optional<ConsentType> findById(UUID id);
    List<ConsentType> findAll();
    void deleteById(UUID id);
}
