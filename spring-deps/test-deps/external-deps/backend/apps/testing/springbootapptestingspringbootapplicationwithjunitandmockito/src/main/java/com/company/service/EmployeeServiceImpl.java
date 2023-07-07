package com.company.service;

import com.company.dto.EmployeeDto;
import com.company.entity.Employee;
import com.company.exception.EmployeeNotFoundException;
import com.company.helper.ModelMapperHelper;
import com.company.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapperHelper modelMapperHelper;


    public EmployeeServiceImpl(final EmployeeRepository employeeRepository,
                               final ModelMapperHelper modelMapperHelper) {
        this.employeeRepository = employeeRepository;
        this.modelMapperHelper = modelMapperHelper;
    }

    public Employee saveEmployee(EmployeeDto employeeDto) throws EmployeeNotFoundException {
        Employee employee = modelMapperHelper.mapDtoToEntity(employeeDto);
        Optional<Employee> employeeFromDatabase = employeeRepository.findByEmployeeId(employee.getEmployeeId());
        if (employeeFromDatabase.isPresent()) {
            throw new EmployeeNotFoundException("employee with employeeId : " + employee.getEmployeeId() + " already exist");
        }
        return employeeRepository.save(employee);
    }

    public List<Employee> saveAllEmployees(List<EmployeeDto> employeeDtoList) {
        List<Employee> employees = new LinkedList<>();
        employeeDtoList.forEach(employeeDto -> {
            Employee employee = modelMapperHelper.mapDtoToEntity(employeeDto);
            employees.add(employee);
        });
        return employeeRepository.saveAll(employees);
    }

    public Employee findByEmployeeId(long employeeId) throws EmployeeNotFoundException {
        Optional<Employee> employeeFromDatabase = employeeRepository.findByEmployeeId(employeeId);
        if (employeeFromDatabase.isEmpty()) {
            throw new EmployeeNotFoundException("Employee not found with employeeId: " + employeeId);
        }
        return employeeFromDatabase.get();
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateByEmployeeId(long employeeId) throws EmployeeNotFoundException {
        Optional<Employee> employeeFromDatabase = employeeRepository.findByEmployeeId(employeeId);
        if (employeeFromDatabase.isEmpty()) {
            throw new EmployeeNotFoundException("employee with employeeId : " + employeeId + " not found");
        }
        return employeeRepository.save(employeeFromDatabase.get());
    }

    public Employee updateEmployee(EmployeeDto employeeDto) throws EmployeeNotFoundException {
        Employee employee = modelMapperHelper.mapDtoToEntity(employeeDto);
        Optional<Employee> employeeFromDatabase = employeeRepository.findByEmployeeId(employee.getEmployeeId());
        if (employeeFromDatabase.isEmpty()) {
            throw new EmployeeNotFoundException("employee with employeeId : " + employee.getEmployeeId() + " not found");
        }
        Employee existingEmployee = employeeFromDatabase.get();
        return employeeRepository.save(existingEmployee);
    }

    public String deleteByEmployeeId(long id) {
        employeeRepository.deleteById(id);
        return "employee with id : " + id + " removed";
    }

    public String deleteAllEmployees() {
        employeeRepository.deleteAll();
        return "all products deleted";
    }

}