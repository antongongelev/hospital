package ru.hospital.repo;


import org.springframework.data.repository.CrudRepository;
import ru.hospital.domain.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
