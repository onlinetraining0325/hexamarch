package com.java.solid.ocp;

public class SapTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("Sap About to Start...");
	}

	@Override
	public void timing() {
		System.out.println("Takes Some time to Announce");
	}

}
