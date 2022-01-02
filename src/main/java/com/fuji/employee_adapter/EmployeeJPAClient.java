package com.fuji.employee_adapter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJPAClient extends JpaRepository<Employee,Long> {
}
