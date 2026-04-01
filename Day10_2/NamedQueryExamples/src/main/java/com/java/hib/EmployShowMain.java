package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployShowMain {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		employList.forEach(System.out::println);
	}
}	
