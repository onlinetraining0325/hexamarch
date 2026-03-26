package com.java.solid.isp;

public class Lokeshwar implements IEmployDetails, IAccountDetails {

	@Override
	public void name() {
		System.out.println("Hi I am Lokeshwar...");
	}

	@Override
	public void paymentDetails() {
		System.out.println("You will get Salary By Month-End...");
	}

	@Override
	public void pfDetails() {
		System.out.println("Pf will be deducted from Salary");
	}

	@Override
	public void paySlips() {
		System.out.println("Payslips Mailed by 10th of evgery month");
	}

}
