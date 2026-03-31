package com.hexaware.main;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

import com.hexaware.dao.EmployDao;
import com.hexaware.dao.EmployDaoImpl;
import com.hexaware.model.Employ;

public class EmploySearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		EmployDao dao = new EmployDaoImpl();
		try {
			Optional<Employ> employ = dao.searchEmployDao(empno);
			if (employ.isPresent()) {
				System.out.println(employ);
			} else {
				System.out.println("Employ Record Not Found...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
