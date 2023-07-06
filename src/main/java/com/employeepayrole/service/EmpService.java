package com.employeepayrole.service;


import com.employeepayrole.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmpService {
    public Employee addData(Employee employee);

    public List<Employee> getAll();

    public Optional<Employee> getById(int id);
}
