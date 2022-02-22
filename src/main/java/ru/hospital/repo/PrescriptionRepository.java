package ru.hospital.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hospital.domain.entity.Prescription;

public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {
}
