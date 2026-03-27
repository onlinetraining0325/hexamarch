package com.java.spr;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.java.spr")
public class AppConfig {

	 // Equivalent to <bean id="studentOne">
    @Bean
    public Student studentOne() {
        Student s1 = new Student();
        s1.setSno(1);
        s1.setFirstName("Srinivas");
        s1.setLastName("R");
        return s1;
    }

    // Equivalent to <bean id="studentTwo">
    @Bean
    public Student studentTwo() {
    	  Student s1 = new Student();
          s1.setSno(2);
          s1.setFirstName("Ranchana");
          s1.setLastName("Devi");
          return s1;
    }

    // Equivalent to <bean id="studentThree">
    @Bean
    public Student studentThree() {
    	  Student s1 = new Student();
          s1.setSno(3);
          s1.setFirstName("Satish");
          s1.setLastName("A");
          return s1;
    }

    // Equivalent to <bean id="trainer">
    @Bean
    public Trainer trainer() {

        Trainer trainer = new Trainer();
        trainer.setTrainerName("Prasanna...");
        trainer.setLocation("Hyderabad");

        trainer.setStudentList(
                Arrays.asList(
                        studentTwo(),
                        studentOne(),
                        studentThree()
                )
        );

        return trainer;
    }
}
