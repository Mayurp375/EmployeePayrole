package com.employeepayrole.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z\\s]{2,}$",
            message = "Employee name Invalid")
    private String name;

   @NotNull(message = "pass valid Contact")
    public long contact;

    @Min(value = 500,message = "Min vage should 500")
    private long sallary;

    @Pattern(regexp = "male|female",
            message = "gender need to be male or female")
    public String gender;

    @Min(18)
    @Max(60)
    public float age;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @NotNull(message = "start date should not empty")
    @PastOrPresent(message = "startdate should be past or today")
    public Date startdate = new Date();

    @NotBlank(message = "note can note blank")
    public String note;

    @NotBlank(message = "profile can note empty")
    public String profilpic;

    @NotNull(message = "department should not empty")
    public List<String> department = new ArrayList<>();
}