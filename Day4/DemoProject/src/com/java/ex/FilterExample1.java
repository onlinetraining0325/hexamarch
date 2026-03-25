package com.java.ex;

import java.util.ArrayList;
import java.util.List;

public class FilterExample1 {

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
        
        /* Display Records whose Basic >= 80000 */
        
        employList.stream().filter(x-> x.getBasic() >=80000).forEach(System.out::println);
        
        /* Display records whose name ends with 'a' */
        System.out.println("---------------------------------------------------------------");
        
        employList.stream().filter(x -> x.getName().endsWith("a")).forEach(System.out::println);
	}
}
