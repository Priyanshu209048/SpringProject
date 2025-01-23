package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
		/* Student student = (Student) context.getBean("student"); */
		/*
		 * We write the student in getBean because spring in stereotype automatically
		 * create the object by make it camel of class name
		 */
		/* System.out.println(student); */
		Student student = context.getBean("obj", Student.class);
		/*
		 * System.out.println(student); System.out.println(student.getSkills());
		 * System.out.println(student.getSkills().getClass().getName());
		 */
		
		System.out.println(student.hashCode());
		Student student1 = context.getBean("obj", Student.class);
		System.out.println(student1.hashCode());
		
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		System.out.println(teacher1.hashCode());
		Teacher teacher2 = context.getBean("teacher", Teacher.class);
		System.out.println(teacher2.hashCode());

	}

}
