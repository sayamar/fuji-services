package com.fuji.employee_details;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class EmployeeServiceAdapter implements  EmployeeService {

    private final EmployeeCommandRepository employeeCommandRepository;

    @Override
    public List<EmployeeDto> getEmployees() {
        return null;
    }

    @Override
    public EmployeeDto getEmployee(Long empId) {
        return null;
    }

    @Override
    public EmployeeDto create(EmployeeDto employeeDto) {
        return this.employeeCommandRepository.create(employeeDto);
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        return this.employeeCommandRepository.update(employeeDto);
    }

    @Override
    public void delete(Long empId) {
        log.info("Deleting the record {} ",empId);
         this.employeeCommandRepository.delete(empId);
    }
}
