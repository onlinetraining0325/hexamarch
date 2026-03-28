package com.java.spr;

public interface EmployDao {
	Employ searchEmploy(int empno);
	String addEmploy(Employ employ);
	String updateEmploy(Employ employUpdated);
	String deleteEmploy(int empno);
}
