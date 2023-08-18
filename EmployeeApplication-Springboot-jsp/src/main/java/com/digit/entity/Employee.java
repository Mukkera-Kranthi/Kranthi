package com.digit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_data")
public class Employee {
	
	private String employeeName;
	@Id
	private int employeeId;
	private double employeeSalary;
	public Employee() {
		super();
	}
	public Employee(String employeeName, int employeeId, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	

}
