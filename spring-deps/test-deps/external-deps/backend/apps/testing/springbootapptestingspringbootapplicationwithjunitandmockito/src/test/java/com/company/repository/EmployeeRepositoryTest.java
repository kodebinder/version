package com.company.repository;

import com.company.entity.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;
    private Employee employee_1;
    private Employee employee_2;

    @BeforeEach
    public void setup(){
        employee_1 = Employee.builder()
                .firstName("Bryan")
                .lastName("Adams")
                .email("bryan.adams@gmail.com")
                .mobile("+919898987676")
                .gender("Male")
                .age(31)
                .nationality("American")
                .build();
        employee_2 = Employee.builder()
                .firstName("John")
                .lastName("Cena")
                .email("john.cena@gmail.com")
                .mobile("+00198263964665")
                .gender("Male")
                .age(40)
                .nationality("American")
                .build();
    }

    @DisplayName("Save-Employee")
    @Test
    public void givenEmployeeObject_whenSave_thenReturnSavedEmployees() {
        Employee savedEmployee = employeeRepository.save(employee_1);
        Assertions.assertThat(savedEmployee).isNotNull();
        Assertions.assertThat(savedEmployee.getEmployeeId()).isGreaterThan(0);
    }

    @DisplayName("Save-Employees")
    @Test
    public void givenEmployeeList_whenFindAll_thenReturnEmployeesList() {
        employeeRepository.save(employee_1);
        employeeRepository.save(employee_2);
        List<Employee> employees = employeeRepository.findAll();
        Assertions.assertThat(employees).isNotNull();
        Assertions.assertThat(employees.size()).isEqualTo(2);
    }

    @DisplayName("FindById-Employees")
    @Test
    public void givenEmployee_whenSave_thenReturnEmployee() {
        Employee savedEmployee = employeeRepository.save(employee_1);
        Optional<Employee> optionalEmployee = employeeRepository.findById(savedEmployee.getEmployeeId());
        Assertions.assertThat(optionalEmployee).isNotEmpty();
    }

    @DisplayName("FindByEmail-Employee")
    @Test
    public void givenEmployeeEmail_whenFindByEmail_thenReturnEmployee() {
        employeeRepository.save(employee_1);
        Optional<Employee> optionalEmployee = employeeRepository.findByEmail(employee_1.getEmail());
        Assertions.assertThat(optionalEmployee).isNotEmpty();
    }

    @DisplayName("Update-Employee")
    @Test
    public void givenEmployeeObject_whenUpdateEmployee_thenReturnUpdatedEmployee() {
        employeeRepository.save(employee_1);
        Optional<Employee> optionalEmployeeFromDatabase = employeeRepository.findByEmployeeId(employee_1.getEmployeeId());
        if (optionalEmployeeFromDatabase.isPresent()) {
            Employee optionalEmployee = optionalEmployeeFromDatabase.get();
            optionalEmployee.setEmail("pushkar.skyhigh@gmail.com");
            Employee updatedEmployee = employeeRepository.save(optionalEmployee);
            Assertions.assertThat(updatedEmployee).isNotNull();
            Assertions.assertThat(updatedEmployee.getEmail()).isEqualTo("pushkar.skyhigh@gmail.com");
        }
    }

    @DisplayName("Delete-Employee")
    @Test
    public void givenEmployeeObject_whenDeleteEmployee_thenRemoveEmployee() {
        employeeRepository.save(employee_1);
        employeeRepository.deleteById(employee_1.getEmployeeId());
        Optional<Employee> optionalEmployee = employeeRepository.findById(employee_1.getEmployeeId());
        Assertions.assertThat(optionalEmployee).isEmpty();
    }

}
