package com.backinto.infraestructure.treatment.persistence.repository;

import com.backinto.infraestructure.treatment.persistence.entity.TreatmentGoalJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TreatmentGoalJpaRepository extends JpaRepository<TreatmentGoalJpaEntity, UUID> {
}
