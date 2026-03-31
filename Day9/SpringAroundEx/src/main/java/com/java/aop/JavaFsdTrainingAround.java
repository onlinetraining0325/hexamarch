package com.java.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JavaFsdTrainingAround {

	 @Pointcut("execution(* com.java.aop.JavaFsdTraining.showInfo(..))")
	 private void anyAdvice() {}
	 
	  @Around(value = "anyAdvice() && args(batch2)", argNames = "pjp,batch2")
	    public Object beforeAdvice(ProceedingJoinPoint pjp, String batch2) throws Throwable {

	        System.out.println("Around Method " + pjp.getSignature());
	        System.out.println("Before Calling Actual Method...");
	        System.out.println("Your Trainer is Prasanna P...");
	        System.out.println("He is FullStack Java Trainer...");
	        System.out.println("Batch value: " + batch2);
	        return pjp.proceed();
	    }
}
