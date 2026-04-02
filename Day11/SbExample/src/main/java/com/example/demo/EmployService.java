package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployService {

	static List<Employ> employList;
	
	static {
		employList  = new ArrayList<Employ>();
		employList.add(new Employ(1, "Lingeshwar", 84234.22));
		employList.add(new Employ(2, "Sajeetha", 90124.22));
		employList.add(new Employ(3, "Vinotha", 98321.22));
		employList.add(new Employ(4, "Sivahari", 90552.22));
		employList.add(new Employ(5, "Madesh", 98113.22));
		
	}
	
	public Employ searchEmploy(int empno) {
		return employList.stream().filter(x -> x.getEmpno() == empno).findFirst().orElse(null);
	}
	
	public List<Employ> showEmploy() {
		return employList;
	}
}
