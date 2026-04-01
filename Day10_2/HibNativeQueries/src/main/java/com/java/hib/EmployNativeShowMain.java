package com.java.hib;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployNativeShowMain {
	public static void main(String[] args) {
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
	     Session session = sf.openSession();
	     Query query = session.getNamedNativeQuery("Employ.findAll");
	     List<Employ> employList = query.getResultList();
	     employList.forEach(System.out::println);
	}
}
