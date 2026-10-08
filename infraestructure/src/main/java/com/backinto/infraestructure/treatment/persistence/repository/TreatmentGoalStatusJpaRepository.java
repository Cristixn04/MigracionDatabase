package com.backinto.infraestructure.treatment.persistence.repository;

import com.backinto.infraestructure.treatment.persistence.entity.TreatmentGoalStatusJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TreatmentGoalStatusJpaRepository extends JpaRepository<TreatmentGoalStatusJpaEntity, UUID> {
}
