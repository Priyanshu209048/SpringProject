package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8 {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaConfig/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		/* Student student = (Student) context.getBean("student"); */
		Student student = (Student) context.getBean("temp");
		System.out.println(student);
		student.study();
		
		//context.close();	//To use this function we should use the ClassPath in the replace of ApplicationContext

	}

}
