package com.ram.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employeesystem")
public class Employee {
@Id
private Integer empId;
@Column(name="empname")
private String empName;
@Column(name="empgender")
private String empGender;
@Column(name="empmail")
private String empMail;
@Column(name="empqualification")
private String empQualification;

//PDC+PSM+PGM+PPC+toString()

public Employee() {
	
	
}

public Integer getEmpId() {
	return empId;
}

public void setEmpId(Integer empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpGender() {
	return empGender;
}

public void setEmpGender(String empGender) {
	this.empGender = empGender;
}

public String getEmpMail() {
	return empMail;
}

public void setEmpMail(String empMail) {
	this.empMail = empMail;
}

public String getEmpQualification() {
	return empQualification;
}

public void setEmpQualification(String empQualification) {
	this.empQualification = empQualification;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empGender=" + empGender + ", empMail=" + empMail
			+ ", empQualification=" + empQualification + "]";
}

}
  