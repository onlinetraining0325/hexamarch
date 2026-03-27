package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		  ApplicationContext ctx =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        Person p1 = ctx.getBean("personDurga", Person.class);
	        Person p2 = ctx.getBean("personMadesh", Person.class);
	        Person p3 = ctx.getBean("personShakira", Person.class);

	        p1.showAllInfo();
	        System.out.println("------------------------------");
	        p2.showAllInfo();
	        System.out.println("------------------------------");
	        p3.showAllInfo();
	}
}
