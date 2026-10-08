package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.DiagnosticSystem;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DiagnosticSystemRepository {
    DiagnosticSystem save(DiagnosticSystem entity);
    Optional<DiagnosticSystem> findById(UUID id);
    List<DiagnosticSystem> findAll();
    void deleteById(UUID id);
}
