package com.hexaware.day1;

class First {
	public void show() {
		System.out.println("Show Method from Class First...");
	}
}

class Second extends First {
	public void display() {
		System.out.println("Display Method from Class Second...");
	}
}

public class InhEx {
	public static void main(String[] args) {
		Second second = new Second();
		second.show();
		second.display();
	}
}
