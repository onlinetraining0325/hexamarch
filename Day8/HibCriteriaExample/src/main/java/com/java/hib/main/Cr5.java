package com.java.hib.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class Cr5 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.between("basic", 80000.00,99999.00));
		List<Employ> employList = cr.list();
		employList.forEach(System.out::println);
	}
}
