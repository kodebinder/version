package com.company.controller;

import com.company.dto.EmployeeDto;
import com.company.entity.Employee;
import com.company.exception.EmployeeNotFoundException;
import com.company.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeService.saveEmployee(employeeDto), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<List<Employee>> saveAllEmployees(@RequestBody @Valid List<EmployeeDto> employeeDtoList) {
        return new ResponseEntity<>(employeeService.saveAllEmployees(employeeDtoList), HttpStatus.CREATED);
    }

    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<Employee> findByEmployeeId(@PathVariable long employeeId) throws EmployeeNotFoundException {
        return ResponseEntity.ok(employeeService.findByEmployeeId(employeeId));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAllEmployees() {
        return ResponseEntity.ok().body(employeeService.findAllEmployees());
    }

    @PutMapping
    public ResponseEntity<Employee> updateEmployee(@RequestBody @Valid EmployeeDto employeeDto) throws EmployeeNotFoundException {
        return new ResponseEntity<>(employeeService.updateEmployee(employeeDto), HttpStatus.OK);
    }

    @PutMapping("/employee/{employeeId}")
    public ResponseEntity<Employee> updateByEmployeeId(@PathVariable("employeeId") long employeeId) throws EmployeeNotFoundException {
        return new ResponseEntity<>(employeeService.updateByEmployeeId(employeeId), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllEmployees() {
        return ResponseEntity.ok().body(employeeService.deleteAllEmployees());
    }

    @DeleteMapping("/employee/{employeeId}")
    public ResponseEntity<String> deleteByEmployeeId(@PathVariable("employeeId") long employeeId) {
        return new ResponseEntity<>(employeeService.deleteByEmployeeId(employeeId), HttpStatus.OK);
    }

}
