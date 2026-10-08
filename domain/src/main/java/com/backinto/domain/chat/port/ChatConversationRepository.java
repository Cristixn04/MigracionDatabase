package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatConversation;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatConversationRepository {
    ChatConversation save(ChatConversation entity);
    Optional<ChatConversation> findById(UUID id);
    List<ChatConversation> findAll();
    void deleteById(UUID id);
}
