package ru.hospital.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hospital.domain.entity.Treatment;

public interface TreatmentRepository extends CrudRepository<Treatment, Long> {
}
