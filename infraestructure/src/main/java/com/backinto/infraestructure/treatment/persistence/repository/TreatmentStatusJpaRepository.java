package com.backinto.infraestructure.treatment.persistence.repository;

import com.backinto.infraestructure.treatment.persistence.entity.TreatmentStatusJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TreatmentStatusJpaRepository extends JpaRepository<TreatmentStatusJpaEntity, UUID> {
}
