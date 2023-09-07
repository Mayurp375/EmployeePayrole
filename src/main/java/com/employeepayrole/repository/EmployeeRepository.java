package com.employeepayrole.repository;

import com.employeepayrole.entity.MyEmployee;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<MyEmployee, Integer> {
}
