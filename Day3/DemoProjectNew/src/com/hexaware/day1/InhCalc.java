package com.hexaware.day1;

import java.util.Scanner;

class Input {
	
	int a,b;
	
	public void readInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers   ");
		a = sc.nextInt();
		b = sc.nextInt();
	}
}

class Calculation extends Input {
	
	public int sum() {
		return a + b;
	}
	
	public int sub() {
		return a - b;
	}
	
	public int mult() {
		return a * b;
	}
}

public class InhCalc {
	
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		obj.readInput();
		System.out.println("Sum is  " +obj.sum());
		System.out.println("Sub is  " +obj.sub());
		System.out.println("Mult is  " +obj.mult());
	}
}
