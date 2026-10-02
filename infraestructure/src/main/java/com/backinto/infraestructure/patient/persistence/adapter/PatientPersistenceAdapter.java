package com.backinto.infraestructure.patient.persistence.adapter;

import com.backinto.domain.patient.model.Patient;
import com.backinto.domain.patient.model.PatientId;
import com.backinto.domain.patient.port.PatientRepository;
import com.backinto.infraestructure.patient.persistence.entity.PatientJpaEntity;
import com.backinto.infraestructure.patient.persistence.mapper.PatientPersistenceMapper;
import com.backinto.infraestructure.patient.persistence.repository.PatientJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PatientPersistenceAdapter implements PatientRepository {

    private final PatientJpaRepository patientJpaRepository;
    private final PatientPersistenceMapper patientPersistenceMapper;

    public PatientPersistenceAdapter(PatientJpaRepository patientJpaRepository,
                                     PatientPersistenceMapper patientPersistenceMapper) {
        this.patientJpaRepository = patientJpaRepository;
        this.patientPersistenceMapper = patientPersistenceMapper;
    }

    @Override
    public Patient save(Patient patient) {
        PatientJpaEntity entity = patientPersistenceMapper.toEntity(patient);
        PatientJpaEntity saved = patientJpaRepository.save(entity);
        return patientPersistenceMapper.toDomain(saved);
    }

    @Override
    public Optional<Patient> findById(PatientId id) {
        return patientJpaRepository.findById(id.value())
                .map(patientPersistenceMapper::toDomain);
    }

    @Override
    public Optional<Patient> findByEmail(String email) {
        return patientJpaRepository.findByEmail(email)
                .map(patientPersistenceMapper::toDomain);
    }

    @Override
    public Optional<Patient> findByDocumentNumber(String documentNumber) {
        return patientJpaRepository.findByDocumentNumber(documentNumber)
                .map(patientPersistenceMapper::toDomain);
    }

    @Override
    public List<Patient> findAll() {
        return patientJpaRepository.findAll().stream()
                .map(patientPersistenceMapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(PatientId id) {
        patientJpaRepository.deleteById(id.value());
    }
}
