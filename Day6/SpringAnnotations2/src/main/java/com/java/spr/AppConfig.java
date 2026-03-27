package com.java.spr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.java.spr")
public class AppConfig {

	@Bean(name="personDurga")
	public Person personDurga() {
		Person p1 = new Person();
		p1.setId(3);
		p1.setName("Durga");
		JobDetails jd = new JobDetails();
		jd.setJob("Software Engineer");
		jd.setCompany("Hexaware");
		jd.setLocation("Chennai");
		Family family = new Family();
		family.setCity("Swamimalai");
		family.setState("TamilNadu");
		p1.setJobDetails(jd);
		p1.setFamily(family);
		return p1;
	}
	
	@Bean(name = "personMadesh")
	public Person personMadesh() {
		Person p1 = new Person();
		p1.setId(2);
		p1.setName("Madesh");
		JobDetails jd = new JobDetails();
		jd.setJob("Software Engineer");
		jd.setCompany("Hexaware");
		jd.setLocation("Chennai");
		Family family = new Family();
		family.setCity("Erode");
		family.setState("TamilNadu");
		p1.setJobDetails(jd);
		p1.setFamily(family);
		return p1;
	}
	
	@Bean(name = "personShakira")
	public Person personShakira() {
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Shakira");
		JobDetails jd = new JobDetails();
		jd.setJob("Software Engineer");
		jd.setCompany("Hexaware");
		jd.setLocation("Chennai");
		Family family = new Family();
		family.setCity("Dindigul");
		family.setState("TamilNadu");
		p1.setJobDetails(jd);
		p1.setFamily(family);
		return p1;
	}
}
