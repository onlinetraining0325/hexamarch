package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.WalSource;
import com.example.demo.model.Wallet;
import com.example.demo.service.WalletService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class WalletController {

	@Autowired
	private WalletService walletService;
	
	@GetMapping(value="/showCustomerWallets/{cusId}")
	public List<Wallet> showCustomerWallets(@PathVariable int cusId) {
		return walletService.showCustomerWallets(cusId);
	}
	
	@GetMapping(value="/showCustomerWalletInfo/{cusId}/{walSource}")
	public Wallet showCustomerWalletInfo(int cusId, WalSource walSource) {
		return walletService.showCustomerWalletInfo(cusId, walSource);
	}
}
