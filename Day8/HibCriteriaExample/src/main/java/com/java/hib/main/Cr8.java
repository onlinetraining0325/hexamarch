package com.java.hib.main;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class Cr8 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.addOrder(Order.asc("name"));
		cr.list().forEach(System.out::println);
	}
}
