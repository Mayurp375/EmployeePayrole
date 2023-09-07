package com.employeepayrole.entity;

import com.employeepayrole.dto.EmployeeDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class MyEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;
    public long contact;
    public float age;
    public long salary;
    public String gender;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    public Date startDate= new Date();
    public String note;
    public String profile;

    @ElementCollection
    private List<String> department= new ArrayList<>();
    public MyEmployee(EmployeeDTO employeeDTO) {

        this.name = employeeDTO.getName();
        this.contact = employeeDTO.getContact();
        this.age = employeeDTO.getAge();
        this.salary = employeeDTO.getSallary();
        this.startDate = employeeDTO.getStartdate();
        this.note = employeeDTO.getNote();
        this.profile = employeeDTO.getProfilpic();
        this.department = employeeDTO.getDepartment();
        this.gender=employeeDTO.getGender();

    }
}
