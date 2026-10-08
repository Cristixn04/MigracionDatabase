package com.backinto.infraestructure.clinical.persistence.repository;

import com.backinto.infraestructure.clinical.persistence.entity.ClinicalRecordStatusJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClinicalRecordStatusJpaRepository extends JpaRepository<ClinicalRecordStatusJpaEntity, UUID> {
}
