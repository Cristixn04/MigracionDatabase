package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.ClinicalNote;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClinicalNoteRepository {
    ClinicalNote save(ClinicalNote entity);
    Optional<ClinicalNote> findById(UUID id);
    List<ClinicalNote> findAll();
    void deleteById(UUID id);
}
