package com.java.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.JoinPoint;

@Aspect 
public class LoggingOperation {

    @Pointcut("execution(* com.java.aop.operations.*.*(..))")
    public void employOperations() {}

    @Before("employOperations()")
    public void beforeMethod(JoinPoint jp) {
        System.out.println("Before Method " + jp.getSignature().getName());
    }

    @After("employOperations()")
    public void afterMethod(JoinPoint jp) {
        System.out.println("After Method " + jp.getSignature().getName());
    }

    @AfterReturning(pointcut = "employOperations()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result) {
        System.out.println("After Returning Value " + result);
    }
}