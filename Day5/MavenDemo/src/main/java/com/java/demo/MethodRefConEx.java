package com.java.demo;

public class MethodRefConEx {
	public static void main(String[] args) {
		ITest obj = Employ::new;
		Employ e = obj.showEmploy(1, "Prasanna", 48825.22);
		System.out.println(e);
	}
}
