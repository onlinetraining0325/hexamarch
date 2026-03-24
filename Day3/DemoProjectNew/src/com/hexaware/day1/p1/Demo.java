package com.hexaware.day1.p1;

public class Demo {

	private String privateStr="Hello";
	public String publicStr="Hi";
	protected String protectedStr="Test";
	String defaultStr="Show";
	
	public void show() {
		System.out.println(privateStr);
		System.out.println(publicStr);
		System.out.println(protectedStr);
		System.out.println(defaultStr);
	}
}
