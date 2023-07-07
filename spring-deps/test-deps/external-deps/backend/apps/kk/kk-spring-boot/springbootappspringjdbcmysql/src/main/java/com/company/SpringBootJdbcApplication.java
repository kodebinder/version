package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.dao.EmployeeDAO;
import com.company.model.Employee;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDAO employeeDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//createEmployee();
		//getEmployeeById();
		//employeeDAO.updateEmployeeEmailById(1, "pushkar.skyhigh@gamil.com");
		employeeDAO.deleteEmployeeById(1);
	}

	private void createEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Pushkar");
		employee.setEmail("pushkarchauhan91@gamil.com");
		employee.setSalary(90000.00);
		employeeDAO.createEmployee(employee);
	}

	private void getEmployeeById() {
		Employee employee = employeeDAO.getEmployeeById(1);
		System.out.println(employee);
	}
}
