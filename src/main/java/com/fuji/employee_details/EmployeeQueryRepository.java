package com.fuji.employee_details;

import java.util.List;

public interface EmployeeQueryRepository {

    List<EmployeeDto> getEmployees();
    EmployeeDto getEmployee(Long empId, String email, String contact);
    // Like similar way
    List<EmployeeDto> getEmployeeByName(String empName);
    List<EmployeeDto> getEmployeesByDept(String department, String role);


}
