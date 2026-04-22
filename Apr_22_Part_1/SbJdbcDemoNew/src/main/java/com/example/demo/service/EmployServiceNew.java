package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;

@Service
public class EmployServiceNew {

    @Autowired
    private EmployRepository employRepository;

    public String deleteEmploy(int empno) {
        Employ employ = employRepository.findById(empno)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + empno));

        employRepository.delete(employ);
        return "Employ Record Deleted...";
    }

    public Employ updateEmploy(Employ employ) {
        if (!employRepository.existsById(employ.getEmpno())) {
            throw new ResourceNotFoundException("Employee not found with id: " + employ.getEmpno());
        }
        return employRepository.save(employ);
    }

    public Employ addEmploy(Employ employ) {
        return employRepository.save(employ);
    }

    public List<Employ> showEmploy() {
        return employRepository.findAll();
    }

    public Employ searchEmploy(int empno) {
        return employRepository.findById(empno)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + empno));
    }
}