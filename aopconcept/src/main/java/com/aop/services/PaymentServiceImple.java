package com.aop.services;

public class PaymentServiceImple implements PaymentService {

	public void makePayment(int amount) {

		System.out.println(amount + " Amount Debited...");
		
		//////
		
		System.out.println(amount + " Amount Credited...");
		
	}

}
