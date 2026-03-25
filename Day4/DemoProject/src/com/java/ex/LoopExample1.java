package com.java.ex;

import java.util.ArrayList;
import java.util.List;

public class LoopExample1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Geetha");
		names.add("Sivahari");
		names.add("Raju");
		names.add("Madesh");
		names.add("Lingeswar");
		
		names.forEach(x -> System.out.println(x));
	}
}
