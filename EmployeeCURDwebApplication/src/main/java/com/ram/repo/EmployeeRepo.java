package com.ram.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ram.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
