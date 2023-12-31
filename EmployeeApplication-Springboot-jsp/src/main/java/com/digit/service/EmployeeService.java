package com.digit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.Employee;
import com.digit.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> getAllEmployee(){
		return repository.findAll();
	}
	
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}

}
