package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	 	@GetMapping("/delete") 
	    public String delete() 
	    { 
	        return "This is the delete request"; 
	    } 
}
