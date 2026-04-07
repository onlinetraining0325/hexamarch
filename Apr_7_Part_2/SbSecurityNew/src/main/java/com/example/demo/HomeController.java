package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value="/home")
	public String home() {
		return "Welcome to Spring Security Basic...";
	}
}
