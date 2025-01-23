package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*This is the program which is the replace of the config xml file*/

@Configuration /* Through this we get that this handles the cofiguration */
//@ComponentScan(basePackages = "com.springcore.javaConfig")	/* Here we give the base package name same as we give in the xml file */
public class JavaConfig {
	
	@Bean
	public Sleeping getSleep() {
		return new Sleeping();
	}
	
	/* @Bean */ //or
	@Bean(name = { "student", "temp", "con" }) /* We can give multiple name to give name to bean in array in case if we don't want to use the below getStudent name in main method*/
	public Student getStudent() {
		/* Creating student object */
		Student student = new Student(getSleep());
		return student;
	}
	
}
