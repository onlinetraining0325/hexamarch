package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Menu;
import com.example.demo.model.Orders;
import com.example.demo.model.WalSource;
import com.example.demo.model.Wallet;
import com.example.demo.repo.OrdersRepository;
import com.example.demo.repo.WalletRepository;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private WalletRepository walletRepository;
	
	@Autowired
	private WalletService walletService;
	
	public List<Orders> showOrders() {
		return ordersRepository.findAll();
	}
	
	public String acceptOrReject(int orderId, int vendorId, String status) {
		Orders orderFound = ordersRepository.findById(orderId).get();
		if (orderFound == null) {
			return "Order Id Not Found...";
		}
		int vid = orderFound.getVenId();
		if (vid==vendorId) {
			Wallet walletFound = walletService.
					showCustomerWalletInfo(orderFound.getCusId(),
						WalSource.valueOf(orderFound.getWalSource()));
			if (status.equals("YES")) {
				orderFound.setOrdStatus("ACCEPTED");
				ordersRepository.save(orderFound);
				return "Order Accepted...";
			} else {
				orderFound.setOrdStatus("DENIED");
				ordersRepository.save(orderFound);
				walletFound.setWalAmount(walletFound.getWalAmount() + orderFound.getOrdBillamount());
				walletRepository.save(walletFound);
				return "Order Rejected...";
			}
		}
		return "";
	}
	
	public List<Orders> showCustomerPendingOrders(int custId) {
		return ordersRepository.findByCusId(custId).stream().filter(x -> 
		x.getOrdStatus().equals("PENDING")).toList();
	}
	
	public List<Orders> showCustomerOrders(int custId) {
		return ordersRepository.findByCusId(custId);
	}
	
	public String placeOrder(Orders order) {
		System.out.println(order);
		Menu menuFound = menuService.searchByMenuId(order.getMenId());
		System.out.println(menuFound);
		double price = menuFound.getMenPrice();
		System.out.println(price);
		Wallet walletFound = walletService.showCustomerWalletInfo(order.getCusId(), 
				WalSource.valueOf( order.getWalSource()));
		System.out.println(walletFound);
		double amount = walletFound.getWalAmount();
		System.out.println(amount);
		double billAmount = price * order.getOrdQuantity();
		if (billAmount > amount) {
			return "Insufficient Funds...";
		}
		order.setOrdBillamount(billAmount);
		order.setOrdStatus("PENDING");
		ordersRepository.save(order);
		walletFound.setWalAmount(amount-billAmount);
		walletRepository.save(walletFound);
		return "Order Placed Successfully...Wallet Updated";
	}
}
