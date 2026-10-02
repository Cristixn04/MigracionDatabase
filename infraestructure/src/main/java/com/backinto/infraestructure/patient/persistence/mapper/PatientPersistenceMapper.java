package com.backinto.infraestructure.patient.persistence.mapper;

import com.backinto.domain.patient.model.Patient;
import com.backinto.domain.patient.model.PatientId;
import com.backinto.infraestructure.patient.persistence.entity.PatientJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class PatientPersistenceMapper {

    public Patient toDomain(PatientJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Patient(
                PatientId.of(entity.getId()),
                entity.getDocumentTypeId(),
                entity.getDocumentNumber(),
                entity.getFirstName(),
                entity.getMiddleName(),
                entity.getLastName(),
                entity.getSecondLastName(),
                entity.getBirthDate(),
                entity.getBiologicalSexId(),
                entity.getGenderIdentity(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getAddress(),
                entity.isActive(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getUpdatedAt(),
                entity.getUpdatedBy(),
                entity.getCityId()
        );
    }

    public PatientJpaEntity toEntity(Patient domain) {
        if (domain == null) {
            return null;
        }
        return new PatientJpaEntity(
                domain.getId().value(),
                domain.getDocumentTypeId(),
                domain.getDocumentNumber(),
                domain.getFirstName(),
                domain.getMiddleName(),
                domain.getLastName(),
                domain.getSecondLastName(),
                domain.getBirthDate(),
                domain.getBiologicalSexId(),
                domain.getGenderIdentity(),
                domain.getEmail(),
                domain.getPhone(),
                domain.getAddress(),
                domain.isActive(),
                domain.getCreatedAt(),
                domain.getCreatedBy(),
                domain.getUpdatedAt(),
                domain.getUpdatedBy(),
                domain.getCityId()
        );
    }
}
