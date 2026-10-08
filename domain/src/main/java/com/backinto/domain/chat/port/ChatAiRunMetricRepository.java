package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatAiRunMetric;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatAiRunMetricRepository {
    ChatAiRunMetric save(ChatAiRunMetric entity);
    Optional<ChatAiRunMetric> findById(UUID id);
    List<ChatAiRunMetric> findAll();
    void deleteById(UUID id);
}
