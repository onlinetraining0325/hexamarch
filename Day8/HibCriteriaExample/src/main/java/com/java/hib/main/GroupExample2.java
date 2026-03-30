package com.java.hib.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class GroupExample2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.groupProperty("dept"));
		plist.add(Projections.max("basic"));
		cr.setProjection(plist);
		List<Object[]> list = cr.list();
		for(Object[] row : list) {
			System.out.print("Department  " +row[0]);
			System.out.println("    Max Salary " +row[1]);
		}
	}
}
