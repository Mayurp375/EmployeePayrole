package com.employeepayrole.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class EmployeeDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z\\s]{2,}$",
            message = "Employee name Invalid")
    private String name;
    @Min(value = 500,message = "Min vage should 500")
    private long sallary;

    @Pattern(regexp = "male|female",
            message = "gender need to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd mm yyyy")
    @NotNull(message = "start date should not empty")
    @PastOrPresent(message = "startdate should be past or today")
    public LocalDate startdate;

    @NotBlank(message = "note can note blank")
    public String note;

    @NotBlank(message = "profile can note empty")
    public String profilpic;

    @NotNull(message = "department should not empty")
    public List<String> department;
}