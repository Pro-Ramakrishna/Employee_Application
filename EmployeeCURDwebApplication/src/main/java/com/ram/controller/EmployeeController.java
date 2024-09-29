package com.ram.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;
import com.ram.service.EmployeeService;
import com.ram.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public String saveData(@RequestBody Employee employeetModel) {
		Employee employee1=empService.saveEmployee(employeetModel);
		String message=null;
		if(employee1!=null) {
			message="Employee saved sucessfully in database";
		}
		else {
			message="Employee not save in database";
		}
		return message;
	}
	@PutMapping("/update/{empId}")
	public Employee updateEmployee(@RequestBody Employee employeeModel,
			@PathVariable Integer empId) {
		
		Employee employeeResposne=empService.getEmployee(empId);
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(employeeModel.getEmpName());
		employee.setEmpGender(employeeModel.getEmpGender());
		employee.setEmpMail(employeeModel.getEmpMail());
		employee.setEmpQualification(employeeModel.getEmpQualification());
		Employee employee1=empService.updateEmployee(employee);
		return employee1;
	}
	@GetMapping("/get/{empId}")
	public Employee findById(@PathVariable Integer empId) {
		Employee employee = empService.getEmployee(empId);
		Employee EmployeeModel = new Employee();
		
		if (employee != null) {
			BeanUtils.copyProperties(employee, EmployeeModel);
		}
		return EmployeeModel;
	}

	@DeleteMapping("/delete/{empId}")
	public void deleteEmployee(@PathVariable Integer empId) {
		empService.deleteEmployee(empId);
	}	

	@GetMapping("/getAll")
	public List<Employee> findAll() {
		List<Employee> employeeList = empService.getAllEmployee();
		List<Employee> employeeModelList=new ArrayList<>();
		Employee employeeModel = null;
		for(Employee entity:employeeList) {
			Employee model=new Employee();
			BeanUtils.copyProperties(entity, model);
			employeeModelList.add(model);
		}
		return employeeModelList;
	
}
}