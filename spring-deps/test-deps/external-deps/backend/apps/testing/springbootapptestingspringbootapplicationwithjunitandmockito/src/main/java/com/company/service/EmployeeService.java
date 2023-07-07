package com.company.service;

import com.company.dto.EmployeeDto;
import com.company.entity.Employee;
import com.company.exception.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(EmployeeDto employeeDto);
    List<Employee> saveAllEmployees(List<EmployeeDto> employeeDtoList);
    Employee findByEmployeeId(long employeeId) throws EmployeeNotFoundException;
    List<Employee> findAllEmployees();
    Employee updateByEmployeeId(long employeeId) throws EmployeeNotFoundException;
    Employee updateEmployee(EmployeeDto employeeDto) throws EmployeeNotFoundException;
    String deleteByEmployeeId(long id);
    String deleteAllEmployees();
}
