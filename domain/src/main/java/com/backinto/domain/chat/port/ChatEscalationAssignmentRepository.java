package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.ChatEscalationAssignment;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChatEscalationAssignmentRepository {
    ChatEscalationAssignment save(ChatEscalationAssignment entity);
    Optional<ChatEscalationAssignment> findById(UUID id);
    List<ChatEscalationAssignment> findAll();
    void deleteById(UUID id);
}
