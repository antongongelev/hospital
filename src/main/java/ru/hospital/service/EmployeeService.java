package ru.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hospital.domain.entity.Employee;
import ru.hospital.repo.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;


    public List<Employee> getAll() {
        return (List<Employee>) repository.findAll();
    }
}
