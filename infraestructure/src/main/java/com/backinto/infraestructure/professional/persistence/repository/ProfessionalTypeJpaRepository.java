package com.backinto.infraestructure.professional.persistence.repository;

import com.backinto.infraestructure.professional.persistence.entity.ProfessionalTypeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProfessionalTypeJpaRepository extends JpaRepository<ProfessionalTypeJpaEntity, UUID> {
}
