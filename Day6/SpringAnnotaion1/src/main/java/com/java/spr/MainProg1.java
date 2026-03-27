package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg1 {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		Trainer trainer = (Trainer)ctx.getBean("trainer", Trainer.class);
		trainer.showInfo();
	}
}
