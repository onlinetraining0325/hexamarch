package com.java.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample2 {
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
		
		Predicate<String> p1 = (name) -> name.endsWith("a");
		
		List<String> result = names.stream().filter(p1).collect(Collectors.toList());
		System.out.println("Names ends with 'a'  ");
		result.forEach(System.out::println);
	}
}
