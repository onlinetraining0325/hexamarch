package com.java.spr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanHello")
public class HelloImpl implements Hello{

	@Value("Welcome to Hexaware...")
	private String welcomeNote;
	@Value("Good Morning to All...")
	private String greeting;
	@Value("Thank You All for Session...")
	private String endNote;
	 
	public String getWelcomeNote() {
		return welcomeNote;
	}
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getEndNote() {
		return endNote;
	}
	public void setEndNote(String endNote) {
		this.endNote = endNote;
	}
	@Override
	public void sayHello(String name) {
		System.out.println(welcomeNote);
		System.out.println(greeting+ " "+name);
		System.out.println(endNote);
	}
	 
	 
}
