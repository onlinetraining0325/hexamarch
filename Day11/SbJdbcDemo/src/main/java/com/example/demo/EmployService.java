package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployService {

	@Autowired
	private EmployRepository employRepository;
	
	public List<Employ> showEmploy() {
		return employRepository.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return employRepository.findById(empno).get();
	}
}
