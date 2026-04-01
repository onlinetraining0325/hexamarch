package com.java.hib;

import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployNativeSearchMain {
	public static void main(String[] args) {
		 int empno;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employ Number  ");
		 empno = sc.nextInt();
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
	     Session session = sf.openSession();
	     Query query = session.getNamedNativeQuery("Employ.Search");
	     query.setParameter("empno", empno);
	     Employ employ = (Employ)query.getSingleResult();
	     if (employ !=null) {
	    	 System.out.println(employ);
	     } else {
	    	 System.out.println("*** Record Not Found ***");
	     }
	}
}	
