package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("com/java/spr/hello.xml");
		Hello hello = (Hello)ctx.getBean("bean1");
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name   ");
		name = sc.nextLine();
		hello.sayHello(name);
	}
}
