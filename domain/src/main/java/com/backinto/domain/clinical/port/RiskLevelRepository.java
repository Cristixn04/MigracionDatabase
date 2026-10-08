package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.RiskLevel;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RiskLevelRepository {
    RiskLevel save(RiskLevel entity);
    Optional<RiskLevel> findById(UUID id);
    List<RiskLevel> findAll();
    void deleteById(UUID id);
}
