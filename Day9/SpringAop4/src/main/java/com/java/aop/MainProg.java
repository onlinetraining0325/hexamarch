package com.java.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.aop.operations.EmployOperations;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/aop/aop.xml");
		EmployOperations operations = (EmployOperations)ctx.getBean("beanOperations");
		operations.getEmployeeById(100);
	}
}
