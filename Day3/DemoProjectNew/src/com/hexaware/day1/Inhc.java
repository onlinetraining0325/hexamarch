package com.hexaware.day1;

class C1 {
	C1() {
		System.out.println("Base Class Constructor...");
	}
}

class C2 extends C1 {
	C2() {
		System.out.println("Derived Class Constructor...");
	}
}

public class Inhc {
	public static void main(String[] args) {
		C2 c2 = new C2();
	}
}
