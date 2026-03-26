package com.java.solid.isp;

public class IspSolution {
	public static void main(String[] args) {
		Lokeshwar lokeshwar = new Lokeshwar();
		System.out.println("---------------------------");
		lokeshwar.name();
		lokeshwar.paymentDetails();
		lokeshwar.paySlips();
		lokeshwar.pfDetails();
		System.out.println("--------------------------");
		Swapna swapna = new Swapna();
		swapna.name();
		swapna.paymentDetails();
	}
}
