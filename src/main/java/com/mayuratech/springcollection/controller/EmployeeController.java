package com.mayuratech.springcollection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.springcollection.model.Employee;
import com.mayuratech.springcollection.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;

	@GetMapping("/getallemployees")
	public List<Employee> getCustomers() {
		return employeeservice.getAllEmployees();
	}
}
