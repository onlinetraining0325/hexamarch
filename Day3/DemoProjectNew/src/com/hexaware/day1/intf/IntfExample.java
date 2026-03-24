package com.hexaware.day1.intf;

public class IntfExample {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Vijaya(),
			new Geetha()
		};
		
		for (ITraining it : arr) {
			it.name();
			it.email();
		}
	}
}
