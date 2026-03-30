package com.java.hib.main;

import com.java.hib.dao.EmployDao;
import com.java.hib.dao.EmployDaoImpl;

public class EmployShowMain {
	public static void main(String[] args) {
		EmployDao employDao = new EmployDaoImpl();
		employDao.showEmployDao().forEach(System.out::println);
	}
}
