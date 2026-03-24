package com.hexaware.day1.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Test implements IOne,ITwo {

	@Override
	public void email() {
		System.out.println("Email from HexaBatch...");
	}

	@Override
	public void name() {
		System.out.println("Name from Hexa Batch...");
	}
	
}
public class MultiInh {
	public static void main(String[] args) {
		Test test = new Test();
		test.name();
		test.email();
	}
}
