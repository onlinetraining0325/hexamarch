package com.java.spr;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PreBoarding {

	@Pointcut("execution(* com.java.spr.Boarding.*(..))")
	public void assignProject() {}
	
	@Before("assignProject()")
	public void mcqExam() {
		System.out.println("Please Check Cleared All Mcq Exams are Not...");
	}
	
	@Before("assignProject()")
	public void capstone() {
		System.out.println("Please Check Completed Capstone Project Or Not...");
	}
	
	@After("assignProject()")
	public void assignLaptop() {
		System.out.println("Please Provide Laptop for the new joinee");
	}
	
	@After("assignProject()")
	public void inviteToTeam() {
		System.out.println("Please Introduce team members for the new joinee");
	}
}
