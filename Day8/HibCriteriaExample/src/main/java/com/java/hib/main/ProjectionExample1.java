package com.java.hib.main;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class ProjectionExample1 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Projection projection1 = Projections.property("name");
		cr.setProjection(projection1);
		System.out.println("Employ Names are  ");
		cr.list().forEach(System.out::println);
	}
}
