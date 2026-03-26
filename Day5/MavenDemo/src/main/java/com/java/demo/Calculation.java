package com.java.demo;

public class Calculation {

	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mult(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		ICalculation c1 = obj::sum;
		System.out.println("Sum is  "+c1.calc(12, 5));
		ICalculation c2 = obj::sub;
		System.out.println("Sub is  " +c2.calc(12, 5));
		ICalculation c3 = obj::mult;
		System.out.println("Mult is  " +c3.calc(12, 5));
	}
}
