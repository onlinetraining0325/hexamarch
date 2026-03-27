package com.java.spr;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/java/spr/hello.xml");
		IHello hello;
		Date date = new Date();
		int hr = date.getHours();
		if (hr <12) {
			hello =(IHello)ctx.getBean("bean1");
		} else if (hr >=12 && hr < 16) {
			hello =(IHello)ctx.getBean("bean2");
		} else {
			hello =(IHello)ctx.getBean("bean3");
		}
		System.out.println(hello.sayHello("Adesh"));
	}
}
