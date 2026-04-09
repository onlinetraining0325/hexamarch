package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {
	Vendor findByVenUsername(String venUsername);
	Vendor findByVenUsernameAndVenPassword(String venUsername, String venPassword);
}
