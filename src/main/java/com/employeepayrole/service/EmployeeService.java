package com.employeepayrole.service;

import com.employeepayrole.entity.MyEmployee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    MyEmployee save(MyEmployee employee);
    List<MyEmployee> getAll();
    Optional<MyEmployee> findById(int id);
}
