package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.MessageType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MessageTypeRepository {
    MessageType save(MessageType entity);
    Optional<MessageType> findById(UUID id);
    List<MessageType> findAll();
    void deleteById(UUID id);
}
