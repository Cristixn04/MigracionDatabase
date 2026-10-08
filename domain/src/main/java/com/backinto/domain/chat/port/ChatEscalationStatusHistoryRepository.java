package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatEscalationStatusHistory;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatEscalationStatusHistoryRepository {
    ChatEscalationStatusHistory save(ChatEscalationStatusHistory entity);
    Optional<ChatEscalationStatusHistory> findById(UUID id);
    List<ChatEscalationStatusHistory> findAll();
    void deleteById(UUID id);
}
