package com.hexaware.day1.intf;

interface IntfOne {
	default void name() {
		System.out.println("Name from IOne Interface...");
	}
}

interface IntfTwo {
	default void name() {
		System.out.println("Name from ITwo Interface...");
	}
}

interface IntfThree {
	default void name() {
		System.out.println("Name from IThree Interface...");
	}
}

class Demo implements IntfOne, IntfThree, IntfTwo {

	@Override
	public void name() {
		IntfOne.super.name();
		IntfThree.super.name();
		IntfTwo.super.name();
	}
	
}

public class DefaultExample {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.name();
	}
}
