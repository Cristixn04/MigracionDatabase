package com.backinto.infraestructure.geography.persistence.repository;

import com.backinto.infraestructure.geography.persistence.entity.CityMunicipalityJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CityMunicipalityJpaRepository extends JpaRepository<CityMunicipalityJpaEntity, UUID> {
}
