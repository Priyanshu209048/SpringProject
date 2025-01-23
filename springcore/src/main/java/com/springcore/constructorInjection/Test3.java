package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/ciConfig.xml");
		PersonBean person = (PersonBean) context.getBean("person");
		System.out.println(person);

		Addition addition = (Addition) context.getBean("addition");
		addition.doSum();
	}

}
