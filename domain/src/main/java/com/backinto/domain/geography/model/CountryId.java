package com.backinto.domain.geography.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record CountryId(UUID value) implements Serializable {
    public CountryId {
        Objects.requireNonNull(value, "CountryId value must not be null");
    }

    public static CountryId of(UUID value) {
        return new CountryId(value);
    }

    public static CountryId generate() {
        return new CountryId(UUID.randomUUID());
    }
}
