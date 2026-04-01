package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ShowDataMain {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =sf.openSession();
		
		Query query = session.createQuery("from Address");
		List<Address> addressList = query.list();
		for (Address address : addressList) {
			System.out.println("Employ Id " +address.getEmploy().getEmpId());
			System.out.println("Employ Name  " +address.getEmploy().getName());
			System.out.println("Employ Email  " +address.getEmploy().getEmail());
			System.out.println("Address 1  " +address.getAddress1());
			System.out.println("Address 2  " +address.getAddress2());
			System.out.println("City   " +address.getCity());
			System.out.println("State  " +address.getState());
			System.out.println("Country " +address.getCountry());
			System.out.println("-----------------------------------");
			
		}
	}
}
