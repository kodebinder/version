package com.company.dao;

import com.company.model.Employee;

public interface EmployeeDAO {
	public abstract void createEmployee(Employee employee);

	public abstract Employee getEmployeeById(Integer employeeId);

	public abstract void updateEmployeeEmailById(Integer employeeId, String newEmail);

	public abstract void deleteEmployeeById(Integer employeeId);
}
