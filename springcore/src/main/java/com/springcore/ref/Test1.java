package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A a = (A) context.getBean("aref");
		A a1 = (A) context.getBean("aref1");
		System.out.println(a);
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		System.out.println(a1.getOb().getY());

	}

}
