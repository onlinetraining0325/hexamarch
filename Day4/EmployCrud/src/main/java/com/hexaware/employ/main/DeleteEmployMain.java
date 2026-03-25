package com.hexaware.employ.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.employ.dao.EmployDao;
import com.hexaware.employ.dao.EmployDaoImpl;

public class DeleteEmployMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		EmployDao employDao = new EmployDaoImpl();
		try {
			System.out.println(employDao.deleteEmploy(empno));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
