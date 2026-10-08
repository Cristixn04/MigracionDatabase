package com.backinto.infraestructure.clinical.persistence.repository;

import com.backinto.infraestructure.clinical.persistence.entity.DiagnosticSystemJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DiagnosticSystemJpaRepository extends JpaRepository<DiagnosticSystemJpaEntity, UUID> {
}
