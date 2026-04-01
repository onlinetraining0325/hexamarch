package com.java.hib;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("empno", empno);
		Employ employ = (Employ)query.uniqueResult();
		if (employ !=null) {
			System.out.println(employ);
		} else {
			System.out.println("*** Employ Record Not Found ***");
		}
	}
}
