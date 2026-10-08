package com.backinto.infraestructure.professional.persistence.repository;

import com.backinto.infraestructure.professional.persistence.entity.ProfessionalStudyJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProfessionalStudyJpaRepository extends JpaRepository<ProfessionalStudyJpaEntity, UUID> {
}
