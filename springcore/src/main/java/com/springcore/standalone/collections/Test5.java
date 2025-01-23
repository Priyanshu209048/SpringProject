package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneConfig.xml");
		Person person1 = (Person) context.getBean("person1");
		Person person2 = (Person) context.getBean("person2");
		System.out.println(person1);
		System.out.println(person1.getFeestructure());
		System.out.println(person1.getProperties());
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getFeestructure().getClass().getName());
		System.out.println(person1.getProperties().getClass().getName());
		System.out.println("----------------------------------");
		System.out.println(person2); 
		System.out.println(person2.getFeestructure());
		System.out.println(person2.getFeestructure().getClass().getName());

	}

}
