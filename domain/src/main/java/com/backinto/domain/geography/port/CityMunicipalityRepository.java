package com.backinto.domain.geography.port;

import com.backinto.domain.geography.model.CityMunicipality;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CityMunicipalityRepository {
    CityMunicipality save(CityMunicipality entity);
    Optional<CityMunicipality> findById(UUID id);
    List<CityMunicipality> findAll();
    void deleteById(UUID id);
}
