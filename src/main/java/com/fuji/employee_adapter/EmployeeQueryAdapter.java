package com.fuji.employee_adapter;

import com.fuji.employee_details.EmployeeDto;
import com.fuji.employee_details.EmployeeQueryRepository;

import java.util.List;

public class EmployeeQueryAdapter implements EmployeeQueryRepository {
    @Override
    public List<EmployeeDto> getEmployees() {
        return null;
    }

    @Override
    public EmployeeDto getEmployee(Long empId, String email, String contact) {
        return null;
    }

    @Override
    public List<EmployeeDto> getEmployeeByName(String empName) {
        return null;
    }

    @Override
    public List<EmployeeDto> getEmployeesByDept(String department, String role) {
        return null;
    }
}
