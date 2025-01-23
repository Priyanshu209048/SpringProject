package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
		/* This is tight coupling */
		/*
		 * StudentBean bean = new StudentBean(1001, "Priyanshu", "Delhi");
		 * System.out.println(bean.toString());
		 */
        
		/* This is loose coupling */
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentBean student1 = (StudentBean) context.getBean("student1");
        StudentBean student2 = (StudentBean) context.getBean("student2");
        
        System.out.println(student1);
		/*
		 * If we remove the toString method from StudentBean class then it print the
		 * address of it
		 */
        System.out.println(student2);
    }
}
