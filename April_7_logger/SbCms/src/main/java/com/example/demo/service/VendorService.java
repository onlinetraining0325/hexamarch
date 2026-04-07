package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Vendor;
import com.example.demo.repo.VendorRepository;

@Service
public class VendorService {

	@Autowired
	private VendorRepository vendorRepository;
	
	public List<Vendor> showVendor() {
		return vendorRepository.findAll();
	}
	
	public String vendorLogin(String userName, String passWord) {
		Vendor vendorFound = vendorRepository.findByVenUsernameAndVenPassword(userName, passWord);
		if (vendorFound == null) {
			throw new ResourceNotFoundException("Invalid UserName or Password...");

		}
		return "1";
	}
	public Vendor searchByUserName(String userName) {
		Vendor vendor = vendorRepository.findByVenUsername(userName);
		if (vendor==null) {
			throw new ResourceNotFoundException("Vendor with UserName "+userName + " Not Found...");
		}
		return vendor;
	}
	
	public Vendor searchByVendorId(int id) {
		 return vendorRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Vendor not found with id: " + id));
	}
}
