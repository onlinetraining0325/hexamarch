package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerServiceNew {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer searchByCustomerUserName(String custUserName) {
        Customer customer = customerRepository.findByCusUsername(custUserName);
        if (customer == null) {
            throw new ResourceNotFoundException("Customer not found with username: " + custUserName);
        }
        return customer;
    }

    public String login(String user, String pwd) {
        Customer customer = customerRepository
                .findByCusUsernameAndCusPassword(user, pwd);

        if (customer == null) {
            throw new ResourceNotFoundException("Invalid username or password");
        }

        return "Login Successful";
    }

    public List<Customer> showCustomer() {
        return customerRepository.findAll();
    }

    public Customer searchByCustomerId(int custId) {
        return customerRepository.findById(custId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + custId));
    }
}