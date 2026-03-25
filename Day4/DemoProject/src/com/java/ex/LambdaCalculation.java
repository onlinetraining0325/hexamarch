package com.java.ex;

import java.util.Scanner;

public class LambdaCalculation {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers   ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		ICalculation obj1 = (x,y) ->  x+y;
        ICalculation obj2 = (x,y) -> x-y;
        ICalculation obj3 = (x,y) -> x*y;
        
        System.out.println("Sum is   " +obj1.calc(a,b));
        System.out.println("Sub is  " +obj2.calc(a, b));
        System.out.println("Mult is   "+obj3.calc(a, b));
	}
}
