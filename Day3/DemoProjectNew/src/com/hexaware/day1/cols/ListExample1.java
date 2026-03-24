package com.hexaware.day1.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Lokesh");
		names.add("Vinotha");
		names.add("Padma");
		names.add("Durga");
		names.add("Varun");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.add(3, "Sajeetha");
		System.out.println("Names after adding new Value  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.set(3, "Thriksha");
		System.out.println("Names after Update Operation");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.remove("Varun");
		System.out.println("Names after Remove Operation");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
