package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Orders;
import com.example.demo.service.OrdersService;


@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	@GetMapping(value="/showOrder")
	public ResponseEntity<List<Orders>> showOrders() {
		 return ResponseEntity.ok(ordersService.showOrders());
	}
	
	@PostMapping(value = "/placeOrder", consumes = "application/json")
	public ResponseEntity<String> placeOrder(@RequestBody Orders orders) {
	    System.out.println(orders);
	    String result = ordersService.placeOrder(orders);
	    return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
}
