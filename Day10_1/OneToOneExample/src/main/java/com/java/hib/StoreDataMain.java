package com.java.hib;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class StoreDataMain {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employ employ1= new Employ();
		employ1.setName("Sivahari");
		employ1.setEmail("sivahari@hexaware.com");
		
		Address address1 = new Address();
		address1.setAddress1("Jaya Nagar");
		address1.setAddress2("Sulthan Palya");
		address1.setCity("Karaikudi");
		address1.setState("TN");
		address1.setZipcode("8472344");
		address1.setCountry("INDIA");
		
		address1.setEmploy(employ1);
		
		Employ employ2 = new Employ();
		employ2.setName("Poojitha");
		employ2.setEmail("Poojitha@hexaware.com");
		
		Address address2 = new Address();
		address2.setAddress1("Secor 5");
		address2.setAddress2("TRT-81");
		address2.setCity("Kanpur");
		address2.setState("UP");
		address2.setZipcode("482344");
		address2.setCountry("INDIA");
		
		address2.setEmploy(employ2);
		
		session.save(employ1);
		session.save(employ2);
		session.save(address1);
		session.save(address2);
		transaction.commit();
		session.close();
		System.out.println("Tables Created Successfully...");

	}
}
