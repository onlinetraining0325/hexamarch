package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("Job Completed...Verifying Result...");
			String cmd = "select * from EmployDup";
			jdbcTemplate.query(cmd , (rs,row) -> 
				new EmployDup(rs.getInt("empno"),rs.getString("name"),
						rs.getString("gender"), rs.getString("dept"),
						rs.getString("desig"),rs.getDouble("basic")
						)).forEach(employ -> log.info("Employ REcord Found " +employ + " In The Db"));
		}
	}
	
	
}
