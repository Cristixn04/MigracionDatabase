package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.EscalationStatus;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EscalationStatusRepository {
    EscalationStatus save(EscalationStatus entity);
    Optional<EscalationStatus> findById(UUID id);
    List<EscalationStatus> findAll();
    void deleteById(UUID id);
}
