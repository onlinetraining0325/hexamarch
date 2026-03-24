package com.hexaware.day1.abs;

public class AbsExample1 {

	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Sam(), new Snowin(),new Triksha()	
		};
		
		for (Training training : arr) {
			training.name();
			training.email();
		}
	}
}
