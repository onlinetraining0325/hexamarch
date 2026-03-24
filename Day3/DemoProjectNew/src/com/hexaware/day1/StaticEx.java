package com.hexaware.day1;

public class StaticEx {
	
	static {
		System.out.println("Static Constructor...");
	}
	
	public StaticEx() {
		System.out.println("Instance Constructor...");
	}
	
	public static void main(String[] args) {
		StaticEx obj = new StaticEx();
	}
}
