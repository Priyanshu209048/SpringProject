package com.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test4 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");
		/*
		 * Car car = (Car) context.getBean("car"); System.out.println(car);
		 */
		
		/* Registering shutdown hook and to use this method we have to import the AbstractApplicationContext
		 * which is the parent interface of ApplicationContext*/
		context.registerShutdownHook();
		
		/*
		 * System.out.println("----------------------------"); Bike bike = (Bike)
		 * context.getBean("bike"); System.out.println(bike);
		 */
		
		System.out.println("----------------------------");
		Cycle cycle = (Cycle) context.getBean("cycle");
		System.out.println(cycle);
		
	}

}
