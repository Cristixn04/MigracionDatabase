package com.backinto.domain.patient.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record PatientId(UUID value) implements Serializable {
    public PatientId {
        Objects.requireNonNull(value, "PatientId value cannot be null");
    }

    public static PatientId of(UUID value) {
        return new PatientId(value);
    }

    public static PatientId generate() {
        return new PatientId(UUID.randomUUID());
    }
}
