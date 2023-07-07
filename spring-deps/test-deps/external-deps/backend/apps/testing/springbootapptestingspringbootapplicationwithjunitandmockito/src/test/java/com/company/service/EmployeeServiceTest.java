package com.company.service;

import com.company.dto.EmployeeDto;
import com.company.entity.Employee;
import com.company.helper.ModelMapperHelper;
import com.company.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;
    @Mock
    private ModelMapperHelper modelMapperHelper;
    private EmployeeService employeeService;
    private EmployeeDto employeeDto;
    private Employee employee;


    @BeforeEach
    public void setup() {
        employeeService = new EmployeeServiceImpl(employeeRepository, modelMapperHelper);
        employeeDto = EmployeeDto.builder()
                .firstName("Bryan")
                .lastName("Adams")
                .email("bryan.adams@gmail.com")
                .mobile("+919898987676")
                .gender("Male")
                .age(31)
                .nationality("American")
                .build();
        employee = Employee.builder()
                .employeeId(1L)
                .firstName("Bryan")
                .lastName("Adams")
                .email("bryan.adams@gmail.com")
                .mobile("+919898987676")
                .gender("Male")
                .age(31)
                .nationality("American")
                .build();
    }

}
