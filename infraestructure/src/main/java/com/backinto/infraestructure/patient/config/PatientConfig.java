package com.backinto.infraestructure.patient.config;

import com.backinto.application.patient.port.in.PatientUseCase;
import com.backinto.application.patient.service.PatientService;
import com.backinto.domain.patient.port.PatientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientConfig {

    @Bean
    public PatientUseCase patientUseCase(PatientRepository patientRepository) {
        return new PatientService(patientRepository);
    }
}
