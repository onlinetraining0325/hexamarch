package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/searchByCustomerUserName/{user}")
	public Customer searchByCustomerUserName(@PathVariable String user) {
		return customerService.searchByCustomerUserName(user);
	}
	
	@GetMapping("/customerLogin/{user}/{pwd}")
	public String customerLogin(@PathVariable String user, 
			@PathVariable String pwd) {
		return customerService.login(user, pwd);
	}
	
	@GetMapping(value="/showcustomer")
	public List<Customer> showCustomer() {
		return customerService.showCustomer();
	}
	
	@GetMapping(value="/searchcustomer/{custId}")
	public Customer searchCustomer(@PathVariable int custId) {
		return customerService.searchByCustomerId(custId);
	}
}
