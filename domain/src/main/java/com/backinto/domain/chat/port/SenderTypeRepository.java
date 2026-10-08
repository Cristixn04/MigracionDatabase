package com.backinto.domain.chat.port;

import com.backinto.domain.chat.model.SenderType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SenderTypeRepository {
    SenderType save(SenderType entity);
    Optional<SenderType> findById(UUID id);
    List<SenderType> findAll();
    void deleteById(UUID id);
}
