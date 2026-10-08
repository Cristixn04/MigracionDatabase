package com.backinto.infraestructure.catalogs.persistence.repository;

import com.backinto.infraestructure.catalogs.persistence.entity.GenderJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GenderJpaRepository extends JpaRepository<GenderJpaEntity, UUID> {
}
