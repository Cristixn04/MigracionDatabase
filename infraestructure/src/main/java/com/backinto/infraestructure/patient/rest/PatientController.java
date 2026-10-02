package com.backinto.infraestructure.patient.rest;

import com.backinto.application.patient.dto.CreatePatientCommand;
import com.backinto.application.patient.dto.PatientResponse;
import com.backinto.application.patient.port.in.PatientUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final PatientUseCase patientUseCase;

    public PatientController(PatientUseCase patientUseCase) {
        this.patientUseCase = patientUseCase;
    }

    @PostMapping
    public ResponseEntity<PatientResponse> createPatient(@RequestBody CreatePatientCommand command) {
        PatientResponse response = patientUseCase.createPatient(command);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<PatientResponse>> getAllPatients() {
        return ResponseEntity.ok(patientUseCase.getAllPatients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientResponse> getPatientById(@PathVariable UUID id) {
        return ResponseEntity.ok(patientUseCase.getPatientById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable UUID id) {
        patientUseCase.deletePatient(id);
        return ResponseEntity.noContent().build();
    }
}
