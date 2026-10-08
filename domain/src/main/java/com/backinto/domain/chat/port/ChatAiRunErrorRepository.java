package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatAiRunError;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatAiRunErrorRepository {
    ChatAiRunError save(ChatAiRunError entity);
    Optional<ChatAiRunError> findById(UUID id);
    List<ChatAiRunError> findAll();
    void deleteById(UUID id);
}
