package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.WalSource;
import com.example.demo.model.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {
	List<Wallet> findByCusId(int cusId);
	Wallet findByCusIdAndWalSource(int cusId,WalSource walSource);
}
