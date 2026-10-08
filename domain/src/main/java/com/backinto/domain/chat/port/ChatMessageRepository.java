package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatMessage;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatMessageRepository {
    ChatMessage save(ChatMessage entity);
    Optional<ChatMessage> findById(UUID id);
    List<ChatMessage> findAll();
    void deleteById(UUID id);
}
