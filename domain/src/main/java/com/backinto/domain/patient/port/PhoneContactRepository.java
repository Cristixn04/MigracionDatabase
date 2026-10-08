package com.backinto.domain.patient.port;

import com.backinto.domain.patient.model.PhoneContact;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PhoneContactRepository {
    PhoneContact save(PhoneContact entity);
    Optional<PhoneContact> findById(UUID id);
    List<PhoneContact> findAll();
    void deleteById(UUID id);
}
