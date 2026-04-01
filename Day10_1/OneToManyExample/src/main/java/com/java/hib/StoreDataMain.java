package com.java.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreDataMain {
	public static void main(String[] args) {
		SessionFactory sessionFactory = 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Question question1 = new Question();
		question1.setQname("What is Java");
		
		Question question2 = new Question();
		question2.setQname("What is EJB");
		
		Answer ans1 = new Answer();
		ans1.setAnswerName("Java is OOP Programming language");
		ans1.setPostedBy("Avesh");
		
		Answer ans2 = new Answer();
		ans2.setAnswerName("EJB is Enterprise Java Beans");
		ans2.setPostedBy("Avesh");
		
		Answer ans3 = new Answer();
		ans3.setAnswerName("Java is platform independent");
		ans3.setPostedBy("Chandu");
		
		Answer ans4 = new Answer();
		ans4.setAnswerName("EJB Used to make Enterprise Server Components");
		ans4.setPostedBy("Chandu");
		
		List<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans3);
		
		List<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans2);
		list2.add(ans4);
		
		question1.setAnswers(list1);
		question2.setAnswers(list2);
	    session.save(question1);
	    session.save(question2);
	    transaction.commit();
	    System.out.println("Tables created...");

	}
}
