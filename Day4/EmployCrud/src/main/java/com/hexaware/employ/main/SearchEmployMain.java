package com.hexaware.employ.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.employ.dao.EmployDao;
import com.hexaware.employ.dao.EmployDaoImpl;
import com.hexaware.employ.model.Employ;

public class SearchEmployMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		EmployDao employDao = new EmployDaoImpl();
		try {
			Employ employ = employDao.searchEmploy(empno);
			if (employ !=null) {
				System.out.println(employ);
			} else {
				System.out.println("*** Employ Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
