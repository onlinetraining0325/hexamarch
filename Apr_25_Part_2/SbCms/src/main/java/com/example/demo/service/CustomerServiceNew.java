package com.example.demo.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerServiceNew {

	private static final Logger log = Logger.getLogger("com.java.log.Calculation");

    @Autowired
    private CustomerRepository customerRepository;

    public Customer searchByCustomerUserName(String custUserName) {
        log.info("Search Customer Method Getting Fired...");
    	Customer customer = customerRepository.findByCusUsername(custUserName);
        if (customer == null) {
        	log.error("Customer with User Id Not Found...");
            throw new ResourceNotFoundException("Customer not found with username: " + custUserName);
        }
        return customer;
    }

    public String login(String user, String pwd) {
    	log.info("Customer Login Getting Fired...");
        Customer customer = customerRepository
                .findByCusUsernameAndCusPassword(user, pwd);

        if (customer == null) {
        	log.error("Invalid Credentials....of Customer Login");
            throw new ResourceNotFoundException("Invalid username or password");
        }

        return "Login Successful";
    }

    public List<Customer> showCustomer() {
    	log.info("Show Customer Controller Getting Fired...");
        return customerRepository.findAll();
    }

    public Customer searchByCustomerId(int custId) {
    	log.info("Search Customer Controller Getting Fired...");
    	  Customer customer = customerRepository.findById(custId)
    	            .orElseThrow(() -> {
    	                log.error("Customer NOT FOUND with ID:  " +custId);
    	                return new ResourceNotFoundException("Customer not found with id: " + custId);
    	            });

    	    log.info("Customer FOUND with ID: " +custId);

    	    return customer;
    }
}