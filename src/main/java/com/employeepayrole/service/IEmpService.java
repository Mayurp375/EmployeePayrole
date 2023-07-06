package com.employeepayrole.service;

import com.employeepayrole.dto.EmployeeDTO;
import com.employeepayrole.entity.Employee;
import com.employeepayrole.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IEmpService implements EmpService{

    @Autowired
    EmployeeRepo empRepo;
    @Autowired
    EmployeeDTO employeeDTO;

    public Employee addData(Employee employee)
    {
         employee = Employee.builder().id(employee.getId())
                                            .name(employee.getName())
                                            .contact(employee.getContact()).age(employee.getAge()).build();
        return empRepo.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        System.out.println("success");
        return empRepo.findAll();
    }

    @Override
    public Optional<Employee> getById(int id) {

        return empRepo.findById(id);
    }
}
