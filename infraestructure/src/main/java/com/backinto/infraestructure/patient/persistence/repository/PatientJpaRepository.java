package com.backinto.infraestructure.patient.persistence.repository;

import com.backinto.infraestructure.patient.persistence.entity.PatientJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PatientJpaRepository extends JpaRepository<PatientJpaEntity, UUID> {
    Optional<PatientJpaEntity> findByEmail(String email);
    Optional<PatientJpaEntity> findByDocumentNumber(String documentNumber);
}
