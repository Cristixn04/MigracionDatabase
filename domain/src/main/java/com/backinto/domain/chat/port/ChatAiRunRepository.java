package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatAiRun;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatAiRunRepository {
    ChatAiRun save(ChatAiRun entity);
    Optional<ChatAiRun> findById(UUID id);
    List<ChatAiRun> findAll();
    void deleteById(UUID id);
}
