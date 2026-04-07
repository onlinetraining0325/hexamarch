package com.java.log4j;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Calculation {
	
	private static final Logger log = Logger.getLogger("com.java.log4j.Calculation");
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		log.info("Program Started Inputing 2 Numbers...");
		System.out.println("Enter 2 Numbers   ");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division  " +c);
			log.info("Program Ended with No Exceptions...");
		} catch (ArithmeticException e) {
			System.err.println("Division By Zero Impossible...");
			log.error("Division by zero Impossible Exception caught...");
		} catch (InputMismatchException e) {
			System.err.println("String Cannot be Converted as Integer...");
			log.error("String Cannot be Converted as Integer Exception Caught...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
