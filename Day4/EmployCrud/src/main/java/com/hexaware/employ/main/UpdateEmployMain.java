package com.hexaware.employ.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.employ.dao.EmployDao;
import com.hexaware.employ.dao.EmployDaoImpl;
import com.hexaware.employ.model.Employ;
import com.hexaware.employ.model.Gender;

public class UpdateEmployMain {
	public static void main(String[] args) {
		Employ employ = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextDouble());
		EmployDao employDao = new EmployDaoImpl();
		try {
			System.out.println(employDao.updateEmploy(employ));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
