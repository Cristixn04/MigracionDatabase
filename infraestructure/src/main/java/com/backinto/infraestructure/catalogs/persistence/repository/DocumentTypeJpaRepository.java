package com.backinto.infraestructure.catalogs.persistence.repository;

import com.backinto.infraestructure.catalogs.persistence.entity.DocumentTypeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DocumentTypeJpaRepository extends JpaRepository<DocumentTypeJpaEntity, UUID> {
}
