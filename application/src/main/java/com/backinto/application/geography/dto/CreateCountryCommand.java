package com.backinto.application.geography.dto;

public record CreateCountryCommand(
        String nameCountry,
        String codeCountry,
        String description,
        String telephonePrefix
) {}
