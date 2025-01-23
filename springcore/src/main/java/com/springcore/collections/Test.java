package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
		EmployeeBean employee1 = (EmployeeBean) context.getBean("employee1");
		System.out.println(employee1);
		/*
		 * System.out.println("Name: " + employee1.getName());
		 * System.out.println("Phone Number: " + employee1.getPhones());
		 * System.out.println("Address: " + employee1.getAddresses());
		 * System.out.println("Course: " + employee1.getCourses());
		 * System.out.println("Profile: " + employee1.getProfile());
		 */
		
		System.out.println(employee1.getPhones().getClass().getName());
	}

}
