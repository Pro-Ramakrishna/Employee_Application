package com.ram.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.model.Employee;
import com.ram.repo.EmployeeRepo;

@Service
public class EmployeeServicelmpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee  employee1=empRepo.save(employee);
		return employee1;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee1=empRepo.save(employee);
		return employee1;
	}

	@Override
	public void deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		empRepo.deleteById(empId);
		
	}

	@Override
	public Employee getEmployee(Integer empId) {
		// TODO Auto-generated method stub
		Optional<Employee> employee=empRepo.findById(empId);
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employeeList=empRepo.findAll();
		
		return employeeList;
	}
}
  