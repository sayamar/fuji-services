package com.fuji.employee_details;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
public class EmployeeDto {

    private Long empId;
    private String firstName;
    private String lastName;
    private String martialStatus;
    private String mobile;
    private String address;
    private String citizenship;
    private String nationality;
    private LocalDate dateOfBirth;
    private String gender;
    private String email;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

}
