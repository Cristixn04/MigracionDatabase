package com.backinto.domain.catalogs.port;

import com.backinto.domain.catalogs.model.RelationshipType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RelationshipTypeRepository {
    RelationshipType save(RelationshipType entity);
    Optional<RelationshipType> findById(UUID id);
    List<RelationshipType> findAll();
    void deleteById(UUID id);
}
