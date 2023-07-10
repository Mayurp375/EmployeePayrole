package com.employeepayrole.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Employee {

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

    @Pattern(regexp = "0-9")
    public long sallary;

    public String gender;
    public LocalDate startDate;
    public String note;
    public String profile;
    private List<String> department;
}
