package com.backinto.domain.catalogs.port;

import com.backinto.domain.catalogs.model.Gender;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GenderRepository {
    Gender save(Gender entity);
    Optional<Gender> findById(UUID id);
    List<Gender> findAll();
    void deleteById(UUID id);
}
