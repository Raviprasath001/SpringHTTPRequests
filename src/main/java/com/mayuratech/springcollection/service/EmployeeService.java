package com.mayuratech.springcollection.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuratech.springcollection.model.Employee;
import com.mayuratech.springcollection.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	// Method to get details of all employees
	public List<Employee> getAllEmployees() {
		List<Employee> customer = new ArrayList<Employee>();
		return (List<Employee>) employeeRepository.findAll();
	}

}
