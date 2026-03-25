package com.java.ex;

import java.util.Arrays;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		  List<String> list = Arrays.asList("Akshitha","Lokesh","Arpita","Subham","Gaurav",
	                "Lokesh","Arpita","Meghana","Subham","Madesh","Poojitha","Lokeshwar","Adesh","Poojitha",
	                "Lokesh","Meghana","Arpita","Lokeshwar","Adesh");
		  /* Above List need to remove the duplicate entries */
		  System.out.println("*** Names after Removing Duplicates ***");
		  list.stream().distinct().forEach(System.out::println);

	}
}
