package ru.hospital.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hospital.domain.entity.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
