package com.fuji;

import com.fuji.employee_adapter.Employee;
import com.fuji.employee_details.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeTestDataProvider {

    public static EmployeeDto getEmployeeDto(){
        return EmployeeDto
                .builder()
                .address("SINGAPORE")
                .email("maruthi@gmail.com")
                .citizenship("INDIAN")
                .firstName("maruthi")
                .lastName("sayampu")
                .gender("male")
                .martialStatus("married")
                .nationality("indian")
                .empId(259689L)
                .build();
    }

    public static Employee getEmployee(){
        return Employee
                .builder()
                .address("SINGAPORE")
                .email("maruthi@gmail.com")
                .citizenship("INDIAN")
                .firstName("maruthi")
                .lastName("sayampu")
                .gender("male")
                .martialStatus("married")
                .nationality("indian")
                .empId(259689L)
                .build();
    }
}
