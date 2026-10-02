package com.backinto.infraestructure.geography.rest;

import com.backinto.application.geography.dto.CountryResponse;
import com.backinto.application.geography.dto.CreateCountryCommand;
import com.backinto.application.geography.port.in.CountryUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {

    private final CountryUseCase countryUseCase;

    public CountryController(CountryUseCase countryUseCase) {
        this.countryUseCase = countryUseCase;
    }

    @PostMapping
    public ResponseEntity<CountryResponse> createCountry(@RequestBody CreateCountryCommand command) {
        CountryResponse response = countryUseCase.createCountry(command);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<CountryResponse>> getAllCountries() {
        return ResponseEntity.ok(countryUseCase.getAllCountries());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryResponse> getCountryById(@PathVariable UUID id) {
        return ResponseEntity.ok(countryUseCase.getCountryById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCountry(@PathVariable UUID id) {
        countryUseCase.deleteCountry(id);
        return ResponseEntity.noContent().build();
    }
}
