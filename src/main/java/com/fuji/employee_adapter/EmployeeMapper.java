package com.fuji.employee_adapter;

import com.fuji.employee_details.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class EmployeeMapper {

    public Employee toEmployee(EmployeeDto employeeDto){
        return Employee
                .builder()
                .citizenship(employeeDto.getCitizenship())
                .firstName(employeeDto.getFirstName())
                .lastName(employeeDto.getLastName())
                .address(employeeDto.getAddress())
                .createdOn(LocalDateTime.now())
                .empId(employeeDto.getEmpId())
                .martialStatus(employeeDto.getMartialStatus())
                .email(employeeDto.getEmail())
                .gender(employeeDto.getGender())
                .nationality(employeeDto.getNationality())
                .mobile(employeeDto.getMobile())
                .build();

    }

    public EmployeeDto toEmployeeDto(Employee employee){
        return EmployeeDto
                .builder()
                .citizenship(employee.getCitizenship())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .address(employee.getAddress())
                .createdOn(employee.getCreatedOn())
                .empId(employee.getEmpId())
                .martialStatus(employee.getMartialStatus())
                .nationality(employee.getNationality())
                .email(employee.getEmail())
                .gender(employee.getGender())
                .mobile(employee.getMobile())
                .build();

    }
}
