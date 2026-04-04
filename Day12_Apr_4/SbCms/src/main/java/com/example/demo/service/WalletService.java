package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.WalSource;
import com.example.demo.model.Wallet;
import com.example.demo.repo.WalletRepository;

@Service
public class WalletService {

	@Autowired
	private WalletRepository walletRepository;
	
	public List<Wallet> showCustomerWallets(int cusId) {
		return walletRepository.findByCusId(cusId);
	}
	
	public Wallet showCustomerWalletInfo(int cusId, WalSource walSource) {
		return walletRepository.findByCusIdAndWalSource(cusId, walSource);
	}
}
