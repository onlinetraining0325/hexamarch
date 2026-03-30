package com.java.hib.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class GroupExampleAll {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.groupProperty("dept"));
		plist.add(Projections.sum("basic"));
		plist.add(Projections.avg("basic"));
		plist.add(Projections.max("basic"));
		plist.add(Projections.min("basic"));
		plist.add(Projections.rowCount());
		cr.setProjection(plist);
		List<Object[]> list = cr.list();
		for(Object[] row : list) {
			System.out.println("Department  " +row[0]);
			System.out.println("Total Salary is  " +row[1]);
			System.out.println("Average Salary is  " +row[2]);
			System.out.println("Max Salary is  " +row[3]);
			System.out.println("Min Salary is  " +row[4]);
			System.out.println("No.of Employees Working  " +row[5]);
			System.out.println("------------------------------------");
		}
	}
}
