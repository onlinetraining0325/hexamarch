package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/feign")
public class EmployController {

    @Autowired
    private EmployClient employClient;

    // Call: http://localhost:YOUR_PORT/feign/showEmploy
    @GetMapping("/showEmploy")
    public List<Employ> getAllEmploy() {
        return employClient.showEmploy();
    }

    // Call: http://localhost:YOUR_PORT/feign/searchEmploy/1
    @GetMapping("/searchEmploy/{id}")
    public Employ getEmployById(@PathVariable int id) {
        return employClient.searchEmploy(id);
    }
}