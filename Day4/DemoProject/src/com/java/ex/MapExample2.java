package com.java.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample2 {

	public static void main(String[] args) {
		
		List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Harsh", 88234.22));
        employList.add(new Employ(2, "Anusri", 78822.33));
        employList.add(new Employ(3, "Junaid", 79002));
        employList.add(new Employ(4, "Gaurav", 80223.22));
        employList.add(new Employ(5, "Vaishnavi", 81234.22));
        employList.add(new Employ(6, "Indu", 79002.22));
        employList.add(new Employ(7, "Raju", 80223.22));
        employList.add(new Employ(8, "Poojitha", 99942.22));
        employList.add(new Employ(9, "Sajeetha", 91511.22));
        
        List<Employ> employListResult = employList.stream().map(x -> 
        		new Employ(x.getEmpno(), x.getName().toUpperCase(), x.getBasic()+1000)
        		).collect(Collectors.toList());
        employListResult.forEach(System.out::println);
	}
}
