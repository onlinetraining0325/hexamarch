package com.hexaware.day1;

public class Quiz2 {

	public static void main(String[] args) {
		Employ emp1 = new Employ(1, "Lokesh", 99422.44);
		Employ emp2 = new Employ(1, "Lokesh", 99422.44);
		
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
	}
}
