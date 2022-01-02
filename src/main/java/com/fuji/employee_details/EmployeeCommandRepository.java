package com.fuji.employee_details;

public interface EmployeeCommandRepository {

    EmployeeDto create(EmployeeDto employeeDto);
    EmployeeDto update(EmployeeDto employeeDto);
    void delete(Long empId);
}
