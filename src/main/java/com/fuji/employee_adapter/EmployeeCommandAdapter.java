package com.fuji.employee_adapter;

import com.fuji.employee_details.EmployeeCommandRepository;
import com.fuji.employee_details.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@AllArgsConstructor
@Slf4j
public class EmployeeCommandAdapter implements EmployeeCommandRepository {

    private final EmployeeJPAClient employeeJPAClient;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto create(EmployeeDto employeeDto) {
       Employee employee = this.employeeJPAClient.save(employeeMapper.toEmployee(employeeDto));
       return employeeMapper.toEmployeeDto(employee);
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        Employee employee = this.employeeJPAClient.getById(employeeDto.getEmpId());
        Employee updatedEmployee = null;
        if (Objects.nonNull(employee)) {
            employee.setAddress(employeeDto.getAddress());
            employee.setMartialStatus(employeeDto.getMartialStatus());
            employee.setLastName(employeeDto.getLastName());
            employee.setGender(employeeDto.getGender());
            updatedEmployee = this.employeeJPAClient.save(employee);
        }
        return this.employeeMapper.toEmployeeDto(updatedEmployee);
    }

    public void delete(Long empId) {
        this.employeeJPAClient.deleteById(empId);
    }
}
