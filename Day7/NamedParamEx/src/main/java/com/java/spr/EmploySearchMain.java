package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
		EmployDao employDao =(EmployDao)ctx.getBean("employDaoImpl");
		Employ employFound = employDao.searchEmploy(empno);
		if (employFound !=null) {
			System.out.println(employFound);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
