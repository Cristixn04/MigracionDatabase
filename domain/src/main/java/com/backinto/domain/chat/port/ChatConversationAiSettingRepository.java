package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatConversationAiSetting;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatConversationAiSettingRepository {
    ChatConversationAiSetting save(ChatConversationAiSetting entity);
    Optional<ChatConversationAiSetting> findById(UUID id);
    List<ChatConversationAiSetting> findAll();
    void deleteById(UUID id);
}
