package com.hexaware.day1.p2;

import com.hexaware.day1.p1.Demo;

public class Testing extends Demo {

	public void test() {
		Testing testing = new Testing();
		System.out.println(testing.protectedStr);
		System.out.println(testing.publicStr);
	}
}
