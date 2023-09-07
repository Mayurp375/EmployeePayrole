package com.employeepayrole.service;

import com.employeepayrole.entity.MyEmployee;
import com.employeepayrole.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public MyEmployee save(MyEmployee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<MyEmployee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<MyEmployee> findById(int id) {
        return employeeRepository.findById(id);
    }
}
