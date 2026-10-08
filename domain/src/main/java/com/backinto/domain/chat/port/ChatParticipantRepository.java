package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatParticipant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatParticipantRepository {
    ChatParticipant save(ChatParticipant entity);
    Optional<ChatParticipant> findById(UUID id);
    List<ChatParticipant> findAll();
    void deleteById(UUID id);
}
