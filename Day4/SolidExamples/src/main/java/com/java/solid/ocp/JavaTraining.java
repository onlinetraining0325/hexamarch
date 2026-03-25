package com.java.solid.ocp;

public class JavaTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("Java Training Offline to be Happen...");
	}

	@Override
	public void timing() {
		System.out.println("Timing is from 9 to 6 may extend");
	}

}
