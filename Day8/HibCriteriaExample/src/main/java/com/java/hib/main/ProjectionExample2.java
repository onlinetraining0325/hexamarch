package com.java.hib.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class ProjectionExample2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("empno"));
		projList.add(Projections.property("name"));
		projList.add(Projections.property("basic"));
		projList.add(Projections.property("dept"));
		
		cr.setProjection(projList);
		
		List<Object[]> list = cr.list();
		for(Object[] ob : list) {
			System.out.println(ob[0] + "    " +ob[1] + "     " +
		             ob[2] + "         " + ob[3]);
		}
	}
}
