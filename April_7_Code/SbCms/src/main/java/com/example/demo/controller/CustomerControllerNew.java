package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerServiceNew;

@RestController
@RequestMapping("/api/customers")
public class CustomerControllerNew {

    @Autowired
    private CustomerServiceNew customerService;

    @GetMapping("/username/{user}")
    public ResponseEntity<Customer> searchByCustomerUserName(@PathVariable String user) {
        return ResponseEntity.ok(customerService.searchByCustomerUserName(user));
    }

    @GetMapping("/login/{user}/{pwd}")
    public ResponseEntity<String> customerLogin(@PathVariable String user,
                                                @PathVariable String pwd) {
        String result = customerService.login(user, pwd);
        return ResponseEntity.ok(result);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> showCustomer() {
        return ResponseEntity.ok(customerService.showCustomer());
    }

    @GetMapping("/{custId}")
    public ResponseEntity<Customer> searchCustomer(@PathVariable int custId) {
        return ResponseEntity.ok(customerService.searchByCustomerId(custId));
    }
}