package com.java.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/java/aop/aop.xml");
		Meeting meeting = (Meeting)ctx.getBean("beanMeeting");
		meeting.scheduleMeeting();
	}
}
