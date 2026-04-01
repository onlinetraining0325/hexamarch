package com.java.hib;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class LoginDemo {
	public static void main(String[] args) {
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName and Password   ");
		user = sc.next();
		pwd = sc.next();
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Query query = session.getNamedQuery("validate");
		query.setParameter("userName", user);
		query.setParameter("passCode", pwd);
		Login loginFound = (Login)query.uniqueResult();
		if (loginFound !=null) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
