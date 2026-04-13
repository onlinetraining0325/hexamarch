package com.example.demo;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Bean
	public JobCompletionNotificationListener listener(JdbcTemplate jdbcTemplate) {
	    return new JobCompletionNotificationListener(jdbcTemplate);
	}
	@Bean
    public FlatFileItemReader<EmployDup> reader() {
        return new FlatFileItemReaderBuilder<EmployDup>()
                .name("personItemReader")
                .resource(new ClassPathResource("EmployNew.csv"))
                .delimited()
                .names("empno", "name","gender","dept","desig","basic")
                .fieldSetMapper(fieldSet -> {
                    EmployDup employDup = new EmployDup();
                    employDup.setEmpno(fieldSet.readInt("empno"));
                    employDup.setName(fieldSet.readString("name"));
                    employDup.setGender(fieldSet.readString("gender"));
                    employDup.setDept(fieldSet.readString("dept"));
                    employDup.setDesig(fieldSet.readString("desig"));
                    employDup.setBasic(fieldSet.readDouble("basic"));
                    return employDup;
                })
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<EmployDup> writer(DataSource dataSource) {
         String sql = "Insert into EmployDup(empno,name,gender,dept,desig,basic) "
         		+ " values(:empno,:name,:gender,:dept,:desig,:basic)";
    	return new JdbcBatchItemWriterBuilder<EmployDup>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql(sql)
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public Step step(JobRepository jobRepository, PlatformTransactionManager transactionManager,
                     FlatFileItemReader<EmployDup> reader, JdbcBatchItemWriter<EmployDup> writer) {
        return new StepBuilder("step", jobRepository)
                .<EmployDup, EmployDup>chunk(10, transactionManager)
                .reader(reader)
                .processor(new EmployDupItemProcessor())
                .writer(writer)
                .build();
    }

    @Bean
    public Job job(JobRepository jobRepository, Step step, JobCompletionNotificationListener listener) {
        return new JobBuilder("importUserJob", jobRepository)
                .listener(listener)   // ✅ IMPORTANT
                .start(step)
                .build();
    }
}
