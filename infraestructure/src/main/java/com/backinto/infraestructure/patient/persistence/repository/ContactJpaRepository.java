package com.backinto.infraestructure.patient.persistence.repository;

import com.backinto.infraestructure.patient.persistence.entity.ContactJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContactJpaRepository extends JpaRepository<ContactJpaEntity, UUID> {
}
