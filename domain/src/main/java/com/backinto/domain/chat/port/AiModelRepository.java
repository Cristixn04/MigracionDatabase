package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.AiModel;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AiModelRepository {
    AiModel save(AiModel entity);
    Optional<AiModel> findById(UUID id);
    List<AiModel> findAll();
    void deleteById(UUID id);
}
