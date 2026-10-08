package com.backinto.domain.patient.port;

import com.backinto.domain.patient.model.Contact;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ContactRepository {
    Contact save(Contact entity);
    Optional<Contact> findById(UUID id);
    List<Contact> findAll();
    void deleteById(UUID id);
}
