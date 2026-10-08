package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ProviderModelAi;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProviderModelAiRepository {
    ProviderModelAi save(ProviderModelAi entity);
    Optional<ProviderModelAi> findById(UUID id);
    List<ProviderModelAi> findAll();
    void deleteById(UUID id);
}
