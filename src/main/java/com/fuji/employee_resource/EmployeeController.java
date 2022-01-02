package com.fuji.employee_resource;


import com.fuji.employee_details.EmployeeDto;
import com.fuji.employee_details.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value="/employees", produces = "application/json")
    public ResponseEntity<List<EmployeeDto>> getEmployees() {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        return new ResponseEntity<>(employeeDtoList, HttpStatus.OK);
    }

    @GetMapping(value ="/employees/{empId}", produces = "application/json")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("empId") String empId){
        EmployeeDto employeeDto = EmployeeDto.builder().build();
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    @PostMapping(value="/employees", produces="application/json")
    public ResponseEntity<EmployeeDto> create(@RequestBody @NotNull EmployeeDto employeeDto){
        return new ResponseEntity<>(this.employeeService.create(employeeDto), HttpStatus.CREATED);

    }

    @PutMapping(value="/employees", produces="application/json")
    public ResponseEntity<EmployeeDto> update(@RequestBody @NotNull EmployeeDto employeeDto){
        log.info("Updating on "+employeeDto.getEmpId());
        return new ResponseEntity<>(this.employeeService.update(employeeDto), HttpStatus.OK);
    }

    @DeleteMapping(value="/employee/{empId}", produces="application/json")
    public void delete(@PathVariable @NotNull Long  empId){
        this.employeeService.delete(empId);
    }
}
