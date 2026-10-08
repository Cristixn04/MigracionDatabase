package com.backinto.domain.clinical.port;

import com.backinto.domain.clinical.model.MentalStatusExam;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MentalStatusExamRepository {
    MentalStatusExam save(MentalStatusExam entity);
    Optional<MentalStatusExam> findById(UUID id);
    List<MentalStatusExam> findAll();
    void deleteById(UUID id);
}
