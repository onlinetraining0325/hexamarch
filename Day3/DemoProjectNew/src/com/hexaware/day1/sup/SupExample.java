package com.hexaware.day1.sup;

class First {
	public void show() {
		System.out.println("Show Method from Class First...");
	}
}

class Second extends First {
	public void show() {
		super.show();
		System.out.println("Show Method from Class Second...");
	}
}

public class SupExample {
	public static void main(String[] args) {
		Second second = new Second();
		second.show();
	}
}
