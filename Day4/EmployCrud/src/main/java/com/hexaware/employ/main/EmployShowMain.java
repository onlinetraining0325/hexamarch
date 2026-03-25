package com.hexaware.employ.main;

import java.sql.SQLException;
import java.util.List;

import com.hexaware.employ.dao.EmployDao;
import com.hexaware.employ.dao.EmployDaoImpl;
import com.hexaware.employ.model.Employ;

public class EmployShowMain {

	public static void main(String[] args) {
		EmployDao employDao = new EmployDaoImpl();
		try {
			List<Employ> employList = employDao.showEmploy();
			employList.forEach(System.out::println);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
