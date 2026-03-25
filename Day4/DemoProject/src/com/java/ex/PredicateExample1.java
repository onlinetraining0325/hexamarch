package com.java.ex;

import java.util.function.Predicate;

public class PredicateExample1 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = (number) -> number > 5;
		System.out.println(p1.test(10));
		System.out.println(p1.test(3));
	}
}
