package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployService {

	@Autowired
	private EmployRepository employRepository;
	
	public String deleteEmploy(int empno) {
		Employ employFound = searchEmploy(empno);
		if (employFound !=null) {
			employRepository.delete(employFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}
	
	public String updateEmploy(Employ employ) {
		employRepository.save(employ);
		return "Employ Record Updated...";
	}
	
	public String addEmploy(Employ employ) {
		employRepository.save(employ);
		return "Employ Record Inserted...";
	}
	
	public List<Employ> showEmploy() {
		return employRepository.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return employRepository.findById(empno).get();
	}
}
