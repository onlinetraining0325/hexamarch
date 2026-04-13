package com.example.demo;

import org.springframework.batch.item.ItemProcessor;

public class EmployDupItemProcessor implements ItemProcessor<EmployDup, EmployDup> {

	@Override
	public EmployDup process(EmployDup item) throws Exception {
		return new EmployDup(item.getEmpno(), item.getName().toUpperCase(),
				item.getGender(), item.getDept().toUpperCase(), item.getDesig(), item.getBasic()+1000);
	}
	

}
