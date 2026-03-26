package com.java.spr;

public class HelloImpl implements IHello {

	private String greeting;
	
	public HelloImpl(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String sayHello(String name) {
		return greeting + name;
	}

}
