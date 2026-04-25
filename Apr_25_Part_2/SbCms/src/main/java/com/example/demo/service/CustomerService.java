package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer searchByCustomerUserName(String custUserName) {
		return customerRepository.findByCusUsername(custUserName);
	}
	
	public String login(String custUserName, String cusPassword) {
		System.out.println(custUserName + " " +cusPassword);
		List<Customer> customerList = customerRepository.findAll();
		Customer customer = customerList.stream()
			    .filter(x -> x.getCusUsername().equals(custUserName) &&
			                 x.getCusPassword().equals(cusPassword))
			    .findFirst()   // ✅ get first match
			    .orElse(null); // ✅ return null if not found
	    
		System.out.println(customer);

	    return (customer != null) ? "1" : "0";
	}
	
	public List<Customer> showCustomer() {
		return customerRepository.findAll();
	}
	
	public Customer searchByCustomerId(int custId) {
		return customerRepository.findById(custId).get();
	}
}
