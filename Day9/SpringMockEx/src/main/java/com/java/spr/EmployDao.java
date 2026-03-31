package com.java.spr;

import java.util.List;

public interface EmployDao {
	
	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
	String addEmploy(Employ employNew);
	String updateEmploy(Employ employUpdated);
	String deleteEmploy(int empno);
}
