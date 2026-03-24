package com.hexaware.day1.ex;

public class ArrayEx {
	public static void main(String[] args) {
		int[] a = {12,5};
		try {
			a[10]=833;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array Size is Small...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
