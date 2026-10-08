package com.backinto.infraestructure.clinical.persistence.repository;

import com.backinto.infraestructure.clinical.persistence.entity.ClinicalNoteJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClinicalNoteJpaRepository extends JpaRepository<ClinicalNoteJpaEntity, UUID> {
}
