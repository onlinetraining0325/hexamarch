package com.java.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalExample2 {

	static List<Employ> employList;

    static {
        employList = new ArrayList<Employ>();
        employList.add(new Employ(1,"Himanshu",85233));
        employList.add(new Employ(2,"Harshita",90833));
        employList.add(new Employ(3,"Ilayarani",91145));
        employList.add(new Employ(4,"Hari Prasad",78667));
    }

    public Employ searchEmp(int empno) {
    	 return employList.stream()
    	            .filter(x -> x.getEmpno() == empno)
    	            .findFirst()
    	            .orElse(null);
    }

    public static void main(String[] args) {
    	int empno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ No   ");
        empno = sc.nextInt();
        OptionalExample2 obj1 = new OptionalExample2();
        Optional<Employ> result = Optional.ofNullable(obj1.searchEmp(empno));
        if (result.isPresent()) {
            System.out.println(result);
        } else {
            System.out.println("*** Record Not Found ***");
        }
	}
}
