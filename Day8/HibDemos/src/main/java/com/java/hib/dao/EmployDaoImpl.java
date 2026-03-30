package com.java.hib.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmployDao() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		String cmd = "from Employ";
		Query query = session.createQuery(cmd);
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		String cmd = "from Employ where empno="+empno;
		Query query = session.createQuery(cmd);
		return (Employ)query.uniqueResult();
	}

	@Override
	public String addEmployDao(Employ employ) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employ);
		trans.commit();
		return "Employ Record Inserted...";
	}

	@Override
	public String updateEmployDao(Employ employ) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(employ);
		trans.commit();
		return "Employ Record Updated...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employ = searchEmployDao(empno);
		if (employ==null) {
			return "Employ Record Not Found...";
		}
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(employ);
		trans.commit();
		return "Employ Record Deleted...";
	}

}
