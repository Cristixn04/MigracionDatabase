package com.backinto.domain.catalogs.port;

import com.backinto.domain.catalogs.model.DocumentType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DocumentTypeRepository {
    DocumentType save(DocumentType entity);
    Optional<DocumentType> findById(UUID id);
    List<DocumentType> findAll();
    void deleteById(UUID id);
}
