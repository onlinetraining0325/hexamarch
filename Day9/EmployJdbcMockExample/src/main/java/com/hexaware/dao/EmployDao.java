package com.hexaware.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.hexaware.model.Employ;

public interface EmployDao {
	
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Optional<Employ> searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
}
