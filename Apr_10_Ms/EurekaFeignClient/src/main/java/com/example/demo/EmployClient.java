package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SBJDBCDEMONEW", url = "http://localhost:1113")
public interface EmployClient {

    @GetMapping("/showemploy")
    List<Employ> showEmploy();

    @GetMapping("/searchemploy/{id}")
    Employ searchEmploy(@PathVariable("id") int id);
}