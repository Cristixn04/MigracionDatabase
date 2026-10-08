package com.backinto.infraestructure.treatment.persistence.repository;

import com.backinto.infraestructure.treatment.persistence.entity.TreatmentPlanJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TreatmentPlanJpaRepository extends JpaRepository<TreatmentPlanJpaEntity, UUID> {
}
