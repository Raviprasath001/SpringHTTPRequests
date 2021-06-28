package com.mayuratech.springcollection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuratech.springcollection.model.ShopCustomer;
import com.mayuratech.springcollection.repository.ShopRepository;

@Service
public class ShopService {

	@Autowired
	ShopRepository shopRepository;

	
	//Method to add a new customer
	public void saveOrUpdate(List<ShopCustomer> customer) {
		shopRepository.saveAll(customer);
	}

}
