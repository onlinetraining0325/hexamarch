package com.java.spr;

public class HelloImpl implements Hello {

	private String welcomeNote;
	private String greeting;
	private String endNote;
	
	public HelloImpl(String welcomeNote, String greeting, String endNote) {
		this.welcomeNote = welcomeNote;
		this.greeting = greeting;
		this.endNote = endNote;
	}

	@Override
	public void sayHello(String name) {
		System.out.println(welcomeNote);
		System.out.println(greeting+name);
		System.out.println(endNote);
	}

}
