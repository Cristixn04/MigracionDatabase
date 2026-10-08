package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.Priority;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PriorityRepository {
    Priority save(Priority entity);
    Optional<Priority> findById(UUID id);
    List<Priority> findAll();
    void deleteById(UUID id);
}
