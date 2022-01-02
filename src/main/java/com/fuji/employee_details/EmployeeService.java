package com.fuji.employee_details;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> getEmployees();
    EmployeeDto getEmployee(Long empId);
    EmployeeDto create(EmployeeDto employeeDto);
    EmployeeDto update(EmployeeDto employeeDto);
    void delete(Long empId); // Soft delete

}
