package com.employeepayrole.entity;

import com.employeepayrole.dto.EmployeeDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

@Entity
public class MyEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @NotNull(message = "pass valid name")
    public String name;

    @NotNull(message = "pass valid Contact")
    public long contact;

    @Min(18)
    @Max(60)
    public float age;


    public long sallary;

    public String gender;
    public Date startDate;
    public String note;
    public String profile;

    private List<Department> department;

    public MyEmployee(EmployeeDTO employeeDTO) {

        this.name = employeeDTO.getName();
        this.contact = employeeDTO.getContact();
        this.age = employeeDTO.getAge();
        this.sallary = employeeDTO.getSallary();
        this.startDate = employeeDTO.getStartdate();
        this.note = employeeDTO.getNote();
        this.profile = employeeDTO.getProfilpic();
        this.department = employeeDTO.getDepartment();
    }
}
