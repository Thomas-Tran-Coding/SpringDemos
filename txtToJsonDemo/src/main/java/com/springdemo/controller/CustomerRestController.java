package com.springdemo.controller;

import java.util.List;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springdemo.Service.CustomerService;
import com.springdemo.entity.Customer;



@RestController
@RequestMapping("/api")
public class CustomerRestController {

	CustomerService customerService;
	private List<Customer> customers;
	
	@Autowired
	public CustomerRestController(CustomerService theCustomerService) {
		customerService = theCustomerService;
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		customers = customerService.readCustomer();
		return customers;
	}

}
