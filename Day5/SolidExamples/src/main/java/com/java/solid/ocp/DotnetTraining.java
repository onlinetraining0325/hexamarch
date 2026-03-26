package com.java.solid.ocp;

public class DotnetTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("Dotnet Training from Hexaware...");
	}

	@Override
	public void timing() {
		System.out.println("Its from 9 to 6 day time");
	}

}
