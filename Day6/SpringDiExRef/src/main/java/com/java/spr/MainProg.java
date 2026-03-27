package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/java/spr/person.xml");
		Person person1 = (Person)ctx.getBean("personLingeshwar");
		person1.showAllInfo();
				
		Person person2 = (Person)ctx.getBean("personMadesh");
		person2.showAllInfo();
		
		Person person3 = (Person)ctx.getBean("personDurga");
		person3.showAllInfo();
	}
}
