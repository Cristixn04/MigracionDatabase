package com.backinto.infraestructure.clinical.persistence.repository;

import com.backinto.infraestructure.clinical.persistence.entity.EncounterJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EncounterJpaRepository extends JpaRepository<EncounterJpaEntity, UUID> {
}
