package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatEscalation;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatEscalationRepository {
    ChatEscalation save(ChatEscalation entity);
    Optional<ChatEscalation> findById(UUID id);
    List<ChatEscalation> findAll();
    void deleteById(UUID id);
}
