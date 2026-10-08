package com.backinto.domain.patient.port;

import com.backinto.domain.patient.model.EmailContact;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmailContactRepository {
    EmailContact save(EmailContact entity);
    Optional<EmailContact> findById(UUID id);
    List<EmailContact> findAll();
    void deleteById(UUID id);
}
