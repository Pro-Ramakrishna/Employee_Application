package com.ram.service;

import java.util.List;

import com.ram.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Integer empId);
	public Employee getEmployee(Integer empId);
	public List<Employee> getAllEmployee();

}
  