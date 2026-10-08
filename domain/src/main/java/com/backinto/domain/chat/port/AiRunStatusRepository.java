package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.AiRunStatus;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AiRunStatusRepository {
    AiRunStatus save(AiRunStatus entity);
    Optional<AiRunStatus> findById(UUID id);
    List<AiRunStatus> findAll();
    void deleteById(UUID id);
}
