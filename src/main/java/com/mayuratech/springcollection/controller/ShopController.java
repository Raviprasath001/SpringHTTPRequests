package com.mayuratech.springcollection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.springcollection.model.ShopCustomer;
import com.mayuratech.springcollection.service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopController {

	@Autowired
	ShopService shopService;

	@RequestMapping(value = "/addcustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody
	public ResponseEntity<Object> bookticket(@RequestBody List<ShopCustomer> customer) {
		shopService.saveOrUpdate(customer);
		return ResponseEntity.ok().allow(HttpMethod.POST).build();
	}
}
