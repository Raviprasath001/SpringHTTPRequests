package com.mayuratech.springcollection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuratech.springcollection.model.BankCustomers;
import com.mayuratech.springcollection.repository.BankRepository;



@Service
public class BankService {
	
	@Autowired
	BankRepository bankRepository;
	
	//Method to add a new customer
	public void saveOrUpdate(List<BankCustomers> customer) {
	   bankRepository.saveAll(customer);
	}
}
