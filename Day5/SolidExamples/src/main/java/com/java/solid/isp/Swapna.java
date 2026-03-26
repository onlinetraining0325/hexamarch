package com.java.solid.isp;

public class Swapna implements IEmployDetails {

	@Override
	public void name() {
		System.out.println("Hi I am Swapna...");
	}

	@Override
	public void paymentDetails() {
		System.out.println("Payment will be received after deducting TDS");
	}

}
