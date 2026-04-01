package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ShowDataMain {
	public static void main(String[] args) {
		SessionFactory sessionFactory = 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Question");
		List<Question> questions = query.list();
		for (Question question : questions) {
			System.out.println("Question id " +question.getId());
			System.out.println("Question Name " +question.getQname());
			List<Answer> answers = question.getAnswers();
			for (Answer ans : answers) {
				System.out.println("Answer Id  " +ans.getId());
				System.out.println("Answer Name  " +ans.getAnswerName());
				System.out.println("Posted By " +ans.getPostedBy());
			}
			System.out.println("----------------------------------");
		}
	}
}
