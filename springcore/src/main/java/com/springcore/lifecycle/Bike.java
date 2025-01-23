package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bike implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bike [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		//init
		System.out.println("Taking Bike : init");
	}

	public void destroy() throws Exception {
		//destroy
		System.out.println("Going to sell the bike : destroy");
		
	}
	
}
