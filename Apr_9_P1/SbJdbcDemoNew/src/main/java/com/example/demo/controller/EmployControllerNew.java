package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employ;
import com.example.demo.service.EmployService;
import com.example.demo.service.EmployServiceNew;

@RestController
@RequestMapping("/api/employ")
public class EmployControllerNew {

    @Autowired
    private EmployServiceNew employService;

    @DeleteMapping("/{empno}")
    public ResponseEntity<String> deleteEmploy(@PathVariable int empno) {
        String msg = employService.deleteEmploy(empno);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Employ> updateEmploy(@RequestBody Employ employ) {
        Employ updated = employService.updateEmploy(employ);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employ> addEmploy(@RequestBody Employ employ) {
        Employ saved = employService.addEmploy(employ);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Employ>> showEmploy() {
        return new ResponseEntity<>(employService.showEmploy(), HttpStatus.OK);
    }

    @GetMapping("/{empno}")
    public ResponseEntity<Employ> searchEmploy(@PathVariable int empno) {
        return new ResponseEntity<>(employService.searchEmploy(empno), HttpStatus.OK);
    }
}