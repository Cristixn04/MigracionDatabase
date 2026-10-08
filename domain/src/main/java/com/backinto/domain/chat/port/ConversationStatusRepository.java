package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ConversationStatus;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ConversationStatusRepository {
    ConversationStatus save(ConversationStatus entity);
    Optional<ConversationStatus> findById(UUID id);
    List<ConversationStatus> findAll();
    void deleteById(UUID id);
}
