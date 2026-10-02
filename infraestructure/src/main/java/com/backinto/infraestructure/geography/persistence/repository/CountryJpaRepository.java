package com.backinto.infraestructure.geography.persistence.repository;

import com.backinto.infraestructure.geography.persistence.entity.CountryJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CountryJpaRepository extends JpaRepository<CountryJpaEntity, UUID> {
    Optional<CountryJpaEntity> findByCodeCountry(String codeCountry);
}
