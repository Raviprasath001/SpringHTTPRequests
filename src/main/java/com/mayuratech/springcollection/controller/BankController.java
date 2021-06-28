package com.mayuratech.springcollection.controller;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.springcollection.model.BankCustomers;
import com.mayuratech.springcollection.service.BankService;

@RestController
@RequestMapping(value = "/bank")
public class BankController {

	@Autowired
	BankService bankService;
	@RequestMapping(value = "/addcustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody
	public ResponseEntity<Object> addnewcustomer(
			@PathVariable @Min(value = 1, message = "id must be greater than or equal to 1") @Max(value = 1000, message = "id must be lower than or equal to 1000") @RequestBody List<BankCustomers> customer) {
		bankService.saveOrUpdate(customer);
		return ResponseEntity.ok().allow(HttpMethod.POST).build();
	}
}
