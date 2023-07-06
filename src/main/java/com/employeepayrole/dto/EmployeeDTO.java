package com.employeepayrole.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class EmployeeDTO {


    private String name;
    private long sallary;

}