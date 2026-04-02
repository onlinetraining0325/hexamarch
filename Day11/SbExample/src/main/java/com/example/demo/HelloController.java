package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String sayHello() {
		return "Welcome to SpringBoot Programming...";
	}
	
	@GetMapping(value="/greeting/{name}")
	public String greeting(@PathVariable String name) {
		return "Good Morning..."+name;
	}
	
	@GetMapping(value="/topic")
	public String topic() {
		return "Java FSD with React Training...";
	}
}
