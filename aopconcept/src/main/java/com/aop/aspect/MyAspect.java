package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//We run all this code without changing the single thing in service program

@Aspect
public class MyAspect {

	//* is used to run this for all return type
	//here we give the path of the program in execution parameter inside the Before annotaion
	@Before("execution(* com.aop.services.PaymentServiceImple.makePayment(..))") //We have any parameter then we write like this makePayment(..)
	public void pringBefore() {
		System.out.println("Payment Started");
	}
	
	@After("execution(* com.aop.services.PaymentServiceImple.makePayment(..))") //We have any parameter then we write like this makePayment(..)
	public void pringAfter() {
		System.out.println("Payment Done...");
	}
	
}
