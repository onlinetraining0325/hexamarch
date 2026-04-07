package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	Customer findByCusUsernameAndCusPassword(String cusUsername, String cusPassword);
	Customer findByCusUsername(String cusUserName);
}
