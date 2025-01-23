package com.springcore.auto_wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/auto_wire/autowireConfig.xml");
		Emp emp = context.getBean("emp", Emp.class); /* This does not need to typecast with Emp */
		System.out.println(emp);

	}

}
