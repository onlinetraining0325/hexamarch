package com.java.spr;

public class HelloImpl implements Hello {

	private String welcomeNote;
	private String greeting;
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
		System.out.println(greeting+name);
		System.out.println(endNote);
	}

}
