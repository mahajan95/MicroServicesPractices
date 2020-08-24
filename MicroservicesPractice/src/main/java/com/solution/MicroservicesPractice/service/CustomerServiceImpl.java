package com.solution.MicroservicesPractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solution.MicroservicesPractice.model.Customer;
import com.solution.MicroservicesPractice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl  implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public Customer save(Customer customer) {
	
		return customerRepository.save(customer);
	} 
	
}
