package com.java.demo;

public class DemoExample {

	public static void greet1() {
		System.out.println("Good Morning to All...Thank You...");
	}
	
	public static void greet2() {
		System.out.println("Good Afternoon to All...Thank You...");
	}
	
	public static void greet3() {
		System.out.println("Good Evening to All...Thank You...");
	}
	
	public static void main(String[] args) {
		IGreeting obj1 = DemoExample::greet1;
		obj1.greeting();
		IGreeting obj2 = DemoExample::greet2;
		obj2.greeting();
		IGreeting obj3 = DemoExample::greet3;
		obj3.greeting();
	}
}
