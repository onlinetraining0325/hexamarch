package com.java.ex;

import java.util.ArrayList;
import java.util.List;

public class LoopExample2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Geetha");
		names.add("Sivahari");
		names.add("Raju");
		names.add("Madesh");
		names.add("Lingeswar");
		names.add("Kirupa");
		names.add("Durga");
		names.add("Shakira");
		System.out.println("Names Are   ");
		names.forEach(System.out::println);
	}
}
