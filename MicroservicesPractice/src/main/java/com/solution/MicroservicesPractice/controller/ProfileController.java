package com.solution.MicroservicesPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solution.MicroservicesPractice.model.Customer;
import com.solution.MicroservicesPractice.service.CustomerService;

@RestController
@RequestMapping(value="/services")
public class ProfileController {
	
	@Autowired
	CustomerService customerService;
	
	
	public Customer savecustomer(@RequestBody Customer customer) {
		return customerService.save(customer);
	}

}
