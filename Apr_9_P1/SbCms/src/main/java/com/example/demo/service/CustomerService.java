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
	
	public String login(String user, String pwd) {
		String res="";
		Customer customer = customerRepository.findByCusUsernameAndCusPassword(user, pwd);
		if (customer != null) {
			res+=1;
		} else {
			res+=0;
		}
		return res;
	} 
	
	public List<Customer> showCustomer() {
		return customerRepository.findAll();
	}
	
	public Customer searchByCustomerId(int custId) {
		return customerRepository.findById(custId).get();
	}
}
