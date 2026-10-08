package com.backinto.infraestructure.chat.persistence.repository;

import com.backinto.infraestructure.chat.persistence.entity.EscalationStatusJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EscalationStatusJpaRepository extends JpaRepository<EscalationStatusJpaEntity, UUID> {
}
