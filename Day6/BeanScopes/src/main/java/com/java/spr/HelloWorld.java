package com.java.spr;


public class HelloWorld {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}

	public void show() {
		System.out.println("Name is  " +name);
	}
}
