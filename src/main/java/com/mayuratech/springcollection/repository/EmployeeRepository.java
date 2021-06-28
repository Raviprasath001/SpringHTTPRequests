package com.mayuratech.springcollection.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayuratech.springcollection.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
