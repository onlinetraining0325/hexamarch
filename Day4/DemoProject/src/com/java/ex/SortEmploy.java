package com.java.ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmploy {
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
        
        System.out.println("Sorted Employ Records Are  ");
        System.out.println("----------------------------");
        
        employList.stream().sorted( (e1, e2) -> {
        	return e1.getName().compareTo(e2.getName());
        }).forEach(System.out::println);
        
        System.out.println("Sort By salary wise  ");
        employList.stream().sorted( (e1, e2) -> {
            return (int) (e2.getBasic() - e1.getBasic());
        }).forEach(System.out::println);

        System.out.println("*** Display First 5 Records ***");
        employList.stream().limit(5).forEach(System.out::println);
        
        Employ maxEmp = employList.stream().max(Comparator.comparing(Employ::getBasic)).orElse(null);
        System.out.println("Employ Record of Max Salary is  " +maxEmp);
        
        Employ minEmp = employList.stream().min(Comparator.comparing(Employ::getBasic)).orElse(null);
        System.out.println("Employ Record of Min Salary is  " +minEmp);
        
        double totalSalary = employList.stream().map(Employ::getBasic).
                reduce(0.0, (a,b) -> a + b );
        System.out.println("Total Salary is " + totalSalary);

        double total = employList.stream().map(Employ::getBasic).reduce(0.0,Double::sum);
        System.out.println("Total Salary is " + total);

	}
}
