package com.fuji.employee_adapter;

import com.fuji.EmployeeTestDataProvider;
import com.fuji.employee_details.EmployeeDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeCommandAdapterTest {

    @InjectMocks
    private EmployeeCommandAdapter employeeCommandAdapter;

    @Mock
    private EmployeeMapper employeeMapper;

    @Mock
    private EmployeeJPAClient employeeJPAClient;

    @Test
    public void testInsertEmployeeData(){

     // Given
        EmployeeDto employeeDto = EmployeeTestDataProvider.getEmployeeDto();
     // When
        when(employeeMapper.toEmployee(any())).thenReturn(EmployeeTestDataProvider.getEmployee());
        when(employeeMapper.toEmployeeDto(any())).thenReturn(EmployeeTestDataProvider.getEmployeeDto());

      EmployeeDto employeeDtoResult =  employeeCommandAdapter.create(employeeDto) ;

      // Then
        assertNotNull(employeeDtoResult);
        assertEquals(259689L, employeeDtoResult.getEmpId());
        assertEquals("SINGAPORE",employeeDtoResult.getAddress());
    }

    @Test
    public void testUpdateExistingEmployeeRecord(){
        // Given
        EmployeeDto employeeDto = EmployeeTestDataProvider.getEmployeeDto();
        // When
//        when(employeeMapper.toEmployee(any())).thenReturn(EmployeeTestDataProvider.getEmployee());
        when(employeeMapper.toEmployeeDto(any())).thenReturn(EmployeeTestDataProvider.getEmployeeDto());

        EmployeeDto employeeDtoResult =  employeeCommandAdapter.update(employeeDto) ;

        // Then
        assertNotNull(employeeDtoResult);
        assertEquals(259689L, employeeDtoResult.getEmpId());
        assertEquals("SINGAPORE",employeeDtoResult.getAddress());
    }


    public void testDeleteEmployeeRecordByEmpId() {
        // Given
        EmployeeDto employeeDto = EmployeeTestDataProvider.getEmployeeDto();
        // When
        when(employeeMapper.toEmployee(any())).thenReturn(EmployeeTestDataProvider.getEmployee());
        when(employeeMapper.toEmployeeDto(any())).thenReturn(EmployeeTestDataProvider.getEmployeeDto());

        EmployeeDto employeeDtoResult =  employeeCommandAdapter.update(employeeDto) ;
    }

}
