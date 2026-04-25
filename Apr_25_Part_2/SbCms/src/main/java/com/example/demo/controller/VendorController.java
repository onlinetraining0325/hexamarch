package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.Vendor;
import com.example.demo.service.VendorService;

@RestController
public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	 @GetMapping("/username/{user}")
	    public ResponseEntity<Vendor> searchByVendorUserName(@PathVariable String user) {
	        return ResponseEntity.ok(vendorService.searchByUserName(user));
	    }

	    @GetMapping("/login/{user}/{pwd}")
	    public ResponseEntity<String> vendorLogin(@PathVariable String user,
	                                                @PathVariable String pwd) {
	        String result = vendorService.vendorLogin(user, pwd);
	        return ResponseEntity.ok(result);
	    }

	    @GetMapping
	    public ResponseEntity<List<Vendor>> showVendor() {
	        return ResponseEntity.ok(vendorService.showVendor());
	    }

	    @GetMapping("/searchByVendorId/{venId}")
	    public ResponseEntity<Vendor> searchVendor(@PathVariable int venId) {
	        return ResponseEntity.ok(vendorService.searchByVendorId(venId));
	    }
}
