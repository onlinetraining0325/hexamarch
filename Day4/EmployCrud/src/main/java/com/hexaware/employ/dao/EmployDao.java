package com.hexaware.employ.dao;

import java.sql.SQLException;
import java.util.List;

import com.hexaware.employ.model.Employ;

public interface EmployDao {
	List<Employ> showEmploy() throws ClassNotFoundException, SQLException;
	Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException;
	String addEmploy(Employ employ) throws ClassNotFoundException, SQLException;
	String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException;
	String deleteEmploy(int empno) throws ClassNotFoundException, SQLException;
}
